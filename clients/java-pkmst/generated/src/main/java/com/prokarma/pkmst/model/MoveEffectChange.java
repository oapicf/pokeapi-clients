package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.MoveEffectChangeEffectText;
import com.prokarma.pkmst.model.VersionGroupSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * MoveEffectChange
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveEffectChange   {
  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  @JsonProperty("effect_entries")
  
  private List<MoveEffectChangeEffectText> effectEntries = new ArrayList<>();

  public MoveEffectChange versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  /**
   * The version group in which the previous effect of this ability originated.
   * @return versionGroup
   */
  @ApiModelProperty(required = true, value = "The version group in which the previous effect of this ability originated.")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public MoveEffectChange effectEntries(List<MoveEffectChangeEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public MoveEffectChange addEffectEntriesItem(MoveEffectChangeEffectText effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

  /**
   * The previous effect of this ability listed in different languages.
   * @return effectEntries
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The previous effect of this ability listed in different languages.")
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
    return Objects.equals(this.versionGroup, moveEffectChange.versionGroup) &&
        Objects.equals(this.effectEntries, moveEffectChange.effectEntries);
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

