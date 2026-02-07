package org.openapitools.model;

import org.openapitools.model.LanguageSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EggGroupName  {
  
  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private LanguageSummary language;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EggGroupName name(String name) {
    this.name = name;
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

  public EggGroupName language(LanguageSummary language) {
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
    EggGroupName eggGroupName = (EggGroupName) o;
    return Objects.equals(this.name, eggGroupName.name) &&
        Objects.equals(this.language, eggGroupName.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EggGroupName {\n");
    
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

