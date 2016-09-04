package com.flymatcher.skyscanner.adaptor.api;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class InOutBoundLeg {

  @JsonPropertyOrder({"carrier", "origin", "destination", "departureDate", "type"})

  private String carrier;

  private String origin;

  private String destination;

  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
  private LocalDateTime departureDate;

  private LegType type;

  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(final String carrier) {
    this.carrier = carrier;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(final String origin) {
    this.origin = origin;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(final String destination) {
    this.destination = destination;
  }

  public LocalDateTime getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(final LocalDateTime departureDate) {
    this.departureDate = departureDate;
  }

  public LegType getType() {
    return type;
  }

  public void setType(final LegType type) {
    this.type = type;
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
