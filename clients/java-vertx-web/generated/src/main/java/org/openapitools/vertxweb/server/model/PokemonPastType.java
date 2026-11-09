package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.GenerationSummary;
import org.openapitools.vertxweb.server.model.PokemonType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonPastType   {
  
  private GenerationSummary generation;
  private List<PokemonType> types = new ArrayList<>();

  public PokemonPastType () {

  }

  public PokemonPastType (GenerationSummary generation, List<PokemonType> types) {
    this.generation = generation;
    this.types = types;
  }

    
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

    
  @JsonProperty("types")
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
    return Objects.equals(generation, pokemonPastType.generation) &&
        Objects.equals(types, pokemonPastType.types);
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
