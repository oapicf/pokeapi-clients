package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TypeSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonFormType   {
  
  private Integer slot;
  private TypeSummary type;

  /**
   * The order the Pokémon&#39;s types are listed in.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(required = true, value = "The order the Pokémon's types are listed in.")
  @JsonProperty("slot")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getSlot() {
    return slot;
  }
  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  /**
   * The type the referenced Form has.
   **/
  
  @ApiModelProperty(required = true, value = "The type the referenced Form has.")
  @JsonProperty("type")
  @NotNull
  @Valid
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

