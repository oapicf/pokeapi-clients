package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveEffectEffectText;
import org.openapitools.model.TypeSummary;
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



@JsonTypeName("MoveChange")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveChange   {
  private Integer accuracy;
  private Integer power;
  private Integer pp;
  private Integer effectChance;
  private List<@Valid MoveEffectEffectText> effectEntries = new ArrayList<>();
  private TypeSummary type;
  private VersionGroupSummary versionGroup;

  public MoveChange() {
  }

  @JsonCreator
  public MoveChange(
    @JsonProperty(required = true, value = "effect_chance") Integer effectChance,
    @JsonProperty(required = true, value = "effect_entries") List<@Valid MoveEffectEffectText> effectEntries,
    @JsonProperty(required = true, value = "type") TypeSummary type,
    @JsonProperty(required = true, value = "version_group") VersionGroupSummary versionGroup
  ) {
    this.effectChance = effectChance;
    this.effectEntries = effectEntries;
    this.type = type;
    this.versionGroup = versionGroup;
  }

  /**
   * The percent value of how likely this move is to be successful.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public MoveChange accuracy(Integer accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  
  @ApiModelProperty(value = "The percent value of how likely this move is to be successful.")
  @JsonProperty("accuracy")
   @Min(-2147483648) @Max(2147483647)public Integer getAccuracy() {
    return accuracy;
  }

  @JsonProperty("accuracy")
  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

  /**
   * The base power before the listed version group, or null if power did not change.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public MoveChange power(Integer power) {
    this.power = power;
    return this;
  }

  
  @ApiModelProperty(value = "The base power before the listed version group, or null if power did not change.")
  @JsonProperty("power")
   @Min(-2147483648) @Max(2147483647)public Integer getPower() {
    return power;
  }

  @JsonProperty("power")
  public void setPower(Integer power) {
    this.power = power;
  }

  /**
   * Power points. The number of times this move can be used.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public MoveChange pp(Integer pp) {
    this.pp = pp;
    return this;
  }

  
  @ApiModelProperty(value = "Power points. The number of times this move can be used.")
  @JsonProperty("pp")
   @Min(-2147483648) @Max(2147483647)public Integer getPp() {
    return pp;
  }

  @JsonProperty("pp")
  public void setPp(Integer pp) {
    this.pp = pp;
  }

  /**
   * The percent value of how likely it is this moves effect will take effect.
   **/
  public MoveChange effectChance(Integer effectChance) {
    this.effectChance = effectChance;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The percent value of how likely it is this moves effect will take effect.")
  @JsonProperty(required = true, value = "effect_chance")
  @NotNull public Integer getEffectChance() {
    return effectChance;
  }

  @JsonProperty(required = true, value = "effect_chance")
  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

  /**
   * The effect of this move listed in different languages.
   **/
  public MoveChange effectEntries(List<@Valid MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The effect of this move listed in different languages.")
  @JsonProperty(required = true, value = "effect_entries")
  public List<@Valid MoveEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  @JsonProperty(required = true, value = "effect_entries")
  public void setEffectEntries(List<@Valid MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public MoveChange addEffectEntriesItem(MoveEffectEffectText effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }

    this.effectEntries.add(effectEntriesItem);
    return this;
  }

  public MoveChange removeEffectEntriesItem(MoveEffectEffectText effectEntriesItem) {
    if (effectEntriesItem != null && this.effectEntries != null) {
      this.effectEntries.remove(effectEntriesItem);
    }

    return this;
  }
  /**
   * The elemental type of this move.
   **/
  public MoveChange type(TypeSummary type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The elemental type of this move.")
  @JsonProperty(required = true, value = "type")
  @NotNull @Valid public TypeSummary getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeSummary type) {
    this.type = type;
  }

  /**
   * The version group in which these move stat values were in effect.
   **/
  public MoveChange versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version group in which these move stat values were in effect.")
  @JsonProperty(required = true, value = "version_group")
  @NotNull @Valid public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty(required = true, value = "version_group")
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
