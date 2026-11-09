package org.openapitools.model;

import org.openapitools.model.LanguageSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveTargetDescription  {
  
 /**
  * The localized description for an API resource in a specific language.
  */
  @ApiModelProperty(value = "The localized description for an API resource in a specific language.")

  private String description;

 /**
  * The language this name is in.
  */
  @ApiModelProperty(required = true, value = "The language this name is in.")

  @Valid

  private LanguageSummary language;
 /**
   * The localized description for an API resource in a specific language.
   * @return description
  **/
  @JsonProperty("description")
 @Size(max=2000)  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MoveTargetDescription description(String description) {
    this.description = description;
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

  public MoveTargetDescription language(LanguageSummary language) {
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
    MoveTargetDescription moveTargetDescription = (MoveTargetDescription) o;
    return Objects.equals(this.description, moveTargetDescription.description) &&
        Objects.equals(this.language, moveTargetDescription.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveTargetDescription {\n");
    
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

