package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.LanguageSummary;
import org.openapitools.model.VersionGroupSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MoveFlavorText
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveFlavorText {

  private String flavorText;

  private LanguageSummary language;

  private VersionGroupSummary versionGroup;

  public MoveFlavorText() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveFlavorText(String flavorText, LanguageSummary language, VersionGroupSummary versionGroup) {
    this.flavorText = flavorText;
    this.language = language;
    this.versionGroup = versionGroup;
  }

  public MoveFlavorText flavorText(String flavorText) {
    this.flavorText = flavorText;
    return this;
  }

  /**
   * Get flavorText
   * @return flavorText
   */
  @NotNull 
  @Schema(name = "flavor_text", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("flavor_text")
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
   * Get language
   * @return language
   */
  @NotNull @Valid 
  @Schema(name = "language", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("language")
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
   * Get versionGroup
   * @return versionGroup
   */
  @NotNull @Valid 
  @Schema(name = "version_group", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_group")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

