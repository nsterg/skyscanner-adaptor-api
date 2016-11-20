package com.flymatcher.skyscanner.adaptor.api;

import static java.time.LocalDate.parse;
import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CheapestQuotesRequest {

  private String market;

  private String originCity;

  private String currency;

  private String locale;

  private String destinationCountry;

  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate outboundPartialDate;

  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate inboundPartialDate;


  public static CheapestQuotesRequest valueOf(final String market, final String city,
      final String destinationCountry, final String currency, final String locale,
      final String outboundPartialDate, final String inboundPartialDate) {
    final CheapestQuotesRequest request = new CheapestQuotesRequest();
    request.market = market;
    request.originCity = city;
    request.currency = currency;
    request.locale = locale;
    request.destinationCountry = destinationCountry;
    request.outboundPartialDate = parse(outboundPartialDate);
    request.inboundPartialDate = parse(inboundPartialDate);
    return request;
  }

  public String getMarket() {
    return market;
  }

  public void setMarket(final String market) {
    this.market = market;
  }

  public String getOriginCity() {
    return originCity;
  }

  public void setOriginCity(final String city) {
    this.originCity = city;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(final String currency) {
    this.currency = currency;
  }


  public String getLocale() {
    return locale;
  }

  public void setLocale(final String locale) {
    this.locale = locale;
  }

  public String getDestinationCountry() {
    return destinationCountry;
  }

  public void setDestinationCountry(final String destinationCountry) {
    this.destinationCountry = destinationCountry;
  }

  public LocalDate getOutboundPartialDate() {
    return outboundPartialDate;
  }

  public void setOutboundPartialDate(final LocalDate outboundPartialDate) {
    this.outboundPartialDate = outboundPartialDate;
  }

  public LocalDate getInboundPartialDate() {
    return inboundPartialDate;
  }

  public void setInboundPartialDate(final LocalDate inboundPartialDate) {
    this.inboundPartialDate = inboundPartialDate;
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
