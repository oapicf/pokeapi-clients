package org.openapitools.model;

import org.openapitools.model.LanguageSummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class MoveEffectEffectText implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The localized effect text for an API resource in a specific language.
   */
  @JsonProperty("effect")
  private String effect;

  /**
   * The localized effect text in brief.
   */
  @JsonProperty("short_effect")
  private String shortEffect;

  /**
   * The language this effect is in.
   */
  @JsonProperty("language")
  private LanguageSummary language;

  /**
   * The localized effect text for an API resource in a specific language.
   * @return effect
   */
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  /**
   * The localized effect text in brief.
   * @return shortEffect
   */
  public String getShortEffect() {
    return shortEffect;
  }

  public void setShortEffect(String shortEffect) {
    this.shortEffect = shortEffect;
  }

  /**
   * The language this effect is in.
   * @return language
   */
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
    MoveEffectEffectText moveEffectEffectText = (MoveEffectEffectText) o;
    return Objects.equals(this.effect, moveEffectEffectText.effect) &&
        Objects.equals(this.shortEffect, moveEffectEffectText.shortEffect) &&
        Objects.equals(this.language, moveEffectEffectText.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, shortEffect, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveEffectEffectText {\n");
    
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    shortEffect: ").append(toIndentedString(shortEffect)).append("\n");
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
