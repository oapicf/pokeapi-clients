package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.MoveChangeEffectEntriesInner;
import org.openapitools.vertxweb.server.model.TypeSummary;
import org.openapitools.vertxweb.server.model.VersionGroupSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveChange   {
  
  private Integer accuracy;
  private Integer power;
  private Integer pp;
  private Integer effectChance;
  private List<MoveChangeEffectEntriesInner> effectEntries = new ArrayList<>();
  private TypeSummary type;
  private VersionGroupSummary versionGroup;

  public MoveChange () {

  }

  public MoveChange (Integer accuracy, Integer power, Integer pp, Integer effectChance, List<MoveChangeEffectEntriesInner> effectEntries, TypeSummary type, VersionGroupSummary versionGroup) {
    this.accuracy = accuracy;
    this.power = power;
    this.pp = pp;
    this.effectChance = effectChance;
    this.effectEntries = effectEntries;
    this.type = type;
    this.versionGroup = versionGroup;
  }

    
  @JsonProperty("accuracy")
  public Integer getAccuracy() {
    return accuracy;
  }
  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

    
  @JsonProperty("power")
  public Integer getPower() {
    return power;
  }
  public void setPower(Integer power) {
    this.power = power;
  }

    
  @JsonProperty("pp")
  public Integer getPp() {
    return pp;
  }
  public void setPp(Integer pp) {
    this.pp = pp;
  }

    
  @JsonProperty("effect_chance")
  public Integer getEffectChance() {
    return effectChance;
  }
  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

    
  @JsonProperty("effect_entries")
  public List<MoveChangeEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

    
  @JsonProperty("type")
  public TypeSummary getType() {
    return type;
  }
  public void setType(TypeSummary type) {
    this.type = type;
  }

    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
