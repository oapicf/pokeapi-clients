package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner   {
  
  private AbilityDetailPokemonInnerPokemon version;
  private Integer maxChance;
  private LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails encounterDetails;

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInner () {

  }

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInner (AbilityDetailPokemonInnerPokemon version, Integer maxChance, LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails encounterDetails) {
    this.version = version;
    this.maxChance = maxChance;
    this.encounterDetails = encounterDetails;
  }

    
  @JsonProperty("version")
  public AbilityDetailPokemonInnerPokemon getVersion() {
    return version;
  }
  public void setVersion(AbilityDetailPokemonInnerPokemon version) {
    this.version = version;
  }

    
  @JsonProperty("max_chance")
  public Integer getMaxChance() {
    return maxChance;
  }
  public void setMaxChance(Integer maxChance) {
    this.maxChance = maxChance;
  }

    
  @JsonProperty("encounter_details")
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails getEncounterDetails() {
    return encounterDetails;
  }
  public void setEncounterDetails(LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails encounterDetails) {
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
    LocationAreaDetailPokemonEncountersInnerVersionDetailsInner locationAreaDetailPokemonEncountersInnerVersionDetailsInner = (LocationAreaDetailPokemonEncountersInnerVersionDetailsInner) o;
    return Objects.equals(version, locationAreaDetailPokemonEncountersInnerVersionDetailsInner.version) &&
        Objects.equals(maxChance, locationAreaDetailPokemonEncountersInnerVersionDetailsInner.maxChance) &&
        Objects.equals(encounterDetails, locationAreaDetailPokemonEncountersInnerVersionDetailsInner.encounterDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, maxChance, encounterDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
