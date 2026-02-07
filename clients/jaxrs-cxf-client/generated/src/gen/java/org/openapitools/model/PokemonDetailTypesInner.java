package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonDetailTypesInner  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer slot;

  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon type;
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

  public PokemonDetailTypesInner slot(Integer slot) {
    this.slot = slot;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public AbilityDetailPokemonInnerPokemon getType() {
    return type;
  }

  public void setType(AbilityDetailPokemonInnerPokemon type) {
    this.type = type;
  }

  public PokemonDetailTypesInner type(AbilityDetailPokemonInnerPokemon type) {
    this.type = type;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

