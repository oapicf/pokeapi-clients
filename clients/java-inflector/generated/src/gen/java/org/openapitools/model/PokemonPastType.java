package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.PokemonType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonPastType   {
  @JsonProperty("generation")
  private GenerationSummary generation;

  @JsonProperty("types")
  private List<PokemonType> types = new ArrayList<>();

  /**
   * The last generation in which the referenced pokémon had the listed types.
   **/
  public PokemonPastType generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The last generation in which the referenced pokémon had the listed types.")
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * The types the referenced pokémon had up to and including the listed generation.
   **/
  public PokemonPastType types(List<PokemonType> types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The types the referenced pokémon had up to and including the listed generation.")
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

