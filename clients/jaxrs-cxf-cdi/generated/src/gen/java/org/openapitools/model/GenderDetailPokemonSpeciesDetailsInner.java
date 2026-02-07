package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class GenderDetailPokemonSpeciesDetailsInner   {
  
  private Integer rate;

  private AbilityDetailPokemonInnerPokemon pokemonSpecies;

  /**
   **/
  public GenderDetailPokemonSpeciesDetailsInner rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("rate")
  @NotNull
  public Integer getRate() {
    return rate;
  }
  public void setRate(Integer rate) {
    this.rate = rate;
  }


  /**
   **/
  public GenderDetailPokemonSpeciesDetailsInner pokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokemon_species")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getPokemonSpecies() {
    return pokemonSpecies;
  }
  public void setPokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

