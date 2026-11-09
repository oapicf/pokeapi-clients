package org.openapitools.model;

import org.openapitools.model.TypeSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonType  {
  
 /**
  * The order the Pokémon's types are listed in.
  */
  @ApiModelProperty(required = true, value = "The order the Pokémon's types are listed in.")
  private Integer slot;

 /**
  * The type the referenced Pokémon has.
  */
  @ApiModelProperty(required = true, value = "The type the referenced Pokémon has.")
  @Valid
  private TypeSummary type;
 /**
  * The order the Pokémon&#39;s types are listed in.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return slot
  */
  @JsonProperty("slot")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getSlot() {
    return slot;
  }

  /**
   * Sets the <code>slot</code> property.
   */
 public void setSlot(Integer slot) {
    this.slot = slot;
  }

  /**
   * Sets the <code>slot</code> property.
   */
  public PokemonType slot(Integer slot) {
    this.slot = slot;
    return this;
  }

 /**
  * The type the referenced Pokémon has.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public TypeSummary getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeSummary type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public PokemonType type(TypeSummary type) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

