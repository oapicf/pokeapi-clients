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
 * PokemonSpeciesDetailPalParkEncountersInner
 */

@JsonTypeName("PokemonSpeciesDetail_pal_park_encounters_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonSpeciesDetailPalParkEncountersInner {

  private AbilityDetailPokemonInnerPokemon area;

  private Integer baseScore;

  private Integer rate;

  public PokemonSpeciesDetailPalParkEncountersInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonSpeciesDetailPalParkEncountersInner(AbilityDetailPokemonInnerPokemon area, Integer baseScore, Integer rate) {
    this.area = area;
    this.baseScore = baseScore;
    this.rate = rate;
  }

  public PokemonSpeciesDetailPalParkEncountersInner area(AbilityDetailPokemonInnerPokemon area) {
    this.area = area;
    return this;
  }

  /**
   * Get area
   * @return area
   */
  @NotNull @Valid 
  @Schema(name = "area", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("area")
  public AbilityDetailPokemonInnerPokemon getArea() {
    return area;
  }

  public void setArea(AbilityDetailPokemonInnerPokemon area) {
    this.area = area;
  }

  public PokemonSpeciesDetailPalParkEncountersInner baseScore(Integer baseScore) {
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

  public PokemonSpeciesDetailPalParkEncountersInner rate(Integer rate) {
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
    PokemonSpeciesDetailPalParkEncountersInner pokemonSpeciesDetailPalParkEncountersInner = (PokemonSpeciesDetailPalParkEncountersInner) o;
    return Objects.equals(this.area, pokemonSpeciesDetailPalParkEncountersInner.area) &&
        Objects.equals(this.baseScore, pokemonSpeciesDetailPalParkEncountersInner.baseScore) &&
        Objects.equals(this.rate, pokemonSpeciesDetailPalParkEncountersInner.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, baseScore, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesDetailPalParkEncountersInner {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
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

