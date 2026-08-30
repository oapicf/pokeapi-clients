package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class StatDetailAffectingMovesIncreaseInner   {

    private Integer change;
    private AbilityDetailPokemonInnerPokemon move;

    /**
     * Default constructor.
     */
    public StatDetailAffectingMovesIncreaseInner() {
    // JSON-B / Jackson
    }

    /**
     * Create StatDetailAffectingMovesIncreaseInner.
     *
     * @param change change
     * @param move move
     */
    public StatDetailAffectingMovesIncreaseInner(
        Integer change, 
        AbilityDetailPokemonInnerPokemon move
    ) {
        this.change = change;
        this.move = move;
    }



    /**
     * Get change
     * @return change
     */
    public Integer getChange() {
        return change;
    }

    public void setChange(Integer change) {
        this.change = change;
    }

    /**
     * Get move
     * @return move
     */
    public AbilityDetailPokemonInnerPokemon getMove() {
        return move;
    }

    public void setMove(AbilityDetailPokemonInnerPokemon move) {
        this.move = move;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatDetailAffectingMovesIncreaseInner {\n");
        
        sb.append("    change: ").append(toIndentedString(change)).append("\n");
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

