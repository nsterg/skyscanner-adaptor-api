package com.flymatcher.skyscanner.adaptor.api.builders;

import static java.time.LocalDateTime.parse;

import java.text.ParseException;
import java.time.LocalDateTime;

import com.flymatcher.skyscanner.adaptor.api.Leg;


public class LegBuilder {

  private String carrier;
  private String origin;
  private String destination;
  private LocalDateTime departureDate;
  private String airportCode;
  private String country;

  private LegBuilder() {}

  public static LegBuilder aLeg() {
    return new LegBuilder();
  }

  public Leg build() {
    final Leg leg = new Leg();

    leg.setCarrier(carrier);
    leg.setOrigin(origin);
    leg.setDestination(destination);
    leg.setDepartureDate(departureDate);
    leg.setAirportCode(airportCode);
    leg.setCountry(country);

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

  public LegBuilder withCountry(final String country) {
    this.country = country;
    return this;
  }

  public LegBuilder withAirportCode(final String airportCode) {
    this.airportCode = airportCode;
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
