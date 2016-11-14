package com.flymatcher.skyscanner.adaptor.api.builders;

import static java.time.LocalDateTime.parse;

import java.time.LocalDateTime;

import com.flymatcher.skyscanner.adaptor.api.Leg;
import com.flymatcher.skyscanner.adaptor.api.SkyscannerQuote;


public class SkyscannerQuoteBuilder {

  private Leg outboundLeg;
  private Leg inboundLeg;
  private double price;
  private boolean direct;
  private LocalDateTime quoteDate;

  private SkyscannerQuoteBuilder() {}

  public static SkyscannerQuoteBuilder aSkyscannerQuote() {
    return new SkyscannerQuoteBuilder();
  }

  public SkyscannerQuote build() {
    final SkyscannerQuote skyscannerQuote = new SkyscannerQuote();

    skyscannerQuote.setOutboundLeg(outboundLeg);
    skyscannerQuote.setInboundLeg(inboundLeg);
    skyscannerQuote.setPrice(price);
    skyscannerQuote.setDirect(direct);
    skyscannerQuote.setQuoteDate(quoteDate);

    return skyscannerQuote;
  }

  public SkyscannerQuoteBuilder withOutboundLeg(final LegBuilder builder) {
    this.outboundLeg = builder.build();
    return this;
  }

  public SkyscannerQuoteBuilder withInboundLeg(final LegBuilder builder) {
    this.inboundLeg = builder.build();
    return this;
  }

  public SkyscannerQuoteBuilder withPrice(final double price) {
    this.price = price;
    return this;
  }

  public SkyscannerQuoteBuilder withDirect(final boolean direct) {
    this.direct = direct;
    return this;
  }

  public SkyscannerQuoteBuilder withQuoteDate(final LocalDateTime quoteDate) {
    this.quoteDate = quoteDate;
    return this;
  }

  public SkyscannerQuoteBuilder withQuoteDate(final String quoteDate) {
    this.quoteDate = parse(quoteDate);
    return this;
  }

}
