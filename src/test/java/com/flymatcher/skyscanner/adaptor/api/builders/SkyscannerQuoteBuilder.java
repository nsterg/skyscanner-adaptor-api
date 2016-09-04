package com.flymatcher.skyscanner.adaptor.api.builders;

import com.flymatcher.skyscanner.adaptor.api.InOutBoundLeg;
import com.flymatcher.skyscanner.adaptor.api.SkyscannerQuote;


public class SkyscannerQuoteBuilder {

  private InOutBoundLeg outboundLeg;
  private InOutBoundLeg inboundLeg;
  private double price;
  private boolean direct;

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

    return skyscannerQuote;
  }

  public SkyscannerQuoteBuilder withOutboundLeg(final InOutBoundLegBuilder builder) {
    this.outboundLeg = builder.build();
    return this;
  }

  public SkyscannerQuoteBuilder withInboundLeg(final InOutBoundLegBuilder builder) {
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

}
