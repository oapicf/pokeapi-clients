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
 * PokemonSpritesOtherHome
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpritesOtherHome {

  private JsonNullable<String> frontDefault = JsonNullable.<String>undefined();

  private JsonNullable<String> frontFemale = JsonNullable.<String>undefined();

  private JsonNullable<String> frontShiny = JsonNullable.<String>undefined();

  private JsonNullable<String> frontShinyFemale = JsonNullable.<String>undefined();

  public PokemonSpritesOtherHome() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonSpritesOtherHome(String frontDefault, String frontFemale, String frontShiny, String frontShinyFemale) {
    this.frontDefault = JsonNullable.of(frontDefault);
    this.frontFemale = JsonNullable.of(frontFemale);
    this.frontShiny = JsonNullable.of(frontShiny);
    this.frontShinyFemale = JsonNullable.of(frontShinyFemale);
  }

  public PokemonSpritesOtherHome frontDefault(String frontDefault) {
    this.frontDefault = JsonNullable.of(frontDefault);
    return this;
  }

  /**
   * The URL of the default Pokémon HOME front image, or null if unavailable.
   * @return frontDefault
   */
  /* @Present */ 
  @Schema(name = "front_default", description = "The URL of the default Pokémon HOME front image, or null if unavailable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("front_default")
  public JsonNullable<String> getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(JsonNullable<String> frontDefault) {
    this.frontDefault = frontDefault;
  }

  public PokemonSpritesOtherHome frontFemale(String frontFemale) {
    this.frontFemale = JsonNullable.of(frontFemale);
    return this;
  }

  /**
   * The URL of the female Pokémon HOME front image, or null if unavailable.
   * @return frontFemale
   */
  /* @Present */ 
  @Schema(name = "front_female", description = "The URL of the female Pokémon HOME front image, or null if unavailable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("front_female")
  public JsonNullable<String> getFrontFemale() {
    return frontFemale;
  }

  public void setFrontFemale(JsonNullable<String> frontFemale) {
    this.frontFemale = frontFemale;
  }

  public PokemonSpritesOtherHome frontShiny(String frontShiny) {
    this.frontShiny = JsonNullable.of(frontShiny);
    return this;
  }

  /**
   * The URL of the shiny Pokémon HOME front image, or null if unavailable.
   * @return frontShiny
   */
  /* @Present */ 
  @Schema(name = "front_shiny", description = "The URL of the shiny Pokémon HOME front image, or null if unavailable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("front_shiny")
  public JsonNullable<String> getFrontShiny() {
    return frontShiny;
  }

  public void setFrontShiny(JsonNullable<String> frontShiny) {
    this.frontShiny = frontShiny;
  }

  public PokemonSpritesOtherHome frontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = JsonNullable.of(frontShinyFemale);
    return this;
  }

  /**
   * The URL of the shiny female Pokémon HOME front image, or null if unavailable.
   * @return frontShinyFemale
   */
  /* @Present */ 
  @Schema(name = "front_shiny_female", description = "The URL of the shiny female Pokémon HOME front image, or null if unavailable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("front_shiny_female")
  public JsonNullable<String> getFrontShinyFemale() {
    return frontShinyFemale;
  }

  public void setFrontShinyFemale(JsonNullable<String> frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpritesOtherHome pokemonSpritesOtherHome = (PokemonSpritesOtherHome) o;
    return Objects.equals(this.frontDefault, pokemonSpritesOtherHome.frontDefault) &&
        Objects.equals(this.frontFemale, pokemonSpritesOtherHome.frontFemale) &&
        Objects.equals(this.frontShiny, pokemonSpritesOtherHome.frontShiny) &&
        Objects.equals(this.frontShinyFemale, pokemonSpritesOtherHome.frontShinyFemale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontFemale, frontShiny, frontShinyFemale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpritesOtherHome {\n");
    sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
    sb.append("    frontFemale: ").append(toIndentedString(frontFemale)).append("\n");
    sb.append("    frontShiny: ").append(toIndentedString(frontShiny)).append("\n");
    sb.append("    frontShinyFemale: ").append(toIndentedString(frontShinyFemale)).append("\n");
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

