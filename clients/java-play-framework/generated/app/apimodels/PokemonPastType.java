package apimodels;

import apimodels.GenerationSummary;
import apimodels.PokemonType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonPastType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonPastType   {
  @JsonProperty("generation")
  @NotNull
@Valid

  private GenerationSummary generation;

  @JsonProperty("types")
  @NotNull
@Valid

  private List<@Valid PokemonType> types = new ArrayList<>();

  public PokemonPastType generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

   /**
   * The last generation in which the referenced pokémon had the listed types.
   * @return generation
  **/
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public PokemonPastType types(List<@Valid PokemonType> types) {
    this.types = types;
    return this;
  }

  public PokemonPastType addTypesItem(PokemonType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * The types the referenced pokémon had up to and including the listed generation.
   * @return types
  **/
  public List<@Valid PokemonType> getTypes() {
    return types;
  }

  public void setTypes(List<@Valid PokemonType> types) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

