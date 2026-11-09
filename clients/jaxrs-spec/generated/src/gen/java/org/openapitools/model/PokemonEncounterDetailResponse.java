package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterConditionValueSummary;
import org.openapitools.model.EncounterMethodSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonEncounterDetailResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonEncounterDetailResponse   {
  private Integer chance;
  private List<@Valid EncounterConditionValueSummary> conditionValues = new ArrayList<>();
  private Integer maxLevel;
  private EncounterMethodSummary method;
  private Integer minLevel;

  public PokemonEncounterDetailResponse() {
  }

  @JsonCreator
  public PokemonEncounterDetailResponse(
    @JsonProperty(required = true, value = "chance") Integer chance,
    @JsonProperty(required = true, value = "condition_values") List<@Valid EncounterConditionValueSummary> conditionValues,
    @JsonProperty(required = true, value = "max_level") Integer maxLevel,
    @JsonProperty(required = true, value = "method") EncounterMethodSummary method,
    @JsonProperty(required = true, value = "min_level") Integer minLevel
  ) {
    this.chance = chance;
    this.conditionValues = conditionValues;
    this.maxLevel = maxLevel;
    this.method = method;
    this.minLevel = minLevel;
  }

  /**
   * Percent chance that this encounter will occur.
   **/
  public PokemonEncounterDetailResponse chance(Integer chance) {
    this.chance = chance;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Percent chance that this encounter will occur.")
  @JsonProperty(required = true, value = "chance")
  @NotNull public Integer getChance() {
    return chance;
  }

  @JsonProperty(required = true, value = "chance")
  public void setChance(Integer chance) {
    this.chance = chance;
  }

  /**
   * A list of condition values that must be in effect for this encounter to occur.
   **/
  public PokemonEncounterDetailResponse conditionValues(List<@Valid EncounterConditionValueSummary> conditionValues) {
    this.conditionValues = conditionValues;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of condition values that must be in effect for this encounter to occur.")
  @JsonProperty(required = true, value = "condition_values")
  @NotNull public List<@Valid EncounterConditionValueSummary> getConditionValues() {
    return conditionValues;
  }

  @JsonProperty(required = true, value = "condition_values")
  public void setConditionValues(List<@Valid EncounterConditionValueSummary> conditionValues) {
    this.conditionValues = conditionValues;
  }

  public PokemonEncounterDetailResponse addConditionValuesItem(EncounterConditionValueSummary conditionValuesItem) {
    if (this.conditionValues == null) {
      this.conditionValues = new ArrayList<>();
    }

    this.conditionValues.add(conditionValuesItem);
    return this;
  }

  public PokemonEncounterDetailResponse removeConditionValuesItem(EncounterConditionValueSummary conditionValuesItem) {
    if (conditionValuesItem != null && this.conditionValues != null) {
      this.conditionValues.remove(conditionValuesItem);
    }

    return this;
  }
  /**
   * The highest level the Pokémon could be encountered at.
   **/
  public PokemonEncounterDetailResponse maxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The highest level the Pokémon could be encountered at.")
  @JsonProperty(required = true, value = "max_level")
  @NotNull public Integer getMaxLevel() {
    return maxLevel;
  }

  @JsonProperty(required = true, value = "max_level")
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
  @JsonProperty(required = true, value = "method")
  @NotNull @Valid public EncounterMethodSummary getMethod() {
    return method;
  }

  @JsonProperty(required = true, value = "method")
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
  @JsonProperty(required = true, value = "min_level")
  @NotNull public Integer getMinLevel() {
    return minLevel;
  }

  @JsonProperty(required = true, value = "min_level")
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
