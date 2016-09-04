package com.flymatcher.skyscanner.adaptor.api.builders;

import static java.time.LocalDateTime.parse;

import java.time.LocalDateTime;

import com.flymatcher.skyscanner.adaptor.api.CheapestQuotesRequest;


public class CheapestQuotesRequestBuilder {

  private String country;
  private String city;
  private String currency;
  private String locale;
  private LocalDateTime outboundPartialDate;
  private LocalDateTime inboundPartialDate;

  private CheapestQuotesRequestBuilder() {}

  public static CheapestQuotesRequestBuilder aCheapestQuotesRequest() {
    return new CheapestQuotesRequestBuilder();
  }

  public CheapestQuotesRequest build() {
    final CheapestQuotesRequest cheapestQuotesRequest = new CheapestQuotesRequest();
    cheapestQuotesRequest.setCity(city);
    cheapestQuotesRequest.setCountry(country);
    cheapestQuotesRequest.setCurrency(currency);
    cheapestQuotesRequest.setLocale(locale);
    cheapestQuotesRequest.setOutboundPartialDate(outboundPartialDate);
    cheapestQuotesRequest.setInboundPartialDate(inboundPartialDate);

    return cheapestQuotesRequest;
  }

  public CheapestQuotesRequestBuilder withCountry(final String country) {
    this.country = country;
    return this;
  }

  public CheapestQuotesRequestBuilder withCity(final String city) {
    this.city = city;
    return this;
  }

  public CheapestQuotesRequestBuilder withCurrency(final String currency) {
    this.currency = currency;
    return this;
  }

  public CheapestQuotesRequestBuilder withLocale(final String locale) {
    this.locale = locale;
    return this;
  }

  public CheapestQuotesRequestBuilder withOutboundPartialDate(
      final LocalDateTime outboundPartialDate) {
    this.outboundPartialDate = outboundPartialDate;
    return this;
  }

  public CheapestQuotesRequestBuilder withOutboundPartialDate(final String outboundPartialDate) {
    this.outboundPartialDate = parse(outboundPartialDate);
    return this;
  }

  public CheapestQuotesRequestBuilder withInboundPartialDate(
      final LocalDateTime inboundPartialDate) {
    this.inboundPartialDate = inboundPartialDate;
    return this;
  }

  public CheapestQuotesRequestBuilder withInboundPartialDate(final String inboundPartialDate) {
    this.inboundPartialDate = parse(inboundPartialDate);
    return this;
  }

  public CheapestQuotesRequestBuilder withDefaultValues() {
    this.country = "GR";
    this.city = "ATH";
    this.currency = "EUR";
    this.locale = "en-GB";
    this.outboundPartialDate = parse("2016-10-10T00:00:00");
    this.inboundPartialDate = parse("2016-10-20T00:00:00");

    return this;
  }

}
