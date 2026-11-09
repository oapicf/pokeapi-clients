package org.openapitools.model;

import org.openapitools.model.PokemonSpeciesSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GenderPokemonSpecies  {
  
 /**
  * The chance of this Pokémon being female, in eighths; or -1 for genderless.
  */
  @ApiModelProperty(required = true, value = "The chance of this Pokémon being female, in eighths; or -1 for genderless.")

  private Integer rate;

 /**
  * A Pokémon species that can be the referenced gender.
  */
  @ApiModelProperty(required = true, value = "A Pokémon species that can be the referenced gender.")

  @Valid

  private PokemonSpeciesSummary pokemonSpecies;
 /**
   * The chance of this Pokémon being female, in eighths; or -1 for genderless.
   * @return rate
  **/
  @JsonProperty("rate")
  @NotNull
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public GenderPokemonSpecies rate(Integer rate) {
    this.rate = rate;
    return this;
  }

 /**
   * A Pokémon species that can be the referenced gender.
   * @return pokemonSpecies
  **/
  @JsonProperty("pokemon_species")
  @NotNull
  public PokemonSpeciesSummary getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  public GenderPokemonSpecies pokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

