package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.MoveDetailMachinesInnerMachine;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveDetailMachinesInner   {
  
  private MoveDetailMachinesInnerMachine machine;
  private AbilityDetailPokemonInnerPokemon versionGroup;

  public MoveDetailMachinesInner () {

  }

  public MoveDetailMachinesInner (MoveDetailMachinesInnerMachine machine, AbilityDetailPokemonInnerPokemon versionGroup) {
    this.machine = machine;
    this.versionGroup = versionGroup;
  }

    
  @JsonProperty("machine")
  public MoveDetailMachinesInnerMachine getMachine() {
    return machine;
  }
  public void setMachine(MoveDetailMachinesInnerMachine machine) {
    this.machine = machine;
  }

    
  @JsonProperty("version_group")
  public AbilityDetailPokemonInnerPokemon getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(AbilityDetailPokemonInnerPokemon versionGroup) {
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
    MoveDetailMachinesInner moveDetailMachinesInner = (MoveDetailMachinesInner) o;
    return Objects.equals(machine, moveDetailMachinesInner.machine) &&
        Objects.equals(versionGroup, moveDetailMachinesInner.versionGroup);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
