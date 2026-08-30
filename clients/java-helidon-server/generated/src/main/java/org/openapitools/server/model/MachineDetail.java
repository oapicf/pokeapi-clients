package org.openapitools.server.model;

import org.openapitools.server.model.ItemSummary;
import org.openapitools.server.model.MoveSummary;
import org.openapitools.server.model.VersionGroupSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MachineDetail   {

    private Integer id;
    private ItemSummary item;
    private VersionGroupSummary versionGroup;
    private MoveSummary move;

    /**
     * Default constructor.
     */
    public MachineDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create MachineDetail.
     *
     * @param id id
     * @param item item
     * @param versionGroup versionGroup
     * @param move move
     */
    public MachineDetail(
        Integer id, 
        ItemSummary item, 
        VersionGroupSummary versionGroup, 
        MoveSummary move
    ) {
        this.id = id;
        this.item = item;
        this.versionGroup = versionGroup;
        this.move = move;
    }



    /**
     * Get id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get item
     * @return item
     */
    public ItemSummary getItem() {
        return item;
    }

    public void setItem(ItemSummary item) {
        this.item = item;
    }

    /**
     * Get versionGroup
     * @return versionGroup
     */
    public VersionGroupSummary getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
     * Get move
     * @return move
     */
    public MoveSummary getMove() {
        return move;
    }

    public void setMove(MoveSummary move) {
        this.move = move;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

