package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveEffectChangeEffectText;
import org.openapitools.model.VersionGroupSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MoveEffectChange
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveEffectChange {

  private VersionGroupSummary versionGroup;

  private List<@Valid MoveEffectChangeEffectText> effectEntries = new ArrayList<>();

  public MoveEffectChange() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveEffectChange(VersionGroupSummary versionGroup, List<@Valid MoveEffectChangeEffectText> effectEntries) {
    this.versionGroup = versionGroup;
    this.effectEntries = effectEntries;
  }

  public MoveEffectChange versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  /**
   * The version group in which the previous effect of this ability originated.
   * @return versionGroup
   */
  @NotNull @Valid 
  @Schema(name = "version_group", description = "The version group in which the previous effect of this ability originated.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty("version_group")
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public MoveEffectChange effectEntries(List<@Valid MoveEffectChangeEffectText> effectEntries) {
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
  
  @Schema(name = "effect_entries", accessMode = Schema.AccessMode.READ_ONLY, description = "The previous effect of this ability listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effect_entries")
  public List<@Valid MoveEffectChangeEffectText> getEffectEntries() {
    return effectEntries;
  }

  @JsonProperty("effect_entries")
  public void setEffectEntries(List<@Valid MoveEffectChangeEffectText> effectEntries) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

