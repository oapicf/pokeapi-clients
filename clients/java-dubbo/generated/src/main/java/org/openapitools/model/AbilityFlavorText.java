package org.openapitools.model;

import org.openapitools.model.LanguageSummary;
import org.openapitools.model.VersionGroupSummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AbilityFlavorText implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("flavor_text")
  private String flavorText;

  @JsonProperty("language")
  private LanguageSummary language;

  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  /**
   * 
   * @return flavorText
   */
  public String getFlavorText() {
    return flavorText;
  }

  public void setFlavorText(String flavorText) {
    this.flavorText = flavorText;
  }

  /**
   * 
   * @return language
   */
  public LanguageSummary getLanguage() {
    return language;
  }

  public void setLanguage(LanguageSummary language) {
    this.language = language;
  }

  /**
   * 
   * @return versionGroup
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
