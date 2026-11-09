package org.openapitools.model;

import org.openapitools.model.LanguageSummary;
import org.openapitools.model.VersionGroupSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemFlavorText  {
  
 /**
  * The localized flavor text for an API resource in a specific language.
  */
  @ApiModelProperty(required = true, value = "The localized flavor text for an API resource in a specific language.")

  private String text;

 /**
  * The version group which uses this flavor text.
  */
  @ApiModelProperty(required = true, value = "The version group which uses this flavor text.")

  @Valid

  private VersionGroupSummary versionGroup;

 /**
  * The language this name is in.
  */
  @ApiModelProperty(required = true, value = "The language this name is in.")

  @Valid

  private LanguageSummary language;
 /**
   * The localized flavor text for an API resource in a specific language.
   * @return text
  **/
  @JsonProperty("text")
  @NotNull
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ItemFlavorText text(String text) {
    this.text = text;
    return this;
  }

 /**
   * The version group which uses this flavor text.
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

  public ItemFlavorText versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

 /**
   * The language this name is in.
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

  public ItemFlavorText language(LanguageSummary language) {
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
    ItemFlavorText itemFlavorText = (ItemFlavorText) o;
    return Objects.equals(this.text, itemFlavorText.text) &&
        Objects.equals(this.versionGroup, itemFlavorText.versionGroup) &&
        Objects.equals(this.language, itemFlavorText.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, versionGroup, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemFlavorText {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
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

