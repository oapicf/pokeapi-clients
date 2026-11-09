package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterConditionValueSummary;
import org.openapitools.model.EncounterMethodSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonEncounterDetailResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonEncounterDetailResponse {

  private Integer chance;

  private List<@Valid EncounterConditionValueSummary> conditionValues = new ArrayList<>();

  private Integer maxLevel;

  private EncounterMethodSummary method;

  private Integer minLevel;

  public PokemonEncounterDetailResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonEncounterDetailResponse(Integer chance, List<@Valid EncounterConditionValueSummary> conditionValues, Integer maxLevel, EncounterMethodSummary method, Integer minLevel) {
    this.chance = chance;
    this.conditionValues = conditionValues;
    this.maxLevel = maxLevel;
    this.method = method;
    this.minLevel = minLevel;
  }

  public PokemonEncounterDetailResponse chance(Integer chance) {
    this.chance = chance;
    return this;
  }

  /**
   * Percent chance that this encounter will occur.
   * @return chance
   */
  @NotNull 
  @Schema(name = "chance", description = "Percent chance that this encounter will occur.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("chance")
  public Integer getChance() {
    return chance;
  }

  public void setChance(Integer chance) {
    this.chance = chance;
  }

  public PokemonEncounterDetailResponse conditionValues(List<@Valid EncounterConditionValueSummary> conditionValues) {
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
  @NotNull 
  @Schema(name = "condition_values", description = "A list of condition values that must be in effect for this encounter to occur.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("condition_values")
  public List<@Valid EncounterConditionValueSummary> getConditionValues() {
    return conditionValues;
  }

  public void setConditionValues(List<@Valid EncounterConditionValueSummary> conditionValues) {
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
  @NotNull 
  @Schema(name = "max_level", description = "The highest level the Pokémon could be encountered at.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max_level")
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
  @NotNull @Valid 
  @Schema(name = "method", description = "The method by which this encounter happens.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("method")
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
  @NotNull 
  @Schema(name = "min_level", description = "The lowest level the Pokémon could be encountered at.", requiredMode = Schema.RequiredMode.REQUIRED)
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

