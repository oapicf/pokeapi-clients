package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AbilityDetailPokemonInner   {

    private Boolean isHidden;
    private Integer slot;
    private AbilityDetailPokemonInnerPokemon pokemon;

    /**
     * Default constructor.
     */
    public AbilityDetailPokemonInner() {
    // JSON-B / Jackson
    }

    /**
     * Create AbilityDetailPokemonInner.
     *
     * @param isHidden isHidden
     * @param slot slot
     * @param pokemon pokemon
     */
    public AbilityDetailPokemonInner(
        Boolean isHidden, 
        Integer slot, 
        AbilityDetailPokemonInnerPokemon pokemon
    ) {
        this.isHidden = isHidden;
        this.slot = slot;
        this.pokemon = pokemon;
    }



    /**
     * Get isHidden
     * @return isHidden
     */
    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
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
     * Get pokemon
     * @return pokemon
     */
    public AbilityDetailPokemonInnerPokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(AbilityDetailPokemonInnerPokemon pokemon) {
        this.pokemon = pokemon;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbilityDetailPokemonInner {\n");
        
        sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
        sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
        sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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

