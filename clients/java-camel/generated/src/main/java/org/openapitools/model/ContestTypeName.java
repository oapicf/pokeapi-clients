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
 * ContestTypeName
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class ContestTypeName {

  private String name;

  private String color;

  private LanguageSummary language;

  public ContestTypeName() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContestTypeName(String name, String color, LanguageSummary language) {
    this.name = name;
    this.color = color;
    this.language = language;
  }

  public ContestTypeName name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for this contest.
   * @return name
   */
  @NotNull @Size(max = 200) 
  @Schema(name = "name", description = "The name for this contest.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContestTypeName color(String color) {
    this.color = color;
    return this;
  }

  /**
   * The color associated with this contest's name.
   * @return color
   */
  @NotNull @Size(max = 10) 
  @Schema(name = "color", description = "The color associated with this contest's name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public ContestTypeName language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  /**
   * The language that this name is in.
   * @return language
   */
  @NotNull @Valid 
  @Schema(name = "language", description = "The language that this name is in.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ContestTypeName contestTypeName = (ContestTypeName) o;
    return Objects.equals(this.name, contestTypeName.name) &&
        Objects.equals(this.color, contestTypeName.color) &&
        Objects.equals(this.language, contestTypeName.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, color, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestTypeName {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

