package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TypeDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class TypeDetailPokemonInner   {
  
  private Integer slot;

  private TypeDetailPokemonInnerPokemon pokemon;

  /**
   **/
  public TypeDetailPokemonInner slot(Integer slot) {
    this.slot = slot;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("slot")
  public Integer getSlot() {
    return slot;
  }
  public void setSlot(Integer slot) {
    this.slot = slot;
  }


  /**
   **/
  public TypeDetailPokemonInner pokemon(TypeDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pokemon")
  public TypeDetailPokemonInnerPokemon getPokemon() {
    return pokemon;
  }
  public void setPokemon(TypeDetailPokemonInnerPokemon pokemon) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

