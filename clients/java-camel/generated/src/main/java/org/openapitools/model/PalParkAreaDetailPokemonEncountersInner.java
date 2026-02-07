package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PalParkAreaDetailPokemonEncountersInner
 */

@JsonTypeName("PalParkAreaDetail_pokemon_encounters_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PalParkAreaDetailPokemonEncountersInner {

  private Integer baseScore;

  private AbilityDetailPokemonInnerPokemon pokemonSpecies;

  private Integer rate;

  public PalParkAreaDetailPokemonEncountersInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PalParkAreaDetailPokemonEncountersInner(Integer baseScore, AbilityDetailPokemonInnerPokemon pokemonSpecies, Integer rate) {
    this.baseScore = baseScore;
    this.pokemonSpecies = pokemonSpecies;
    this.rate = rate;
  }

  public PalParkAreaDetailPokemonEncountersInner baseScore(Integer baseScore) {
    this.baseScore = baseScore;
    return this;
  }

  /**
   * Get baseScore
   * @return baseScore
   */
  @NotNull 
  @Schema(name = "base_score", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("base_score")
  public Integer getBaseScore() {
    return baseScore;
  }

  public void setBaseScore(Integer baseScore) {
    this.baseScore = baseScore;
  }

  public PalParkAreaDetailPokemonEncountersInner pokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  /**
   * Get pokemonSpecies
   * @return pokemonSpecies
   */
  @NotNull @Valid 
  @Schema(name = "pokemon-species", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon-species")
  public AbilityDetailPokemonInnerPokemon getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  public PalParkAreaDetailPokemonEncountersInner rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
   */
  @NotNull 
  @Schema(name = "rate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rate")
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PalParkAreaDetailPokemonEncountersInner palParkAreaDetailPokemonEncountersInner = (PalParkAreaDetailPokemonEncountersInner) o;
    return Objects.equals(this.baseScore, palParkAreaDetailPokemonEncountersInner.baseScore) &&
        Objects.equals(this.pokemonSpecies, palParkAreaDetailPokemonEncountersInner.pokemonSpecies) &&
        Objects.equals(this.rate, palParkAreaDetailPokemonEncountersInner.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseScore, pokemonSpecies, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PalParkAreaDetailPokemonEncountersInner {\n");
    sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
    sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

