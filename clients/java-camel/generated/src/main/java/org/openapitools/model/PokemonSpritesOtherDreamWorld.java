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
 * PokemonSpritesOtherDreamWorld
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpritesOtherDreamWorld {

  private JsonNullable<String> frontDefault = JsonNullable.<String>undefined();

  private JsonNullable<String> frontFemale = JsonNullable.<String>undefined();

  public PokemonSpritesOtherDreamWorld() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonSpritesOtherDreamWorld(String frontDefault, String frontFemale) {
    this.frontDefault = JsonNullable.of(frontDefault);
    this.frontFemale = JsonNullable.of(frontFemale);
  }

  public PokemonSpritesOtherDreamWorld frontDefault(String frontDefault) {
    this.frontDefault = JsonNullable.of(frontDefault);
    return this;
  }

  /**
   * The URL of the default Pokémon Dream World front image, or null if unavailable.
   * @return frontDefault
   */
  /* @Present */ 
  @Schema(name = "front_default", description = "The URL of the default Pokémon Dream World front image, or null if unavailable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("front_default")
  public JsonNullable<String> getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(JsonNullable<String> frontDefault) {
    this.frontDefault = frontDefault;
  }

  public PokemonSpritesOtherDreamWorld frontFemale(String frontFemale) {
    this.frontFemale = JsonNullable.of(frontFemale);
    return this;
  }

  /**
   * The URL of the female Pokémon Dream World front image, or null if unavailable.
   * @return frontFemale
   */
  /* @Present */ 
  @Schema(name = "front_female", description = "The URL of the female Pokémon Dream World front image, or null if unavailable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("front_female")
  public JsonNullable<String> getFrontFemale() {
    return frontFemale;
  }

  public void setFrontFemale(JsonNullable<String> frontFemale) {
    this.frontFemale = frontFemale;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld = (PokemonSpritesOtherDreamWorld) o;
    return Objects.equals(this.frontDefault, pokemonSpritesOtherDreamWorld.frontDefault) &&
        Objects.equals(this.frontFemale, pokemonSpritesOtherDreamWorld.frontFemale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontFemale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpritesOtherDreamWorld {\n");
    sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
    sb.append("    frontFemale: ").append(toIndentedString(frontFemale)).append("\n");
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

