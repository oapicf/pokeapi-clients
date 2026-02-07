package org.openapitools.model;

import org.openapitools.model.LanguageSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LocationName  {
  
  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private LanguageSummary language;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocationName name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get language
   * @return language
  **/
  @JsonProperty("language")
  public LanguageSummary getLanguage() {
    return language;
  }

  public void setLanguage(LanguageSummary language) {
    this.language = language;
  }

  public LocationName language(LanguageSummary language) {
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
    LocationName locationName = (LocationName) o;
    return Objects.equals(this.name, locationName.name) &&
        Objects.equals(this.language, locationName.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationName {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

