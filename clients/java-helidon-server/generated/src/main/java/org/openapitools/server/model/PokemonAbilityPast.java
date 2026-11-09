package org.openapitools.server.model;

import org.openapitools.server.model.AbilitySummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonAbilityPast   {

    private Boolean isHidden;
    private Integer slot;
    private AbilitySummary ability;

    /**
     * Default constructor.
     */
    public PokemonAbilityPast() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonAbilityPast.
     *
     * @param isHidden Whether or not this is a hidden ability.
     * @param slot The slot this ability occupies in this Pokémon species.
     * @param ability The ability the Pokémon may have.
     */
    public PokemonAbilityPast(
        Boolean isHidden, 
        Integer slot, 
        AbilitySummary ability
    ) {
        this.isHidden = isHidden;
        this.slot = slot;
        this.ability = ability;
    }



    /**
     * Whether or not this is a hidden ability.
     * @return isHidden
     */
    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    /**
     * The slot this ability occupies in this Pokémon species.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return slot
     */
    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    /**
     * The ability the Pokémon may have.
     * @return ability
     */
    public AbilitySummary getAbility() {
        return ability;
    }

    public void setAbility(AbilitySummary ability) {
        this.ability = ability;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonAbilityPast {\n");
        
        sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
        sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
        sb.append("    ability: ").append(toIndentedString(ability)).append("\n");
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

