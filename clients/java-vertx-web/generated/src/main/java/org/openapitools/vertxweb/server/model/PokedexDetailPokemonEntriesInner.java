package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokedexDetailPokemonEntriesInner   {
  
  private Integer entryNumber;
  private AbilityDetailPokemonInnerPokemon pokemonSpecies;

  public PokedexDetailPokemonEntriesInner () {

  }

  public PokedexDetailPokemonEntriesInner (Integer entryNumber, AbilityDetailPokemonInnerPokemon pokemonSpecies) {
    this.entryNumber = entryNumber;
    this.pokemonSpecies = pokemonSpecies;
  }

    
  @JsonProperty("entry_number")
  public Integer getEntryNumber() {
    return entryNumber;
  }
  public void setEntryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
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
    PokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner = (PokedexDetailPokemonEntriesInner) o;
    return Objects.equals(entryNumber, pokedexDetailPokemonEntriesInner.entryNumber) &&
        Objects.equals(pokemonSpecies, pokedexDetailPokemonEntriesInner.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryNumber, pokemonSpecies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokedexDetailPokemonEntriesInner {\n");
    
    sb.append("    entryNumber: ").append(toIndentedString(entryNumber)).append("\n");
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
