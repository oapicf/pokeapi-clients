package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.LanguageSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonShapeAwesomeName
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonShapeAwesomeName {

  private String awesomeName;

  private LanguageSummary language;

  public PokemonShapeAwesomeName() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonShapeAwesomeName(String awesomeName, LanguageSummary language) {
    this.awesomeName = awesomeName;
    this.language = language;
  }

  public PokemonShapeAwesomeName awesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
    return this;
  }

  /**
   * The localized \"scientific\" name for an API resource in a specific language.
   * @return awesomeName
   */
  @NotNull @Size(max = 30) 
  @Schema(name = "awesome_name", description = "The localized \"scientific\" name for an API resource in a specific language.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("awesome_name")
  public String getAwesomeName() {
    return awesomeName;
  }

  public void setAwesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
  }

  public PokemonShapeAwesomeName language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  /**
   * The language this \"scientific\" name is in.
   * @return language
   */
  @NotNull @Valid 
  @Schema(name = "language", description = "The language this \"scientific\" name is in.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("language")
  public LanguageSummary getLanguage() {
    return language;
  }

  public void setLanguage(LanguageSummary language) {
    this.language = language;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonShapeAwesomeName pokemonShapeAwesomeName = (PokemonShapeAwesomeName) o;
    return Objects.equals(this.awesomeName, pokemonShapeAwesomeName.awesomeName) &&
        Objects.equals(this.language, pokemonShapeAwesomeName.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awesomeName, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonShapeAwesomeName {\n");
    sb.append("    awesomeName: ").append(toIndentedString(awesomeName)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

