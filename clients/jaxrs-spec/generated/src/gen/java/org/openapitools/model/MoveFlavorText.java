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



@JsonTypeName("MoveFlavorText")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveFlavorText   {
  private String flavorText;
  private LanguageSummary language;
  private VersionGroupSummary versionGroup;

  public MoveFlavorText() {
  }

  @JsonCreator
  public MoveFlavorText(
    @JsonProperty(required = true, value = "flavor_text") String flavorText,
    @JsonProperty(required = true, value = "language") LanguageSummary language,
    @JsonProperty(required = true, value = "version_group") VersionGroupSummary versionGroup
  ) {
    this.flavorText = flavorText;
    this.language = language;
    this.versionGroup = versionGroup;
  }

  /**
   * The localized flavor text for an api resource in a specific language.
   **/
  public MoveFlavorText flavorText(String flavorText) {
    this.flavorText = flavorText;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The localized flavor text for an api resource in a specific language.")
  @JsonProperty(required = true, value = "flavor_text")
  @NotNull public String getFlavorText() {
    return flavorText;
  }

  @JsonProperty(required = true, value = "flavor_text")
  public void setFlavorText(String flavorText) {
    this.flavorText = flavorText;
  }

  /**
   * The language this name is in.
   **/
  public MoveFlavorText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The language this name is in.")
  @JsonProperty(required = true, value = "language")
  @NotNull @Valid public LanguageSummary getLanguage() {
    return language;
  }

  @JsonProperty(required = true, value = "language")
  public void setLanguage(LanguageSummary language) {
    this.language = language;
  }

  /**
   * The version group that uses this flavor text.
   **/
  public MoveFlavorText versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version group that uses this flavor text.")
  @JsonProperty(required = true, value = "version_group")
  @NotNull @Valid public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty(required = true, value = "version_group")
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
