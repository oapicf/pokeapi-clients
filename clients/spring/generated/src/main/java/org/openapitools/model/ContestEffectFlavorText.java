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
 * ContestEffectFlavorText
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T15:29:13.146999890Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ContestEffectFlavorText {

  private String flavorText;

  private LanguageSummary language;

  public ContestEffectFlavorText() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContestEffectFlavorText(String flavorText, LanguageSummary language) {
    this.flavorText = flavorText;
    this.language = language;
  }

  public ContestEffectFlavorText flavorText(String flavorText) {
    this.flavorText = flavorText;
    return this;
  }

  /**
   * Get flavorText
   * @return flavorText
   */
  @NotNull @Size(max = 500) 
  @Schema(name = "flavor_text", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("flavor_text")
  public String getFlavorText() {
    return flavorText;
  }

  public void setFlavorText(String flavorText) {
    this.flavorText = flavorText;
  }

  public ContestEffectFlavorText language(LanguageSummary language) {
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
    ContestEffectFlavorText contestEffectFlavorText = (ContestEffectFlavorText) o;
    return Objects.equals(this.flavorText, contestEffectFlavorText.flavorText) &&
        Objects.equals(this.language, contestEffectFlavorText.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flavorText, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestEffectFlavorText {\n");
    sb.append("    flavorText: ").append(toIndentedString(flavorText)).append("\n");
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

