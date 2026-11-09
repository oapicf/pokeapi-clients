package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveEffectEffectText;
import org.openapitools.model.TypeSummary;
import org.openapitools.model.VersionGroupSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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
  public Integer getAccuracy() {
    return accuracy;
  }
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
  public Integer getPower() {
    return power;
  }
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
  public Integer getPp() {
    return pp;
  }
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
  @JsonProperty("effect_chance")
  public Integer getEffectChance() {
    return effectChance;
  }
  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

  /**
   * The effect of this move listed in different languages.
   **/
  public MoveChange effectEntries(List<MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The effect of this move listed in different languages.")
  @JsonProperty("effect_entries")
  public List<MoveEffectEffectText> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * The elemental type of this move.
   **/
  public MoveChange type(TypeSummary type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The elemental type of this move.")
  @JsonProperty("type")
  public TypeSummary getType() {
    return type;
  }
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
    return Objects.equals(accuracy, moveChange.accuracy) &&
        Objects.equals(power, moveChange.power) &&
        Objects.equals(pp, moveChange.pp) &&
        Objects.equals(effectChance, moveChange.effectChance) &&
        Objects.equals(effectEntries, moveChange.effectEntries) &&
        Objects.equals(type, moveChange.type) &&
        Objects.equals(versionGroup, moveChange.versionGroup);
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

