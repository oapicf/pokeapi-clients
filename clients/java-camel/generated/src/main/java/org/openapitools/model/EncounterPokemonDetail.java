package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EncounterPokemonDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class EncounterPokemonDetail {

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> minPerfectIvs = JsonNullable.<Integer>undefined();

  private Boolean alwaysShiny;

  private Boolean neverShiny;

  private Boolean isAlpha;

  public EncounterPokemonDetail minPerfectIvs(Integer minPerfectIvs) {
    this.minPerfectIvs = JsonNullable.of(minPerfectIvs);
    return this;
  }

  /**
   * The minimum number of perfect IVs, or null if unspecified.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minPerfectIvs
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "min_perfect_ivs", description = "The minimum number of perfect IVs, or null if unspecified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("min_perfect_ivs")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getMinPerfectIvs() {
    return minPerfectIvs;
  }

  public void setMinPerfectIvs(JsonNullable<Integer> minPerfectIvs) {
    this.minPerfectIvs = minPerfectIvs;
  }

  public EncounterPokemonDetail alwaysShiny(Boolean alwaysShiny) {
    this.alwaysShiny = alwaysShiny;
    return this;
  }

  /**
   * Whether the encountered Pokémon is always shiny.
   * @return alwaysShiny
   */
  
  @Schema(name = "always_shiny", description = "Whether the encountered Pokémon is always shiny.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("always_shiny")
  public Boolean getAlwaysShiny() {
    return alwaysShiny;
  }

  public void setAlwaysShiny(Boolean alwaysShiny) {
    this.alwaysShiny = alwaysShiny;
  }

  public EncounterPokemonDetail neverShiny(Boolean neverShiny) {
    this.neverShiny = neverShiny;
    return this;
  }

  /**
   * Whether the encountered Pokémon can never be shiny.
   * @return neverShiny
   */
  
  @Schema(name = "never_shiny", description = "Whether the encountered Pokémon can never be shiny.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("never_shiny")
  public Boolean getNeverShiny() {
    return neverShiny;
  }

  public void setNeverShiny(Boolean neverShiny) {
    this.neverShiny = neverShiny;
  }

  public EncounterPokemonDetail isAlpha(Boolean isAlpha) {
    this.isAlpha = isAlpha;
    return this;
  }

  /**
   * Whether the encountered Pokémon is an alpha Pokémon.
   * @return isAlpha
   */
  
  @Schema(name = "is_alpha", description = "Whether the encountered Pokémon is an alpha Pokémon.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_alpha")
  public Boolean getIsAlpha() {
    return isAlpha;
  }

  public void setIsAlpha(Boolean isAlpha) {
    this.isAlpha = isAlpha;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncounterPokemonDetail encounterPokemonDetail = (EncounterPokemonDetail) o;
    return equalsNullable(this.minPerfectIvs, encounterPokemonDetail.minPerfectIvs) &&
        Objects.equals(this.alwaysShiny, encounterPokemonDetail.alwaysShiny) &&
        Objects.equals(this.neverShiny, encounterPokemonDetail.neverShiny) &&
        Objects.equals(this.isAlpha, encounterPokemonDetail.isAlpha);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(minPerfectIvs), alwaysShiny, neverShiny, isAlpha);
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
    sb.append("class EncounterPokemonDetail {\n");
    sb.append("    minPerfectIvs: ").append(toIndentedString(minPerfectIvs)).append("\n");
    sb.append("    alwaysShiny: ").append(toIndentedString(alwaysShiny)).append("\n");
    sb.append("    neverShiny: ").append(toIndentedString(neverShiny)).append("\n");
    sb.append("    isAlpha: ").append(toIndentedString(isAlpha)).append("\n");
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

