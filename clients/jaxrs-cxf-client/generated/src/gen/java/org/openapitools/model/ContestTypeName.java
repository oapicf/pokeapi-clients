package org.openapitools.model;

import org.openapitools.model.LanguageSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ContestTypeName  {
  
 /**
  * The name for this contest.
  */
  @ApiModelProperty(required = true, value = "The name for this contest.")

  private String name;

 /**
  * The color associated with this contest's name.
  */
  @ApiModelProperty(required = true, value = "The color associated with this contest's name.")

  private String color;

 /**
  * The language that this name is in.
  */
  @ApiModelProperty(required = true, value = "The language that this name is in.")

  private LanguageSummary language;
 /**
   * The name for this contest.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContestTypeName name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The color associated with this contest&#39;s name.
   * @return color
  **/
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public ContestTypeName color(String color) {
    this.color = color;
    return this;
  }

 /**
   * The language that this name is in.
   * @return language
  **/
  @JsonProperty("language")
  public LanguageSummary getLanguage() {
    return language;
  }

  public void setLanguage(LanguageSummary language) {
    this.language = language;
  }

  public ContestTypeName language(LanguageSummary language) {
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
    ContestTypeName contestTypeName = (ContestTypeName) o;
    return Objects.equals(this.name, contestTypeName.name) &&
        Objects.equals(this.color, contestTypeName.color) &&
        Objects.equals(this.language, contestTypeName.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, color, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestTypeName {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

