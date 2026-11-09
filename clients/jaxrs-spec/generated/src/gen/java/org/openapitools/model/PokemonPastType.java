package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.PokemonType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonPastType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonPastType   {
  private GenerationSummary generation;
  private List<@Valid PokemonType> types = new ArrayList<>();

  public PokemonPastType() {
  }

  @JsonCreator
  public PokemonPastType(
    @JsonProperty(required = true, value = "generation") GenerationSummary generation,
    @JsonProperty(required = true, value = "types") List<@Valid PokemonType> types
  ) {
    this.generation = generation;
    this.types = types;
  }

  /**
   * The last generation in which the referenced pokémon had the listed types.
   **/
  public PokemonPastType generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The last generation in which the referenced pokémon had the listed types.")
  @JsonProperty(required = true, value = "generation")
  @NotNull @Valid public GenerationSummary getGeneration() {
    return generation;
  }

  @JsonProperty(required = true, value = "generation")
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * The types the referenced pokémon had up to and including the listed generation.
   **/
  public PokemonPastType types(List<@Valid PokemonType> types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The types the referenced pokémon had up to and including the listed generation.")
  @JsonProperty(required = true, value = "types")
  @NotNull public List<@Valid PokemonType> getTypes() {
    return types;
  }

  @JsonProperty(required = true, value = "types")
  public void setTypes(List<@Valid PokemonType> types) {
    this.types = types;
  }

  public PokemonPastType addTypesItem(PokemonType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }

    this.types.add(typesItem);
    return this;
  }

  public PokemonPastType removeTypesItem(PokemonType typesItem) {
    if (typesItem != null && this.types != null) {
      this.types.remove(typesItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
