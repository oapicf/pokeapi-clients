package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.PokemonSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * TypePokemon
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class TypePokemon   {
  @JsonProperty("slot")
  private Integer slot;

  @JsonProperty("pokemon")
  private PokemonSummary pokemon;

  public TypePokemon slot(Integer slot) {
    this.slot = slot;
    return this;
  }

  /**
   * The order the Pokémon's types are listed in.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return slot
   */
  @ApiModelProperty(required = true, value = "The order the Pokémon's types are listed in.")
  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public TypePokemon pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  /**
   * The Pokémon that has the referenced type.
   * @return pokemon
   */
  @ApiModelProperty(required = true, value = "The Pokémon that has the referenced type.")
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypePokemon typePokemon = (TypePokemon) o;
    return Objects.equals(this.slot, typePokemon.slot) &&
        Objects.equals(this.pokemon, typePokemon.pokemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slot, pokemon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypePokemon {\n");
    
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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

