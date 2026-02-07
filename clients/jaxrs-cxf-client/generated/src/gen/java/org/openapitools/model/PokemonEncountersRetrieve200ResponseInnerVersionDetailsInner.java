package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner  {
  
  @ApiModelProperty(required = true, value = "")

  private List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails = new ArrayList<>();

  @ApiModelProperty(example = "100", required = true, value = "")

  private BigDecimal maxChance;

  @ApiModelProperty(required = true, value = "")

  private PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion version;
 /**
   * Get encounterDetails
   * @return encounterDetails
  **/
  @JsonProperty("encounter_details")
  public List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> getEncounterDetails() {
    return encounterDetails;
  }

  public void setEncounterDetails(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails) {
    this.encounterDetails = encounterDetails;
  }

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner encounterDetails(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails) {
    this.encounterDetails = encounterDetails;
    return this;
  }

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner addEncounterDetailsItem(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner encounterDetailsItem) {
    this.encounterDetails.add(encounterDetailsItem);
    return this;
  }

 /**
   * Get maxChance
   * @return maxChance
  **/
  @JsonProperty("max_chance")
  public BigDecimal getMaxChance() {
    return maxChance;
  }

  public void setMaxChance(BigDecimal maxChance) {
    this.maxChance = maxChance;
  }

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner maxChance(BigDecimal maxChance) {
    this.maxChance = maxChance;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion getVersion() {
    return version;
  }

  public void setVersion(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion version) {
    this.version = version;
  }

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner version(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion version) {
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
    PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner = (PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner) o;
    return Objects.equals(this.encounterDetails, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner.encounterDetails) &&
        Objects.equals(this.maxChance, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner.maxChance) &&
        Objects.equals(this.version, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encounterDetails, maxChance, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner {\n");
    
    sb.append("    encounterDetails: ").append(toIndentedString(encounterDetails)).append("\n");
    sb.append("    maxChance: ").append(toIndentedString(maxChance)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

