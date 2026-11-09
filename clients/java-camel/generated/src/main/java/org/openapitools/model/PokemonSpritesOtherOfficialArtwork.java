package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonSpritesOtherOfficialArtwork
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpritesOtherOfficialArtwork {

  private JsonNullable<String> frontDefault = JsonNullable.<String>undefined();

  private JsonNullable<String> frontShiny = JsonNullable.<String>undefined();

  private Map<String, Map<String, Object>> versions = new HashMap<>();

  public PokemonSpritesOtherOfficialArtwork() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonSpritesOtherOfficialArtwork(String frontDefault, String frontShiny) {
    this.frontDefault = JsonNullable.of(frontDefault);
    this.frontShiny = JsonNullable.of(frontShiny);
  }

  public PokemonSpritesOtherOfficialArtwork frontDefault(String frontDefault) {
    this.frontDefault = JsonNullable.of(frontDefault);
    return this;
  }

  /**
   * The URL of the default front official artwork, or null if unavailable.
   * @return frontDefault
   */
  /* @Present */ 
  @Schema(name = "front_default", description = "The URL of the default front official artwork, or null if unavailable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("front_default")
  public JsonNullable<String> getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(JsonNullable<String> frontDefault) {
    this.frontDefault = frontDefault;
  }

  public PokemonSpritesOtherOfficialArtwork frontShiny(String frontShiny) {
    this.frontShiny = JsonNullable.of(frontShiny);
    return this;
  }

  /**
   * The URL of the shiny front official artwork, or null if unavailable.
   * @return frontShiny
   */
  /* @Present */ 
  @Schema(name = "front_shiny", description = "The URL of the shiny front official artwork, or null if unavailable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("front_shiny")
  public JsonNullable<String> getFrontShiny() {
    return frontShiny;
  }

  public void setFrontShiny(JsonNullable<String> frontShiny) {
    this.frontShiny = frontShiny;
  }

  public PokemonSpritesOtherOfficialArtwork versions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
    return this;
  }

  public PokemonSpritesOtherOfficialArtwork putVersionsItem(String key, Map<String, Object> versionsItem) {
    if (this.versions == null) {
      this.versions = new HashMap<>();
    }
    this.versions.put(key, versionsItem);
    return this;
  }

  /**
   * Additional official artwork grouped by version. Available keys vary by resource.
   * @return versions
   */
  
  @Schema(name = "versions", description = "Additional official artwork grouped by version. Available keys vary by resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versions")
  public Map<String, Map<String, Object>> getVersions() {
    return versions;
  }

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
    PokemonSpritesOtherOfficialArtwork pokemonSpritesOtherOfficialArtwork = (PokemonSpritesOtherOfficialArtwork) o;
    return Objects.equals(this.frontDefault, pokemonSpritesOtherOfficialArtwork.frontDefault) &&
        Objects.equals(this.frontShiny, pokemonSpritesOtherOfficialArtwork.frontShiny) &&
        Objects.equals(this.versions, pokemonSpritesOtherOfficialArtwork.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontShiny, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpritesOtherOfficialArtwork {\n");
    sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
    sb.append("    frontShiny: ").append(toIndentedString(frontShiny)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

