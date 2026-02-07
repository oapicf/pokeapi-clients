package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityChangeEffectText;
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



@JsonTypeName("AbilityChange")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AbilityChange   {
  private VersionGroupSummary versionGroup;
  private @Valid List<@Valid AbilityChangeEffectText> effectEntries = new ArrayList<>();

  public AbilityChange() {
  }

  @JsonCreator
  public AbilityChange(
    @JsonProperty(required = true, value = "version_group") VersionGroupSummary versionGroup,
    @JsonProperty(required = true, value = "effect_entries") List<@Valid AbilityChangeEffectText> effectEntries
  ) {
    this.versionGroup = versionGroup;
    this.effectEntries = effectEntries;
  }

  /**
   **/
  public AbilityChange versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "version_group")
  @NotNull @Valid public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty(required = true, value = "version_group")
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   **/
  public AbilityChange effectEntries(List<@Valid AbilityChangeEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "effect_entries")
  @NotNull @Valid public List<@Valid AbilityChangeEffectText> getEffectEntries() {
    return effectEntries;
  }

  @JsonProperty(required = true, value = "effect_entries")
  public void setEffectEntries(List<@Valid AbilityChangeEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public AbilityChange addEffectEntriesItem(AbilityChangeEffectText effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }

    this.effectEntries.add(effectEntriesItem);
    return this;
  }

  public AbilityChange removeEffectEntriesItem(AbilityChangeEffectText effectEntriesItem) {
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

