package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.MoveDetailMachinesInnerMachine;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveDetailMachinesInner  {
  
  @ApiModelProperty(required = true, value = "")

  private MoveDetailMachinesInnerMachine machine;

  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon versionGroup;
 /**
   * Get machine
   * @return machine
  **/
  @JsonProperty("machine")
  public MoveDetailMachinesInnerMachine getMachine() {
    return machine;
  }

  public void setMachine(MoveDetailMachinesInnerMachine machine) {
    this.machine = machine;
  }

  public MoveDetailMachinesInner machine(MoveDetailMachinesInnerMachine machine) {
    this.machine = machine;
    return this;
  }

 /**
   * Get versionGroup
   * @return versionGroup
  **/
  @JsonProperty("version_group")
  public AbilityDetailPokemonInnerPokemon getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(AbilityDetailPokemonInnerPokemon versionGroup) {
    this.versionGroup = versionGroup;
  }

  public MoveDetailMachinesInner versionGroup(AbilityDetailPokemonInnerPokemon versionGroup) {
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
    MoveDetailMachinesInner moveDetailMachinesInner = (MoveDetailMachinesInner) o;
    return Objects.equals(this.machine, moveDetailMachinesInner.machine) &&
        Objects.equals(this.versionGroup, moveDetailMachinesInner.versionGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(machine, versionGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveDetailMachinesInner {\n");
    
    sb.append("    machine: ").append(toIndentedString(machine)).append("\n");
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

