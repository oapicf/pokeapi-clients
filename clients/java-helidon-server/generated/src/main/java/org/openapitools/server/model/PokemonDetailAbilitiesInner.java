package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonDetailAbilitiesInner   {

    private AbilityDetailPokemonInnerPokemon ability;
    private Boolean isHidden;
    private Integer slot;

    /**
     * Default constructor.
     */
    public PokemonDetailAbilitiesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonDetailAbilitiesInner.
     *
     * @param ability ability
     * @param isHidden isHidden
     * @param slot slot
     */
    public PokemonDetailAbilitiesInner(
        AbilityDetailPokemonInnerPokemon ability, 
        Boolean isHidden, 
        Integer slot
    ) {
        this.ability = ability;
        this.isHidden = isHidden;
        this.slot = slot;
    }



    /**
     * Get ability
     * @return ability
     */
    public AbilityDetailPokemonInnerPokemon getAbility() {
        return ability;
    }

    public void setAbility(AbilityDetailPokemonInnerPokemon ability) {
        this.ability = ability;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDetailAbilitiesInner {\n");
        
        sb.append("    ability: ").append(toIndentedString(ability)).append("\n");
        sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
        sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
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

