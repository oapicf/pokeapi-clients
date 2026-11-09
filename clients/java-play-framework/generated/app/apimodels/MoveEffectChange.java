package apimodels;

import apimodels.MoveEffectChangeEffectText;
import apimodels.VersionGroupSummary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MoveEffectChange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MoveEffectChange   {
  @JsonProperty("version_group")
  @NotNull
@Valid

  private VersionGroupSummary versionGroup;

  @JsonProperty("effect_entries")
  @NotNull
@Valid

  private List<@Valid MoveEffectChangeEffectText> effectEntries = new ArrayList<>();

  public MoveEffectChange versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

   /**
   * The version group in which the previous effect of this ability originated.
   * @return versionGroup
  **/
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

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
  **/
  public List<@Valid MoveEffectChangeEffectText> getEffectEntries() {
    return effectEntries;
  }

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
    return Objects.equals(versionGroup, moveEffectChange.versionGroup) &&
        Objects.equals(effectEntries, moveEffectChange.effectEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionGroup, effectEntries);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

