package org.openapitools.model;

import java.net.URI;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ItemDetailMachinesInner implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("machine")
  private URI machine;

  @JsonProperty("version_group")
  private AbilityDetailPokemonInnerPokemon versionGroup;

  /**
   * 
   * @return machine
   */
  public URI getMachine() {
    return machine;
  }

  public void setMachine(URI machine) {
    this.machine = machine;
  }

  /**
   * 
   * @return versionGroup
   */
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
    ItemDetailMachinesInner itemDetailMachinesInner = (ItemDetailMachinesInner) o;
    return Objects.equals(this.machine, itemDetailMachinesInner.machine) &&
        Objects.equals(this.versionGroup, itemDetailMachinesInner.versionGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(machine, versionGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDetailMachinesInner {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
