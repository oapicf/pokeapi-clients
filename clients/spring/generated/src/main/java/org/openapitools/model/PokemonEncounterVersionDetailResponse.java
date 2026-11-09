package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonEncounterDetailResponse;
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
 * PokemonEncounterVersionDetailResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonEncounterVersionDetailResponse {

  private VersionSummary version;

  private Integer maxChance;

  private List<@Valid PokemonEncounterDetailResponse> encounterDetails = new ArrayList<>();

  public PokemonEncounterVersionDetailResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonEncounterVersionDetailResponse(VersionSummary version, Integer maxChance, List<@Valid PokemonEncounterDetailResponse> encounterDetails) {
    this.version = version;
    this.maxChance = maxChance;
    this.encounterDetails = encounterDetails;
  }

  public PokemonEncounterVersionDetailResponse version(VersionSummary version) {
    this.version = version;
    return this;
  }

  /**
   * The game version this encounter happens in.
   * @return version
   */
  @NotNull @Valid 
  @Schema(name = "version", description = "The game version this encounter happens in.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public VersionSummary getVersion() {
    return version;
  }

  @JsonProperty("version")
  public void setVersion(VersionSummary version) {
    this.version = version;
  }

  public PokemonEncounterVersionDetailResponse maxChance(Integer maxChance) {
    this.maxChance = maxChance;
    return this;
  }

  /**
   * The total percentage of all encounter potential.
   * @return maxChance
   */
  @NotNull 
  @Schema(name = "max_chance", description = "The total percentage of all encounter potential.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max_chance")
  public Integer getMaxChance() {
    return maxChance;
  }

  @JsonProperty("max_chance")
  public void setMaxChance(Integer maxChance) {
    this.maxChance = maxChance;
  }

  public PokemonEncounterVersionDetailResponse encounterDetails(List<@Valid PokemonEncounterDetailResponse> encounterDetails) {
    this.encounterDetails = encounterDetails;
    return this;
  }

  public PokemonEncounterVersionDetailResponse addEncounterDetailsItem(PokemonEncounterDetailResponse encounterDetailsItem) {
    if (this.encounterDetails == null) {
      this.encounterDetails = new ArrayList<>();
    }
    this.encounterDetails.add(encounterDetailsItem);
    return this;
  }

  /**
   * A list of encounters and their specifics.
   * @return encounterDetails
   */
  @NotNull 
  @Schema(name = "encounter_details", description = "A list of encounters and their specifics.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("encounter_details")
  public List<@Valid PokemonEncounterDetailResponse> getEncounterDetails() {
    return encounterDetails;
  }

  @JsonProperty("encounter_details")
  public void setEncounterDetails(List<@Valid PokemonEncounterDetailResponse> encounterDetails) {
    this.encounterDetails = encounterDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonEncounterVersionDetailResponse pokemonEncounterVersionDetailResponse = (PokemonEncounterVersionDetailResponse) o;
    return Objects.equals(this.version, pokemonEncounterVersionDetailResponse.version) &&
        Objects.equals(this.maxChance, pokemonEncounterVersionDetailResponse.maxChance) &&
        Objects.equals(this.encounterDetails, pokemonEncounterVersionDetailResponse.encounterDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, maxChance, encounterDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonEncounterVersionDetailResponse {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    maxChance: ").append(toIndentedString(maxChance)).append("\n");
    sb.append("    encounterDetails: ").append(toIndentedString(encounterDetails)).append("\n");
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

