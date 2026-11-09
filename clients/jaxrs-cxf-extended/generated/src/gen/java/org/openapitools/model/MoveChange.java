package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveEffectEffectText;
import org.openapitools.model.TypeSummary;
import org.openapitools.model.VersionGroupSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveChange  {
  
 /**
  * The percent value of how likely this move is to be successful.
  */
  @ApiModelProperty(value = "The percent value of how likely this move is to be successful.")
  private Integer accuracy;

 /**
  * The base power before the listed version group, or null if power did not change.
  */
  @ApiModelProperty(value = "The base power before the listed version group, or null if power did not change.")
  private Integer power;

 /**
  * Power points. The number of times this move can be used.
  */
  @ApiModelProperty(value = "Power points. The number of times this move can be used.")
  private Integer pp;

 /**
  * The percent value of how likely it is this moves effect will take effect.
  */
  @ApiModelProperty(required = true, value = "The percent value of how likely it is this moves effect will take effect.")
  private Integer effectChance;

 /**
  * The effect of this move listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The effect of this move listed in different languages.")
  private List<@Valid MoveEffectEffectText> effectEntries = new ArrayList<>();

 /**
  * The elemental type of this move.
  */
  @ApiModelProperty(required = true, value = "The elemental type of this move.")
  @Valid
  private TypeSummary type;

 /**
  * The version group in which these move stat values were in effect.
  */
  @ApiModelProperty(required = true, value = "The version group in which these move stat values were in effect.")
  @Valid
  private VersionGroupSummary versionGroup;
 /**
  * The percent value of how likely this move is to be successful.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return accuracy
  */
  @JsonProperty("accuracy")
 @Min(-2147483648) @Max(2147483647)  public Integer getAccuracy() {
    return accuracy;
  }

  /**
   * Sets the <code>accuracy</code> property.
   */
 public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

  /**
   * Sets the <code>accuracy</code> property.
   */
  public MoveChange accuracy(Integer accuracy) {
    this.accuracy = accuracy;
    return this;
  }

 /**
  * The base power before the listed version group, or null if power did not change.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return power
  */
  @JsonProperty("power")
 @Min(-2147483648) @Max(2147483647)  public Integer getPower() {
    return power;
  }

  /**
   * Sets the <code>power</code> property.
   */
 public void setPower(Integer power) {
    this.power = power;
  }

  /**
   * Sets the <code>power</code> property.
   */
  public MoveChange power(Integer power) {
    this.power = power;
    return this;
  }

 /**
  * Power points. The number of times this move can be used.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return pp
  */
  @JsonProperty("pp")
 @Min(-2147483648) @Max(2147483647)  public Integer getPp() {
    return pp;
  }

  /**
   * Sets the <code>pp</code> property.
   */
 public void setPp(Integer pp) {
    this.pp = pp;
  }

  /**
   * Sets the <code>pp</code> property.
   */
  public MoveChange pp(Integer pp) {
    this.pp = pp;
    return this;
  }

 /**
  * The percent value of how likely it is this moves effect will take effect.
  * @return effectChance
  */
  @JsonProperty("effect_chance")
  @NotNull
  public Integer getEffectChance() {
    return effectChance;
  }

  /**
   * Sets the <code>effectChance</code> property.
   */
 public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

  /**
   * Sets the <code>effectChance</code> property.
   */
  public MoveChange effectChance(Integer effectChance) {
    this.effectChance = effectChance;
    return this;
  }

 /**
  * The effect of this move listed in different languages.
  * @return effectEntries
  */
  @JsonProperty("effect_entries")
  @NotNull
  public List<@Valid MoveEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  /**
   * Sets the <code>effectEntries</code> property.
   * <br><em>N.B. <code>effectEntries</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setEffectEntries(List<@Valid MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * Sets the <code>effectEntries</code> property.
   * <br><em>N.B. <code>effectEntries</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public MoveChange effectEntries(List<@Valid MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  /**
   * Adds a new item to the <code>effectEntries</code> list.
   * <br><em>N.B. <code>effectEntries</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public MoveChange addEffectEntriesItem(MoveEffectEffectText effectEntriesItem) {
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

 /**
  * The elemental type of this move.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public TypeSummary getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeSummary type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public MoveChange type(TypeSummary type) {
    this.type = type;
    return this;
  }

 /**
  * The version group in which these move stat values were in effect.
  * @return versionGroup
  */
  @JsonProperty("version_group")
  @NotNull
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  /**
   * Sets the <code>versionGroup</code> property.
   */
 public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * Sets the <code>versionGroup</code> property.
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

