package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PalParkAreaSummary;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonSpeciesPalParkEncounter
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpeciesPalParkEncounter {

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> baseScore = JsonNullable.<Integer>undefined();

  private Integer rate;

  private PalParkAreaSummary area;

  public PokemonSpeciesPalParkEncounter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonSpeciesPalParkEncounter(Integer rate, PalParkAreaSummary area) {
    this.rate = rate;
    this.area = area;
  }

  public PokemonSpeciesPalParkEncounter baseScore(Integer baseScore) {
    this.baseScore = JsonNullable.of(baseScore);
    return this;
  }

  /**
   * The base score given to the player when the referenced Pokémon is caught during a pal park run.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return baseScore
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "base_score", description = "The base score given to the player when the referenced Pokémon is caught during a pal park run.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("base_score")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getBaseScore() {
    return baseScore;
  }

  public void setBaseScore(JsonNullable<Integer> baseScore) {
    this.baseScore = baseScore;
  }

  public PokemonSpeciesPalParkEncounter rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  /**
   * The base rate for encountering the referenced Pokémon in this pal park area.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return rate
   */
  @NotNull @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "rate", description = "The base rate for encountering the referenced Pokémon in this pal park area.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rate")
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public PokemonSpeciesPalParkEncounter area(PalParkAreaSummary area) {
    this.area = area;
    return this;
  }

  /**
   * The pal park area where this encounter happens.
   * @return area
   */
  @NotNull @Valid 
  @Schema(name = "area", description = "The pal park area where this encounter happens.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("area")
  public PalParkAreaSummary getArea() {
    return area;
  }

  public void setArea(PalParkAreaSummary area) {
    this.area = area;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter = (PokemonSpeciesPalParkEncounter) o;
    return equalsNullable(this.baseScore, pokemonSpeciesPalParkEncounter.baseScore) &&
        Objects.equals(this.rate, pokemonSpeciesPalParkEncounter.rate) &&
        Objects.equals(this.area, pokemonSpeciesPalParkEncounter.area);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(baseScore), rate, area);
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
    sb.append("class PokemonSpeciesPalParkEncounter {\n");
    sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
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

