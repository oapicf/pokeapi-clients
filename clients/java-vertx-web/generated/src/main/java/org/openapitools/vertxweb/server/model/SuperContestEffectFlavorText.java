package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.LanguageSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SuperContestEffectFlavorText   {
  
  private String flavorText;
  private LanguageSummary language;

  public SuperContestEffectFlavorText () {

  }

  public SuperContestEffectFlavorText (String flavorText, LanguageSummary language) {
    this.flavorText = flavorText;
    this.language = language;
  }

    
  @JsonProperty("flavor_text")
  public String getFlavorText() {
    return flavorText;
  }
  public void setFlavorText(String flavorText) {
    this.flavorText = flavorText;
  }

    
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
    SuperContestEffectFlavorText superContestEffectFlavorText = (SuperContestEffectFlavorText) o;
    return Objects.equals(flavorText, superContestEffectFlavorText.flavorText) &&
        Objects.equals(language, superContestEffectFlavorText.language);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
