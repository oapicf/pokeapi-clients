package apimodels;

import apimodels.EncounterConditionValueSummary;
import apimodels.EncounterMethodSummary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonEncounterDetailResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonEncounterDetailResponse   {
  @JsonProperty("chance")
  @NotNull

  private Integer chance;

  @JsonProperty("condition_values")
  @NotNull
@Valid

  private List<@Valid EncounterConditionValueSummary> conditionValues = new ArrayList<>();

  @JsonProperty("max_level")
  @NotNull

  private Integer maxLevel;

  @JsonProperty("method")
  @NotNull
@Valid

  private EncounterMethodSummary method;

  @JsonProperty("min_level")
  @NotNull

  private Integer minLevel;

  public PokemonEncounterDetailResponse chance(Integer chance) {
    this.chance = chance;
    return this;
  }

   /**
   * Percent chance that this encounter will occur.
   * @return chance
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

