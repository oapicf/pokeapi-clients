package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PokemonDetailCries
 */

@JsonTypeName("PokemonDetail_cries")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T15:29:13.146999890Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetailCries {

  private URI latest;

  private URI legacy;

  public PokemonDetailCries() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonDetailCries(URI latest, URI legacy) {
    this.latest = latest;
    this.legacy = legacy;
  }

  public PokemonDetailCries latest(URI latest) {
    this.latest = latest;
    return this;
  }

  /**
   * Get latest
   * @return latest
   */
  @NotNull @Valid 
  @Schema(name = "latest", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("latest")
  public URI getLatest() {
    return latest;
  }

  public void setLatest(URI latest) {
    this.latest = latest;
  }

  public PokemonDetailCries legacy(URI legacy) {
    this.legacy = legacy;
    return this;
  }

  /**
   * Get legacy
   * @return legacy
   */
  @NotNull @Valid 
  @Schema(name = "legacy", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("legacy")
  public URI getLegacy() {
    return legacy;
  }

  public void setLegacy(URI legacy) {
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
    PokemonDetailCries pokemonDetailCries = (PokemonDetailCries) o;
    return Objects.equals(this.latest, pokemonDetailCries.latest) &&
        Objects.equals(this.legacy, pokemonDetailCries.legacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latest, legacy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDetailCries {\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

