package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterConditionValueSummary;
import org.openapitools.model.EncounterMethodSummary;
import org.openapitools.model.EncounterPokemonDetail;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LocationAreaEncounterDetail  {
  
 /**
  * The lowest level the Pokémon could be encountered at.
  */
  @ApiModelProperty(required = true, value = "The lowest level the Pokémon could be encountered at.")
  private Integer minLevel;

 /**
  * The highest level the Pokémon could be encountered at.
  */
  @ApiModelProperty(required = true, value = "The highest level the Pokémon could be encountered at.")
  private Integer maxLevel;

 /**
  * Percent chance that this encounter will occur.
  */
  @ApiModelProperty(value = "Percent chance that this encounter will occur.")
  private Integer chance = 0;

 /**
  * The method by which this encounter happens.
  */
  @ApiModelProperty(value = "The method by which this encounter happens.")
  @Valid
  private EncounterMethodSummary method;

 /**
  * A list of condition values that must be in effect for this encounter to occur.
  */
  @ApiModelProperty(required = true, value = "A list of condition values that must be in effect for this encounter to occur.")
  private List<@Valid EncounterConditionValueSummary> conditionValues = new ArrayList<>();

 /**
  * Additional properties of the encountered Pokémon, or null if unspecified.
  */
  @ApiModelProperty(required = true, value = "Additional properties of the encountered Pokémon, or null if unspecified.")
  @Valid
  private EncounterPokemonDetail pokemonDetails;
 /**
  * The lowest level the Pokémon could be encountered at.
  * @return minLevel
  */
  @JsonProperty("min_level")
  @NotNull
  public Integer getMinLevel() {
    return minLevel;
  }

  /**
   * Sets the <code>minLevel</code> property.
   */
 public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  /**
   * Sets the <code>minLevel</code> property.
   */
  public LocationAreaEncounterDetail minLevel(Integer minLevel) {
    this.minLevel = minLevel;
    return this;
  }

 /**
  * The highest level the Pokémon could be encountered at.
  * @return maxLevel
  */
  @JsonProperty("max_level")
  @NotNull
  public Integer getMaxLevel() {
    return maxLevel;
  }

  /**
   * Sets the <code>maxLevel</code> property.
   */
 public void setMaxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
  }

  /**
   * Sets the <code>maxLevel</code> property.
   */
  public LocationAreaEncounterDetail maxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
    return this;
  }

 /**
  * Percent chance that this encounter will occur.
  * @return chance
  */
  @JsonProperty("chance")
  public Integer getChance() {
    return chance;
  }

  /**
   * Sets the <code>chance</code> property.
   */
 public void setChance(Integer chance) {
    this.chance = chance;
  }

  /**
   * Sets the <code>chance</code> property.
   */
  public LocationAreaEncounterDetail chance(Integer chance) {
    this.chance = chance;
    return this;
  }

 /**
  * The method by which this encounter happens.
  * @return method
  */
  @JsonProperty("method")
  public EncounterMethodSummary getMethod() {
    return method;
  }

  /**
   * Sets the <code>method</code> property.
   */
 public void setMethod(EncounterMethodSummary method) {
    this.method = method;
  }

  /**
   * Sets the <code>method</code> property.
   */
  public LocationAreaEncounterDetail method(EncounterMethodSummary method) {
    this.method = method;
    return this;
  }

 /**
  * A list of condition values that must be in effect for this encounter to occur.
  * @return conditionValues
  */
  @JsonProperty("condition_values")
  @NotNull
  public List<@Valid EncounterConditionValueSummary> getConditionValues() {
    return conditionValues;
  }

  /**
   * Sets the <code>conditionValues</code> property.
   * <br><em>N.B. <code>conditionValues</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setConditionValues(List<@Valid EncounterConditionValueSummary> conditionValues) {
    this.conditionValues = conditionValues;
  }

  /**
   * Sets the <code>conditionValues</code> property.
   * <br><em>N.B. <code>conditionValues</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public LocationAreaEncounterDetail conditionValues(List<@Valid EncounterConditionValueSummary> conditionValues) {
    this.conditionValues = conditionValues;
    return this;
  }

  /**
   * Adds a new item to the <code>conditionValues</code> list.
   * <br><em>N.B. <code>conditionValues</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public LocationAreaEncounterDetail addConditionValuesItem(EncounterConditionValueSummary conditionValuesItem) {
    this.conditionValues.add(conditionValuesItem);
    return this;
  }

 /**
  * Additional properties of the encountered Pokémon, or null if unspecified.
  * @return pokemonDetails
  */
  @JsonProperty("pokemon_details")
  @NotNull
  public EncounterPokemonDetail getPokemonDetails() {
    return pokemonDetails;
  }

  /**
   * Sets the <code>pokemonDetails</code> property.
   * <br><em>N.B. <code>pokemonDetails</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPokemonDetails(EncounterPokemonDetail pokemonDetails) {
    this.pokemonDetails = pokemonDetails;
  }

  /**
   * Sets the <code>pokemonDetails</code> property.
   * <br><em>N.B. <code>pokemonDetails</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public LocationAreaEncounterDetail pokemonDetails(EncounterPokemonDetail pokemonDetails) {
    this.pokemonDetails = pokemonDetails;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

