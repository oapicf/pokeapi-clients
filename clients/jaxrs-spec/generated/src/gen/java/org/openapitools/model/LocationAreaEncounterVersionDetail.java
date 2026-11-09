package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VersionSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LocationAreaEncounterVersionDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaEncounterVersionDetail   {
  private Integer rate;
  private VersionSummary version;

  public LocationAreaEncounterVersionDetail() {
  }

  @JsonCreator
  public LocationAreaEncounterVersionDetail(
    @JsonProperty(required = true, value = "rate") Integer rate,
    @JsonProperty(required = true, value = "version") VersionSummary version
  ) {
    this.rate = rate;
    this.version = version;
  }

  /**
   * The chance of an encounter to occur.
   **/
  public LocationAreaEncounterVersionDetail rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The chance of an encounter to occur.")
  @JsonProperty(required = true, value = "rate")
  @NotNull public Integer getRate() {
    return rate;
  }

  @JsonProperty(required = true, value = "rate")
  public void setRate(Integer rate) {
    this.rate = rate;
  }

  /**
   * The version of the game in which the encounter can occur with the given chance.
   **/
  public LocationAreaEncounterVersionDetail version(VersionSummary version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version of the game in which the encounter can occur with the given chance.")
  @JsonProperty(required = true, value = "version")
  @NotNull @Valid public VersionSummary getVersion() {
    return version;
  }

  @JsonProperty(required = true, value = "version")
  public void setVersion(VersionSummary version) {
    this.version = version;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
