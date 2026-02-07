package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.PokemonDetailAbilitiesInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonDetailPastAbilitiesInner   {
  
  private List<PokemonDetailAbilitiesInner> abilities = new ArrayList<>();
  private AbilityDetailPokemonInnerPokemon generation;

  public PokemonDetailPastAbilitiesInner () {

  }

  public PokemonDetailPastAbilitiesInner (List<PokemonDetailAbilitiesInner> abilities, AbilityDetailPokemonInnerPokemon generation) {
    this.abilities = abilities;
    this.generation = generation;
  }

    
  @JsonProperty("abilities")
  public List<PokemonDetailAbilitiesInner> getAbilities() {
    return abilities;
  }
  public void setAbilities(List<PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
  }

    
  @JsonProperty("generation")
  public AbilityDetailPokemonInnerPokemon getGeneration() {
    return generation;
  }
  public void setGeneration(AbilityDetailPokemonInnerPokemon generation) {
    this.generation = generation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner = (PokemonDetailPastAbilitiesInner) o;
    return Objects.equals(abilities, pokemonDetailPastAbilitiesInner.abilities) &&
        Objects.equals(generation, pokemonDetailPastAbilitiesInner.generation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abilities, generation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDetailPastAbilitiesInner {\n");
    
    sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
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
