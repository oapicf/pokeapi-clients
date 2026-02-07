package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner  {
  
  @ApiModelProperty(example = "100", required = true, value = "")
  @Valid
  private BigDecimal chance;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> conditionValues = new ArrayList<>();

  @ApiModelProperty(example = "10", required = true, value = "")
  @Valid
  private BigDecimal maxLevel;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod method;

  @ApiModelProperty(example = "10", required = true, value = "")
  @Valid
  private BigDecimal minLevel;
 /**
  * Get chance
  * @return chance
  */
  @JsonProperty("chance")
  @NotNull
  public BigDecimal getChance() {
    return chance;
  }

  /**
   * Sets the <code>chance</code> property.
   */
 public void setChance(BigDecimal chance) {
    this.chance = chance;
  }

  /**
   * Sets the <code>chance</code> property.
   */
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner chance(BigDecimal chance) {
    this.chance = chance;
    return this;
  }

 /**
  * Get conditionValues
  * @return conditionValues
  */
  @JsonProperty("condition_values")
  @NotNull
  public List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> getConditionValues() {
    return conditionValues;
  }

  /**
   * Sets the <code>conditionValues</code> property.
   */
 public void setConditionValues(List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> conditionValues) {
    this.conditionValues = conditionValues;
  }

  /**
   * Sets the <code>conditionValues</code> property.
   */
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner conditionValues(List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> conditionValues) {
    this.conditionValues = conditionValues;
    return this;
  }

  /**
   * Adds a new item to the <code>conditionValues</code> list.
   */
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner addConditionValuesItem(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner conditionValuesItem) {
    this.conditionValues.add(conditionValuesItem);
    return this;
  }

 /**
  * Get maxLevel
  * @return maxLevel
  */
  @JsonProperty("max_level")
  @NotNull
  public BigDecimal getMaxLevel() {
    return maxLevel;
  }

  /**
   * Sets the <code>maxLevel</code> property.
   */
 public void setMaxLevel(BigDecimal maxLevel) {
    this.maxLevel = maxLevel;
  }

  /**
   * Sets the <code>maxLevel</code> property.
   */
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner maxLevel(BigDecimal maxLevel) {
    this.maxLevel = maxLevel;
    return this;
  }

 /**
  * Get method
  * @return method
  */
  @JsonProperty("method")
  @NotNull
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod getMethod() {
    return method;
  }

  /**
   * Sets the <code>method</code> property.
   */
 public void setMethod(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod method) {
    this.method = method;
  }

  /**
   * Sets the <code>method</code> property.
   */
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner method(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod method) {
    this.method = method;
    return this;
  }

 /**
  * Get minLevel
  * @return minLevel
  */
  @JsonProperty("min_level")
  @NotNull
  public BigDecimal getMinLevel() {
    return minLevel;
  }

  /**
   * Sets the <code>minLevel</code> property.
   */
 public void setMinLevel(BigDecimal minLevel) {
    this.minLevel = minLevel;
  }

  /**
   * Sets the <code>minLevel</code> property.
   */
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner minLevel(BigDecimal minLevel) {
    this.minLevel = minLevel;
    return this;
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
    return Objects.equals(this.chance, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.chance) &&
        Objects.equals(this.conditionValues, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.conditionValues) &&
        Objects.equals(this.maxLevel, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.maxLevel) &&
        Objects.equals(this.method, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.method) &&
        Objects.equals(this.minLevel, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.minLevel);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

