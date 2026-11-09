package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.TypeSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonFormType
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonFormType {

  private Integer slot;

  private TypeSummary type;

  public PokemonFormType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonFormType(Integer slot, TypeSummary type) {
    this.slot = slot;
    this.type = type;
  }

  public PokemonFormType slot(Integer slot) {
    this.slot = slot;
    return this;
  }

  /**
   * The order the Pokémon's types are listed in.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return slot
   */
  @NotNull @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "slot", description = "The order the Pokémon's types are listed in.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("slot")
  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public PokemonFormType type(TypeSummary type) {
    this.type = type;
    return this;
  }

  /**
   * The type the referenced Form has.
   * @return type
   */
  @NotNull @Valid 
  @Schema(name = "type", description = "The type the referenced Form has.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
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

