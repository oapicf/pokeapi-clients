package apimodels;

import apimodels.ItemSummary;
import apimodels.MoveSummary;
import apimodels.VersionGroupSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MachineDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MachineDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("item")
  @NotNull
@Valid

  private ItemSummary item;

  @JsonProperty("version_group")
  @NotNull
@Valid

  private VersionGroupSummary versionGroup;

  @JsonProperty("move")
  @NotNull
@Valid

  private MoveSummary move;

  public MachineDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MachineDetail item(ItemSummary item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

