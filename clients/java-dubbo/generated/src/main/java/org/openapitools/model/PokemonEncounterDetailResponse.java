package org.openapitools.model;

import org.openapitools.model.EncounterConditionValueSummary;
import org.openapitools.model.EncounterMethodSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonEncounterDetailResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Percent chance that this encounter will occur.
   */
  @JsonProperty("chance")
  private Integer chance;

  /**
   * A list of condition values that must be in effect for this encounter to occur.
   */
  @JsonProperty("condition_values")
  private List<EncounterConditionValueSummary> conditionValues = new ArrayList<>();

  /**
   * The highest level the Pokémon could be encountered at.
   */
  @JsonProperty("max_level")
  private Integer maxLevel;

  /**
   * The method by which this encounter happens.
   */
  @JsonProperty("method")
  private EncounterMethodSummary method;

  /**
   * The lowest level the Pokémon could be encountered at.
   */
  @JsonProperty("min_level")
  private Integer minLevel;

  /**
   * Percent chance that this encounter will occur.
   * @return chance
   */
  public Integer getChance() {
    return chance;
  }

  public void setChance(Integer chance) {
    this.chance = chance;
  }

  /**
   * A list of condition values that must be in effect for this encounter to occur.
   * @return conditionValues
   */
  public List<EncounterConditionValueSummary> getConditionValues() {
    return conditionValues;
  }

  public void setConditionValues(List<EncounterConditionValueSummary> conditionValues) {
    this.conditionValues = conditionValues;
  }

  /**
   * The highest level the Pokémon could be encountered at.
   * @return maxLevel
   */
  public Integer getMaxLevel() {
    return maxLevel;
  }

  public void setMaxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
  }

  /**
   * The method by which this encounter happens.
   * @return method
   */
  public EncounterMethodSummary getMethod() {
    return method;
  }

  public void setMethod(EncounterMethodSummary method) {
    this.method = method;
  }

  /**
   * The lowest level the Pokémon could be encountered at.
   * @return minLevel
   */
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
