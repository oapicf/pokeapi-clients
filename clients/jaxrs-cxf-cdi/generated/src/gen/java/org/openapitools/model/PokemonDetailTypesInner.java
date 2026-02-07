package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokemonDetailTypesInner   {
  
  private Integer slot;

  private AbilityDetailPokemonInnerPokemon type;

  /**
   **/
  public PokemonDetailTypesInner slot(Integer slot) {
    this.slot = slot;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("slot")
  @NotNull
  public Integer getSlot() {
    return slot;
  }
  public void setSlot(Integer slot) {
    this.slot = slot;
  }


  /**
   **/
  public PokemonDetailTypesInner type(AbilityDetailPokemonInnerPokemon type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getType() {
    return type;
  }
  public void setType(AbilityDetailPokemonInnerPokemon type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonDetailTypesInner pokemonDetailTypesInner = (PokemonDetailTypesInner) o;
    return Objects.equals(this.slot, pokemonDetailTypesInner.slot) &&
        Objects.equals(this.type, pokemonDetailTypesInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slot, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDetailTypesInner {\n");
    
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

