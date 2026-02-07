package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.LanguageSummary;
import org.openapitools.vertxweb.server.model.VersionGroupSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveFlavorText   {
  
  private String flavorText;
  private LanguageSummary language;
  private VersionGroupSummary versionGroup;

  public MoveFlavorText () {

  }

  public MoveFlavorText (String flavorText, LanguageSummary language, VersionGroupSummary versionGroup) {
    this.flavorText = flavorText;
    this.language = language;
    this.versionGroup = versionGroup;
  }

    
  @JsonProperty("flavor_text")
  public String getFlavorText() {
    return flavorText;
  }
  public void setFlavorText(String flavorText) {
    this.flavorText = flavorText;
  }

    
  @JsonProperty("language")
  public LanguageSummary getLanguage() {
    return language;
  }
  public void setLanguage(LanguageSummary language) {
    this.language = language;
  }

    
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
    return Objects.equals(flavorText, moveFlavorText.flavorText) &&
        Objects.equals(language, moveFlavorText.language) &&
        Objects.equals(versionGroup, moveFlavorText.versionGroup);
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
