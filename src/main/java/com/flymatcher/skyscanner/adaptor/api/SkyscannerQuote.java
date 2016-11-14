package com.flymatcher.skyscanner.adaptor.api;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class SkyscannerQuote {

  @JsonPropertyOrder({"outboundLeg", "inboundLeg", "price", "direct"})

  private Leg outboundLeg;

  private Leg inboundLeg;

  private double price;

  private boolean direct;

  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
  private LocalDateTime quoteDate;

  public Leg getOutboundLeg() {
    return outboundLeg;
  }

  public void setOutboundLeg(final Leg outboundLeg) {
    this.outboundLeg = outboundLeg;
  }

  public Leg getInboundLeg() {
    return inboundLeg;
  }

  public void setInboundLeg(final Leg inboundLeg) {
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


  public LocalDateTime getQuoteDate() {
    return quoteDate;
  }

  public void setQuoteDate(final LocalDateTime quoteDate) {
    this.quoteDate = quoteDate;
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
