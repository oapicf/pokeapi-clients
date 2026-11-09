package org.openapitools.model;

import org.openapitools.model.LanguageSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SuperContestEffectFlavorText  {
  
 /**
  * The localized flavor text for an API resource in a specific language.
  */
  @ApiModelProperty(required = true, value = "The localized flavor text for an API resource in a specific language.")

  private String flavorText;

 /**
  * The language this name is in.
  */
  @ApiModelProperty(required = true, value = "The language this name is in.")

  @Valid

  private LanguageSummary language;
 /**
   * The localized flavor text for an API resource in a specific language.
   * @return flavorText
  **/
  @JsonProperty("flavor_text")
  @NotNull
 @Size(max=500)  public String getFlavorText() {
    return flavorText;
  }

  public void setFlavorText(String flavorText) {
    this.flavorText = flavorText;
  }

  public SuperContestEffectFlavorText flavorText(String flavorText) {
    this.flavorText = flavorText;
    return this;
  }

 /**
   * The language this name is in.
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

  public SuperContestEffectFlavorText language(LanguageSummary language) {
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
    SuperContestEffectFlavorText superContestEffectFlavorText = (SuperContestEffectFlavorText) o;
    return Objects.equals(this.flavorText, superContestEffectFlavorText.flavorText) &&
        Objects.equals(this.language, superContestEffectFlavorText.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flavorText, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperContestEffectFlavorText {\n");
    
    sb.append("    flavorText: ").append(toIndentedString(flavorText)).append("\n");
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

