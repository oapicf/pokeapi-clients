package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaSummary;
import org.openapitools.model.PokemonEncounterVersionDetailResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonEncounterResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonEncounterResponse {

  private LocationAreaSummary locationArea;

  private List<@Valid PokemonEncounterVersionDetailResponse> versionDetails = new ArrayList<>();

  public PokemonEncounterResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonEncounterResponse(LocationAreaSummary locationArea, List<@Valid PokemonEncounterVersionDetailResponse> versionDetails) {
    this.locationArea = locationArea;
    this.versionDetails = versionDetails;
  }

  public PokemonEncounterResponse locationArea(LocationAreaSummary locationArea) {
    this.locationArea = locationArea;
    return this;
  }

  /**
   * The location area the referenced Pokémon can be encountered in.
   * @return locationArea
   */
  @NotNull @Valid 
  @Schema(name = "location_area", description = "The location area the referenced Pokémon can be encountered in.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("location_area")
  public LocationAreaSummary getLocationArea() {
    return locationArea;
  }

  public void setLocationArea(LocationAreaSummary locationArea) {
    this.locationArea = locationArea;
  }

  public PokemonEncounterResponse versionDetails(List<@Valid PokemonEncounterVersionDetailResponse> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public PokemonEncounterResponse addVersionDetailsItem(PokemonEncounterVersionDetailResponse versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }
    this.versionDetails.add(versionDetailsItem);
    return this;
  }

  /**
   * A list of versions and encounters with the referenced Pokémon that might happen.
   * @return versionDetails
   */
  @NotNull 
  @Schema(name = "version_details", description = "A list of versions and encounters with the referenced Pokémon that might happen.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_details")
  public List<@Valid PokemonEncounterVersionDetailResponse> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<@Valid PokemonEncounterVersionDetailResponse> versionDetails) {
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
    PokemonEncounterResponse pokemonEncounterResponse = (PokemonEncounterResponse) o;
    return Objects.equals(this.locationArea, pokemonEncounterResponse.locationArea) &&
        Objects.equals(this.versionDetails, pokemonEncounterResponse.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationArea, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonEncounterResponse {\n");
    sb.append("    locationArea: ").append(toIndentedString(locationArea)).append("\n");
    sb.append("    versionDetails: ").append(toIndentedString(versionDetails)).append("\n");
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

