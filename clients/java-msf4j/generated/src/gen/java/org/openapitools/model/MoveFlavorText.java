package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;
import org.openapitools.model.VersionGroupSummary;

/**
 * MoveFlavorText
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveFlavorText   {
  @JsonProperty("flavor_text")
  private String flavorText;

  @JsonProperty("language")
  private LanguageSummary language;

  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  public MoveFlavorText flavorText(String flavorText) {
    this.flavorText = flavorText;
    return this;
  }

   /**
   * The localized flavor text for an api resource in a specific language.
   * @return flavorText
  **/
  @ApiModelProperty(required = true, value = "The localized flavor text for an api resource in a specific language.")
  public String getFlavorText() {
    return flavorText;
  }

  public void setFlavorText(String flavorText) {
    this.flavorText = flavorText;
  }

  public MoveFlavorText language(LanguageSummary language) {
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

  public MoveFlavorText versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

   /**
   * The version group that uses this flavor text.
   * @return versionGroup
  **/
  @ApiModelProperty(required = true, value = "The version group that uses this flavor text.")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveFlavorText moveFlavorText = (MoveFlavorText) o;
    return Objects.equals(this.flavorText, moveFlavorText.flavorText) &&
        Objects.equals(this.language, moveFlavorText.language) &&
        Objects.equals(this.versionGroup, moveFlavorText.versionGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flavorText, language, versionGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveFlavorText {\n");
    
    sb.append("    flavorText: ").append(toIndentedString(flavorText)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
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

