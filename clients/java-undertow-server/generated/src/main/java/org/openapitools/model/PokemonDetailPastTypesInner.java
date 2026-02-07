/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
 *
 * OpenAPI document version: 2.7.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.PokemonDetailTypesInner;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-02-07T04:17:17.108399996Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetailPastTypesInner   {
  
  private AbilityDetailPokemonInnerPokemon generation;
  private List<PokemonDetailTypesInner> types = new ArrayList<>();

  /**
   */
  public PokemonDetailPastTypesInner generation(AbilityDetailPokemonInnerPokemon generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("generation")
  public AbilityDetailPokemonInnerPokemon getGeneration() {
    return generation;
  }
  public void setGeneration(AbilityDetailPokemonInnerPokemon generation) {
    this.generation = generation;
  }

  /**
   */
  public PokemonDetailPastTypesInner types(List<PokemonDetailTypesInner> types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("types")
  public List<PokemonDetailTypesInner> getTypes() {
    return types;
  }
  public void setTypes(List<PokemonDetailTypesInner> types) {
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

