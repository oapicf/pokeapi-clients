package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityChangeEffectText;
import org.openapitools.model.VersionGroupSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AbilityChange  {
  
  @ApiModelProperty(required = true, value = "")

  private VersionGroupSummary versionGroup;

  @ApiModelProperty(required = true, value = "")

  private List<AbilityChangeEffectText> effectEntries = new ArrayList<>();
 /**
   * Get versionGroup
   * @return versionGroup
  **/
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public AbilityChange versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

 /**
   * Get effectEntries
   * @return effectEntries
  **/
  @JsonProperty("effect_entries")
  public List<AbilityChangeEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<AbilityChangeEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public AbilityChange effectEntries(List<AbilityChangeEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public AbilityChange addEffectEntriesItem(AbilityChangeEffectText effectEntriesItem) {
    this.effectEntries.add(effectEntriesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

