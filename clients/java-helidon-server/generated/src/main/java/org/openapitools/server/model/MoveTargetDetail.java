package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.MoveSummary;
import org.openapitools.server.model.MoveTargetDescription;
import org.openapitools.server.model.MoveTargetName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveTargetDetail   {

    private Integer id;
    private String name;
    private List<@Valid MoveTargetDescription> descriptions = new ArrayList<>();
    private List<@Valid MoveSummary> moves = new ArrayList<>();
    private List<@Valid MoveTargetName> names = new ArrayList<>();

    /**
     * Default constructor.
     */
    public MoveTargetDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveTargetDetail.
     *
     * @param id id
     * @param name name
     * @param descriptions descriptions
     * @param moves moves
     * @param names names
     */
    public MoveTargetDetail(
        Integer id, 
        String name, 
        List<@Valid MoveTargetDescription> descriptions, 
        List<@Valid MoveSummary> moves, 
        List<@Valid MoveTargetName> names
    ) {
        this.id = id;
        this.name = name;
        this.descriptions = descriptions;
        this.moves = moves;
        this.names = names;
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
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get descriptions
     * @return descriptions
     */
    public List<@Valid MoveTargetDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<@Valid MoveTargetDescription> descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * Get moves
     * @return moves
     */
    public List<@Valid MoveSummary> getMoves() {
        return moves;
    }

    public void setMoves(List<@Valid MoveSummary> moves) {
        this.moves = moves;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid MoveTargetName> getNames() {
        return names;
    }

    public void setNames(List<@Valid MoveTargetName> names) {
        this.names = names;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveTargetDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

