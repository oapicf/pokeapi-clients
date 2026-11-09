package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MoveEffectChangeEffectText;
import org.openapitools.vertxweb.server.model.VersionGroupSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveEffectChange   {
  
  private VersionGroupSummary versionGroup;
  private List<MoveEffectChangeEffectText> effectEntries = new ArrayList<>();

  public MoveEffectChange () {

  }

  public MoveEffectChange (VersionGroupSummary versionGroup, List<MoveEffectChangeEffectText> effectEntries) {
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
  public List<MoveEffectChangeEffectText> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<MoveEffectChangeEffectText> effectEntries) {
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
    MoveEffectChange moveEffectChange = (MoveEffectChange) o;
    return Objects.equals(versionGroup, moveEffectChange.versionGroup) &&
        Objects.equals(effectEntries, moveEffectChange.effectEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionGroup, effectEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveEffectChange {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
