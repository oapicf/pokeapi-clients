package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonCries
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonCries {

  private JsonNullable<String> latest = JsonNullable.<String>undefined();

  private JsonNullable<String> legacy = JsonNullable.<String>undefined();

  public PokemonCries() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonCries(String latest, String legacy) {
    this.latest = JsonNullable.of(latest);
    this.legacy = JsonNullable.of(legacy);
  }

  public PokemonCries latest(String latest) {
    this.latest = JsonNullable.of(latest);
    return this;
  }

  /**
   * The latest depiction of this Pokémon's cry.
   * @return latest
   */
  /* @Present */ 
  @Schema(name = "latest", description = "The latest depiction of this Pokémon's cry.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("latest")
  public JsonNullable<String> getLatest() {
    return latest;
  }

  public void setLatest(JsonNullable<String> latest) {
    this.latest = latest;
  }

  public PokemonCries legacy(String legacy) {
    this.legacy = JsonNullable.of(legacy);
    return this;
  }

  /**
   * The legacy depiction of this Pokémon's cry.
   * @return legacy
   */
  /* @Present */ 
  @Schema(name = "legacy", description = "The legacy depiction of this Pokémon's cry.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("legacy")
  public JsonNullable<String> getLegacy() {
    return legacy;
  }

  public void setLegacy(JsonNullable<String> legacy) {
    this.legacy = legacy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonCries pokemonCries = (PokemonCries) o;
    return Objects.equals(this.latest, pokemonCries.latest) &&
        Objects.equals(this.legacy, pokemonCries.legacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latest, legacy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonCries {\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    legacy: ").append(toIndentedString(legacy)).append("\n");
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

