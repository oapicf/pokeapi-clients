package org.openapitools.model;

import org.openapitools.model.TypeDetailPokemonInnerPokemon;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TypeDetailPokemonInner  {
  
  @ApiModelProperty(value = "")

  private Integer slot;

  @ApiModelProperty(value = "")

  private TypeDetailPokemonInnerPokemon pokemon;
 /**
   * Get slot
   * @return slot
  **/
  @JsonProperty("slot")
  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public TypeDetailPokemonInner slot(Integer slot) {
    this.slot = slot;
    return this;
  }

 /**
   * Get pokemon
   * @return pokemon
  **/
  @JsonProperty("pokemon")
  public TypeDetailPokemonInnerPokemon getPokemon() {
    return pokemon;
  }

  public void setPokemon(TypeDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
  }

  public TypeDetailPokemonInner pokemon(TypeDetailPokemonInnerPokemon pokemon) {
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
    TypeDetailPokemonInner typeDetailPokemonInner = (TypeDetailPokemonInner) o;
    return Objects.equals(this.slot, typeDetailPokemonInner.slot) &&
        Objects.equals(this.pokemon, typeDetailPokemonInner.pokemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slot, pokemon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeDetailPokemonInner {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

