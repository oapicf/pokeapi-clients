package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.MoveMetaCategoryDescription;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveMetaCategoryDetail   {

    private Integer id;
    private String name;
    private List<@Valid MoveMetaCategoryDescription> descriptions = new ArrayList<>();
    private List<@Valid AbilityDetailPokemonInnerPokemon> moves = new ArrayList<>();

    /**
     * Default constructor.
     */
    public MoveMetaCategoryDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveMetaCategoryDetail.
     *
     * @param id id
     * @param name name
     * @param descriptions descriptions
     * @param moves moves
     */
    public MoveMetaCategoryDetail(
        Integer id, 
        String name, 
        List<@Valid MoveMetaCategoryDescription> descriptions, 
        List<@Valid AbilityDetailPokemonInnerPokemon> moves
    ) {
        this.id = id;
        this.name = name;
        this.descriptions = descriptions;
        this.moves = moves;
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
    public List<@Valid MoveMetaCategoryDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<@Valid MoveMetaCategoryDescription> descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * Get moves
     * @return moves
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getMoves() {
        return moves;
    }

    public void setMoves(List<@Valid AbilityDetailPokemonInnerPokemon> moves) {
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

