package com.flymatcher.skyscanner.adaptor.api.builders;

import static java.time.LocalDateTime.parse;

import java.text.ParseException;
import java.time.LocalDateTime;

import com.flymatcher.skyscanner.adaptor.api.InOutBoundLeg;


public class InOutBoundLegBuilder {

  private String carrier;
  private String origin;
  private String destination;
  private LocalDateTime departureDate;

  private InOutBoundLegBuilder() {}

  public static InOutBoundLegBuilder aInOutBoundLeg() {
    return new InOutBoundLegBuilder();
  }

  public InOutBoundLeg build() {
    final InOutBoundLeg inOutBoundLeg = new InOutBoundLeg();

    inOutBoundLeg.setCarrier(carrier);
    inOutBoundLeg.setOrigin(origin);
    inOutBoundLeg.setDestination(destination);
    inOutBoundLeg.setDepartureDate(departureDate);

    return inOutBoundLeg;
  }

  public InOutBoundLegBuilder withCarrier(final String carrier) {
    this.carrier = carrier;
    return this;
  }

  public InOutBoundLegBuilder withOrigin(final String origin) {
    this.origin = origin;
    return this;
  }

  public InOutBoundLegBuilder withDestination(final String destination) {
    this.destination = destination;
    return this;
  }

  public InOutBoundLegBuilder withDepartureDate(final LocalDateTime departureDate) {
    this.departureDate = departureDate;
    return this;
  }

  public InOutBoundLegBuilder withDepartureDate(final String departureDate) throws ParseException {
    this.departureDate = parse(departureDate);
    return this;
  }

}
