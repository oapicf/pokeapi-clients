package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class GenderDetailPokemonSpeciesDetailsInner implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("rate")
  private Integer rate;

  @JsonProperty("pokemon_species")
  private AbilityDetailPokemonInnerPokemon pokemonSpecies;

  /**
   * 
   * @return rate
   */
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  /**
   * 
   * @return pokemonSpecies
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
