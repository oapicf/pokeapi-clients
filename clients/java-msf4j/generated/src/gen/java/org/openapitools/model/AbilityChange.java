package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityChangeEffectText;
import org.openapitools.model.VersionGroupSummary;

/**
 * AbilityChange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AbilityChange   {
  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  @JsonProperty("effect_entries")
  private List<@Valid AbilityChangeEffectText> effectEntries = new ArrayList<>();

  public AbilityChange versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

   /**
   * Get versionGroup
   * @return versionGroup
  **/
  @ApiModelProperty(required = true, value = "")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public AbilityChange effectEntries(List<@Valid AbilityChangeEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public AbilityChange addEffectEntriesItem(AbilityChangeEffectText effectEntriesItem) {
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

   /**
   * Get effectEntries
   * @return effectEntries
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid AbilityChangeEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<@Valid AbilityChangeEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbilityChange abilityChange = (AbilityChange) o;
    return Objects.equals(this.versionGroup, abilityChange.versionGroup) &&
        Objects.equals(this.effectEntries, abilityChange.effectEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionGroup, effectEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbilityChange {\n");
    
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
    sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
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

