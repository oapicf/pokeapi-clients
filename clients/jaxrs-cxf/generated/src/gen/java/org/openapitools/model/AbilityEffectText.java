package org.openapitools.model;

import org.openapitools.model.LanguageSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AbilityEffectText  {
  
 /**
  * The localized effect text for an API resource in a specific language.
  */
  @ApiModelProperty(required = true, value = "The localized effect text for an API resource in a specific language.")

  private String effect;

 /**
  * The localized effect text in brief.
  */
  @ApiModelProperty(required = true, value = "The localized effect text in brief.")

  private String shortEffect;

 /**
  * The language this effect is in.
  */
  @ApiModelProperty(required = true, value = "The language this effect is in.")

  @Valid

  private LanguageSummary language;
 /**
   * The localized effect text for an API resource in a specific language.
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

  public AbilityEffectText effect(String effect) {
    this.effect = effect;
    return this;
  }

 /**
   * The localized effect text in brief.
   * @return shortEffect
  **/
  @JsonProperty("short_effect")
  @NotNull
 @Size(max=300)  public String getShortEffect() {
    return shortEffect;
  }

  public void setShortEffect(String shortEffect) {
    this.shortEffect = shortEffect;
  }

  public AbilityEffectText shortEffect(String shortEffect) {
    this.shortEffect = shortEffect;
    return this;
  }

 /**
   * The language this effect is in.
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

  public AbilityEffectText language(LanguageSummary language) {
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
    AbilityEffectText abilityEffectText = (AbilityEffectText) o;
    return Objects.equals(this.effect, abilityEffectText.effect) &&
        Objects.equals(this.shortEffect, abilityEffectText.shortEffect) &&
        Objects.equals(this.language, abilityEffectText.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, shortEffect, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbilityEffectText {\n");
    
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

