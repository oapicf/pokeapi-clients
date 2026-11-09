package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.TypeSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokemonType
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonType   {
  @JsonProperty("slot")
  private Integer slot;

  @JsonProperty("type")
  private TypeSummary type;

  public PokemonType slot(Integer slot) {
    this.slot = slot;
    return this;
  }

  /**
   * The order the Pokémon's types are listed in.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return slot
   */
  @ApiModelProperty(required = true, value = "The order the Pokémon's types are listed in.")
  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public PokemonType type(TypeSummary type) {
    this.type = type;
    return this;
  }

  /**
   * The type the referenced Pokémon has.
   * @return type
   */
  @ApiModelProperty(required = true, value = "The type the referenced Pokémon has.")
  public TypeSummary getType() {
    return type;
  }

  public void setType(TypeSummary type) {
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
    PokemonType pokemonType = (PokemonType) o;
    return Objects.equals(this.slot, pokemonType.slot) &&
        Objects.equals(this.type, pokemonType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slot, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonType {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

