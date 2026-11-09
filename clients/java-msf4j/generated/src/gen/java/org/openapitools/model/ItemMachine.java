package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MachineSummary;
import org.openapitools.model.VersionGroupSummary;

/**
 * ItemMachine
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class ItemMachine   {
  @JsonProperty("machine")
  private MachineSummary machine;

  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  public ItemMachine machine(MachineSummary machine) {
    this.machine = machine;
    return this;
  }

   /**
   * The machine that teaches a move from an item.
   * @return machine
  **/
  @ApiModelProperty(required = true, value = "The machine that teaches a move from an item.")
  public MachineSummary getMachine() {
    return machine;
  }

  public void setMachine(MachineSummary machine) {
    this.machine = machine;
  }

  public ItemMachine versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

   /**
   * The version group of this specific machine.
   * @return versionGroup
  **/
  @ApiModelProperty(required = true, value = "The version group of this specific machine.")
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

