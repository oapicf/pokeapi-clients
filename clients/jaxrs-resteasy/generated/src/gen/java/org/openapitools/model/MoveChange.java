package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveChangeEffectEntriesInner;
import org.openapitools.model.TypeSummary;
import org.openapitools.model.VersionGroupSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-07T04:17:47.675703185Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveChange   {
  
  private Integer accuracy;
  private Integer power;
  private Integer pp;
  private Integer effectChance;
  private List<@Valid MoveChangeEffectEntriesInner> effectEntries = new ArrayList<>();
  private TypeSummary type;
  private VersionGroupSummary versionGroup;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accuracy")
  public Integer getAccuracy() {
    return accuracy;
  }
  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("power")
  public Integer getPower() {
    return power;
  }
  public void setPower(Integer power) {
    this.power = power;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pp")
  public Integer getPp() {
    return pp;
  }
  public void setPp(Integer pp) {
    this.pp = pp;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("effect_chance")
  @NotNull
  public Integer getEffectChance() {
    return effectChance;
  }
  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("effect_entries")
  @NotNull
  @Valid
  public List<@Valid MoveChangeEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<@Valid MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull
  @Valid
  public TypeSummary getType() {
    return type;
  }
  public void setType(TypeSummary type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("version_group")
  @NotNull
  @Valid
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

