package com.flymatcher.skyscanner.adaptor.api;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class CheapestQuotesRequest {

  @JsonPropertyOrder({"country", "city", "currency", "locale", "outboundPartialDate",
      "inboundPartialDate"})

  private String country;
  private String city;
  private String currency;
  private String locale;
  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
  private LocalDateTime outboundPartialDate;
  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
  private LocalDateTime inboundPartialDate;



  public String getCountry() {
    return country;
  }

  public void setCountry(final String country) {
    this.country = country;
  }

  public String getCity() {
    return city;
  }

  public void setCity(final String city) {
    this.city = city;
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

  public LocalDateTime getOutboundPartialDate() {
    return outboundPartialDate;
  }

  public void setOutboundPartialDate(final LocalDateTime outboundPartialDate) {
    this.outboundPartialDate = outboundPartialDate;
  }

  public LocalDateTime getInboundPartialDate() {
    return inboundPartialDate;
  }

  public void setInboundPartialDate(final LocalDateTime inboundPartialDate) {
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
