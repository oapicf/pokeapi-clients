package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TypeDetailPokemonInnerPokemon;

/**
 * TypeDetailPokemonInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeDetailPokemonInner   {
  @JsonProperty("slot")
  private Integer slot;

  @JsonProperty("pokemon")
  private TypeDetailPokemonInnerPokemon pokemon;

  public TypeDetailPokemonInner slot(Integer slot) {
    this.slot = slot;
    return this;
  }

   /**
   * Get slot
   * @return slot
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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

