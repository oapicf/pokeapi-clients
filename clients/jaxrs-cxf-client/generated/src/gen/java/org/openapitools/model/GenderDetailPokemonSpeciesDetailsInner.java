package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GenderDetailPokemonSpeciesDetailsInner  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer rate;

  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon pokemonSpecies;
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

  public GenderDetailPokemonSpeciesDetailsInner rate(Integer rate) {
    this.rate = rate;
    return this;
  }

 /**
   * Get pokemonSpecies
   * @return pokemonSpecies
  **/
  @JsonProperty("pokemon_species")
  public AbilityDetailPokemonInnerPokemon getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  public GenderDetailPokemonSpeciesDetailsInner pokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
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
    GenderDetailPokemonSpeciesDetailsInner genderDetailPokemonSpeciesDetailsInner = (GenderDetailPokemonSpeciesDetailsInner) o;
    return Objects.equals(this.rate, genderDetailPokemonSpeciesDetailsInner.rate) &&
        Objects.equals(this.pokemonSpecies, genderDetailPokemonSpeciesDetailsInner.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, pokemonSpecies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenderDetailPokemonSpeciesDetailsInner {\n");
    
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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

