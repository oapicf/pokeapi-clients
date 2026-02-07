package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PalParkAreaDetailPokemonEncountersInner  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer baseScore;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon pokemonSpecies;

  @ApiModelProperty(required = true, value = "")
  private Integer rate;
 /**
  * Get baseScore
  * @return baseScore
  */
  @JsonProperty("base_score")
  @NotNull
  public Integer getBaseScore() {
    return baseScore;
  }

  /**
   * Sets the <code>baseScore</code> property.
   */
 public void setBaseScore(Integer baseScore) {
    this.baseScore = baseScore;
  }

  /**
   * Sets the <code>baseScore</code> property.
   */
  public PalParkAreaDetailPokemonEncountersInner baseScore(Integer baseScore) {
    this.baseScore = baseScore;
    return this;
  }

 /**
  * Get pokemonSpecies
  * @return pokemonSpecies
  */
  @JsonProperty("pokemon-species")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getPokemonSpecies() {
    return pokemonSpecies;
  }

  /**
   * Sets the <code>pokemonSpecies</code> property.
   */
 public void setPokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  /**
   * Sets the <code>pokemonSpecies</code> property.
   */
  public PalParkAreaDetailPokemonEncountersInner pokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

 /**
  * Get rate
  * @return rate
  */
  @JsonProperty("rate")
  @NotNull
  public Integer getRate() {
    return rate;
  }

  /**
   * Sets the <code>rate</code> property.
   */
 public void setRate(Integer rate) {
    this.rate = rate;
  }

  /**
   * Sets the <code>rate</code> property.
   */
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

