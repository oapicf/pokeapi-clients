package org.openapitools.model;

import org.openapitools.model.TypeSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonFormType  {
  
 /**
  * The order the Pokémon's types are listed in.
  */
  @ApiModelProperty(required = true, value = "The order the Pokémon's types are listed in.")

  private Integer slot;

 /**
  * The type the referenced Form has.
  */
  @ApiModelProperty(required = true, value = "The type the referenced Form has.")

  private TypeSummary type;
 /**
   * The order the Pokémon&#39;s types are listed in.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return slot
  **/
  @JsonProperty("slot")
  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public PokemonFormType slot(Integer slot) {
    this.slot = slot;
    return this;
  }

 /**
   * The type the referenced Form has.
   * @return type
  **/
  @JsonProperty("type")
  public TypeSummary getType() {
    return type;
  }

  public void setType(TypeSummary type) {
    this.type = type;
  }

  public PokemonFormType type(TypeSummary type) {
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
    PokemonFormType pokemonFormType = (PokemonFormType) o;
    return Objects.equals(this.slot, pokemonFormType.slot) &&
        Objects.equals(this.type, pokemonFormType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slot, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonFormType {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

