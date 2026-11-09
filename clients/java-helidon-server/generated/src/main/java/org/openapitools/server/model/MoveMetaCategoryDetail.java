package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.MoveMetaCategoryDescription;
import org.openapitools.server.model.MoveSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveMetaCategoryDetail   {

    private Integer id;
    private String name;
    private List<@Valid MoveMetaCategoryDescription> descriptions = new ArrayList<>();
    private List<@Valid MoveSummary> moves = new ArrayList<>();

    /**
     * Default constructor.
     */
    public MoveMetaCategoryDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveMetaCategoryDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param descriptions The description of this resource listed in different languages.
     * @param moves A list of moves that fall into this category.
     */
    public MoveMetaCategoryDetail(
        Integer id, 
        String name, 
        List<@Valid MoveMetaCategoryDescription> descriptions, 
        List<@Valid MoveSummary> moves
    ) {
        this.id = id;
        this.name = name;
        this.descriptions = descriptions;
        this.moves = moves;
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
     * The description of this resource listed in different languages.
     * @return descriptions
     */
    public List<@Valid MoveMetaCategoryDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<@Valid MoveMetaCategoryDescription> descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * A list of moves that fall into this category.
     * @return moves
     */
    public List<@Valid MoveSummary> getMoves() {
        return moves;
    }

    public void setMoves(List<@Valid MoveSummary> moves) {
        this.moves = moves;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveMetaCategoryDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
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

