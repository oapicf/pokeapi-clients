package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TypeSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonType   {
  private Integer slot;
  private TypeSummary type;

  public PokemonType() {
  }

  @JsonCreator
  public PokemonType(
    @JsonProperty(required = true, value = "slot") Integer slot,
    @JsonProperty(required = true, value = "type") TypeSummary type
  ) {
    this.slot = slot;
    this.type = type;
  }

  /**
   * The order the Pokémon&#39;s types are listed in.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonType slot(Integer slot) {
    this.slot = slot;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The order the Pokémon's types are listed in.")
  @JsonProperty(required = true, value = "slot")
  @NotNull  @Min(-2147483648) @Max(2147483647)public Integer getSlot() {
    return slot;
  }

  @JsonProperty(required = true, value = "slot")
  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  /**
   * The type the referenced Pokémon has.
   **/
  public PokemonType type(TypeSummary type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type the referenced Pokémon has.")
  @JsonProperty(required = true, value = "type")
  @NotNull @Valid public TypeSummary getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
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
