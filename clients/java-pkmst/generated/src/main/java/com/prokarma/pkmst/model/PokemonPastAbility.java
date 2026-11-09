package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.GenerationSummary;
import com.prokarma.pkmst.model.PokemonAbilityPast;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokemonPastAbility
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonPastAbility   {
  @JsonProperty("abilities")
  
  private List<PokemonAbilityPast> abilities = new ArrayList<>();

  @JsonProperty("generation")
  private GenerationSummary generation;

  public PokemonPastAbility abilities(List<PokemonAbilityPast> abilities) {
    this.abilities = abilities;
    return this;
  }

  public PokemonPastAbility addAbilitiesItem(PokemonAbilityPast abilitiesItem) {
    if (this.abilities == null) {
      this.abilities = new ArrayList<>();
    }
    this.abilities.add(abilitiesItem);
    return this;
  }

  /**
   * The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
   * @return abilities
   */
  @ApiModelProperty(required = true, value = "The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.")
  public List<PokemonAbilityPast> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<PokemonAbilityPast> abilities) {
    this.abilities = abilities;
  }

  public PokemonPastAbility generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  /**
   * The last generation in which the referenced pokémon had the listed abilities.
   * @return generation
   */
  @ApiModelProperty(required = true, value = "The last generation in which the referenced pokémon had the listed abilities.")
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

