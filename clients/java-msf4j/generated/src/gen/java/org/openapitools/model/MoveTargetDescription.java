package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;

/**
 * MoveTargetDescription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveTargetDescription   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("language")
  private LanguageSummary language;

  public MoveTargetDescription description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The localized description for an API resource in a specific language.
   * @return description
  **/
  @ApiModelProperty(value = "The localized description for an API resource in a specific language.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MoveTargetDescription language(LanguageSummary language) {
    this.language = language;
    return this;
  }

   /**
   * The language this name is in.
   * @return language
  **/
  @ApiModelProperty(required = true, value = "The language this name is in.")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

