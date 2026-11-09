package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonEncounterDetailResponse;
import org.openapitools.model.VersionSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonEncounterVersionDetailResponse  {
  
 /**
  * The game version this encounter happens in.
  */
  @ApiModelProperty(required = true, value = "The game version this encounter happens in.")
  @Valid
  private VersionSummary version;

 /**
  * The total percentage of all encounter potential.
  */
  @ApiModelProperty(required = true, value = "The total percentage of all encounter potential.")
  private Integer maxChance;

 /**
  * A list of encounters and their specifics.
  */
  @ApiModelProperty(required = true, value = "A list of encounters and their specifics.")
  private List<@Valid PokemonEncounterDetailResponse> encounterDetails = new ArrayList<>();
 /**
  * The game version this encounter happens in.
  * @return version
  */
  @JsonProperty("version")
  @NotNull
  public VersionSummary getVersion() {
    return version;
  }

  /**
   * Sets the <code>version</code> property.
   */
 public void setVersion(VersionSummary version) {
    this.version = version;
  }

  /**
   * Sets the <code>version</code> property.
   */
  public PokemonEncounterVersionDetailResponse version(VersionSummary version) {
    this.version = version;
    return this;
  }

 /**
  * The total percentage of all encounter potential.
  * @return maxChance
  */
  @JsonProperty("max_chance")
  @NotNull
  public Integer getMaxChance() {
    return maxChance;
  }

  /**
   * Sets the <code>maxChance</code> property.
   */
 public void setMaxChance(Integer maxChance) {
    this.maxChance = maxChance;
  }

  /**
   * Sets the <code>maxChance</code> property.
   */
  public PokemonEncounterVersionDetailResponse maxChance(Integer maxChance) {
    this.maxChance = maxChance;
    return this;
  }

 /**
  * A list of encounters and their specifics.
  * @return encounterDetails
  */
  @JsonProperty("encounter_details")
  @NotNull
  public List<@Valid PokemonEncounterDetailResponse> getEncounterDetails() {
    return encounterDetails;
  }

  /**
   * Sets the <code>encounterDetails</code> property.
   */
 public void setEncounterDetails(List<@Valid PokemonEncounterDetailResponse> encounterDetails) {
    this.encounterDetails = encounterDetails;
  }

  /**
   * Sets the <code>encounterDetails</code> property.
   */
  public PokemonEncounterVersionDetailResponse encounterDetails(List<@Valid PokemonEncounterDetailResponse> encounterDetails) {
    this.encounterDetails = encounterDetails;
    return this;
  }

  /**
   * Adds a new item to the <code>encounterDetails</code> list.
   */
  public PokemonEncounterVersionDetailResponse addEncounterDetailsItem(PokemonEncounterDetailResponse encounterDetailsItem) {
    this.encounterDetails.add(encounterDetailsItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

