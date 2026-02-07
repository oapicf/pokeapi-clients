package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T15:22:50.575598517Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class SuperContestEffectFlavorText   {
  @JsonProperty("flavor_text")
  private String flavorText;

  @JsonProperty("language")
  private LanguageSummary language;

  /**
   **/
  public SuperContestEffectFlavorText flavorText(String flavorText) {
    this.flavorText = flavorText;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("flavor_text")
  public String getFlavorText() {
    return flavorText;
  }
  public void setFlavorText(String flavorText) {
    this.flavorText = flavorText;
  }

  /**
   **/
  public SuperContestEffectFlavorText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

