package org.openapitools.model;

import org.openapitools.model.MachineSummary;
import org.openapitools.model.VersionGroupSummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class ItemMachine implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The machine that teaches a move from an item.
   */
  @JsonProperty("machine")
  private MachineSummary machine;

  /**
   * The version group of this specific machine.
   */
  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  /**
   * The machine that teaches a move from an item.
   * @return machine
   */
  public MachineSummary getMachine() {
    return machine;
  }

  public void setMachine(MachineSummary machine) {
    this.machine = machine;
  }

  /**
   * The version group of this specific machine.
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
    ItemMachine itemMachine = (ItemMachine) o;
    return Objects.equals(this.machine, itemMachine.machine) &&
        Objects.equals(this.versionGroup, itemMachine.versionGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(machine, versionGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemMachine {\n");
    
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
