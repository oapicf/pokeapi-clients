package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LocationAreaDetailEncounterMethodRatesInner
 */

@JsonTypeName("LocationAreaDetail_encounter_method_rates_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T02:00:43.960184425Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocationAreaDetailEncounterMethodRatesInner {

  private AbilityDetailPokemonInnerPokemon encounterMethod;

  private List<@Valid LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails = new ArrayList<>();

  public LocationAreaDetailEncounterMethodRatesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocationAreaDetailEncounterMethodRatesInner(AbilityDetailPokemonInnerPokemon encounterMethod, List<@Valid LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails) {
    this.encounterMethod = encounterMethod;
    this.versionDetails = versionDetails;
  }

  public LocationAreaDetailEncounterMethodRatesInner encounterMethod(AbilityDetailPokemonInnerPokemon encounterMethod) {
    this.encounterMethod = encounterMethod;
    return this;
  }

  /**
   * Get encounterMethod
   * @return encounterMethod
   */
  @NotNull @Valid 
  @Schema(name = "encounter_method", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("encounter_method")
  public AbilityDetailPokemonInnerPokemon getEncounterMethod() {
    return encounterMethod;
  }

  @JsonProperty("encounter_method")
  public void setEncounterMethod(AbilityDetailPokemonInnerPokemon encounterMethod) {
    this.encounterMethod = encounterMethod;
  }

  public LocationAreaDetailEncounterMethodRatesInner versionDetails(List<@Valid LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public LocationAreaDetailEncounterMethodRatesInner addVersionDetailsItem(LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }
    this.versionDetails.add(versionDetailsItem);
    return this;
  }

  /**
   * Get versionDetails
   * @return versionDetails
   */
  @NotNull @Valid 
  @Schema(name = "version_details", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_details")
  public List<@Valid LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> getVersionDetails() {
    return versionDetails;
  }

  @JsonProperty("version_details")
  public void setVersionDetails(List<@Valid LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails) {
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
    LocationAreaDetailEncounterMethodRatesInner locationAreaDetailEncounterMethodRatesInner = (LocationAreaDetailEncounterMethodRatesInner) o;
    return Objects.equals(this.encounterMethod, locationAreaDetailEncounterMethodRatesInner.encounterMethod) &&
        Objects.equals(this.versionDetails, locationAreaDetailEncounterMethodRatesInner.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encounterMethod, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaDetailEncounterMethodRatesInner {\n");
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

