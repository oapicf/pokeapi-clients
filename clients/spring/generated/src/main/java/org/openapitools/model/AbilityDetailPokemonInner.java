package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AbilityDetailPokemonInner
 */

@JsonTypeName("AbilityDetail_pokemon_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T02:00:43.960184425Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AbilityDetailPokemonInner {

  private Boolean isHidden;

  private Integer slot;

  private AbilityDetailPokemonInnerPokemon pokemon;

  public AbilityDetailPokemonInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AbilityDetailPokemonInner(Boolean isHidden, Integer slot, AbilityDetailPokemonInnerPokemon pokemon) {
    this.isHidden = isHidden;
    this.slot = slot;
    this.pokemon = pokemon;
  }

  public AbilityDetailPokemonInner isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * Get isHidden
   * @return isHidden
   */
  @NotNull 
  @Schema(name = "is_hidden", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_hidden")
  public Boolean getIsHidden() {
    return isHidden;
  }

  @JsonProperty("is_hidden")
  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public AbilityDetailPokemonInner slot(Integer slot) {
    this.slot = slot;
    return this;
  }

  /**
   * Get slot
   * @return slot
   */
  @NotNull 
  @Schema(name = "slot", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("slot")
  public Integer getSlot() {
    return slot;
  }

  @JsonProperty("slot")
  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public AbilityDetailPokemonInner pokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  /**
   * Get pokemon
   * @return pokemon
   */
  @NotNull @Valid 
  @Schema(name = "pokemon", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon")
  public AbilityDetailPokemonInnerPokemon getPokemon() {
    return pokemon;
  }

  @JsonProperty("pokemon")
  public void setPokemon(AbilityDetailPokemonInnerPokemon pokemon) {
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
    AbilityDetailPokemonInner abilityDetailPokemonInner = (AbilityDetailPokemonInner) o;
    return Objects.equals(this.isHidden, abilityDetailPokemonInner.isHidden) &&
        Objects.equals(this.slot, abilityDetailPokemonInner.slot) &&
        Objects.equals(this.pokemon, abilityDetailPokemonInner.pokemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHidden, slot, pokemon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbilityDetailPokemonInner {\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
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

