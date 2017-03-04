package com.flymatcher.skyscanner.adaptor.api.builders;

import static java.time.LocalDateTime.parse;

import java.text.ParseException;
import java.time.LocalDateTime;

import com.flymatcher.skyscanner.adaptor.api.Leg;


public class LegBuilder {

  private String carrier;
  private String origin;
  private String destination;
  private String originCode;
  private String destinationCode;
  private LocalDateTime departureDate;
  private String country;
  private String countryCode;

  private LegBuilder() {}

  public static LegBuilder aLeg() {
    return new LegBuilder();
  }

  public Leg build() {
    final Leg leg = new Leg();

    leg.setCarrier(carrier);
    leg.setOrigin(origin);
    leg.setDestination(destination);
    leg.setOriginCode(originCode);
    leg.setDestinationCode(destinationCode);
    leg.setDepartureDate(departureDate);
    leg.setCountry(country);
    leg.setCountryCode(countryCode);

    return leg;
  }

  public LegBuilder withCarrier(final String carrier) {
    this.carrier = carrier;
    return this;
  }

  public LegBuilder withOrigin(final String origin) {
    this.origin = origin;
    return this;
  }

  public LegBuilder withDestination(final String destination) {
    this.destination = destination;
    return this;
  }


  public LegBuilder withOriginCode(final String originCode) {
    this.originCode = originCode;
    return this;
  }

  public LegBuilder withDestinationCode(final String destinationCode) {
    this.destinationCode = destinationCode;
    return this;
  }

  public LegBuilder withCountry(final String country) {
    this.country = country;
    return this;
  }

  public LegBuilder withCountryCode(final String countryCode) {
    this.countryCode = countryCode;
    return this;
  }


  public LegBuilder withDepartureDate(final LocalDateTime departureDate) {
    this.departureDate = departureDate;
    return this;
  }

  public LegBuilder withDepartureDate(final String departureDate) throws ParseException {
    this.departureDate = parse(departureDate);
    return this;
  }

}
