package apimodels;

import apimodels.LanguageSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AbilityEffectText
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AbilityEffectText   {
  @JsonProperty("effect")
  @NotNull
@Size(max=6000)

  private String effect;

  @JsonProperty("short_effect")
  @NotNull
@Size(max=300)

  private String shortEffect;

  @JsonProperty("language")
  @NotNull
@Valid

  private LanguageSummary language;

  public AbilityEffectText effect(String effect) {
    this.effect = effect;
    return this;
  }

   /**
   * Get effect
   * @return effect
  **/
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public AbilityEffectText shortEffect(String shortEffect) {
    this.shortEffect = shortEffect;
    return this;
  }

   /**
   * Get shortEffect
   * @return shortEffect
  **/
  public String getShortEffect() {
    return shortEffect;
  }

  public void setShortEffect(String shortEffect) {
    this.shortEffect = shortEffect;
  }

  public AbilityEffectText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
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
    AbilityEffectText abilityEffectText = (AbilityEffectText) o;
    return Objects.equals(effect, abilityEffectText.effect) &&
        Objects.equals(shortEffect, abilityEffectText.shortEffect) &&
        Objects.equals(language, abilityEffectText.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, shortEffect, language);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

