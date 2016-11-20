package com.flymatcher.skyscanner.adaptor.api;

import static com.flymatcher.skyscanner.adaptor.api.builders.CheapestQuotesRequestBuilder.aCheapestQuotesRequest;
import static org.apache.commons.io.FileUtils.readFileToString;
import static org.junit.Assert.assertThat;
import static uk.co.datumedge.hamcrest.json.SameJSONAs.sameJSONAs;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CheapestQuotesRequestMarshalTest {

  private ObjectMapper mapper;

  @Before
  public void setup() {
    mapper = new ObjectMapper();
    mapper.findAndRegisterModules();
  }

  @Test
  public void shouldMarshalCheapestQuotesRequest() throws IOException {
    final CheapestQuotesRequest dto = aCheapestQuotesRequest().withDefaultValues().build();

    final String expectedJson =
        readFileToString(new File("src/test/resources/junit/cheapest-quotes-request.json"));

    final String actualJson = mapper.writeValueAsString(dto);

    assertThat("Json did not match expected output", expectedJson, sameJSONAs(actualJson));
  }

}
