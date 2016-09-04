package com.flymatcher.skyscanner.adaptor.api;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class SkyscannerQuote {

  @JsonPropertyOrder({"outboundLeg", "inboundLeg", "price", "direct"})

  private InOutBoundLeg outboundLeg;

  private InOutBoundLeg inboundLeg;

  private double price;

  private boolean direct;

  public InOutBoundLeg getOutboundLeg() {
    return outboundLeg;
  }

  public void setOutboundLeg(final InOutBoundLeg outboundLeg) {
    this.outboundLeg = outboundLeg;
  }

  public InOutBoundLeg getInboundLeg() {
    return inboundLeg;
  }

  public void setInboundLeg(final InOutBoundLeg inboundLeg) {
    this.inboundLeg = inboundLeg;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(final double price) {
    this.price = price;
  }

  public boolean isDirect() {
    return direct;
  }

  public void setDirect(final boolean direct) {
    this.direct = direct;
  }


  @Override
  public int hashCode() {
    return reflectionHashCode(this);
  }

  @Override
  public boolean equals(final Object obj) {
    return reflectionEquals(this, obj);
  }

  @Override
  public String toString() {
    return reflectionToString(this);
  }

}
