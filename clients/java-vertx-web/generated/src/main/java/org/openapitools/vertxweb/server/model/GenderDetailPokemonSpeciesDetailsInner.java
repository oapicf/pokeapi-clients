package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenderDetailPokemonSpeciesDetailsInner   {
  
  private Integer rate;
  private AbilityDetailPokemonInnerPokemon pokemonSpecies;

  public GenderDetailPokemonSpeciesDetailsInner () {

  }

  public GenderDetailPokemonSpeciesDetailsInner (Integer rate, AbilityDetailPokemonInnerPokemon pokemonSpecies) {
    this.rate = rate;
    this.pokemonSpecies = pokemonSpecies;
  }

    
  @JsonProperty("rate")
  public Integer getRate() {
    return rate;
  }
  public void setRate(Integer rate) {
    this.rate = rate;
  }

    
  @JsonProperty("pokemon_species")
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
    return Objects.equals(rate, genderDetailPokemonSpeciesDetailsInner.rate) &&
        Objects.equals(pokemonSpecies, genderDetailPokemonSpeciesDetailsInner.pokemonSpecies);
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
