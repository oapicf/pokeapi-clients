package org.openapitools.model;

import org.openapitools.model.GenerationSummary;
import org.openapitools.model.PokemonType;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonPastType implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The last generation in which the referenced pokémon had the listed types.
   */
  @JsonProperty("generation")
  private GenerationSummary generation;

  /**
   * The types the referenced pokémon had up to and including the listed generation.
   */
  @JsonProperty("types")
  private List<PokemonType> types = new ArrayList<>();

  /**
   * The last generation in which the referenced pokémon had the listed types.
   * @return generation
   */
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * The types the referenced pokémon had up to and including the listed generation.
   * @return types
   */
  public List<PokemonType> getTypes() {
    return types;
  }

  public void setTypes(List<PokemonType> types) {
    this.types = types;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
