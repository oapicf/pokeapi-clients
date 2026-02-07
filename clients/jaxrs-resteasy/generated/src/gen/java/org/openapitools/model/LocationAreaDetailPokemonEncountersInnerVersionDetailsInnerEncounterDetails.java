package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-07T04:17:47.675703185Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails   {
  
  private Integer minLevel;
  private Integer maxLevel;
  private AbilityDetailPokemonInnerPokemon conditionValues;
  private Integer chance;
  private AbilityDetailPokemonInnerPokemon method;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("min_level")
  @NotNull
  public Integer getMinLevel() {
    return minLevel;
  }
  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("max_level")
  @NotNull
  public Integer getMaxLevel() {
    return maxLevel;
  }
  public void setMaxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("condition_values")
  @Valid
  public AbilityDetailPokemonInnerPokemon getConditionValues() {
    return conditionValues;
  }
  public void setConditionValues(AbilityDetailPokemonInnerPokemon conditionValues) {
    this.conditionValues = conditionValues;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("chance")
  @NotNull
  public Integer getChance() {
    return chance;
  }
  public void setChance(Integer chance) {
    this.chance = chance;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("method")
  @NotNull
  @Valid
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

