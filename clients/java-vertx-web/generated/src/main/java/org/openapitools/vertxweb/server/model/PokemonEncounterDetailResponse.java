package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.EncounterConditionValueSummary;
import org.openapitools.vertxweb.server.model.EncounterMethodSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonEncounterDetailResponse   {
  
  private Integer chance;
  private List<EncounterConditionValueSummary> conditionValues = new ArrayList<>();
  private Integer maxLevel;
  private EncounterMethodSummary method;
  private Integer minLevel;

  public PokemonEncounterDetailResponse () {

  }

  public PokemonEncounterDetailResponse (Integer chance, List<EncounterConditionValueSummary> conditionValues, Integer maxLevel, EncounterMethodSummary method, Integer minLevel) {
    this.chance = chance;
    this.conditionValues = conditionValues;
    this.maxLevel = maxLevel;
    this.method = method;
    this.minLevel = minLevel;
  }

    
  @JsonProperty("chance")
  public Integer getChance() {
    return chance;
  }
  public void setChance(Integer chance) {
    this.chance = chance;
  }

    
  @JsonProperty("condition_values")
  public List<EncounterConditionValueSummary> getConditionValues() {
    return conditionValues;
  }
  public void setConditionValues(List<EncounterConditionValueSummary> conditionValues) {
    this.conditionValues = conditionValues;
  }

    
  @JsonProperty("max_level")
  public Integer getMaxLevel() {
    return maxLevel;
  }
  public void setMaxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
  }

    
  @JsonProperty("method")
  public EncounterMethodSummary getMethod() {
    return method;
  }
  public void setMethod(EncounterMethodSummary method) {
    this.method = method;
  }

    
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
