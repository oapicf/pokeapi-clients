package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterConditionValueSummary;
import org.openapitools.model.EncounterMethodSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

  /**
   * Percent chance that this encounter will occur.
   **/
  public PokemonEncounterDetailResponse chance(Integer chance) {
    this.chance = chance;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Percent chance that this encounter will occur.")
  @JsonProperty("chance")
  public Integer getChance() {
    return chance;
  }
  public void setChance(Integer chance) {
    this.chance = chance;
  }

  /**
   * A list of condition values that must be in effect for this encounter to occur.
   **/
  public PokemonEncounterDetailResponse conditionValues(List<EncounterConditionValueSummary> conditionValues) {
    this.conditionValues = conditionValues;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of condition values that must be in effect for this encounter to occur.")
  @JsonProperty("condition_values")
  public List<EncounterConditionValueSummary> getConditionValues() {
    return conditionValues;
  }
  public void setConditionValues(List<EncounterConditionValueSummary> conditionValues) {
    this.conditionValues = conditionValues;
  }

  /**
   * The highest level the Pokémon could be encountered at.
   **/
  public PokemonEncounterDetailResponse maxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The highest level the Pokémon could be encountered at.")
  @JsonProperty("max_level")
  public Integer getMaxLevel() {
    return maxLevel;
  }
  public void setMaxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
  }

  /**
   * The method by which this encounter happens.
   **/
  public PokemonEncounterDetailResponse method(EncounterMethodSummary method) {
    this.method = method;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The method by which this encounter happens.")
  @JsonProperty("method")
  public EncounterMethodSummary getMethod() {
    return method;
  }
  public void setMethod(EncounterMethodSummary method) {
    this.method = method;
  }

  /**
   * The lowest level the Pokémon could be encountered at.
   **/
  public PokemonEncounterDetailResponse minLevel(Integer minLevel) {
    this.minLevel = minLevel;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The lowest level the Pokémon could be encountered at.")
  @JsonProperty("min_level")
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
    return Objects.equals(chance, pokemonEncounterDetailResponse.chance) &&
        Objects.equals(conditionValues, pokemonEncounterDetailResponse.conditionValues) &&
        Objects.equals(maxLevel, pokemonEncounterDetailResponse.maxLevel) &&
        Objects.equals(method, pokemonEncounterDetailResponse.method) &&
        Objects.equals(minLevel, pokemonEncounterDetailResponse.minLevel);
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

