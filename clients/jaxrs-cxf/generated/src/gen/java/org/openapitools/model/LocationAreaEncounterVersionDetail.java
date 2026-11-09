package org.openapitools.model;

import org.openapitools.model.VersionSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LocationAreaEncounterVersionDetail  {
  
 /**
  * The chance of an encounter to occur.
  */
  @ApiModelProperty(required = true, value = "The chance of an encounter to occur.")

  private Integer rate;

 /**
  * The version of the game in which the encounter can occur with the given chance.
  */
  @ApiModelProperty(required = true, value = "The version of the game in which the encounter can occur with the given chance.")

  @Valid

  private VersionSummary version;
 /**
   * The chance of an encounter to occur.
   * @return rate
  **/
  @JsonProperty("rate")
  @NotNull
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public LocationAreaEncounterVersionDetail rate(Integer rate) {
    this.rate = rate;
    return this;
  }

 /**
   * The version of the game in which the encounter can occur with the given chance.
   * @return version
  **/
  @JsonProperty("version")
  @NotNull
  public VersionSummary getVersion() {
    return version;
  }

  public void setVersion(VersionSummary version) {
    this.version = version;
  }

  public LocationAreaEncounterVersionDetail version(VersionSummary version) {
    this.version = version;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAreaEncounterVersionDetail locationAreaEncounterVersionDetail = (LocationAreaEncounterVersionDetail) o;
    return Objects.equals(this.rate, locationAreaEncounterVersionDetail.rate) &&
        Objects.equals(this.version, locationAreaEncounterVersionDetail.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaEncounterVersionDetail {\n");
    
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

