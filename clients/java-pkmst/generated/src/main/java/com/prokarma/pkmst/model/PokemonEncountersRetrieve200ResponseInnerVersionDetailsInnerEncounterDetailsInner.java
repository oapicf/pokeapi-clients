package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner;
import com.prokarma.pkmst.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner   {
  @JsonProperty("chance")
  private BigDecimal chance;

  @JsonProperty("condition_values")
  
  private List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> conditionValues = new ArrayList<>();

  @JsonProperty("max_level")
  private BigDecimal maxLevel;

  @JsonProperty("method")
  private PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod method;

  @JsonProperty("min_level")
  private BigDecimal minLevel;

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner chance(BigDecimal chance) {
    this.chance = chance;
    return this;
  }

  /**
   * Get chance
   * @return chance
   */
  @ApiModelProperty(example = "100", required = true, value = "")
  public BigDecimal getChance() {
    return chance;
  }

  public void setChance(BigDecimal chance) {
    this.chance = chance;
  }

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner conditionValues(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> conditionValues) {
    this.conditionValues = conditionValues;
    return this;
  }

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner addConditionValuesItem(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner conditionValuesItem) {
    if (this.conditionValues == null) {
      this.conditionValues = new ArrayList<>();
    }
    this.conditionValues.add(conditionValuesItem);
    return this;
  }

  /**
   * Get conditionValues
   * @return conditionValues
   */
  @ApiModelProperty(required = true, value = "")
  public List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> getConditionValues() {
    return conditionValues;
  }

  public void setConditionValues(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> conditionValues) {
    this.conditionValues = conditionValues;
  }

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner maxLevel(BigDecimal maxLevel) {
    this.maxLevel = maxLevel;
    return this;
  }

  /**
   * Get maxLevel
   * @return maxLevel
   */
  @ApiModelProperty(example = "10", required = true, value = "")
  public BigDecimal getMaxLevel() {
    return maxLevel;
  }

  public void setMaxLevel(BigDecimal maxLevel) {
    this.maxLevel = maxLevel;
  }

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner method(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
   */
  @ApiModelProperty(required = true, value = "")
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod getMethod() {
    return method;
  }

  public void setMethod(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod method) {
    this.method = method;
  }

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner minLevel(BigDecimal minLevel) {
    this.minLevel = minLevel;
    return this;
  }

  /**
   * Get minLevel
   * @return minLevel
   */
  @ApiModelProperty(example = "10", required = true, value = "")
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

