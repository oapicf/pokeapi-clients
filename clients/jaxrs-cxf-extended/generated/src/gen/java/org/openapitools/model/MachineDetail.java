package org.openapitools.model;

import org.openapitools.model.ItemSummary;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.VersionGroupSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MachineDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ItemSummary item;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private VersionGroupSummary versionGroup;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private MoveSummary move;
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public MachineDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Get item
  * @return item
  */
  @JsonProperty("item")
  @NotNull
  public ItemSummary getItem() {
    return item;
  }

  /**
   * Sets the <code>item</code> property.
   */
 public void setItem(ItemSummary item) {
    this.item = item;
  }

  /**
   * Sets the <code>item</code> property.
   */
  public MachineDetail item(ItemSummary item) {
    this.item = item;
    return this;
  }

 /**
  * Get versionGroup
  * @return versionGroup
  */
  @JsonProperty("version_group")
  @NotNull
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  /**
   * Sets the <code>versionGroup</code> property.
   */
 public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * Sets the <code>versionGroup</code> property.
   */
  public MachineDetail versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

 /**
  * Get move
  * @return move
  */
  @JsonProperty("move")
  @NotNull
  public MoveSummary getMove() {
    return move;
  }

  /**
   * Sets the <code>move</code> property.
   */
 public void setMove(MoveSummary move) {
    this.move = move;
  }

  /**
   * Sets the <code>move</code> property.
   */
  public MachineDetail move(MoveSummary move) {
    this.move = move;
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
    MachineDetail machineDetail = (MachineDetail) o;
    return Objects.equals(this.id, machineDetail.id) &&
        Objects.equals(this.item, machineDetail.item) &&
        Objects.equals(this.versionGroup, machineDetail.versionGroup) &&
        Objects.equals(this.move, machineDetail.move);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, item, versionGroup, move);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
    sb.append("    move: ").append(toIndentedString(move)).append("\n");
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

