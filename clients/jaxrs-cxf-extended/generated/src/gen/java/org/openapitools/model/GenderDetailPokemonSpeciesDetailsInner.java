package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GenderDetailPokemonSpeciesDetailsInner  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer rate;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon pokemonSpecies;
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
  public GenderDetailPokemonSpeciesDetailsInner rate(Integer rate) {
    this.rate = rate;
    return this;
  }

 /**
  * Get pokemonSpecies
  * @return pokemonSpecies
  */
  @JsonProperty("pokemon_species")
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

