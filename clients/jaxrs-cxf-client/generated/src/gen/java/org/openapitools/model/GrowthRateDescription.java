package org.openapitools.model;

import org.openapitools.model.LanguageSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GrowthRateDescription  {
  
 /**
  * The localized description for an API resource in a specific language.
  */
  @ApiModelProperty(value = "The localized description for an API resource in a specific language.")

  private String description;

 /**
  * The language this name is in.
  */
  @ApiModelProperty(required = true, value = "The language this name is in.")

  private LanguageSummary language;
 /**
   * The localized description for an API resource in a specific language.
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GrowthRateDescription description(String description) {
    this.description = description;
    return this;
  }

 /**
   * The language this name is in.
   * @return language
  **/
  @JsonProperty("language")
  public LanguageSummary getLanguage() {
    return language;
  }

  public void setLanguage(LanguageSummary language) {
    this.language = language;
  }

  public GrowthRateDescription language(LanguageSummary language) {
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
    GrowthRateDescription growthRateDescription = (GrowthRateDescription) o;
    return Objects.equals(this.description, growthRateDescription.description) &&
        Objects.equals(this.language, growthRateDescription.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrowthRateDescription {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

