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
 * AbilityChangeEffectText
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T02:00:43.960184425Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AbilityChangeEffectText {

  private String effect;

  private LanguageSummary language;

  public AbilityChangeEffectText() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AbilityChangeEffectText(String effect, LanguageSummary language) {
    this.effect = effect;
    this.language = language;
  }

  public AbilityChangeEffectText effect(String effect) {
    this.effect = effect;
    return this;
  }

  /**
   * Get effect
   * @return effect
   */
  @NotNull @Size(max = 6000) 
  @Schema(name = "effect", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effect")
  public String getEffect() {
    return effect;
  }

  @JsonProperty("effect")
  public void setEffect(String effect) {
    this.effect = effect;
  }

  public AbilityChangeEffectText language(LanguageSummary language) {
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
    AbilityChangeEffectText abilityChangeEffectText = (AbilityChangeEffectText) o;
    return Objects.equals(this.effect, abilityChangeEffectText.effect) &&
        Objects.equals(this.language, abilityChangeEffectText.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbilityChangeEffectText {\n");
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

