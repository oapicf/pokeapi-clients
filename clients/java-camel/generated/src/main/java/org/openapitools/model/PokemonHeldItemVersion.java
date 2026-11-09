package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.VersionSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonHeldItemVersion
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonHeldItemVersion {

  private Integer rarity;

  private VersionSummary version;

  public PokemonHeldItemVersion() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonHeldItemVersion(Integer rarity, VersionSummary version) {
    this.rarity = rarity;
    this.version = version;
  }

  public PokemonHeldItemVersion rarity(Integer rarity) {
    this.rarity = rarity;
    return this;
  }

  /**
   * How often the item is held.
   * @return rarity
   */
  @NotNull 
  @Schema(name = "rarity", description = "How often the item is held.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rarity")
  public Integer getRarity() {
    return rarity;
  }

  public void setRarity(Integer rarity) {
    this.rarity = rarity;
  }

  public PokemonHeldItemVersion version(VersionSummary version) {
    this.version = version;
    return this;
  }

  /**
   * The version in which the item is held.
   * @return version
   */
  @NotNull @Valid 
  @Schema(name = "version", description = "The version in which the item is held.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public VersionSummary getVersion() {
    return version;
  }

  public void setVersion(VersionSummary version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonHeldItemVersion pokemonHeldItemVersion = (PokemonHeldItemVersion) o;
    return Objects.equals(this.rarity, pokemonHeldItemVersion.rarity) &&
        Objects.equals(this.version, pokemonHeldItemVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rarity, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonHeldItemVersion {\n");
    sb.append("    rarity: ").append(toIndentedString(rarity)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

