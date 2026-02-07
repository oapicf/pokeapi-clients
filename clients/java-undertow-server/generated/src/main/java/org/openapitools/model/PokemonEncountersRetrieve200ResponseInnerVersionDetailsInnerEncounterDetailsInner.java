/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
 *
 * OpenAPI document version: 2.7.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-02-07T04:17:17.108399996Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner   {
  
  private BigDecimal chance;
  private List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> conditionValues = new ArrayList<>();
  private BigDecimal maxLevel;
  private PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod method;
  private BigDecimal minLevel;

  /**
   */
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner chance(BigDecimal chance) {
    this.chance = chance;
    return this;
  }

  
  @ApiModelProperty(example = "100", required = true, value = "")
  @JsonProperty("chance")
  public BigDecimal getChance() {
    return chance;
  }
  public void setChance(BigDecimal chance) {
    this.chance = chance;
  }

  /**
   */
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner conditionValues(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> conditionValues) {
    this.conditionValues = conditionValues;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("condition_values")
  public List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> getConditionValues() {
    return conditionValues;
  }
  public void setConditionValues(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner> conditionValues) {
    this.conditionValues = conditionValues;
  }

  /**
   */
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner maxLevel(BigDecimal maxLevel) {
    this.maxLevel = maxLevel;
    return this;
  }

  
  @ApiModelProperty(example = "10", required = true, value = "")
  @JsonProperty("max_level")
  public BigDecimal getMaxLevel() {
    return maxLevel;
  }
  public void setMaxLevel(BigDecimal maxLevel) {
    this.maxLevel = maxLevel;
  }

  /**
   */
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner method(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod method) {
    this.method = method;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("method")
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod getMethod() {
    return method;
  }
  public void setMethod(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod method) {
    this.method = method;
  }

  /**
   */
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner minLevel(BigDecimal minLevel) {
    this.minLevel = minLevel;
    return this;
  }

  
  @ApiModelProperty(example = "10", required = true, value = "")
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

