package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AbilitySummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonAbility
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonAbility {

  private @Nullable Boolean isHidden;

  private Integer slot;

  private AbilitySummary ability;

  public PokemonAbility() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonAbility(Integer slot, AbilitySummary ability) {
    this.slot = slot;
    this.ability = ability;
  }

  public PokemonAbility isHidden(@Nullable Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * Whether or not this is a hidden ability.
   * @return isHidden
   */
  
  @Schema(name = "is_hidden", description = "Whether or not this is a hidden ability.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_hidden")
  public @Nullable Boolean getIsHidden() {
    return isHidden;
  }

  @JsonProperty("is_hidden")
  public void setIsHidden(@Nullable Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public PokemonAbility slot(Integer slot) {
    this.slot = slot;
    return this;
  }

  /**
   * The slot this ability occupies in this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return slot
   */
  @NotNull @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "slot", description = "The slot this ability occupies in this Pokémon species.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("slot")
  public Integer getSlot() {
    return slot;
  }

  @JsonProperty("slot")
  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public PokemonAbility ability(AbilitySummary ability) {
    this.ability = ability;
    return this;
  }

  /**
   * The ability the Pokémon may have.
   * @return ability
   */
  @NotNull @Valid 
  @Schema(name = "ability", description = "The ability the Pokémon may have.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ability")
  public AbilitySummary getAbility() {
    return ability;
  }

  @JsonProperty("ability")
  public void setAbility(AbilitySummary ability) {
    this.ability = ability;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonAbility pokemonAbility = (PokemonAbility) o;
    return Objects.equals(this.isHidden, pokemonAbility.isHidden) &&
        Objects.equals(this.slot, pokemonAbility.slot) &&
        Objects.equals(this.ability, pokemonAbility.ability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHidden, slot, ability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonAbility {\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    ability: ").append(toIndentedString(ability)).append("\n");
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

