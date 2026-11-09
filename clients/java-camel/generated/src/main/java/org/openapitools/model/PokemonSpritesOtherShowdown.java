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
 * PokemonSpritesOtherShowdown
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpritesOtherShowdown {

  private JsonNullable<String> frontDefault = JsonNullable.<String>undefined();

  private JsonNullable<String> frontFemale = JsonNullable.<String>undefined();

  private JsonNullable<String> frontShiny = JsonNullable.<String>undefined();

  private JsonNullable<String> frontShinyFemale = JsonNullable.<String>undefined();

  private JsonNullable<String> backDefault = JsonNullable.<String>undefined();

  private JsonNullable<String> backFemale = JsonNullable.<String>undefined();

  private JsonNullable<String> backShiny = JsonNullable.<String>undefined();

  private JsonNullable<String> backShinyFemale = JsonNullable.<String>undefined();

  public PokemonSpritesOtherShowdown() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonSpritesOtherShowdown(String frontDefault, String frontFemale, String frontShiny, String frontShinyFemale, String backDefault, String backFemale, String backShiny, String backShinyFemale) {
    this.frontDefault = JsonNullable.of(frontDefault);
    this.frontFemale = JsonNullable.of(frontFemale);
    this.frontShiny = JsonNullable.of(frontShiny);
    this.frontShinyFemale = JsonNullable.of(frontShinyFemale);
    this.backDefault = JsonNullable.of(backDefault);
    this.backFemale = JsonNullable.of(backFemale);
    this.backShiny = JsonNullable.of(backShiny);
    this.backShinyFemale = JsonNullable.of(backShinyFemale);
  }

  public PokemonSpritesOtherShowdown frontDefault(String frontDefault) {
    this.frontDefault = JsonNullable.of(frontDefault);
    return this;
  }

  /**
   * The URL of the default Pokémon Showdown front image, or null if unavailable.
   * @return frontDefault
   */
  /* @Present */ 
  @Schema(name = "front_default", description = "The URL of the default Pokémon Showdown front image, or null if unavailable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("front_default")
  public JsonNullable<String> getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(JsonNullable<String> frontDefault) {
    this.frontDefault = frontDefault;
  }

  public PokemonSpritesOtherShowdown frontFemale(String frontFemale) {
    this.frontFemale = JsonNullable.of(frontFemale);
    return this;
  }

  /**
   * The URL of the female Pokémon Showdown front image, or null if unavailable.
   * @return frontFemale
   */
  /* @Present */ 
  @Schema(name = "front_female", description = "The URL of the female Pokémon Showdown front image, or null if unavailable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("front_female")
  public JsonNullable<String> getFrontFemale() {
    return frontFemale;
  }

  public void setFrontFemale(JsonNullable<String> frontFemale) {
    this.frontFemale = frontFemale;
  }

  public PokemonSpritesOtherShowdown frontShiny(String frontShiny) {
    this.frontShiny = JsonNullable.of(frontShiny);
    return this;
  }

  /**
   * The URL of the shiny Pokémon Showdown front image, or null if unavailable.
   * @return frontShiny
   */
  /* @Present */ 
  @Schema(name = "front_shiny", description = "The URL of the shiny Pokémon Showdown front image, or null if unavailable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("front_shiny")
  public JsonNullable<String> getFrontShiny() {
    return frontShiny;
  }

  public void setFrontShiny(JsonNullable<String> frontShiny) {
    this.frontShiny = frontShiny;
  }

  public PokemonSpritesOtherShowdown frontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = JsonNullable.of(frontShinyFemale);
    return this;
  }

  /**
   * The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
   * @return frontShinyFemale
   */
  /* @Present */ 
  @Schema(name = "front_shiny_female", description = "The URL of the shiny female Pokémon Showdown front image, or null if unavailable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("front_shiny_female")
  public JsonNullable<String> getFrontShinyFemale() {
    return frontShinyFemale;
  }

  public void setFrontShinyFemale(JsonNullable<String> frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }

  public PokemonSpritesOtherShowdown backDefault(String backDefault) {
    this.backDefault = JsonNullable.of(backDefault);
    return this;
  }

  /**
   * The URL of the default Pokémon Showdown back image, or null if unavailable.
   * @return backDefault
   */
  /* @Present */ 
  @Schema(name = "back_default", description = "The URL of the default Pokémon Showdown back image, or null if unavailable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("back_default")
  public JsonNullable<String> getBackDefault() {
    return backDefault;
  }

  public void setBackDefault(JsonNullable<String> backDefault) {
    this.backDefault = backDefault;
  }

  public PokemonSpritesOtherShowdown backFemale(String backFemale) {
    this.backFemale = JsonNullable.of(backFemale);
    return this;
  }

  /**
   * The URL of the female Pokémon Showdown back image, or null if unavailable.
   * @return backFemale
   */
  /* @Present */ 
  @Schema(name = "back_female", description = "The URL of the female Pokémon Showdown back image, or null if unavailable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("back_female")
  public JsonNullable<String> getBackFemale() {
    return backFemale;
  }

  public void setBackFemale(JsonNullable<String> backFemale) {
    this.backFemale = backFemale;
  }

  public PokemonSpritesOtherShowdown backShiny(String backShiny) {
    this.backShiny = JsonNullable.of(backShiny);
    return this;
  }

  /**
   * The URL of the shiny Pokémon Showdown back image, or null if unavailable.
   * @return backShiny
   */
  /* @Present */ 
  @Schema(name = "back_shiny", description = "The URL of the shiny Pokémon Showdown back image, or null if unavailable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("back_shiny")
  public JsonNullable<String> getBackShiny() {
    return backShiny;
  }

  public void setBackShiny(JsonNullable<String> backShiny) {
    this.backShiny = backShiny;
  }

  public PokemonSpritesOtherShowdown backShinyFemale(String backShinyFemale) {
    this.backShinyFemale = JsonNullable.of(backShinyFemale);
    return this;
  }

  /**
   * The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
   * @return backShinyFemale
   */
  /* @Present */ 
  @Schema(name = "back_shiny_female", description = "The URL of the shiny female Pokémon Showdown back image, or null if unavailable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("back_shiny_female")
  public JsonNullable<String> getBackShinyFemale() {
    return backShinyFemale;
  }

  public void setBackShinyFemale(JsonNullable<String> backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpritesOtherShowdown pokemonSpritesOtherShowdown = (PokemonSpritesOtherShowdown) o;
    return Objects.equals(this.frontDefault, pokemonSpritesOtherShowdown.frontDefault) &&
        Objects.equals(this.frontFemale, pokemonSpritesOtherShowdown.frontFemale) &&
        Objects.equals(this.frontShiny, pokemonSpritesOtherShowdown.frontShiny) &&
        Objects.equals(this.frontShinyFemale, pokemonSpritesOtherShowdown.frontShinyFemale) &&
        Objects.equals(this.backDefault, pokemonSpritesOtherShowdown.backDefault) &&
        Objects.equals(this.backFemale, pokemonSpritesOtherShowdown.backFemale) &&
        Objects.equals(this.backShiny, pokemonSpritesOtherShowdown.backShiny) &&
        Objects.equals(this.backShinyFemale, pokemonSpritesOtherShowdown.backShinyFemale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontFemale, frontShiny, frontShinyFemale, backDefault, backFemale, backShiny, backShinyFemale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpritesOtherShowdown {\n");
    sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
    sb.append("    frontFemale: ").append(toIndentedString(frontFemale)).append("\n");
    sb.append("    frontShiny: ").append(toIndentedString(frontShiny)).append("\n");
    sb.append("    frontShinyFemale: ").append(toIndentedString(frontShinyFemale)).append("\n");
    sb.append("    backDefault: ").append(toIndentedString(backDefault)).append("\n");
    sb.append("    backFemale: ").append(toIndentedString(backFemale)).append("\n");
    sb.append("    backShiny: ").append(toIndentedString(backShiny)).append("\n");
    sb.append("    backShinyFemale: ").append(toIndentedString(backShinyFemale)).append("\n");
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

