package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.MoveMetaAilmentName;
import org.openapitools.server.model.MoveSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveMetaAilmentDetail   {

    private Integer id;
    private String name;
    private List<@Valid MoveSummary> moves = new ArrayList<>();
    private List<@Valid MoveMetaAilmentName> names = new ArrayList<>();

    /**
     * Default constructor.
     */
    public MoveMetaAilmentDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveMetaAilmentDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param moves A list of moves that cause this ailment.
     * @param names The name of this resource listed in different languages.
     */
    public MoveMetaAilmentDetail(
        Integer id, 
        String name, 
        List<@Valid MoveSummary> moves, 
        List<@Valid MoveMetaAilmentName> names
    ) {
        this.id = id;
        this.name = name;
        this.moves = moves;
        this.names = names;
    }



    /**
     * The identifier for this resource.
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The name for this resource.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * A list of moves that cause this ailment.
     * @return moves
     */
    public List<@Valid MoveSummary> getMoves() {
        return moves;
    }

    public void setMoves(List<@Valid MoveSummary> moves) {
        this.moves = moves;
    }

    /**
     * The name of this resource listed in different languages.
     * @return names
     */
    public List<@Valid MoveMetaAilmentName> getNames() {
        return names;
    }

    public void setNames(List<@Valid MoveMetaAilmentName> names) {
        this.names = names;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveMetaAilmentDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

