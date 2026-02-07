package org.openapitools.model;

import org.openapitools.model.LanguageSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveMetaCategoryDescription  {
  
  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private LanguageSummary language;
 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
 @Size(max=1000)  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MoveMetaCategoryDescription description(String description) {
    this.description = description;
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

  public MoveMetaCategoryDescription language(LanguageSummary language) {
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
    MoveMetaCategoryDescription moveMetaCategoryDescription = (MoveMetaCategoryDescription) o;
    return Objects.equals(this.description, moveMetaCategoryDescription.description) &&
        Objects.equals(this.language, moveMetaCategoryDescription.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveMetaCategoryDescription {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

