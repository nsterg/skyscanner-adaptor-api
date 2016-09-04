package com.flymatcher.skyscanner.adaptor.api;

import static com.flymatcher.skyscanner.adaptor.api.builders.InOutBoundLegBuilder.aInOutBoundLeg;
import static com.flymatcher.skyscanner.adaptor.api.builders.SkyscannerCheapestQuotesResponseBuilder.aSkyscannerCheapestQuotesResponse;
import static com.flymatcher.skyscanner.adaptor.api.builders.SkyscannerQuoteBuilder.aSkyscannerQuote;
import static org.apache.commons.io.FileUtils.readFileToString;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flymatcher.skyscanner.adaptor.api.builders.InOutBoundLegBuilder;

public class SkyscannerCheapestQuotesResponseUnmarshalTest {

  private static final String OUT_BOUND_DATE = "2016-10-10T00:00:00";
  private static final String IN_BOUND_DATE = "2016-10-20T00:00:00";
  private static final String CARRIER = "easyjet";
  private static final String ORIGIN = "ATH";
  private static final String DESTINATION1 = "LND";
  private static final String DESTINATION2 = "MAD";

  private ObjectMapper mapper;

  @Before
  public void setup() {
    mapper = new ObjectMapper();
    mapper.findAndRegisterModules();
  }

  @Test
  public void shouldUnmarshalCheapestQuotesResponse()
      throws JsonParseException, JsonMappingException, IOException, ParseException {

    // @formatter:off
    final SkyscannerCheapestQuotesResponse expectedDto = aSkyscannerCheapestQuotesResponse().withQuotes(
                                                            aSkyscannerQuote().withDirect(true).withPrice(62)
                                                              .withInboundLeg(buildInBoundLeg(DESTINATION1))
                                                              .withOutboundLeg(buildOutBoundLeg(DESTINATION1)),
                                                            aSkyscannerQuote().withDirect(true).withPrice(72)
                                                              .withInboundLeg(buildInBoundLeg(DESTINATION2))
                                                              .withOutboundLeg(buildOutBoundLeg(DESTINATION2)))
                                                          .build();
    // @formatter:on

    final String json =
        readFileToString(new File("src/test/resources/junit/cheapest-quotes-response.json"));

    final SkyscannerCheapestQuotesResponse actualDto =
        mapper.readValue(json, SkyscannerCheapestQuotesResponse.class);

    assertEquals("Dto did not match expected input", expectedDto, actualDto);

  }

  private InOutBoundLegBuilder buildOutBoundLeg(final String destination) throws ParseException {
    return aInOutBoundLeg().withCarrier(CARRIER).withOrigin(ORIGIN).withDestination(destination)
        .withDepartureDate(OUT_BOUND_DATE);
  }

  private InOutBoundLegBuilder buildInBoundLeg(final String destination) throws ParseException {
    return aInOutBoundLeg().withCarrier(CARRIER).withOrigin(destination).withDestination(ORIGIN)
        .withDepartureDate(IN_BOUND_DATE);
  }

}
