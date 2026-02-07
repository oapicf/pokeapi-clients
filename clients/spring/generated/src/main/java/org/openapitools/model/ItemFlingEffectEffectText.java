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
 * ItemFlingEffectEffectText
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemFlingEffectEffectText {

  private String effect;

  private LanguageSummary language;

  public ItemFlingEffectEffectText() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ItemFlingEffectEffectText(String effect, LanguageSummary language) {
    this.effect = effect;
    this.language = language;
  }

  public ItemFlingEffectEffectText effect(String effect) {
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

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public ItemFlingEffectEffectText language(LanguageSummary language) {
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
    ItemFlingEffectEffectText itemFlingEffectEffectText = (ItemFlingEffectEffectText) o;
    return Objects.equals(this.effect, itemFlingEffectEffectText.effect) &&
        Objects.equals(this.language, itemFlingEffectEffectText.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemFlingEffectEffectText {\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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

