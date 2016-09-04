package com.flymatcher.skyscanner.adaptor.api;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import java.util.List;

public class SkyscannerCheapestQuotesResponse {

  private List<SkyscannerQuote> quotes;

  public List<SkyscannerQuote> getQuotes() {
    return quotes;
  }

  public void setQuotes(final List<SkyscannerQuote> quotes) {
    this.quotes = quotes;
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
