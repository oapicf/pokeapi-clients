package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.PokemonSpritesOther;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonSprites
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSprites {

  private JsonNullable<String> frontDefault = JsonNullable.<String>undefined();

  private JsonNullable<String> frontShiny = JsonNullable.<String>undefined();

  private JsonNullable<String> frontFemale = JsonNullable.<String>undefined();

  private JsonNullable<String> frontShinyFemale = JsonNullable.<String>undefined();

  private JsonNullable<String> backDefault = JsonNullable.<String>undefined();

  private JsonNullable<String> backShiny = JsonNullable.<String>undefined();

  private JsonNullable<String> backFemale = JsonNullable.<String>undefined();

  private JsonNullable<String> backShinyFemale = JsonNullable.<String>undefined();

  private @Nullable PokemonSpritesOther other;

  private Map<String, Map<String, Object>> versions = new HashMap<>();

  public PokemonSprites() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonSprites(String frontDefault, String frontShiny, String frontFemale, String frontShinyFemale, String backDefault, String backShiny, String backFemale, String backShinyFemale) {
    this.frontDefault = JsonNullable.of(frontDefault);
    this.frontShiny = JsonNullable.of(frontShiny);
    this.frontFemale = JsonNullable.of(frontFemale);
    this.frontShinyFemale = JsonNullable.of(frontShinyFemale);
    this.backDefault = JsonNullable.of(backDefault);
    this.backShiny = JsonNullable.of(backShiny);
    this.backFemale = JsonNullable.of(backFemale);
    this.backShinyFemale = JsonNullable.of(backShinyFemale);
  }

  public PokemonSprites frontDefault(String frontDefault) {
    this.frontDefault = JsonNullable.of(frontDefault);
    return this;
  }

  /**
   * The default depiction of this Pokémon from the front in battle.
   * @return frontDefault
   */
  /* @Present */ 
  @Schema(name = "front_default", description = "The default depiction of this Pokémon from the front in battle.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("front_default")
  public JsonNullable<String> getFrontDefault() {
    return frontDefault;
  }

  @JsonProperty("front_default")
  public void setFrontDefault(JsonNullable<String> frontDefault) {
    this.frontDefault = frontDefault;
  }

  public PokemonSprites frontShiny(String frontShiny) {
    this.frontShiny = JsonNullable.of(frontShiny);
    return this;
  }

  /**
   * The shiny depiction of this Pokémon from the front in battle.
   * @return frontShiny
   */
  /* @Present */ 
  @Schema(name = "front_shiny", description = "The shiny depiction of this Pokémon from the front in battle.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("front_shiny")
  public JsonNullable<String> getFrontShiny() {
    return frontShiny;
  }

  @JsonProperty("front_shiny")
  public void setFrontShiny(JsonNullable<String> frontShiny) {
    this.frontShiny = frontShiny;
  }

  public PokemonSprites frontFemale(String frontFemale) {
    this.frontFemale = JsonNullable.of(frontFemale);
    return this;
  }

  /**
   * The female depiction of this Pokémon from the front in battle.
   * @return frontFemale
   */
  /* @Present */ 
  @Schema(name = "front_female", description = "The female depiction of this Pokémon from the front in battle.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("front_female")
  public JsonNullable<String> getFrontFemale() {
    return frontFemale;
  }

  @JsonProperty("front_female")
  public void setFrontFemale(JsonNullable<String> frontFemale) {
    this.frontFemale = frontFemale;
  }

  public PokemonSprites frontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = JsonNullable.of(frontShinyFemale);
    return this;
  }

  /**
   * The shiny female depiction of this Pokémon from the front in battle.
   * @return frontShinyFemale
   */
  /* @Present */ 
  @Schema(name = "front_shiny_female", description = "The shiny female depiction of this Pokémon from the front in battle.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("front_shiny_female")
  public JsonNullable<String> getFrontShinyFemale() {
    return frontShinyFemale;
  }

  @JsonProperty("front_shiny_female")
  public void setFrontShinyFemale(JsonNullable<String> frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }

  public PokemonSprites backDefault(String backDefault) {
    this.backDefault = JsonNullable.of(backDefault);
    return this;
  }

  /**
   * The default depiction of this Pokémon from the back in battle.
   * @return backDefault
   */
  /* @Present */ 
  @Schema(name = "back_default", description = "The default depiction of this Pokémon from the back in battle.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("back_default")
  public JsonNullable<String> getBackDefault() {
    return backDefault;
  }

  @JsonProperty("back_default")
  public void setBackDefault(JsonNullable<String> backDefault) {
    this.backDefault = backDefault;
  }

  public PokemonSprites backShiny(String backShiny) {
    this.backShiny = JsonNullable.of(backShiny);
    return this;
  }

  /**
   * The shiny depiction of this Pokémon from the back in battle.
   * @return backShiny
   */
  /* @Present */ 
  @Schema(name = "back_shiny", description = "The shiny depiction of this Pokémon from the back in battle.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("back_shiny")
  public JsonNullable<String> getBackShiny() {
    return backShiny;
  }

  @JsonProperty("back_shiny")
  public void setBackShiny(JsonNullable<String> backShiny) {
    this.backShiny = backShiny;
  }

  public PokemonSprites backFemale(String backFemale) {
    this.backFemale = JsonNullable.of(backFemale);
    return this;
  }

  /**
   * The female depiction of this Pokémon from the back in battle.
   * @return backFemale
   */
  /* @Present */ 
  @Schema(name = "back_female", description = "The female depiction of this Pokémon from the back in battle.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("back_female")
  public JsonNullable<String> getBackFemale() {
    return backFemale;
  }

  @JsonProperty("back_female")
  public void setBackFemale(JsonNullable<String> backFemale) {
    this.backFemale = backFemale;
  }

  public PokemonSprites backShinyFemale(String backShinyFemale) {
    this.backShinyFemale = JsonNullable.of(backShinyFemale);
    return this;
  }

  /**
   * The shiny female depiction of this Pokémon from the back in battle.
   * @return backShinyFemale
   */
  /* @Present */ 
  @Schema(name = "back_shiny_female", description = "The shiny female depiction of this Pokémon from the back in battle.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("back_shiny_female")
  public JsonNullable<String> getBackShinyFemale() {
    return backShinyFemale;
  }

  @JsonProperty("back_shiny_female")
  public void setBackShinyFemale(JsonNullable<String> backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
  }

  public PokemonSprites other(@Nullable PokemonSpritesOther other) {
    this.other = other;
    return this;
  }

  /**
   * Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
   * @return other
   */
  @Valid 
  @Schema(name = "other", description = "Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("other")
  public @Nullable PokemonSpritesOther getOther() {
    return other;
  }

  @JsonProperty("other")
  public void setOther(@Nullable PokemonSpritesOther other) {
    this.other = other;
  }

  public PokemonSprites versions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
    return this;
  }

  public PokemonSprites putVersionsItem(String key, Map<String, Object> versionsItem) {
    if (this.versions == null) {
      this.versions = new HashMap<>();
    }
    this.versions.put(key, versionsItem);
    return this;
  }

  /**
   * Sprites grouped by generation and game. Available keys vary by resource.
   * @return versions
   */
  
  @Schema(name = "versions", description = "Sprites grouped by generation and game. Available keys vary by resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versions")
  public Map<String, Map<String, Object>> getVersions() {
    return versions;
  }

  @JsonProperty("versions")
  public void setVersions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSprites pokemonSprites = (PokemonSprites) o;
    return Objects.equals(this.frontDefault, pokemonSprites.frontDefault) &&
        Objects.equals(this.frontShiny, pokemonSprites.frontShiny) &&
        Objects.equals(this.frontFemale, pokemonSprites.frontFemale) &&
        Objects.equals(this.frontShinyFemale, pokemonSprites.frontShinyFemale) &&
        Objects.equals(this.backDefault, pokemonSprites.backDefault) &&
        Objects.equals(this.backShiny, pokemonSprites.backShiny) &&
        Objects.equals(this.backFemale, pokemonSprites.backFemale) &&
        Objects.equals(this.backShinyFemale, pokemonSprites.backShinyFemale) &&
        Objects.equals(this.other, pokemonSprites.other) &&
        Objects.equals(this.versions, pokemonSprites.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontShiny, frontFemale, frontShinyFemale, backDefault, backShiny, backFemale, backShinyFemale, other, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSprites {\n");
    sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
    sb.append("    frontShiny: ").append(toIndentedString(frontShiny)).append("\n");
    sb.append("    frontFemale: ").append(toIndentedString(frontFemale)).append("\n");
    sb.append("    frontShinyFemale: ").append(toIndentedString(frontShinyFemale)).append("\n");
    sb.append("    backDefault: ").append(toIndentedString(backDefault)).append("\n");
    sb.append("    backShiny: ").append(toIndentedString(backShiny)).append("\n");
    sb.append("    backFemale: ").append(toIndentedString(backFemale)).append("\n");
    sb.append("    backShinyFemale: ").append(toIndentedString(backShinyFemale)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

