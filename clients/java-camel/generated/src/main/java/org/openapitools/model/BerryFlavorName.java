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
 * BerryFlavorName
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class BerryFlavorName {

  private String name;

  private LanguageSummary language;

  public BerryFlavorName() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BerryFlavorName(String name, LanguageSummary language) {
    this.name = name;
    this.language = language;
  }

  public BerryFlavorName name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The localized name for an API resource in a specific language.
   * @return name
   */
  @NotNull @Size(max = 200) 
  @Schema(name = "name", description = "The localized name for an API resource in a specific language.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BerryFlavorName language(LanguageSummary language) {
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
    BerryFlavorName berryFlavorName = (BerryFlavorName) o;
    return Objects.equals(this.name, berryFlavorName.name) &&
        Objects.equals(this.language, berryFlavorName.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFlavorName {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

