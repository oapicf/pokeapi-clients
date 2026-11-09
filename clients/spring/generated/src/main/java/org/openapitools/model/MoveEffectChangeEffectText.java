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
 * MoveEffectChangeEffectText
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveEffectChangeEffectText {

  private String effect;

  private LanguageSummary language;

  public MoveEffectChangeEffectText() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveEffectChangeEffectText(String effect, LanguageSummary language) {
    this.effect = effect;
    this.language = language;
  }

  public MoveEffectChangeEffectText effect(String effect) {
    this.effect = effect;
    return this;
  }

  /**
   * The localized effect text for an API resource in a specific language.
   * @return effect
   */
  @NotNull @Size(max = 6000) 
  @Schema(name = "effect", description = "The localized effect text for an API resource in a specific language.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effect")
  public String getEffect() {
    return effect;
  }

  @JsonProperty("effect")
  public void setEffect(String effect) {
    this.effect = effect;
  }

  public MoveEffectChangeEffectText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  /**
   * The language this effect is in.
   * @return language
   */
  @NotNull @Valid 
  @Schema(name = "language", description = "The language this effect is in.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    MoveEffectChangeEffectText moveEffectChangeEffectText = (MoveEffectChangeEffectText) o;
    return Objects.equals(this.effect, moveEffectChangeEffectText.effect) &&
        Objects.equals(this.language, moveEffectChangeEffectText.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveEffectChangeEffectText {\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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

