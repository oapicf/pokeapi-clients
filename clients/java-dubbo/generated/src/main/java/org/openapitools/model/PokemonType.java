package org.openapitools.model;

import org.openapitools.model.TypeSummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonType implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The order the Pokémon&#39;s types are listed in.
   */
  @JsonProperty("slot")
  private Integer slot;

  /**
   * The type the referenced Pokémon has.
   */
  @JsonProperty("type")
  private TypeSummary type;

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
   * The type the referenced Pokémon has.
   * @return type
   */
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
