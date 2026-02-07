package apimodels;

import apimodels.TypeDetailPokemonInnerPokemon;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TypeDetailPokemonInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TypeDetailPokemonInner   {
  @JsonProperty("slot")
  
  private Integer slot;

  @JsonProperty("pokemon")
  @Valid

  private TypeDetailPokemonInnerPokemon pokemon;

  public TypeDetailPokemonInner slot(Integer slot) {
    this.slot = slot;
    return this;
  }

   /**
   * Get slot
   * @return slot
  **/
  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public TypeDetailPokemonInner pokemon(TypeDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
    return this;
  }

   /**
   * Get pokemon
   * @return pokemon
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

