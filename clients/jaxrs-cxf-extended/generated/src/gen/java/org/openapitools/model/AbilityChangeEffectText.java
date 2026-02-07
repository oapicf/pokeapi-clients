package org.openapitools.model;

import org.openapitools.model.LanguageSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AbilityChangeEffectText  {
  
  @ApiModelProperty(required = true, value = "")
  private String effect;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private LanguageSummary language;
 /**
  * Get effect
  * @return effect
  */
  @JsonProperty("effect")
  @NotNull
 @Size(max=6000)  public String getEffect() {
    return effect;
  }

  /**
   * Sets the <code>effect</code> property.
   */
 public void setEffect(String effect) {
    this.effect = effect;
  }

  /**
   * Sets the <code>effect</code> property.
   */
  public AbilityChangeEffectText effect(String effect) {
    this.effect = effect;
    return this;
  }

 /**
  * Get language
  * @return language
  */
  @JsonProperty("language")
  @NotNull
  public LanguageSummary getLanguage() {
    return language;
  }

  /**
   * Sets the <code>language</code> property.
   */
 public void setLanguage(LanguageSummary language) {
    this.language = language;
  }

  /**
   * Sets the <code>language</code> property.
   */
  public AbilityChangeEffectText language(LanguageSummary language) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

