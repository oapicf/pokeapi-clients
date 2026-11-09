package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.MoveEffectEffectText;
import com.prokarma.pkmst.model.TypeSummary;
import com.prokarma.pkmst.model.VersionGroupSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * MoveChange
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveChange   {
  @JsonProperty("accuracy")
  private Integer accuracy;

  @JsonProperty("power")
  private Integer power;

  @JsonProperty("pp")
  private Integer pp;

  @JsonProperty("effect_chance")
  private Integer effectChance;

  @JsonProperty("effect_entries")
  
  private List<MoveEffectEffectText> effectEntries = new ArrayList<>();

  @JsonProperty("type")
  private TypeSummary type;

  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  public MoveChange accuracy(Integer accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  /**
   * The percent value of how likely this move is to be successful.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return accuracy
   */
  @ApiModelProperty(value = "The percent value of how likely this move is to be successful.")
  public Integer getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

  public MoveChange power(Integer power) {
    this.power = power;
    return this;
  }

  /**
   * The base power before the listed version group, or null if power did not change.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return power
   */
  @ApiModelProperty(value = "The base power before the listed version group, or null if power did not change.")
  public Integer getPower() {
    return power;
  }

  public void setPower(Integer power) {
    this.power = power;
  }

  public MoveChange pp(Integer pp) {
    this.pp = pp;
    return this;
  }

  /**
   * Power points. The number of times this move can be used.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return pp
   */
  @ApiModelProperty(value = "Power points. The number of times this move can be used.")
  public Integer getPp() {
    return pp;
  }

  public void setPp(Integer pp) {
    this.pp = pp;
  }

  public MoveChange effectChance(Integer effectChance) {
    this.effectChance = effectChance;
    return this;
  }

  /**
   * The percent value of how likely it is this moves effect will take effect.
   * @return effectChance
   */
  @ApiModelProperty(required = true, value = "The percent value of how likely it is this moves effect will take effect.")
  public Integer getEffectChance() {
    return effectChance;
  }

  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

  public MoveChange effectEntries(List<MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public MoveChange addEffectEntriesItem(MoveEffectEffectText effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

  /**
   * The effect of this move listed in different languages.
   * @return effectEntries
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The effect of this move listed in different languages.")
  public List<MoveEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public MoveChange type(TypeSummary type) {
    this.type = type;
    return this;
  }

  /**
   * The elemental type of this move.
   * @return type
   */
  @ApiModelProperty(required = true, value = "The elemental type of this move.")
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
   * The version group in which these move stat values were in effect.
   * @return versionGroup
   */
  @ApiModelProperty(required = true, value = "The version group in which these move stat values were in effect.")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

