package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PokemonSpeciesSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GenderPokemonSpecies
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class GenderPokemonSpecies {

  private Integer rate;

  private PokemonSpeciesSummary pokemonSpecies;

  public GenderPokemonSpecies() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenderPokemonSpecies(Integer rate, PokemonSpeciesSummary pokemonSpecies) {
    this.rate = rate;
    this.pokemonSpecies = pokemonSpecies;
  }

  public GenderPokemonSpecies rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  /**
   * The chance of this Pokémon being female, in eighths; or -1 for genderless.
   * @return rate
   */
  @NotNull 
  @Schema(name = "rate", description = "The chance of this Pokémon being female, in eighths; or -1 for genderless.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rate")
  public Integer getRate() {
    return rate;
  }

  @JsonProperty("rate")
  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public GenderPokemonSpecies pokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  /**
   * A Pokémon species that can be the referenced gender.
   * @return pokemonSpecies
   */
  @NotNull @Valid 
  @Schema(name = "pokemon_species", description = "A Pokémon species that can be the referenced gender.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon_species")
  public PokemonSpeciesSummary getPokemonSpecies() {
    return pokemonSpecies;
  }

  @JsonProperty("pokemon_species")
  public void setPokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenderPokemonSpecies genderPokemonSpecies = (GenderPokemonSpecies) o;
    return Objects.equals(this.rate, genderPokemonSpecies.rate) &&
        Objects.equals(this.pokemonSpecies, genderPokemonSpecies.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, pokemonSpecies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenderPokemonSpecies {\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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

