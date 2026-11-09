package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.GenerationSummary;
import org.openapitools.vertxweb.server.model.PokemonAbilityPast;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonPastAbility   {
  
  private List<PokemonAbilityPast> abilities = new ArrayList<>();
  private GenerationSummary generation;

  public PokemonPastAbility () {

  }

  public PokemonPastAbility (List<PokemonAbilityPast> abilities, GenerationSummary generation) {
    this.abilities = abilities;
    this.generation = generation;
  }

    
  @JsonProperty("abilities")
  public List<PokemonAbilityPast> getAbilities() {
    return abilities;
  }
  public void setAbilities(List<PokemonAbilityPast> abilities) {
    this.abilities = abilities;
  }

    
  @JsonProperty("generation")
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
    return Objects.equals(abilities, pokemonPastAbility.abilities) &&
        Objects.equals(generation, pokemonPastAbility.generation);
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
