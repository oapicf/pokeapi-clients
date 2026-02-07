package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails   {
  @JsonProperty("min_level")
  private Integer minLevel;

  @JsonProperty("max_level")
  private Integer maxLevel;

  @JsonProperty("condition_values")
  private AbilityDetailPokemonInnerPokemon conditionValues;

  @JsonProperty("chance")
  private Integer chance;

  @JsonProperty("method")
  private AbilityDetailPokemonInnerPokemon method;

  /**
   **/
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails minLevel(Integer minLevel) {
    this.minLevel = minLevel;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("min_level")
  public Integer getMinLevel() {
    return minLevel;
  }
  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  /**
   **/
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails maxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("max_level")
  public Integer getMaxLevel() {
    return maxLevel;
  }
  public void setMaxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
  }

  /**
   **/
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails conditionValues(AbilityDetailPokemonInnerPokemon conditionValues) {
    this.conditionValues = conditionValues;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("condition_values")
  public AbilityDetailPokemonInnerPokemon getConditionValues() {
    return conditionValues;
  }
  public void setConditionValues(AbilityDetailPokemonInnerPokemon conditionValues) {
    this.conditionValues = conditionValues;
  }

  /**
   **/
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails chance(Integer chance) {
    this.chance = chance;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("chance")
  public Integer getChance() {
    return chance;
  }
  public void setChance(Integer chance) {
    this.chance = chance;
  }

  /**
   **/
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails method(AbilityDetailPokemonInnerPokemon method) {
    this.method = method;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

