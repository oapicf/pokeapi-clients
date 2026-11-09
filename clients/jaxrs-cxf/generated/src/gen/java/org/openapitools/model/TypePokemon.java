package org.openapitools.model;

import org.openapitools.model.PokemonSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TypePokemon  {
  
 /**
  * The order the Pokémon's types are listed in.
  */
  @ApiModelProperty(required = true, value = "The order the Pokémon's types are listed in.")

  private Integer slot;

 /**
  * The Pokémon that has the referenced type.
  */
  @ApiModelProperty(required = true, value = "The Pokémon that has the referenced type.")

  @Valid

  private PokemonSummary pokemon;
 /**
   * The order the Pokémon&#39;s types are listed in.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return slot
  **/
  @JsonProperty("slot")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public TypePokemon slot(Integer slot) {
    this.slot = slot;
    return this;
  }

 /**
   * The Pokémon that has the referenced type.
   * @return pokemon
  **/
  @JsonProperty("pokemon")
  @NotNull
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  public TypePokemon pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

