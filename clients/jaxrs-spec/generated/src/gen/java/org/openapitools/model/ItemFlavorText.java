package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;
import org.openapitools.model.VersionGroupSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ItemFlavorText")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemFlavorText   {
  private String text;
  private VersionGroupSummary versionGroup;
  private LanguageSummary language;

  public ItemFlavorText() {
  }

  @JsonCreator
  public ItemFlavorText(
    @JsonProperty(required = true, value = "text") String text,
    @JsonProperty(required = true, value = "version_group") VersionGroupSummary versionGroup,
    @JsonProperty(required = true, value = "language") LanguageSummary language
  ) {
    this.text = text;
    this.versionGroup = versionGroup;
    this.language = language;
  }

  /**
   **/
  public ItemFlavorText text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "text")
  @NotNull public String getText() {
    return text;
  }

  @JsonProperty(required = true, value = "text")
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
  @JsonProperty(required = true, value = "version_group")
  @NotNull @Valid public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty(required = true, value = "version_group")
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
  @JsonProperty(required = true, value = "language")
  @NotNull @Valid public LanguageSummary getLanguage() {
    return language;
  }

  @JsonProperty(required = true, value = "language")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

