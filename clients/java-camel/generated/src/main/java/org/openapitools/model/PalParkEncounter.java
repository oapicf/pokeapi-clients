package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokemonSpeciesSummary;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PalParkEncounter
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PalParkEncounter {

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> baseScore = JsonNullable.<Integer>undefined();

  private Integer rate;

  private PokemonSpeciesSummary pokemonSpecies;

  public PalParkEncounter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PalParkEncounter(Integer rate, PokemonSpeciesSummary pokemonSpecies) {
    this.rate = rate;
    this.pokemonSpecies = pokemonSpecies;
  }

  public PalParkEncounter baseScore(Integer baseScore) {
    this.baseScore = JsonNullable.of(baseScore);
    return this;
  }

  /**
   * The base score given to the player when this Pokémon is caught during a pal park run.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return baseScore
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "base_score", description = "The base score given to the player when this Pokémon is caught during a pal park run.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("base_score")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getBaseScore() {
    return baseScore;
  }

  public void setBaseScore(JsonNullable<Integer> baseScore) {
    this.baseScore = baseScore;
  }

  public PalParkEncounter rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  /**
   * The base rate for encountering this Pokémon in this pal park area.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return rate
   */
  @NotNull @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "rate", description = "The base rate for encountering this Pokémon in this pal park area.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rate")
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public PalParkEncounter pokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  /**
   * The Pokémon species being encountered.
   * @return pokemonSpecies
   */
  @NotNull @Valid 
  @Schema(name = "pokemon_species", description = "The Pokémon species being encountered.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon_species")
  public PokemonSpeciesSummary getPokemonSpecies() {
    return pokemonSpecies;
  }

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
    PalParkEncounter palParkEncounter = (PalParkEncounter) o;
    return equalsNullable(this.baseScore, palParkEncounter.baseScore) &&
        Objects.equals(this.rate, palParkEncounter.rate) &&
        Objects.equals(this.pokemonSpecies, palParkEncounter.pokemonSpecies);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(baseScore), rate, pokemonSpecies);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PalParkEncounter {\n");
    sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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

