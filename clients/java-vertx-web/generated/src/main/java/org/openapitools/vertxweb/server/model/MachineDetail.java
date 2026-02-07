package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ItemSummary;
import org.openapitools.vertxweb.server.model.MoveSummary;
import org.openapitools.vertxweb.server.model.VersionGroupSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MachineDetail   {
  
  private Integer id;
  private ItemSummary item;
  private VersionGroupSummary versionGroup;
  private MoveSummary move;

  public MachineDetail () {

  }

  public MachineDetail (Integer id, ItemSummary item, VersionGroupSummary versionGroup, MoveSummary move) {
    this.id = id;
    this.item = item;
    this.versionGroup = versionGroup;
    this.move = move;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("item")
  public ItemSummary getItem() {
    return item;
  }
  public void setItem(ItemSummary item) {
    this.item = item;
  }

    
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

    
  @JsonProperty("move")
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
    return Objects.equals(id, machineDetail.id) &&
        Objects.equals(item, machineDetail.item) &&
        Objects.equals(versionGroup, machineDetail.versionGroup) &&
        Objects.equals(move, machineDetail.move);
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
