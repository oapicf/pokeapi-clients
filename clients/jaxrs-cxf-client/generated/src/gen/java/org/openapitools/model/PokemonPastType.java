package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.PokemonType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonPastType  {
  
 /**
  * The last generation in which the referenced pokémon had the listed types.
  */
  @ApiModelProperty(required = true, value = "The last generation in which the referenced pokémon had the listed types.")

  private GenerationSummary generation;

 /**
  * The types the referenced pokémon had up to and including the listed generation.
  */
  @ApiModelProperty(required = true, value = "The types the referenced pokémon had up to and including the listed generation.")

  private List<PokemonType> types = new ArrayList<>();
 /**
   * The last generation in which the referenced pokémon had the listed types.
   * @return generation
  **/
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public PokemonPastType generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

 /**
   * The types the referenced pokémon had up to and including the listed generation.
   * @return types
  **/
  @JsonProperty("types")
  public List<PokemonType> getTypes() {
    return types;
  }

  public void setTypes(List<PokemonType> types) {
    this.types = types;
  }

  public PokemonPastType types(List<PokemonType> types) {
    this.types = types;
    return this;
  }

  public PokemonPastType addTypesItem(PokemonType typesItem) {
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
    PokemonPastType pokemonPastType = (PokemonPastType) o;
    return Objects.equals(this.generation, pokemonPastType.generation) &&
        Objects.equals(this.types, pokemonPastType.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generation, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonPastType {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

