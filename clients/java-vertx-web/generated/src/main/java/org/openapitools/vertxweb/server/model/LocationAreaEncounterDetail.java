package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.EncounterConditionValueSummary;
import org.openapitools.vertxweb.server.model.EncounterMethodSummary;
import org.openapitools.vertxweb.server.model.EncounterPokemonDetail;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationAreaEncounterDetail   {
  
  private Integer minLevel;
  private Integer maxLevel;
  private Integer chance = 0;
  private EncounterMethodSummary method;
  private List<EncounterConditionValueSummary> conditionValues = new ArrayList<>();
  private EncounterPokemonDetail pokemonDetails;

  public LocationAreaEncounterDetail () {

  }

  public LocationAreaEncounterDetail (Integer minLevel, Integer maxLevel, Integer chance, EncounterMethodSummary method, List<EncounterConditionValueSummary> conditionValues, EncounterPokemonDetail pokemonDetails) {
    this.minLevel = minLevel;
    this.maxLevel = maxLevel;
    this.chance = chance;
    this.method = method;
    this.conditionValues = conditionValues;
    this.pokemonDetails = pokemonDetails;
  }

    
  @JsonProperty("min_level")
  public Integer getMinLevel() {
    return minLevel;
  }
  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

    
  @JsonProperty("max_level")
  public Integer getMaxLevel() {
    return maxLevel;
  }
  public void setMaxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
  }

    
  @JsonProperty("chance")
  public Integer getChance() {
    return chance;
  }
  public void setChance(Integer chance) {
    this.chance = chance;
  }

    
  @JsonProperty("method")
  public EncounterMethodSummary getMethod() {
    return method;
  }
  public void setMethod(EncounterMethodSummary method) {
    this.method = method;
  }

    
  @JsonProperty("condition_values")
  public List<EncounterConditionValueSummary> getConditionValues() {
    return conditionValues;
  }
  public void setConditionValues(List<EncounterConditionValueSummary> conditionValues) {
    this.conditionValues = conditionValues;
  }

    
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
