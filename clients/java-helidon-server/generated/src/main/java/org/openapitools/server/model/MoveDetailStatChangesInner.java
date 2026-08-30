package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveDetailStatChangesInner   {

    private Integer change;
    private AbilityDetailPokemonInnerPokemon stat;

    /**
     * Default constructor.
     */
    public MoveDetailStatChangesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveDetailStatChangesInner.
     *
     * @param change change
     * @param stat stat
     */
    public MoveDetailStatChangesInner(
        Integer change, 
        AbilityDetailPokemonInnerPokemon stat
    ) {
        this.change = change;
        this.stat = stat;
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
     * Get stat
     * @return stat
     */
    public AbilityDetailPokemonInnerPokemon getStat() {
        return stat;
    }

    public void setStat(AbilityDetailPokemonInnerPokemon stat) {
        this.stat = stat;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveDetailStatChangesInner {\n");
        
        sb.append("    change: ").append(toIndentedString(change)).append("\n");
        sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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

