package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.PokemonSpeciesSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * GenderPokemonSpecies
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class GenderPokemonSpecies   {
  @JsonProperty("rate")
  private Integer rate;

  @JsonProperty("pokemon_species")
  private PokemonSpeciesSummary pokemonSpecies;

  public GenderPokemonSpecies rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  /**
   * The chance of this Pokémon being female, in eighths; or -1 for genderless.
   * @return rate
   */
  @ApiModelProperty(required = true, value = "The chance of this Pokémon being female, in eighths; or -1 for genderless.")
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public GenderPokemonSpecies pokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  /**
   * A Pokémon species that can be the referenced gender.
   * @return pokemonSpecies
   */
  @ApiModelProperty(required = true, value = "A Pokémon species that can be the referenced gender.")
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

