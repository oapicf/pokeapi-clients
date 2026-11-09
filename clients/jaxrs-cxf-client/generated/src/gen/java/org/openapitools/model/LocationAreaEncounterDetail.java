package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterConditionValueSummary;
import org.openapitools.model.EncounterMethodSummary;
import org.openapitools.model.EncounterPokemonDetail;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
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

  private EncounterMethodSummary method;

 /**
  * A list of condition values that must be in effect for this encounter to occur.
  */
  @ApiModelProperty(required = true, value = "A list of condition values that must be in effect for this encounter to occur.")

  private List<EncounterConditionValueSummary> conditionValues = new ArrayList<>();

 /**
  * Additional properties of the encountered Pokémon, or null if unspecified.
  */
  @ApiModelProperty(required = true, value = "Additional properties of the encountered Pokémon, or null if unspecified.")

  private EncounterPokemonDetail pokemonDetails;
 /**
   * The lowest level the Pokémon could be encountered at.
   * @return minLevel
  **/
  @JsonProperty("min_level")
  public Integer getMinLevel() {
    return minLevel;
  }

  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  public LocationAreaEncounterDetail minLevel(Integer minLevel) {
    this.minLevel = minLevel;
    return this;
  }

 /**
   * The highest level the Pokémon could be encountered at.
   * @return maxLevel
  **/
  @JsonProperty("max_level")
  public Integer getMaxLevel() {
    return maxLevel;
  }

  public void setMaxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
  }

  public LocationAreaEncounterDetail maxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
    return this;
  }

 /**
   * Percent chance that this encounter will occur.
   * @return chance
  **/
  @JsonProperty("chance")
  public Integer getChance() {
    return chance;
  }

  public void setChance(Integer chance) {
    this.chance = chance;
  }

  public LocationAreaEncounterDetail chance(Integer chance) {
    this.chance = chance;
    return this;
  }

 /**
   * The method by which this encounter happens.
   * @return method
  **/
  @JsonProperty("method")
  public EncounterMethodSummary getMethod() {
    return method;
  }

  public void setMethod(EncounterMethodSummary method) {
    this.method = method;
  }

  public LocationAreaEncounterDetail method(EncounterMethodSummary method) {
    this.method = method;
    return this;
  }

 /**
   * A list of condition values that must be in effect for this encounter to occur.
   * @return conditionValues
  **/
  @JsonProperty("condition_values")
  public List<EncounterConditionValueSummary> getConditionValues() {
    return conditionValues;
  }


 /**
   * Additional properties of the encountered Pokémon, or null if unspecified.
   * @return pokemonDetails
  **/
  @JsonProperty("pokemon_details")
  public EncounterPokemonDetail getPokemonDetails() {
    return pokemonDetails;
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

