package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterMethodSummary;
import org.openapitools.model.LocationAreaEncounterVersionDetail;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LocationAreaEncounterRate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaEncounterRate {

  private EncounterMethodSummary encounterMethod;

  private List<@Valid LocationAreaEncounterVersionDetail> versionDetails = new ArrayList<>();

  public LocationAreaEncounterRate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocationAreaEncounterRate(EncounterMethodSummary encounterMethod, List<@Valid LocationAreaEncounterVersionDetail> versionDetails) {
    this.encounterMethod = encounterMethod;
    this.versionDetails = versionDetails;
  }

  public LocationAreaEncounterRate encounterMethod(EncounterMethodSummary encounterMethod) {
    this.encounterMethod = encounterMethod;
    return this;
  }

  /**
   * The method in which Pokémon may be encountered in an area..
   * @return encounterMethod
   */
  @NotNull @Valid 
  @Schema(name = "encounter_method", description = "The method in which Pokémon may be encountered in an area..", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("encounter_method")
  public EncounterMethodSummary getEncounterMethod() {
    return encounterMethod;
  }

  @JsonProperty("encounter_method")
  public void setEncounterMethod(EncounterMethodSummary encounterMethod) {
    this.encounterMethod = encounterMethod;
  }

  public LocationAreaEncounterRate versionDetails(List<@Valid LocationAreaEncounterVersionDetail> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public LocationAreaEncounterRate addVersionDetailsItem(LocationAreaEncounterVersionDetail versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }
    this.versionDetails.add(versionDetailsItem);
    return this;
  }

  /**
   * The chance of the encounter to occur on a version of the game.
   * @return versionDetails
   */
  @NotNull 
  @Schema(name = "version_details", description = "The chance of the encounter to occur on a version of the game.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_details")
  public List<@Valid LocationAreaEncounterVersionDetail> getVersionDetails() {
    return versionDetails;
  }

  @JsonProperty("version_details")
  public void setVersionDetails(List<@Valid LocationAreaEncounterVersionDetail> versionDetails) {
    this.versionDetails = versionDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAreaEncounterRate locationAreaEncounterRate = (LocationAreaEncounterRate) o;
    return Objects.equals(this.encounterMethod, locationAreaEncounterRate.encounterMethod) &&
        Objects.equals(this.versionDetails, locationAreaEncounterRate.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encounterMethod, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaEncounterRate {\n");
    sb.append("    encounterMethod: ").append(toIndentedString(encounterMethod)).append("\n");
    sb.append("    versionDetails: ").append(toIndentedString(versionDetails)).append("\n");
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

