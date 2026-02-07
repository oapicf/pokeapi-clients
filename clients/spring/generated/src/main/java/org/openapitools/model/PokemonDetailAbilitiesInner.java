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
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PokemonDetailAbilitiesInner
 */

@JsonTypeName("PokemonDetail_abilities_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T15:29:13.146999890Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetailAbilitiesInner {

  private AbilityDetailPokemonInnerPokemon ability;

  private Boolean isHidden;

  private Integer slot;

  public PokemonDetailAbilitiesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonDetailAbilitiesInner(AbilityDetailPokemonInnerPokemon ability, Boolean isHidden, Integer slot) {
    this.ability = ability;
    this.isHidden = isHidden;
    this.slot = slot;
  }

  public PokemonDetailAbilitiesInner ability(AbilityDetailPokemonInnerPokemon ability) {
    this.ability = ability;
    return this;
  }

  /**
   * Get ability
   * @return ability
   */
  @NotNull @Valid 
  @Schema(name = "ability", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ability")
  public AbilityDetailPokemonInnerPokemon getAbility() {
    return ability;
  }

  public void setAbility(AbilityDetailPokemonInnerPokemon ability) {
    this.ability = ability;
  }

  public PokemonDetailAbilitiesInner isHidden(Boolean isHidden) {
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

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public PokemonDetailAbilitiesInner slot(Integer slot) {
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

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonDetailAbilitiesInner pokemonDetailAbilitiesInner = (PokemonDetailAbilitiesInner) o;
    return Objects.equals(this.ability, pokemonDetailAbilitiesInner.ability) &&
        Objects.equals(this.isHidden, pokemonDetailAbilitiesInner.isHidden) &&
        Objects.equals(this.slot, pokemonDetailAbilitiesInner.slot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ability, isHidden, slot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDetailAbilitiesInner {\n");
    sb.append("    ability: ").append(toIndentedString(ability)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
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

