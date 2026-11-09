package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MachineSummary;
import org.openapitools.model.VersionGroupSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ItemMachine")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class ItemMachine   {
  private MachineSummary machine;
  private VersionGroupSummary versionGroup;

  public ItemMachine() {
  }

  @JsonCreator
  public ItemMachine(
    @JsonProperty(required = true, value = "machine") MachineSummary machine,
    @JsonProperty(required = true, value = "version_group") VersionGroupSummary versionGroup
  ) {
    this.machine = machine;
    this.versionGroup = versionGroup;
  }

  /**
   * The machine that teaches a move from an item.
   **/
  public ItemMachine machine(MachineSummary machine) {
    this.machine = machine;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The machine that teaches a move from an item.")
  @JsonProperty(required = true, value = "machine")
  @NotNull @Valid public MachineSummary getMachine() {
    return machine;
  }

  @JsonProperty(required = true, value = "machine")
  public void setMachine(MachineSummary machine) {
    this.machine = machine;
  }

  /**
   * The version group of this specific machine.
   **/
  public ItemMachine versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version group of this specific machine.")
  @JsonProperty(required = true, value = "version_group")
  @NotNull @Valid public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty(required = true, value = "version_group")
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
