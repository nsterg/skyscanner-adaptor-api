package com.flymatcher.skyscanner.adaptor.api;

import static com.flymatcher.skyscanner.adaptor.api.builders.LegBuilder.aLeg;
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
import com.flymatcher.skyscanner.adaptor.api.builders.LegBuilder;

public class SkyscannerCheapestQuotesResponseUnmarshalTest {

  private static final String OUT_BOUND_DATE = "2016-10-10T00:00:00";
  private static final String IN_BOUND_DATE = "2016-10-20T00:00:00";
  private static final String QUOTE_DATE = "2016-09-12T00:00:00";

  private static final String CARRIER = "easyjet";
  private static final String ORIGIN = "Athens";
  private static final String DESTINATION1 = "London";
  private static final String DESTINATION2 = "Madrid";
  private static final String AIRPORT_CODE1 = "LND";
  private static final String AIRPORT_CODE2 = "MAD";
  private static final String AIRPORT_CODE3 = "ATH";

  private static final String COUNTRY1 = "United Kingdom";
  private static final String COUNTRY2 = "Spain";
  private static final String COUNTRY3 = "Greece";



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
                                                            aSkyscannerQuote().withDirect(true).withPrice(62).withQuoteDate(QUOTE_DATE)
                                                              .withInboundLeg(buildInBoundLeg(DESTINATION1, AIRPORT_CODE3, COUNTRY3))
                                                              .withOutboundLeg(buildOutBoundLeg(DESTINATION1, AIRPORT_CODE1, COUNTRY1)),
                                                            aSkyscannerQuote().withDirect(true).withPrice(72).withQuoteDate(QUOTE_DATE)
                                                              .withInboundLeg(buildInBoundLeg(DESTINATION2, AIRPORT_CODE3, COUNTRY3))
                                                              .withOutboundLeg(buildOutBoundLeg(DESTINATION2, AIRPORT_CODE2, COUNTRY2)))
                                                          .build();
    // @formatter:on

    final String json =
        readFileToString(new File("src/test/resources/junit/cheapest-quotes-response.json"));

    final SkyscannerCheapestQuotesResponse actualDto =
        mapper.readValue(json, SkyscannerCheapestQuotesResponse.class);

    assertEquals("Dto did not match expected input", expectedDto, actualDto);

  }

  private LegBuilder buildOutBoundLeg(final String destination, final String airportCode,
      final String country) throws ParseException {
    return aLeg().withCarrier(CARRIER).withOrigin(ORIGIN).withDestination(destination)
        .withAirportCode(airportCode).withCountry(country).withDepartureDate(OUT_BOUND_DATE);
  }

  private LegBuilder buildInBoundLeg(final String destination, final String airportCode,
      final String country) throws ParseException {
    return aLeg().withCarrier(CARRIER).withOrigin(destination).withDestination(ORIGIN)
        .withAirportCode(airportCode).withCountry(country).withDepartureDate(IN_BOUND_DATE);
  }

}
