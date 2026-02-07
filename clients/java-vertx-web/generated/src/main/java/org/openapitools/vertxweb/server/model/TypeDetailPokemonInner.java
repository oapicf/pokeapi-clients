package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.TypeDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeDetailPokemonInner   {
  
  private Integer slot;
  private TypeDetailPokemonInnerPokemon pokemon;

  public TypeDetailPokemonInner () {

  }

  public TypeDetailPokemonInner (Integer slot, TypeDetailPokemonInnerPokemon pokemon) {
    this.slot = slot;
    this.pokemon = pokemon;
  }

    
  @JsonProperty("slot")
  public Integer getSlot() {
    return slot;
  }
  public void setSlot(Integer slot) {
    this.slot = slot;
  }

    
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
    return Objects.equals(slot, typeDetailPokemonInner.slot) &&
        Objects.equals(pokemon, typeDetailPokemonInner.pokemon);
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
