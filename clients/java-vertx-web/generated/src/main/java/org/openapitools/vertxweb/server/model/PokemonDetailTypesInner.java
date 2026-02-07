package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonDetailTypesInner   {
  
  private Integer slot;
  private AbilityDetailPokemonInnerPokemon type;

  public PokemonDetailTypesInner () {

  }

  public PokemonDetailTypesInner (Integer slot, AbilityDetailPokemonInnerPokemon type) {
    this.slot = slot;
    this.type = type;
  }

    
  @JsonProperty("slot")
  public Integer getSlot() {
    return slot;
  }
  public void setSlot(Integer slot) {
    this.slot = slot;
  }

    
  @JsonProperty("type")
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
    return Objects.equals(slot, pokemonDetailTypesInner.slot) &&
        Objects.equals(type, pokemonDetailTypesInner.type);
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
