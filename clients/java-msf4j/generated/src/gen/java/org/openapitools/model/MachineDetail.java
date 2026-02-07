package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.VersionGroupSummary;

/**
 * MachineDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T15:23:10.683633502Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MachineDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("item")
  private ItemSummary item;

  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  @JsonProperty("move")
  private MoveSummary move;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public MachineDetail item(ItemSummary item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(required = true, value = "")
  public ItemSummary getItem() {
    return item;
  }

  public void setItem(ItemSummary item) {
    this.item = item;
  }

  public MachineDetail versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

   /**
   * Get versionGroup
   * @return versionGroup
  **/
  @ApiModelProperty(required = true, value = "")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public MachineDetail move(MoveSummary move) {
    this.move = move;
    return this;
  }

   /**
   * Get move
   * @return move
  **/
  @ApiModelProperty(required = true, value = "")
  public MoveSummary getMove() {
    return move;
  }

  public void setMove(MoveSummary move) {
    this.move = move;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

