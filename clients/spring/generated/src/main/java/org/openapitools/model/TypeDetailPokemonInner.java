package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.TypeDetailPokemonInnerPokemon;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TypeDetailPokemonInner
 */

@JsonTypeName("TypeDetail_pokemon_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T02:00:43.960184425Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TypeDetailPokemonInner {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer slot;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable TypeDetailPokemonInnerPokemon pokemon;

  public TypeDetailPokemonInner slot(@Nullable Integer slot) {
    this.slot = slot;
    return this;
  }

  /**
   * Get slot
   * @return slot
   */
  
  @Schema(name = "slot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slot")
  public @Nullable Integer getSlot() {
    return slot;
  }

  @JsonProperty("slot")
  public void setSlot(@Nullable Integer slot) {
    this.slot = slot;
  }

  public TypeDetailPokemonInner pokemon(@Nullable TypeDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  /**
   * Get pokemon
   * @return pokemon
   */
  @Valid 
  @Schema(name = "pokemon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pokemon")
  public @Nullable TypeDetailPokemonInnerPokemon getPokemon() {
    return pokemon;
  }

  @JsonProperty("pokemon")
  public void setPokemon(@Nullable TypeDetailPokemonInnerPokemon pokemon) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

