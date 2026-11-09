package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;

/**
 * AbilityChangeEffectText
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class AbilityChangeEffectText   {
  @JsonProperty("effect")
  private String effect;

  @JsonProperty("language")
  private LanguageSummary language;

  public AbilityChangeEffectText effect(String effect) {
    this.effect = effect;
    return this;
  }

   /**
   * The localized effect text for an API resource in a specific language.
   * @return effect
  **/
  @ApiModelProperty(required = true, value = "The localized effect text for an API resource in a specific language.")
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public AbilityChangeEffectText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

   /**
   * The language this effect is in.
   * @return language
  **/
  @ApiModelProperty(required = true, value = "The language this effect is in.")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

