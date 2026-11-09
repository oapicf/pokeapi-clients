package org.openapitools.model;

import org.openapitools.model.PokemonSpeciesSummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class GenderPokemonSpecies implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The chance of this Pokémon being female, in eighths; or -1 for genderless.
   */
  @JsonProperty("rate")
  private Integer rate;

  /**
   * A Pokémon species that can be the referenced gender.
   */
  @JsonProperty("pokemon_species")
  private PokemonSpeciesSummary pokemonSpecies;

  /**
   * The chance of this Pokémon being female, in eighths; or -1 for genderless.
   * @return rate
   */
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  /**
   * A Pokémon species that can be the referenced gender.
   * @return pokemonSpecies
   */
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
