package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.PokemonDetailTypesInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonDetailPastTypesInner  {
  
  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon generation;

  @ApiModelProperty(required = true, value = "")

  private List<PokemonDetailTypesInner> types = new ArrayList<>();
 /**
   * Get generation
   * @return generation
  **/
  @JsonProperty("generation")
  public AbilityDetailPokemonInnerPokemon getGeneration() {
    return generation;
  }

  public void setGeneration(AbilityDetailPokemonInnerPokemon generation) {
    this.generation = generation;
  }

  public PokemonDetailPastTypesInner generation(AbilityDetailPokemonInnerPokemon generation) {
    this.generation = generation;
    return this;
  }

 /**
   * Get types
   * @return types
  **/
  @JsonProperty("types")
  public List<PokemonDetailTypesInner> getTypes() {
    return types;
  }

  public void setTypes(List<PokemonDetailTypesInner> types) {
    this.types = types;
  }

  public PokemonDetailPastTypesInner types(List<PokemonDetailTypesInner> types) {
    this.types = types;
    return this;
  }

  public PokemonDetailPastTypesInner addTypesItem(PokemonDetailTypesInner typesItem) {
    this.types.add(typesItem);
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
    PokemonDetailPastTypesInner pokemonDetailPastTypesInner = (PokemonDetailPastTypesInner) o;
    return Objects.equals(this.generation, pokemonDetailPastTypesInner.generation) &&
        Objects.equals(this.types, pokemonDetailPastTypesInner.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generation, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDetailPastTypesInner {\n");
    
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

