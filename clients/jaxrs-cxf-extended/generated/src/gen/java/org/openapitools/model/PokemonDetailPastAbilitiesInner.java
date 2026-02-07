package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.PokemonDetailAbilitiesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonDetailPastAbilitiesInner  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonDetailAbilitiesInner> abilities = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon generation;
 /**
  * Get abilities
  * @return abilities
  */
  @JsonProperty("abilities")
  @NotNull
  public List<@Valid PokemonDetailAbilitiesInner> getAbilities() {
    return abilities;
  }

  /**
   * Sets the <code>abilities</code> property.
   */
 public void setAbilities(List<@Valid PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
  }

  /**
   * Sets the <code>abilities</code> property.
   */
  public PokemonDetailPastAbilitiesInner abilities(List<@Valid PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
    return this;
  }

  /**
   * Adds a new item to the <code>abilities</code> list.
   */
  public PokemonDetailPastAbilitiesInner addAbilitiesItem(PokemonDetailAbilitiesInner abilitiesItem) {
    this.abilities.add(abilitiesItem);
    return this;
  }

 /**
  * Get generation
  * @return generation
  */
  @JsonProperty("generation")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getGeneration() {
    return generation;
  }

  /**
   * Sets the <code>generation</code> property.
   */
 public void setGeneration(AbilityDetailPokemonInnerPokemon generation) {
    this.generation = generation;
  }

  /**
   * Sets the <code>generation</code> property.
   */
  public PokemonDetailPastAbilitiesInner generation(AbilityDetailPokemonInnerPokemon generation) {
    this.generation = generation;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

