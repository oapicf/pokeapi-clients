package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveChangeEffectEntriesInner;
import org.openapitools.model.TypeSummary;
import org.openapitools.model.VersionGroupSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class MoveChange implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("accuracy")
  private Integer accuracy;

  @JsonProperty("power")
  private Integer power;

  @JsonProperty("pp")
  private Integer pp;

  @JsonProperty("effect_chance")
  private Integer effectChance;

  @JsonProperty("effect_entries")
  private List<MoveChangeEffectEntriesInner> effectEntries = new ArrayList<>();

  @JsonProperty("type")
  private TypeSummary type;

  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  /**
   * 
   * @return accuracy
   */
  public Integer getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

  /**
   * 
   * @return power
   */
  public Integer getPower() {
    return power;
  }

  public void setPower(Integer power) {
    this.power = power;
  }

  /**
   * 
   * @return pp
   */
  public Integer getPp() {
    return pp;
  }

  public void setPp(Integer pp) {
    this.pp = pp;
  }

  /**
   * 
   * @return effectChance
   */
  public Integer getEffectChance() {
    return effectChance;
  }

  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

  /**
   * 
   * @return effectEntries
   */
  public List<MoveChangeEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * 
   * @return type
   */
  public TypeSummary getType() {
    return type;
  }

  public void setType(TypeSummary type) {
    this.type = type;
  }

  /**
   * 
   * @return versionGroup
   */
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
