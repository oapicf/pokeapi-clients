package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonDetailTypesInner   {

    private Integer slot;
    private AbilityDetailPokemonInnerPokemon type;

    /**
     * Default constructor.
     */
    public PokemonDetailTypesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonDetailTypesInner.
     *
     * @param slot slot
     * @param type type
     */
    public PokemonDetailTypesInner(
        Integer slot, 
        AbilityDetailPokemonInnerPokemon type
    ) {
        this.slot = slot;
        this.type = type;
    }



    /**
     * Get slot
     * @return slot
     */
    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    /**
     * Get type
     * @return type
     */
    public AbilityDetailPokemonInnerPokemon getType() {
        return type;
    }

    public void setType(AbilityDetailPokemonInnerPokemon type) {
        this.type = type;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDetailTypesInner {\n");
        
        sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

