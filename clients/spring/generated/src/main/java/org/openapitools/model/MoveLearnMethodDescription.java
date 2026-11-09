package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.LanguageSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MoveLearnMethodDescription
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveLearnMethodDescription {

  private @Nullable String description;

  private LanguageSummary language;

  public MoveLearnMethodDescription() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveLearnMethodDescription(LanguageSummary language) {
    this.language = language;
  }

  public MoveLearnMethodDescription description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * The localized description for an API resource in a specific language.
   * @return description
   */
  @Size(max = 2000) 
  @Schema(name = "description", description = "The localized description for an API resource in a specific language.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public MoveLearnMethodDescription language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  /**
   * The language this name is in.
   * @return language
   */
  @NotNull @Valid 
  @Schema(name = "language", description = "The language this name is in.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("language")
  public LanguageSummary getLanguage() {
    return language;
  }

  @JsonProperty("language")
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
    MoveLearnMethodDescription moveLearnMethodDescription = (MoveLearnMethodDescription) o;
    return Objects.equals(this.description, moveLearnMethodDescription.description) &&
        Objects.equals(this.language, moveLearnMethodDescription.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveLearnMethodDescription {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

