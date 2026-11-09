package org.openapitools.model;

import org.openapitools.model.LanguageSummary;
import org.openapitools.model.VersionGroupSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveFlavorText  {
  
 /**
  * The localized flavor text for an api resource in a specific language.
  */
  @ApiModelProperty(required = true, value = "The localized flavor text for an api resource in a specific language.")

  private String flavorText;

 /**
  * The language this name is in.
  */
  @ApiModelProperty(required = true, value = "The language this name is in.")

  private LanguageSummary language;

 /**
  * The version group that uses this flavor text.
  */
  @ApiModelProperty(required = true, value = "The version group that uses this flavor text.")

  private VersionGroupSummary versionGroup;
 /**
   * The localized flavor text for an api resource in a specific language.
   * @return flavorText
  **/
  @JsonProperty("flavor_text")
  public String getFlavorText() {
    return flavorText;
  }

  public void setFlavorText(String flavorText) {
    this.flavorText = flavorText;
  }

  public MoveFlavorText flavorText(String flavorText) {
    this.flavorText = flavorText;
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

  public MoveFlavorText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

 /**
   * The version group that uses this flavor text.
   * @return versionGroup
  **/
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public MoveFlavorText versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

