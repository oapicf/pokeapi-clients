package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaEncounterDetail   {
  
  private Integer minLevel;
  private Integer maxLevel;
  private Integer chance = 0;
  private EncounterMethodSummary method;
  private List<@Valid EncounterConditionValueSummary> conditionValues = new ArrayList<>();
  private EncounterPokemonDetail pokemonDetails;

  /**
   * The lowest level the Pokémon could be encountered at.
   **/
  
  @ApiModelProperty(required = true, value = "The lowest level the Pokémon could be encountered at.")
  @JsonProperty("min_level")
  @NotNull
  public Integer getMinLevel() {
    return minLevel;
  }
  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  /**
   * The highest level the Pokémon could be encountered at.
   **/
  
  @ApiModelProperty(required = true, value = "The highest level the Pokémon could be encountered at.")
  @JsonProperty("max_level")
  @NotNull
  public Integer getMaxLevel() {
    return maxLevel;
  }
  public void setMaxLevel(Integer maxLevel) {
    this.maxLevel = maxLevel;
  }

  /**
   * Percent chance that this encounter will occur.
   **/
  
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
  
  @ApiModelProperty(value = "The method by which this encounter happens.")
  @JsonProperty("method")
  @Valid
  public EncounterMethodSummary getMethod() {
    return method;
  }
  public void setMethod(EncounterMethodSummary method) {
    this.method = method;
  }

  /**
   * A list of condition values that must be in effect for this encounter to occur.
   **/
  
  @ApiModelProperty(required = true, value = "A list of condition values that must be in effect for this encounter to occur.")
  @JsonProperty("condition_values")
  @NotNull
  public List<@Valid EncounterConditionValueSummary> getConditionValues() {
    return conditionValues;
  }
  public void setConditionValues(List<@Valid EncounterConditionValueSummary> conditionValues) {
    this.conditionValues = conditionValues;
  }

  /**
   * Additional properties of the encountered Pokémon, or null if unspecified.
   **/
  
  @ApiModelProperty(required = true, value = "Additional properties of the encountered Pokémon, or null if unspecified.")
  @JsonProperty("pokemon_details")
  @NotNull
  @Valid
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

