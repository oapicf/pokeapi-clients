package org.openapitools.model;

import org.openapitools.model.LanguageSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ContestEffectEffectText  {
  
 /**
  * The localized effect text for an API resource in a specific language.
  */
  @ApiModelProperty(required = true, value = "The localized effect text for an API resource in a specific language.")

  private String effect;

 /**
  * The language this effect is in.
  */
  @ApiModelProperty(required = true, value = "The language this effect is in.")

  private LanguageSummary language;
 /**
   * The localized effect text for an API resource in a specific language.
   * @return effect
  **/
  @JsonProperty("effect")
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public ContestEffectEffectText effect(String effect) {
    this.effect = effect;
    return this;
  }

 /**
   * The language this effect is in.
   * @return language
  **/
  @JsonProperty("language")
  public LanguageSummary getLanguage() {
    return language;
  }

  public void setLanguage(LanguageSummary language) {
    this.language = language;
  }

  public ContestEffectEffectText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestEffectEffectText contestEffectEffectText = (ContestEffectEffectText) o;
    return Objects.equals(this.effect, contestEffectEffectText.effect) &&
        Objects.equals(this.language, contestEffectEffectText.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestEffectEffectText {\n");
    
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

