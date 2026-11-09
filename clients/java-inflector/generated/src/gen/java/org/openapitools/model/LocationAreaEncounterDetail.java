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
import org.openapitools.model.EncounterPokemonDetail;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaEncounterDetail   {
  @JsonProperty("min_level")
  private Integer minLevel;

  @JsonProperty("max_level")
  private Integer maxLevel;

  @JsonProperty("chance")
  private Integer chance = 0;

  @JsonProperty("method")
  private EncounterMethodSummary method;

  @JsonProperty("condition_values")
  private List<EncounterConditionValueSummary> conditionValues = new ArrayList<>();

  @JsonProperty("pokemon_details")
  private EncounterPokemonDetail pokemonDetails;

  /**
   * The lowest level the Pokémon could be encountered at.
   **/
  public LocationAreaEncounterDetail minLevel(Integer minLevel) {
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

  /**
   * The highest level the Pokémon could be encountered at.
   **/
  public LocationAreaEncounterDetail maxLevel(Integer maxLevel) {
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
  public EncounterMethodSummary getMethod() {
    return method;
  }
  public void setMethod(EncounterMethodSummary method) {
    this.method = method;
  }

  /**
   * A list of condition values that must be in effect for this encounter to occur.
   **/
  public LocationAreaEncounterDetail conditionValues(List<EncounterConditionValueSummary> conditionValues) {
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
   * Additional properties of the encountered Pokémon, or null if unspecified.
   **/
  public LocationAreaEncounterDetail pokemonDetails(EncounterPokemonDetail pokemonDetails) {
    this.pokemonDetails = pokemonDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Additional properties of the encountered Pokémon, or null if unspecified.")
  @JsonProperty("pokemon_details")
  public EncounterPokemonDetail getPokemonDetails() {
    return pokemonDetails;
  }
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
    return Objects.equals(minLevel, locationAreaEncounterDetail.minLevel) &&
        Objects.equals(maxLevel, locationAreaEncounterDetail.maxLevel) &&
        Objects.equals(chance, locationAreaEncounterDetail.chance) &&
        Objects.equals(method, locationAreaEncounterDetail.method) &&
        Objects.equals(conditionValues, locationAreaEncounterDetail.conditionValues) &&
        Objects.equals(pokemonDetails, locationAreaEncounterDetail.pokemonDetails);
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

