package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;
import org.openapitools.model.VersionGroupSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemFlavorText   {
  @JsonProperty("text")
  private String text;

  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  @JsonProperty("language")
  private LanguageSummary language;

  /**
   **/
  public ItemFlavorText text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   **/
  public ItemFlavorText versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   **/
  public ItemFlavorText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("language")
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
    ItemFlavorText itemFlavorText = (ItemFlavorText) o;
    return Objects.equals(text, itemFlavorText.text) &&
        Objects.equals(versionGroup, itemFlavorText.versionGroup) &&
        Objects.equals(language, itemFlavorText.language);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

