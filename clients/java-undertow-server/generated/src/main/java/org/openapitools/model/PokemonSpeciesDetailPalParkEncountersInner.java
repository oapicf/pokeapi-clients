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
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-02-07T04:17:17.108399996Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonSpeciesDetailPalParkEncountersInner   {
  
  private AbilityDetailPokemonInnerPokemon area;
  private Integer baseScore;
  private Integer rate;

  /**
   */
  public PokemonSpeciesDetailPalParkEncountersInner area(AbilityDetailPokemonInnerPokemon area) {
    this.area = area;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("area")
  public AbilityDetailPokemonInnerPokemon getArea() {
    return area;
  }
  public void setArea(AbilityDetailPokemonInnerPokemon area) {
    this.area = area;
  }

  /**
   */
  public PokemonSpeciesDetailPalParkEncountersInner baseScore(Integer baseScore) {
    this.baseScore = baseScore;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("base_score")
  public Integer getBaseScore() {
    return baseScore;
  }
  public void setBaseScore(Integer baseScore) {
    this.baseScore = baseScore;
  }

  /**
   */
  public PokemonSpeciesDetailPalParkEncountersInner rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("rate")
  public Integer getRate() {
    return rate;
  }
  public void setRate(Integer rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpeciesDetailPalParkEncountersInner pokemonSpeciesDetailPalParkEncountersInner = (PokemonSpeciesDetailPalParkEncountersInner) o;
    return Objects.equals(area, pokemonSpeciesDetailPalParkEncountersInner.area) &&
        Objects.equals(baseScore, pokemonSpeciesDetailPalParkEncountersInner.baseScore) &&
        Objects.equals(rate, pokemonSpeciesDetailPalParkEncountersInner.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, baseScore, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesDetailPalParkEncountersInner {\n");
    
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

