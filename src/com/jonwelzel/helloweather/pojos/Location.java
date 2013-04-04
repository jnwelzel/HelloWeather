package com.jonwelzel.helloweather.pojos;

/**
 * A geographical location
 * @author Jon Welzel
 *
 */
public class Location {
  
  private String city;
  
  private String state;
  
  private String country;
  
  private Integer woeid;
  
  public Location() {}

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Integer getWoeid() {
    return woeid;
  }

  public void setWoeid(Integer woeid) {
    this.woeid = woeid;
  }
  
  @Override
  public boolean equals(Object o) {
    boolean isEqual = false;
    
    if (o != null) {
      Location loc = (Location) o;
      if (loc.getWoeid() != null) {
        isEqual = loc.getWoeid().equals(this.woeid);
      }
    }
    
    return isEqual;
  }
  
}
