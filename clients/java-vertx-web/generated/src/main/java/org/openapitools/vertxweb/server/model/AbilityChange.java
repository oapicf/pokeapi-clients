package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityChangeEffectText;
import org.openapitools.vertxweb.server.model.VersionGroupSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AbilityChange   {
  
  private VersionGroupSummary versionGroup;
  private List<AbilityChangeEffectText> effectEntries = new ArrayList<>();

  public AbilityChange () {

  }

  public AbilityChange (VersionGroupSummary versionGroup, List<AbilityChangeEffectText> effectEntries) {
    this.versionGroup = versionGroup;
    this.effectEntries = effectEntries;
  }

    
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

    
  @JsonProperty("effect_entries")
  public List<AbilityChangeEffectText> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<AbilityChangeEffectText> effectEntries) {
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
    return Objects.equals(versionGroup, abilityChange.versionGroup) &&
        Objects.equals(effectEntries, abilityChange.effectEntries);
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
