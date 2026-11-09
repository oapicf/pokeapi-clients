package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.EncounterConditionValueSummary;
import com.prokarma.pkmst.model.EncounterMethodSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokemonEncounterDetailResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonEncounterDetailResponse   {
  @JsonProperty("chance")
  private Integer chance;

  @JsonProperty("condition_values")
  
  private List<EncounterConditionValueSummary> conditionValues = new ArrayList<>();

  @JsonProperty("max_level")
  private Integer maxLevel;

  @JsonProperty("method")
  private EncounterMethodSummary method;

  @JsonProperty("min_level")
  private Integer minLevel;

  public PokemonEncounterDetailResponse chance(Integer chance) {
    this.chance = chance;
    return this;
  }

  /**
   * Percent chance that this encounter will occur.
   * @return chance
   */
  @ApiModelProperty(required = true, value = "Percent chance that this encounter will occur.")
  public Integer getChance() {
    return chance;
  }

  public void setChance(Integer chance) {
    this.chance = chance;
  }

  public PokemonEncounterDetailResponse conditionValues(List<EncounterConditionValueSummary> conditionValues) {
    this.conditionValues = conditionValues;
    return this;
  }

  public PokemonEncounterDetailResponse addConditionValuesItem(EncounterConditionValueSummary conditionValuesItem) {
    if (this.conditionValues == null) {
      this.conditionValues = new ArrayList<>();
    }
    this.conditionValues.add(conditionValuesItem);
    return this;
  }

  /**
   * A list of condition values that must be in effect for this encounter to occur.
   * @return conditionValues
   */
  @ApiModelProperty(required = true, value = "A list of condition values that must be in effect for this encounter to occur.")
  public List<EncounterConditionValueSummary> getConditionValues() {
    return conditionValues;
  }

  public void setConditionValues(List<EncounterConditionValueSummary> conditionValues) {
    this.conditionValues = conditionValues;
  }

  public PokemonEncounterDetailResponse maxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
    return this;
  }

  /**
   * The highest level the Pokémon could be encountered at.
   * @return maxLevel
   */
  @ApiModelProperty(required = true, value = "The highest level the Pokémon could be encountered at.")
  public Integer getMaxLevel() {
    return maxLevel;
  }

  public void setMaxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
  }

  public PokemonEncounterDetailResponse method(EncounterMethodSummary method) {
    this.method = method;
    return this;
  }

  /**
   * The method by which this encounter happens.
   * @return method
   */
  @ApiModelProperty(required = true, value = "The method by which this encounter happens.")
  public EncounterMethodSummary getMethod() {
    return method;
  }

  public void setMethod(EncounterMethodSummary method) {
    this.method = method;
  }

  public PokemonEncounterDetailResponse minLevel(Integer minLevel) {
    this.minLevel = minLevel;
    return this;
  }

  /**
   * The lowest level the Pokémon could be encountered at.
   * @return minLevel
   */
  @ApiModelProperty(required = true, value = "The lowest level the Pokémon could be encountered at.")
  public Integer getMinLevel() {
    return minLevel;
  }

  public void setMinLevel(Integer minLevel) {
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
    PokemonEncounterDetailResponse pokemonEncounterDetailResponse = (PokemonEncounterDetailResponse) o;
    return Objects.equals(this.chance, pokemonEncounterDetailResponse.chance) &&
        Objects.equals(this.conditionValues, pokemonEncounterDetailResponse.conditionValues) &&
        Objects.equals(this.maxLevel, pokemonEncounterDetailResponse.maxLevel) &&
        Objects.equals(this.method, pokemonEncounterDetailResponse.method) &&
        Objects.equals(this.minLevel, pokemonEncounterDetailResponse.minLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chance, conditionValues, maxLevel, method, minLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonEncounterDetailResponse {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

