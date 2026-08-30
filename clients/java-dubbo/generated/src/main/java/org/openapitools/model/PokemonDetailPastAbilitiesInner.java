package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.PokemonDetailAbilitiesInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PokemonDetailPastAbilitiesInner implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("abilities")
  private List<PokemonDetailAbilitiesInner> abilities = new ArrayList<>();

  @JsonProperty("generation")
  private AbilityDetailPokemonInnerPokemon generation;

  /**
   * 
   * @return abilities
   */
  public List<PokemonDetailAbilitiesInner> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
  }

  /**
   * 
   * @return generation
   */
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
    return Objects.equals(this.abilities, pokemonDetailPastAbilitiesInner.abilities) &&
        Objects.equals(this.generation, pokemonDetailPastAbilitiesInner.generation);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
