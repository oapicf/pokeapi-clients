package org.openapitools.model;

import org.openapitools.model.PokemonSummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class TypePokemon implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The order the Pokémon&#39;s types are listed in.
   */
  @JsonProperty("slot")
  private Integer slot;

  /**
   * The Pokémon that has the referenced type.
   */
  @JsonProperty("pokemon")
  private PokemonSummary pokemon;

  /**
   * The order the Pokémon&#39;s types are listed in.
   * @return slot
   */
  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  /**
   * The Pokémon that has the referenced type.
   * @return pokemon
   */
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
