package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner;
import org.openapitools.vertxweb.server.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner   {
  
  private BigDecimal chance;
  private List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> conditionValues = new ArrayList<>();
  private BigDecimal maxLevel;
  private PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod method;
  private BigDecimal minLevel;

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner () {

  }

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner (BigDecimal chance, List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> conditionValues, BigDecimal maxLevel, PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod method, BigDecimal minLevel) {
    this.chance = chance;
    this.conditionValues = conditionValues;
    this.maxLevel = maxLevel;
    this.method = method;
    this.minLevel = minLevel;
  }

    
  @JsonProperty("chance")
  public BigDecimal getChance() {
    return chance;
  }
  public void setChance(BigDecimal chance) {
    this.chance = chance;
  }

    
  @JsonProperty("condition_values")
  public List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> getConditionValues() {
    return conditionValues;
  }
  public void setConditionValues(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> conditionValues) {
    this.conditionValues = conditionValues;
  }

    
  @JsonProperty("max_level")
  public BigDecimal getMaxLevel() {
    return maxLevel;
  }
  public void setMaxLevel(BigDecimal maxLevel) {
    this.maxLevel = maxLevel;
  }

    
  @JsonProperty("method")
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod getMethod() {
    return method;
  }
  public void setMethod(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod method) {
    this.method = method;
  }

    
  @JsonProperty("min_level")
  public BigDecimal getMinLevel() {
    return minLevel;
  }
  public void setMinLevel(BigDecimal minLevel) {
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
    PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner = (PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner) o;
    return Objects.equals(chance, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.chance) &&
        Objects.equals(conditionValues, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.conditionValues) &&
        Objects.equals(maxLevel, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.maxLevel) &&
        Objects.equals(method, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.method) &&
        Objects.equals(minLevel, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.minLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chance, conditionValues, maxLevel, method, minLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
