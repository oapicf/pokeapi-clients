package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveEffectChangeEffectText;
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



@JsonTypeName("MoveEffectChange")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveEffectChange   {
  private VersionGroupSummary versionGroup;
  private List<@Valid MoveEffectChangeEffectText> effectEntries = new ArrayList<>();

  public MoveEffectChange() {
  }

  @JsonCreator
  public MoveEffectChange(
    @JsonProperty(required = true, value = "version_group") VersionGroupSummary versionGroup,
    @JsonProperty(required = true, value = "effect_entries") List<@Valid MoveEffectChangeEffectText> effectEntries
  ) {
    this.versionGroup = versionGroup;
    this.effectEntries = effectEntries;
  }

  /**
   * The version group in which the previous effect of this ability originated.
   **/
  public MoveEffectChange versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version group in which the previous effect of this ability originated.")
  @JsonProperty(required = true, value = "version_group")
  @NotNull @Valid public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty(required = true, value = "version_group")
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * The previous effect of this ability listed in different languages.
   **/
  public MoveEffectChange effectEntries(List<@Valid MoveEffectChangeEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The previous effect of this ability listed in different languages.")
  @JsonProperty(required = true, value = "effect_entries")
  public List<@Valid MoveEffectChangeEffectText> getEffectEntries() {
    return effectEntries;
  }

  @JsonProperty(required = true, value = "effect_entries")
  public void setEffectEntries(List<@Valid MoveEffectChangeEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public MoveEffectChange addEffectEntriesItem(MoveEffectChangeEffectText effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }

    this.effectEntries.add(effectEntriesItem);
    return this;
  }

  public MoveEffectChange removeEffectEntriesItem(MoveEffectChangeEffectText effectEntriesItem) {
    if (effectEntriesItem != null && this.effectEntries != null) {
      this.effectEntries.remove(effectEntriesItem);
    }

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
