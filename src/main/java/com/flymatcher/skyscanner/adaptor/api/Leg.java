package com.flymatcher.skyscanner.adaptor.api;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Leg {

  private String carrier;

  private String origin;
  private String originCode;

  private String destination;
  private String destinationCode;

  private String country;

  private String countryCode;

  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
  private LocalDateTime departureDate;

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


  public String getOriginCode() {
    return originCode;
  }

  public void setOriginCode(final String originCode) {
    this.originCode = originCode;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(final String destination) {
    this.destination = destination;
  }


  public String getDestinationCode() {
    return destinationCode;
  }

  public void setDestinationCode(final String destinationCode) {
    this.destinationCode = destinationCode;
  }

  public LocalDateTime getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(final LocalDateTime departureDate) {
    this.departureDate = departureDate;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(final String country) {
    this.country = country;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(final String countryCode) {
    this.countryCode = countryCode;
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
