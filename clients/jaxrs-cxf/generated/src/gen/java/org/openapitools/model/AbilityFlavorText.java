package org.openapitools.model;

import org.openapitools.model.LanguageSummary;
import org.openapitools.model.VersionGroupSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AbilityFlavorText  {
  
  @ApiModelProperty(required = true, value = "")

  private String flavorText;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private LanguageSummary language;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private VersionGroupSummary versionGroup;
 /**
   * Get flavorText
   * @return flavorText
  **/
  @JsonProperty("flavor_text")
  @NotNull
  public String getFlavorText() {
    return flavorText;
  }

  public void setFlavorText(String flavorText) {
    this.flavorText = flavorText;
  }

  public AbilityFlavorText flavorText(String flavorText) {
    this.flavorText = flavorText;
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

  public AbilityFlavorText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

 /**
   * Get versionGroup
   * @return versionGroup
  **/
  @JsonProperty("version_group")
  @NotNull
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public AbilityFlavorText versionGroup(VersionGroupSummary versionGroup) {
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
    AbilityFlavorText abilityFlavorText = (AbilityFlavorText) o;
    return Objects.equals(this.flavorText, abilityFlavorText.flavorText) &&
        Objects.equals(this.language, abilityFlavorText.language) &&
        Objects.equals(this.versionGroup, abilityFlavorText.versionGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flavorText, language, versionGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbilityFlavorText {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

