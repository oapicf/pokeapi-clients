package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails   {
  
  private Integer minLevel;
  private Integer maxLevel;
  private AbilityDetailPokemonInnerPokemon conditionValues;
  private Integer chance;
  private AbilityDetailPokemonInnerPokemon method;

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails () {

  }

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails (Integer minLevel, Integer maxLevel, AbilityDetailPokemonInnerPokemon conditionValues, Integer chance, AbilityDetailPokemonInnerPokemon method) {
    this.minLevel = minLevel;
    this.maxLevel = maxLevel;
    this.conditionValues = conditionValues;
    this.chance = chance;
    this.method = method;
  }

    
  @JsonProperty("min_level")
  public Integer getMinLevel() {
    return minLevel;
  }
  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

    
  @JsonProperty("max_level")
  public Integer getMaxLevel() {
    return maxLevel;
  }
  public void setMaxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
  }

    
  @JsonProperty("condition_values")
  public AbilityDetailPokemonInnerPokemon getConditionValues() {
    return conditionValues;
  }
  public void setConditionValues(AbilityDetailPokemonInnerPokemon conditionValues) {
    this.conditionValues = conditionValues;
  }

    
  @JsonProperty("chance")
  public Integer getChance() {
    return chance;
  }
  public void setChance(Integer chance) {
    this.chance = chance;
  }

    
  @JsonProperty("method")
  public AbilityDetailPokemonInnerPokemon getMethod() {
    return method;
  }
  public void setMethod(AbilityDetailPokemonInnerPokemon method) {
    this.method = method;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails = (LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails) o;
    return Objects.equals(minLevel, locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.minLevel) &&
        Objects.equals(maxLevel, locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.maxLevel) &&
        Objects.equals(conditionValues, locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.conditionValues) &&
        Objects.equals(chance, locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.chance) &&
        Objects.equals(method, locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minLevel, maxLevel, conditionValues, chance, method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails {\n");
    
    sb.append("    minLevel: ").append(toIndentedString(minLevel)).append("\n");
    sb.append("    maxLevel: ").append(toIndentedString(maxLevel)).append("\n");
    sb.append("    conditionValues: ").append(toIndentedString(conditionValues)).append("\n");
    sb.append("    chance: ").append(toIndentedString(chance)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
