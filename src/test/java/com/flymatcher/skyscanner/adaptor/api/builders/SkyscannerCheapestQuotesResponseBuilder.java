package com.flymatcher.skyscanner.adaptor.api.builders;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

import com.flymatcher.skyscanner.adaptor.api.SkyscannerCheapestQuotesResponse;
import com.flymatcher.skyscanner.adaptor.api.SkyscannerQuote;


public class SkyscannerCheapestQuotesResponseBuilder {

  private List<SkyscannerQuote> quotes;

  private SkyscannerCheapestQuotesResponseBuilder() {}

  public static SkyscannerCheapestQuotesResponseBuilder aSkyscannerCheapestQuotesResponse() {
    return new SkyscannerCheapestQuotesResponseBuilder();
  }

  public SkyscannerCheapestQuotesResponse build() {
    final SkyscannerCheapestQuotesResponse skyscannerCheapestQuotesResponse =
        new SkyscannerCheapestQuotesResponse();

    skyscannerCheapestQuotesResponse.setQuotes(quotes);

    return skyscannerCheapestQuotesResponse;
  }

  public SkyscannerCheapestQuotesResponseBuilder withQuotes(
      final SkyscannerQuoteBuilder... builders) {
    return withQuotes(asList(builders));
  }

  public SkyscannerCheapestQuotesResponseBuilder withQuotes(
      final List<SkyscannerQuoteBuilder> builders) {
    if (null == this.quotes) {
      this.quotes = new ArrayList<SkyscannerQuote>();
    }

    for (final SkyscannerQuoteBuilder builder : builders) {
      this.quotes.add(builder.build());
    }

    return this;
  }

}
