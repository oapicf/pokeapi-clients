package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokemonSpeciesSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class GenderPokemonSpecies   {
  
  private Integer rate;

  private PokemonSpeciesSummary pokemonSpecies;

  /**
   * The chance of this Pokémon being female, in eighths; or -1 for genderless.
   **/
  public GenderPokemonSpecies rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The chance of this Pokémon being female, in eighths; or -1 for genderless.")
  @JsonProperty("rate")
  @NotNull
  public Integer getRate() {
    return rate;
  }
  public void setRate(Integer rate) {
    this.rate = rate;
  }


  /**
   * A Pokémon species that can be the referenced gender.
   **/
  public GenderPokemonSpecies pokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A Pokémon species that can be the referenced gender.")
  @JsonProperty("pokemon_species")
  @NotNull
  public PokemonSpeciesSummary getPokemonSpecies() {
    return pokemonSpecies;
  }
  public void setPokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenderPokemonSpecies genderPokemonSpecies = (GenderPokemonSpecies) o;
    return Objects.equals(this.rate, genderPokemonSpecies.rate) &&
        Objects.equals(this.pokemonSpecies, genderPokemonSpecies.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, pokemonSpecies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenderPokemonSpecies {\n");
    
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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

