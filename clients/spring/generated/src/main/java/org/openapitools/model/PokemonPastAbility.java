package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.PokemonAbilityPast;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonPastAbility
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonPastAbility {

  private List<@Valid PokemonAbilityPast> abilities = new ArrayList<>();

  private GenerationSummary generation;

  public PokemonPastAbility() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonPastAbility(List<@Valid PokemonAbilityPast> abilities, GenerationSummary generation) {
    this.abilities = abilities;
    this.generation = generation;
  }

  public PokemonPastAbility abilities(List<@Valid PokemonAbilityPast> abilities) {
    this.abilities = abilities;
    return this;
  }

  public PokemonPastAbility addAbilitiesItem(PokemonAbilityPast abilitiesItem) {
    if (this.abilities == null) {
      this.abilities = new ArrayList<>();
    }
    this.abilities.add(abilitiesItem);
    return this;
  }

  /**
   * The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
   * @return abilities
   */
  @NotNull 
  @Schema(name = "abilities", description = "The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("abilities")
  public List<@Valid PokemonAbilityPast> getAbilities() {
    return abilities;
  }

  @JsonProperty("abilities")
  public void setAbilities(List<@Valid PokemonAbilityPast> abilities) {
    this.abilities = abilities;
  }

  public PokemonPastAbility generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  /**
   * The last generation in which the referenced pokémon had the listed abilities.
   * @return generation
   */
  @NotNull @Valid 
  @Schema(name = "generation", description = "The last generation in which the referenced pokémon had the listed abilities.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }

  @JsonProperty("generation")
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonPastAbility pokemonPastAbility = (PokemonPastAbility) o;
    return Objects.equals(this.abilities, pokemonPastAbility.abilities) &&
        Objects.equals(this.generation, pokemonPastAbility.generation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abilities, generation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonPastAbility {\n");
    sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
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

