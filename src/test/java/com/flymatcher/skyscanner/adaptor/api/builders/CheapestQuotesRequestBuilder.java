package com.flymatcher.skyscanner.adaptor.api.builders;

import static java.time.LocalDateTime.parse;

import java.text.ParseException;
import java.time.LocalDateTime;

import com.flymatcher.skyscanner.adaptor.api.CheapestQuotesRequest;


public class CheapestQuotesRequestBuilder {

  private String country;
  private String city;
  private String currency;
  private LocalDateTime departureDate;

  private CheapestQuotesRequestBuilder() {}

  public static CheapestQuotesRequestBuilder aCheapestQuotesRequest() {
    return new CheapestQuotesRequestBuilder();
  }

  public CheapestQuotesRequest build() {
    final CheapestQuotesRequest cheapestQuotesRequest = new CheapestQuotesRequest();
    cheapestQuotesRequest.setCity(city);
    cheapestQuotesRequest.setCountry(country);
    cheapestQuotesRequest.setCurrency(currency);
    cheapestQuotesRequest.setDepartureDate(departureDate);

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

  public CheapestQuotesRequestBuilder withDepartureDate(final LocalDateTime departureDate) {
    this.departureDate = departureDate;
    return this;
  }

  public CheapestQuotesRequestBuilder withDepartureDate(final String departureDate)
      throws ParseException {
    this.departureDate = parse(departureDate);
    return this;
  }

  public CheapestQuotesRequestBuilder withDefaultValues() {
    this.country = "GR";
    this.city = "ATH";
    this.currency = "EUR";
    this.departureDate = parse("2016-10-10T00:00:00");
    return this;
  }

}
