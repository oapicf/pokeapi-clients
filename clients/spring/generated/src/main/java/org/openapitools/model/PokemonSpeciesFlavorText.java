package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.LanguageSummary;
import org.openapitools.model.VersionSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PokemonSpeciesFlavorText
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonSpeciesFlavorText {

  private String flavorText;

  private LanguageSummary language;

  private VersionSummary version;

  public PokemonSpeciesFlavorText() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonSpeciesFlavorText(String flavorText, LanguageSummary language, VersionSummary version) {
    this.flavorText = flavorText;
    this.language = language;
    this.version = version;
  }

  public PokemonSpeciesFlavorText flavorText(String flavorText) {
    this.flavorText = flavorText;
    return this;
  }

  /**
   * Get flavorText
   * @return flavorText
   */
  @NotNull 
  @Schema(name = "flavor_text", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("flavor_text")
  public String getFlavorText() {
    return flavorText;
  }

  public void setFlavorText(String flavorText) {
    this.flavorText = flavorText;
  }

  public PokemonSpeciesFlavorText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   */
  @NotNull @Valid 
  @Schema(name = "language", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("language")
  public LanguageSummary getLanguage() {
    return language;
  }

  public void setLanguage(LanguageSummary language) {
    this.language = language;
  }

  public PokemonSpeciesFlavorText version(VersionSummary version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @NotNull @Valid 
  @Schema(name = "version", requiredMode = Schema.RequiredMode.REQUIRED)
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
    PokemonSpeciesFlavorText pokemonSpeciesFlavorText = (PokemonSpeciesFlavorText) o;
    return Objects.equals(this.flavorText, pokemonSpeciesFlavorText.flavorText) &&
        Objects.equals(this.language, pokemonSpeciesFlavorText.language) &&
        Objects.equals(this.version, pokemonSpeciesFlavorText.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flavorText, language, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesFlavorText {\n");
    sb.append("    flavorText: ").append(toIndentedString(flavorText)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

