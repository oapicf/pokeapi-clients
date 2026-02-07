package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer minLevel;

  @ApiModelProperty(required = true, value = "")

  private Integer maxLevel;

  @ApiModelProperty(value = "")

  private AbilityDetailPokemonInnerPokemon conditionValues;

  @ApiModelProperty(required = true, value = "")

  private Integer chance;

  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon method;
 /**
   * Get minLevel
   * @return minLevel
  **/
  @JsonProperty("min_level")
  public Integer getMinLevel() {
    return minLevel;
  }

  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails minLevel(Integer minLevel) {
    this.minLevel = minLevel;
    return this;
  }

 /**
   * Get maxLevel
   * @return maxLevel
  **/
  @JsonProperty("max_level")
  public Integer getMaxLevel() {
    return maxLevel;
  }

  public void setMaxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
  }

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails maxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
    return this;
  }

 /**
   * Get conditionValues
   * @return conditionValues
  **/
  @JsonProperty("condition_values")
  public AbilityDetailPokemonInnerPokemon getConditionValues() {
    return conditionValues;
  }

  public void setConditionValues(AbilityDetailPokemonInnerPokemon conditionValues) {
    this.conditionValues = conditionValues;
  }

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails conditionValues(AbilityDetailPokemonInnerPokemon conditionValues) {
    this.conditionValues = conditionValues;
    return this;
  }

 /**
   * Get chance
   * @return chance
  **/
  @JsonProperty("chance")
  public Integer getChance() {
    return chance;
  }

  public void setChance(Integer chance) {
    this.chance = chance;
  }

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails chance(Integer chance) {
    this.chance = chance;
    return this;
  }

 /**
   * Get method
   * @return method
  **/
  @JsonProperty("method")
  public AbilityDetailPokemonInnerPokemon getMethod() {
    return method;
  }

  public void setMethod(AbilityDetailPokemonInnerPokemon method) {
    this.method = method;
  }

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails method(AbilityDetailPokemonInnerPokemon method) {
    this.method = method;
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
    LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails = (LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails) o;
    return Objects.equals(this.minLevel, locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.minLevel) &&
        Objects.equals(this.maxLevel, locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.maxLevel) &&
        Objects.equals(this.conditionValues, locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.conditionValues) &&
        Objects.equals(this.chance, locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.chance) &&
        Objects.equals(this.method, locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.method);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

