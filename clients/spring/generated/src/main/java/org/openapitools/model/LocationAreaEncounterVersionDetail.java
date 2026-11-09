package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.VersionSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LocationAreaEncounterVersionDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaEncounterVersionDetail {

  private Integer rate;

  private VersionSummary version;

  public LocationAreaEncounterVersionDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocationAreaEncounterVersionDetail(Integer rate, VersionSummary version) {
    this.rate = rate;
    this.version = version;
  }

  public LocationAreaEncounterVersionDetail rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  /**
   * The chance of an encounter to occur.
   * @return rate
   */
  @NotNull 
  @Schema(name = "rate", description = "The chance of an encounter to occur.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rate")
  public Integer getRate() {
    return rate;
  }

  @JsonProperty("rate")
  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public LocationAreaEncounterVersionDetail version(VersionSummary version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the game in which the encounter can occur with the given chance.
   * @return version
   */
  @NotNull @Valid 
  @Schema(name = "version", description = "The version of the game in which the encounter can occur with the given chance.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public VersionSummary getVersion() {
    return version;
  }

  @JsonProperty("version")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

