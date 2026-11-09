package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;

/**
 * ContestTypeName
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class ContestTypeName   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("color")
  private String color;

  @JsonProperty("language")
  private LanguageSummary language;

  public ContestTypeName name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this contest.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name for this contest.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContestTypeName color(String color) {
    this.color = color;
    return this;
  }

   /**
   * The color associated with this contest's name.
   * @return color
  **/
  @ApiModelProperty(required = true, value = "The color associated with this contest's name.")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public ContestTypeName language(LanguageSummary language) {
    this.language = language;
    return this;
  }

   /**
   * The language that this name is in.
   * @return language
  **/
  @ApiModelProperty(required = true, value = "The language that this name is in.")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

