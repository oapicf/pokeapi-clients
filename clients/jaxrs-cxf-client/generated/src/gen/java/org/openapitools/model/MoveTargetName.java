package org.openapitools.model;

import org.openapitools.model.LanguageSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveTargetName  {
  
 /**
  * The localized name for an API resource in a specific language.
  */
  @ApiModelProperty(required = true, value = "The localized name for an API resource in a specific language.")

  private String name;

 /**
  * The language this name is in.
  */
  @ApiModelProperty(required = true, value = "The language this name is in.")

  private LanguageSummary language;
 /**
   * The localized name for an API resource in a specific language.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MoveTargetName name(String name) {
    this.name = name;
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

  public MoveTargetName language(LanguageSummary language) {
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
    MoveTargetName moveTargetName = (MoveTargetName) o;
    return Objects.equals(this.name, moveTargetName.name) &&
        Objects.equals(this.language, moveTargetName.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveTargetName {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

