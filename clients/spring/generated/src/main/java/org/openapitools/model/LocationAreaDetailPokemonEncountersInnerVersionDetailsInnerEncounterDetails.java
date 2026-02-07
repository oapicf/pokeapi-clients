package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
 */

@JsonTypeName("LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails {

  private Integer minLevel;

  private Integer maxLevel;

  private @Nullable AbilityDetailPokemonInnerPokemon conditionValues;

  private Integer chance;

  private AbilityDetailPokemonInnerPokemon method;

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails(Integer minLevel, Integer maxLevel, Integer chance, AbilityDetailPokemonInnerPokemon method) {
    this.minLevel = minLevel;
    this.maxLevel = maxLevel;
    this.chance = chance;
    this.method = method;
  }

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails minLevel(Integer minLevel) {
    this.minLevel = minLevel;
    return this;
  }

  /**
   * Get minLevel
   * @return minLevel
   */
  @NotNull 
  @Schema(name = "min_level", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("min_level")
  public Integer getMinLevel() {
    return minLevel;
  }

  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails maxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
    return this;
  }

  /**
   * Get maxLevel
   * @return maxLevel
   */
  @NotNull 
  @Schema(name = "max_level", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max_level")
  public Integer getMaxLevel() {
    return maxLevel;
  }

  public void setMaxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
  }

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails conditionValues(@Nullable AbilityDetailPokemonInnerPokemon conditionValues) {
    this.conditionValues = conditionValues;
    return this;
  }

  /**
   * Get conditionValues
   * @return conditionValues
   */
  @Valid 
  @Schema(name = "condition_values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("condition_values")
  public @Nullable AbilityDetailPokemonInnerPokemon getConditionValues() {
    return conditionValues;
  }

  public void setConditionValues(@Nullable AbilityDetailPokemonInnerPokemon conditionValues) {
    this.conditionValues = conditionValues;
  }

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails chance(Integer chance) {
    this.chance = chance;
    return this;
  }

  /**
   * Get chance
   * @return chance
   */
  @NotNull 
  @Schema(name = "chance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("chance")
  public Integer getChance() {
    return chance;
  }

  public void setChance(Integer chance) {
    this.chance = chance;
  }

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails method(AbilityDetailPokemonInnerPokemon method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
   */
  @NotNull @Valid 
  @Schema(name = "method", requiredMode = Schema.RequiredMode.REQUIRED)
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

