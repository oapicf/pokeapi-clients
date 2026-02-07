package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonDetail_types_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetailTypesInner   {
  private Integer slot;
  private AbilityDetailPokemonInnerPokemon type;

  public PokemonDetailTypesInner() {
  }

  @JsonCreator
  public PokemonDetailTypesInner(
    @JsonProperty(required = true, value = "slot") Integer slot,
    @JsonProperty(required = true, value = "type") AbilityDetailPokemonInnerPokemon type
  ) {
    this.slot = slot;
    this.type = type;
  }

  /**
   **/
  public PokemonDetailTypesInner slot(Integer slot) {
    this.slot = slot;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "slot")
  @NotNull public Integer getSlot() {
    return slot;
  }

  @JsonProperty(required = true, value = "slot")
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
  @JsonProperty(required = true, value = "type")
  @NotNull @Valid public AbilityDetailPokemonInnerPokemon getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
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

