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
import org.openapitools.model.EncounterPokemonDetail;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LocationAreaEncounterDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaEncounterDetail {

  private Integer minLevel;

  private Integer maxLevel;

  private Integer chance = 0;

  private @Nullable EncounterMethodSummary method;

  private List<@Valid EncounterConditionValueSummary> conditionValues = new ArrayList<>();

  private JsonNullable<EncounterPokemonDetail> pokemonDetails = JsonNullable.<EncounterPokemonDetail>undefined();

  public LocationAreaEncounterDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocationAreaEncounterDetail(Integer minLevel, Integer maxLevel, List<@Valid EncounterConditionValueSummary> conditionValues, EncounterPokemonDetail pokemonDetails) {
    this.minLevel = minLevel;
    this.maxLevel = maxLevel;
    this.conditionValues = conditionValues;
    this.pokemonDetails = JsonNullable.of(pokemonDetails);
  }

  public LocationAreaEncounterDetail minLevel(Integer minLevel) {
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

  @JsonProperty("min_level")
  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  public LocationAreaEncounterDetail maxLevel(Integer maxLevel) {
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

  @JsonProperty("max_level")
  public void setMaxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
  }

  public LocationAreaEncounterDetail chance(Integer chance) {
    this.chance = chance;
    return this;
  }

  /**
   * Percent chance that this encounter will occur.
   * @return chance
   */
  
  @Schema(name = "chance", description = "Percent chance that this encounter will occur.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("chance")
  public Integer getChance() {
    return chance;
  }

  @JsonProperty("chance")
  public void setChance(Integer chance) {
    this.chance = chance;
  }

  public LocationAreaEncounterDetail method(@Nullable EncounterMethodSummary method) {
    this.method = method;
    return this;
  }

  /**
   * The method by which this encounter happens.
   * @return method
   */
  @Valid 
  @Schema(name = "method", description = "The method by which this encounter happens.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("method")
  public @Nullable EncounterMethodSummary getMethod() {
    return method;
  }

  @JsonProperty("method")
  public void setMethod(@Nullable EncounterMethodSummary method) {
    this.method = method;
  }

  public LocationAreaEncounterDetail conditionValues(List<@Valid EncounterConditionValueSummary> conditionValues) {
    this.conditionValues = conditionValues;
    return this;
  }

  public LocationAreaEncounterDetail addConditionValuesItem(EncounterConditionValueSummary conditionValuesItem) {
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
  
  @Schema(name = "condition_values", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of condition values that must be in effect for this encounter to occur.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("condition_values")
  public List<@Valid EncounterConditionValueSummary> getConditionValues() {
    return conditionValues;
  }

  @JsonProperty("condition_values")
  public void setConditionValues(List<@Valid EncounterConditionValueSummary> conditionValues) {
    this.conditionValues = conditionValues;
  }

  public LocationAreaEncounterDetail pokemonDetails(EncounterPokemonDetail pokemonDetails) {
    this.pokemonDetails = JsonNullable.of(pokemonDetails);
    return this;
  }

  /**
   * Additional properties of the encountered Pokémon, or null if unspecified.
   * @return pokemonDetails
   */
  @Valid 
  @Schema(name = "pokemon_details", accessMode = Schema.AccessMode.READ_ONLY, description = "Additional properties of the encountered Pokémon, or null if unspecified.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("pokemon_details")
  public JsonNullable<EncounterPokemonDetail> getPokemonDetails() {
    return pokemonDetails;
  }

  @JsonProperty("pokemon_details")
  public void setPokemonDetails(JsonNullable<EncounterPokemonDetail> pokemonDetails) {
    this.pokemonDetails = pokemonDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAreaEncounterDetail locationAreaEncounterDetail = (LocationAreaEncounterDetail) o;
    return Objects.equals(this.minLevel, locationAreaEncounterDetail.minLevel) &&
        Objects.equals(this.maxLevel, locationAreaEncounterDetail.maxLevel) &&
        Objects.equals(this.chance, locationAreaEncounterDetail.chance) &&
        Objects.equals(this.method, locationAreaEncounterDetail.method) &&
        Objects.equals(this.conditionValues, locationAreaEncounterDetail.conditionValues) &&
        Objects.equals(this.pokemonDetails, locationAreaEncounterDetail.pokemonDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minLevel, maxLevel, chance, method, conditionValues, pokemonDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaEncounterDetail {\n");
    sb.append("    minLevel: ").append(toIndentedString(minLevel)).append("\n");
    sb.append("    maxLevel: ").append(toIndentedString(maxLevel)).append("\n");
    sb.append("    chance: ").append(toIndentedString(chance)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    conditionValues: ").append(toIndentedString(conditionValues)).append("\n");
    sb.append("    pokemonDetails: ").append(toIndentedString(pokemonDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

