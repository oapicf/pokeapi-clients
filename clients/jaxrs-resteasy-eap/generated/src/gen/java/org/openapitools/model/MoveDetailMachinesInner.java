package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.MoveDetailMachinesInnerMachine;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-02-07T04:17:52.397146649Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDetailMachinesInner   {
  
  private MoveDetailMachinesInnerMachine machine;
  private AbilityDetailPokemonInnerPokemon versionGroup;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("machine")
  @NotNull
  public MoveDetailMachinesInnerMachine getMachine() {
    return machine;
  }
  public void setMachine(MoveDetailMachinesInnerMachine machine) {
    this.machine = machine;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("version_group")
  @NotNull
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

