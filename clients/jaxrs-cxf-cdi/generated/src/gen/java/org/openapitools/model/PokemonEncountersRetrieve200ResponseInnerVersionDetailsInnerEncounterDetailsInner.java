package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner   {
  
  private BigDecimal chance;

  private List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> conditionValues = new ArrayList<>();

  private BigDecimal maxLevel;

  private PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod method;

  private BigDecimal minLevel;

  /**
   **/
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner chance(BigDecimal chance) {
    this.chance = chance;
    return this;
  }

  
  @ApiModelProperty(example = "100", required = true, value = "")
  @JsonProperty("chance")
  @NotNull
  public BigDecimal getChance() {
    return chance;
  }
  public void setChance(BigDecimal chance) {
    this.chance = chance;
  }


  /**
   **/
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner conditionValues(List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> conditionValues) {
    this.conditionValues = conditionValues;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("condition_values")
  @NotNull
  public List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> getConditionValues() {
    return conditionValues;
  }
  public void setConditionValues(List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> conditionValues) {
    this.conditionValues = conditionValues;
  }

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner addConditionValuesItem(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner conditionValuesItem) {
    if (this.conditionValues == null) {
      this.conditionValues = new ArrayList<>();
    }
    this.conditionValues.add(conditionValuesItem);
    return this;
  }


  /**
   **/
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner maxLevel(BigDecimal maxLevel) {
    this.maxLevel = maxLevel;
    return this;
  }

  
  @ApiModelProperty(example = "10", required = true, value = "")
  @JsonProperty("max_level")
  @NotNull
  public BigDecimal getMaxLevel() {
    return maxLevel;
  }
  public void setMaxLevel(BigDecimal maxLevel) {
    this.maxLevel = maxLevel;
  }


  /**
   **/
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner method(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod method) {
    this.method = method;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("method")
  @NotNull
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod getMethod() {
    return method;
  }
  public void setMethod(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod method) {
    this.method = method;
  }


  /**
   **/
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner minLevel(BigDecimal minLevel) {
    this.minLevel = minLevel;
    return this;
  }

  
  @ApiModelProperty(example = "10", required = true, value = "")
  @JsonProperty("min_level")
  @NotNull
  public BigDecimal getMinLevel() {
    return minLevel;
  }
  public void setMinLevel(BigDecimal minLevel) {
    this.minLevel = minLevel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner = (PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner) o;
    return Objects.equals(this.chance, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.chance) &&
        Objects.equals(this.conditionValues, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.conditionValues) &&
        Objects.equals(this.maxLevel, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.maxLevel) &&
        Objects.equals(this.method, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.method) &&
        Objects.equals(this.minLevel, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.minLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chance, conditionValues, maxLevel, method, minLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner {\n");
    
    sb.append("    chance: ").append(toIndentedString(chance)).append("\n");
    sb.append("    conditionValues: ").append(toIndentedString(conditionValues)).append("\n");
    sb.append("    maxLevel: ").append(toIndentedString(maxLevel)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    minLevel: ").append(toIndentedString(minLevel)).append("\n");
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

