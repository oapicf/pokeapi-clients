package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PalParkAreaDetailPokemonEncountersInner  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer baseScore;

  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon pokemonSpecies;

  @ApiModelProperty(required = true, value = "")

  private Integer rate;
 /**
   * Get baseScore
   * @return baseScore
  **/
  @JsonProperty("base_score")
  public Integer getBaseScore() {
    return baseScore;
  }

  public void setBaseScore(Integer baseScore) {
    this.baseScore = baseScore;
  }

  public PalParkAreaDetailPokemonEncountersInner baseScore(Integer baseScore) {
    this.baseScore = baseScore;
    return this;
  }

 /**
   * Get pokemonSpecies
   * @return pokemonSpecies
  **/
  @JsonProperty("pokemon-species")
  public AbilityDetailPokemonInnerPokemon getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  public PalParkAreaDetailPokemonEncountersInner pokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

 /**
   * Get rate
   * @return rate
  **/
  @JsonProperty("rate")
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public PalParkAreaDetailPokemonEncountersInner rate(Integer rate) {
    this.rate = rate;
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
    PalParkAreaDetailPokemonEncountersInner palParkAreaDetailPokemonEncountersInner = (PalParkAreaDetailPokemonEncountersInner) o;
    return Objects.equals(this.baseScore, palParkAreaDetailPokemonEncountersInner.baseScore) &&
        Objects.equals(this.pokemonSpecies, palParkAreaDetailPokemonEncountersInner.pokemonSpecies) &&
        Objects.equals(this.rate, palParkAreaDetailPokemonEncountersInner.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseScore, pokemonSpecies, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PalParkAreaDetailPokemonEncountersInner {\n");
    
    sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
    sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

