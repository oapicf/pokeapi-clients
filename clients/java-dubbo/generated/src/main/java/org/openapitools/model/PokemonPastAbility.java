package org.openapitools.model;

import org.openapitools.model.GenerationSummary;
import org.openapitools.model.PokemonAbilityPast;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonPastAbility implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
   */
  @JsonProperty("abilities")
  private List<PokemonAbilityPast> abilities = new ArrayList<>();

  /**
   * The last generation in which the referenced pokémon had the listed abilities.
   */
  @JsonProperty("generation")
  private GenerationSummary generation;

  /**
   * The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
   * @return abilities
   */
  public List<PokemonAbilityPast> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<PokemonAbilityPast> abilities) {
    this.abilities = abilities;
  }

  /**
   * The last generation in which the referenced pokémon had the listed abilities.
   * @return generation
   */
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
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
    PokemonPastAbility pokemonPastAbility = (PokemonPastAbility) o;
    return Objects.equals(this.abilities, pokemonPastAbility.abilities) &&
        Objects.equals(this.generation, pokemonPastAbility.generation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abilities, generation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonPastAbility {\n");
    
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
