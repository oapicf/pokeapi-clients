package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterConditionValueSummary;
import org.openapitools.model.EncounterMethodSummary;
import org.openapitools.model.EncounterPokemonDetail;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LocationAreaEncounterDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaEncounterDetail   {
  private Integer minLevel;
  private Integer maxLevel;
  private Integer chance = 0;
  private EncounterMethodSummary method;
  private List<@Valid EncounterConditionValueSummary> conditionValues = new ArrayList<>();
  private EncounterPokemonDetail pokemonDetails;

  public LocationAreaEncounterDetail() {
  }

  @JsonCreator
  public LocationAreaEncounterDetail(
    @JsonProperty(required = true, value = "min_level") Integer minLevel,
    @JsonProperty(required = true, value = "max_level") Integer maxLevel,
    @JsonProperty(required = true, value = "condition_values") List<@Valid EncounterConditionValueSummary> conditionValues,
    @JsonProperty(required = true, value = "pokemon_details") EncounterPokemonDetail pokemonDetails
  ) {
    this.minLevel = minLevel;
    this.maxLevel = maxLevel;
    this.conditionValues = conditionValues;
    this.pokemonDetails = pokemonDetails;
  }

  /**
   * The lowest level the Pokémon could be encountered at.
   **/
  public LocationAreaEncounterDetail minLevel(Integer minLevel) {
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

  /**
   * The highest level the Pokémon could be encountered at.
   **/
  public LocationAreaEncounterDetail maxLevel(Integer maxLevel) {
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
   * Percent chance that this encounter will occur.
   **/
  public LocationAreaEncounterDetail chance(Integer chance) {
    this.chance = chance;
    return this;
  }

  
  @ApiModelProperty(value = "Percent chance that this encounter will occur.")
  @JsonProperty("chance")
  public Integer getChance() {
    return chance;
  }

  @JsonProperty("chance")
  public void setChance(Integer chance) {
    this.chance = chance;
  }

  /**
   * The method by which this encounter happens.
   **/
  public LocationAreaEncounterDetail method(EncounterMethodSummary method) {
    this.method = method;
    return this;
  }

  
  @ApiModelProperty(value = "The method by which this encounter happens.")
  @JsonProperty("method")
  @Valid public EncounterMethodSummary getMethod() {
    return method;
  }

  @JsonProperty("method")
  public void setMethod(EncounterMethodSummary method) {
    this.method = method;
  }

  /**
   * A list of condition values that must be in effect for this encounter to occur.
   **/
  public LocationAreaEncounterDetail conditionValues(List<@Valid EncounterConditionValueSummary> conditionValues) {
    this.conditionValues = conditionValues;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of condition values that must be in effect for this encounter to occur.")
  @JsonProperty(required = true, value = "condition_values")
  public List<@Valid EncounterConditionValueSummary> getConditionValues() {
    return conditionValues;
  }

  @JsonProperty(required = true, value = "condition_values")
  public void setConditionValues(List<@Valid EncounterConditionValueSummary> conditionValues) {
    this.conditionValues = conditionValues;
  }

  public LocationAreaEncounterDetail addConditionValuesItem(EncounterConditionValueSummary conditionValuesItem) {
    if (this.conditionValues == null) {
      this.conditionValues = new ArrayList<>();
    }

    this.conditionValues.add(conditionValuesItem);
    return this;
  }

  public LocationAreaEncounterDetail removeConditionValuesItem(EncounterConditionValueSummary conditionValuesItem) {
    if (conditionValuesItem != null && this.conditionValues != null) {
      this.conditionValues.remove(conditionValuesItem);
    }

    return this;
  }
  /**
   * Additional properties of the encountered Pokémon, or null if unspecified.
   **/
  public LocationAreaEncounterDetail pokemonDetails(EncounterPokemonDetail pokemonDetails) {
    this.pokemonDetails = pokemonDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Additional properties of the encountered Pokémon, or null if unspecified.")
  @JsonProperty(required = true, value = "pokemon_details")
  @Valid public EncounterPokemonDetail getPokemonDetails() {
    return pokemonDetails;
  }

  @JsonProperty(required = true, value = "pokemon_details")
  public void setPokemonDetails(EncounterPokemonDetail pokemonDetails) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
