package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails   {
  private Integer minLevel;
  private Integer maxLevel;
  private AbilityDetailPokemonInnerPokemon conditionValues;
  private Integer chance;
  private AbilityDetailPokemonInnerPokemon method;

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails() {
  }

  @JsonCreator
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails(
    @JsonProperty(required = true, value = "min_level") Integer minLevel,
    @JsonProperty(required = true, value = "max_level") Integer maxLevel,
    @JsonProperty(required = true, value = "chance") Integer chance,
    @JsonProperty(required = true, value = "method") AbilityDetailPokemonInnerPokemon method
  ) {
    this.minLevel = minLevel;
    this.maxLevel = maxLevel;
    this.chance = chance;
    this.method = method;
  }

  /**
   **/
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails minLevel(Integer minLevel) {
    this.minLevel = minLevel;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "min_level")
  @NotNull public Integer getMinLevel() {
    return minLevel;
  }

  @JsonProperty(required = true, value = "min_level")
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
  @JsonProperty(required = true, value = "max_level")
  @NotNull public Integer getMaxLevel() {
    return maxLevel;
  }

  @JsonProperty(required = true, value = "max_level")
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
  @Valid public AbilityDetailPokemonInnerPokemon getConditionValues() {
    return conditionValues;
  }

  @JsonProperty("condition_values")
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
  @JsonProperty(required = true, value = "chance")
  @NotNull public Integer getChance() {
    return chance;
  }

  @JsonProperty(required = true, value = "chance")
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
  @JsonProperty(required = true, value = "method")
  @NotNull @Valid public AbilityDetailPokemonInnerPokemon getMethod() {
    return method;
  }

  @JsonProperty(required = true, value = "method")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

