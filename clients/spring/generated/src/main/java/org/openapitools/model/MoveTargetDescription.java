package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.LanguageSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MoveTargetDescription
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveTargetDescription {

  private @Nullable String description;

  private LanguageSummary language;

  public MoveTargetDescription() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveTargetDescription(LanguageSummary language) {
    this.language = language;
  }

  public MoveTargetDescription description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @Size(max = 1000) 
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public MoveTargetDescription language(LanguageSummary language) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveTargetDescription moveTargetDescription = (MoveTargetDescription) o;
    return Objects.equals(this.description, moveTargetDescription.description) &&
        Objects.equals(this.language, moveTargetDescription.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveTargetDescription {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

