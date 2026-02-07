package org.openapitools.model;

import org.openapitools.model.LanguageSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ContestEffectEffectText  {
  
  @ApiModelProperty(required = true, value = "")

  private String effect;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private LanguageSummary language;
 /**
   * Get effect
   * @return effect
  **/
  @JsonProperty("effect")
  @NotNull
 @Size(max=6000)  public String getEffect() {
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
   * Get language
   * @return language
  **/
  @JsonProperty("language")
  @NotNull
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

