package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveChangeEffectEntriesInner;
import org.openapitools.model.TypeSummary;
import org.openapitools.model.VersionGroupSummary;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MoveChange
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T15:29:13.146999890Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveChange {

  private JsonNullable<Integer> accuracy = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> power = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> pp = JsonNullable.<Integer>undefined();

  private Integer effectChance;

  @Valid
  private List<@Valid MoveChangeEffectEntriesInner> effectEntries = new ArrayList<>();

  private TypeSummary type;

  private VersionGroupSummary versionGroup;

  public MoveChange() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveChange(Integer effectChance, List<@Valid MoveChangeEffectEntriesInner> effectEntries, TypeSummary type, VersionGroupSummary versionGroup) {
    this.effectChance = effectChance;
    this.effectEntries = effectEntries;
    this.type = type;
    this.versionGroup = versionGroup;
  }

  public MoveChange accuracy(Integer accuracy) {
    this.accuracy = JsonNullable.of(accuracy);
    return this;
  }

  /**
   * Get accuracy
   * @return accuracy
   */
  
  @Schema(name = "accuracy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accuracy")
  public JsonNullable<Integer> getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(JsonNullable<Integer> accuracy) {
    this.accuracy = accuracy;
  }

  public MoveChange power(Integer power) {
    this.power = JsonNullable.of(power);
    return this;
  }

  /**
   * Get power
   * @return power
   */
  
  @Schema(name = "power", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("power")
  public JsonNullable<Integer> getPower() {
    return power;
  }

  public void setPower(JsonNullable<Integer> power) {
    this.power = power;
  }

  public MoveChange pp(Integer pp) {
    this.pp = JsonNullable.of(pp);
    return this;
  }

  /**
   * Get pp
   * @return pp
   */
  
  @Schema(name = "pp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pp")
  public JsonNullable<Integer> getPp() {
    return pp;
  }

  public void setPp(JsonNullable<Integer> pp) {
    this.pp = pp;
  }

  public MoveChange effectChance(Integer effectChance) {
    this.effectChance = effectChance;
    return this;
  }

  /**
   * Get effectChance
   * @return effectChance
   */
  @NotNull 
  @Schema(name = "effect_chance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effect_chance")
  public Integer getEffectChance() {
    return effectChance;
  }

  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

  public MoveChange effectEntries(List<@Valid MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public MoveChange addEffectEntriesItem(MoveChangeEffectEntriesInner effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

  /**
   * Get effectEntries
   * @return effectEntries
   */
  @NotNull @Valid 
  @Schema(name = "effect_entries", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effect_entries")
  public List<@Valid MoveChangeEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<@Valid MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public MoveChange type(TypeSummary type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeSummary getType() {
    return type;
  }

  public void setType(TypeSummary type) {
    this.type = type;
  }

  public MoveChange versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  /**
   * Get versionGroup
   * @return versionGroup
   */
  @NotNull @Valid 
  @Schema(name = "version_group", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveChange moveChange = (MoveChange) o;
    return equalsNullable(this.accuracy, moveChange.accuracy) &&
        equalsNullable(this.power, moveChange.power) &&
        equalsNullable(this.pp, moveChange.pp) &&
        Objects.equals(this.effectChance, moveChange.effectChance) &&
        Objects.equals(this.effectEntries, moveChange.effectEntries) &&
        Objects.equals(this.type, moveChange.type) &&
        Objects.equals(this.versionGroup, moveChange.versionGroup);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(accuracy), hashCodeNullable(power), hashCodeNullable(pp), effectChance, effectEntries, type, versionGroup);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveChange {\n");
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    pp: ").append(toIndentedString(pp)).append("\n");
    sb.append("    effectChance: ").append(toIndentedString(effectChance)).append("\n");
    sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
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

