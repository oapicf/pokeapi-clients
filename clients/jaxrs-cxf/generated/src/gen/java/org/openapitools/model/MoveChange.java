package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveChangeEffectEntriesInner;
import org.openapitools.model.TypeSummary;
import org.openapitools.model.VersionGroupSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveChange  {
  
  @ApiModelProperty(value = "")

  private Integer accuracy;

  @ApiModelProperty(value = "")

  private Integer power;

  @ApiModelProperty(value = "")

  private Integer pp;

  @ApiModelProperty(required = true, value = "")

  private Integer effectChance;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid MoveChangeEffectEntriesInner> effectEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private TypeSummary type;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private VersionGroupSummary versionGroup;
 /**
   * Get accuracy
   * @return accuracy
  **/
  @JsonProperty("accuracy")
  public Integer getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

  public MoveChange accuracy(Integer accuracy) {
    this.accuracy = accuracy;
    return this;
  }

 /**
   * Get power
   * @return power
  **/
  @JsonProperty("power")
  public Integer getPower() {
    return power;
  }

  public void setPower(Integer power) {
    this.power = power;
  }

  public MoveChange power(Integer power) {
    this.power = power;
    return this;
  }

 /**
   * Get pp
   * @return pp
  **/
  @JsonProperty("pp")
  public Integer getPp() {
    return pp;
  }

  public void setPp(Integer pp) {
    this.pp = pp;
  }

  public MoveChange pp(Integer pp) {
    this.pp = pp;
    return this;
  }

 /**
   * Get effectChance
   * @return effectChance
  **/
  @JsonProperty("effect_chance")
  @NotNull
  public Integer getEffectChance() {
    return effectChance;
  }

  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

  public MoveChange effectChance(Integer effectChance) {
    this.effectChance = effectChance;
    return this;
  }

 /**
   * Get effectEntries
   * @return effectEntries
  **/
  @JsonProperty("effect_entries")
  @NotNull
  public List<@Valid MoveChangeEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<@Valid MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public MoveChange effectEntries(List<@Valid MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public MoveChange addEffectEntriesItem(MoveChangeEffectEntriesInner effectEntriesItem) {
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public TypeSummary getType() {
    return type;
  }

  public void setType(TypeSummary type) {
    this.type = type;
  }

  public MoveChange type(TypeSummary type) {
    this.type = type;
    return this;
  }

 /**
   * Get versionGroup
   * @return versionGroup
  **/
  @JsonProperty("version_group")
  @NotNull
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public MoveChange versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
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
    MoveChange moveChange = (MoveChange) o;
    return Objects.equals(this.accuracy, moveChange.accuracy) &&
        Objects.equals(this.power, moveChange.power) &&
        Objects.equals(this.pp, moveChange.pp) &&
        Objects.equals(this.effectChance, moveChange.effectChance) &&
        Objects.equals(this.effectEntries, moveChange.effectEntries) &&
        Objects.equals(this.type, moveChange.type) &&
        Objects.equals(this.versionGroup, moveChange.versionGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accuracy, power, pp, effectChance, effectEntries, type, versionGroup);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

