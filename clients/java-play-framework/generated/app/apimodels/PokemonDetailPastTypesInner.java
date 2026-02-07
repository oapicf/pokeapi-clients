package apimodels;

import apimodels.AbilityDetailPokemonInnerPokemon;
import apimodels.PokemonDetailTypesInner;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * PokemonDetailPastTypesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonDetailPastTypesInner   {
  @JsonProperty("generation")
  @NotNull
@Valid

  private AbilityDetailPokemonInnerPokemon generation;

  @JsonProperty("types")
  @NotNull
@Valid

  private List<@Valid PokemonDetailTypesInner> types = new ArrayList<>();

  public PokemonDetailPastTypesInner generation(AbilityDetailPokemonInnerPokemon generation) {
    this.generation = generation;
    return this;
  }

   /**
   * Get generation
   * @return generation
  **/
  public AbilityDetailPokemonInnerPokemon getGeneration() {
    return generation;
  }

  public void setGeneration(AbilityDetailPokemonInnerPokemon generation) {
    this.generation = generation;
  }

  public PokemonDetailPastTypesInner types(List<@Valid PokemonDetailTypesInner> types) {
    this.types = types;
    return this;
  }

  public PokemonDetailPastTypesInner addTypesItem(PokemonDetailTypesInner typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  public List<@Valid PokemonDetailTypesInner> getTypes() {
    return types;
  }

  public void setTypes(List<@Valid PokemonDetailTypesInner> types) {
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
    PokemonDetailPastTypesInner pokemonDetailPastTypesInner = (PokemonDetailPastTypesInner) o;
    return Objects.equals(generation, pokemonDetailPastTypesInner.generation) &&
        Objects.equals(types, pokemonDetailPastTypesInner.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generation, types);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

