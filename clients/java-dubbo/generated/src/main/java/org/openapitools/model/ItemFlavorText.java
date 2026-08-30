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

public class ItemFlavorText implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("text")
  private String text;

  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  @JsonProperty("language")
  private LanguageSummary language;

  /**
   * 
   * @return text
   */
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
