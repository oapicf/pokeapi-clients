package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokeathlonStatDetailAffectingNaturesDecreaseInner   {

    private Integer maxChange;
    private AbilityDetailPokemonInnerPokemon nature;

    /**
     * Default constructor.
     */
    public PokeathlonStatDetailAffectingNaturesDecreaseInner() {
    // JSON-B / Jackson
    }

    /**
     * Create PokeathlonStatDetailAffectingNaturesDecreaseInner.
     *
     * @param maxChange maxChange
     * @param nature nature
     */
    public PokeathlonStatDetailAffectingNaturesDecreaseInner(
        Integer maxChange, 
        AbilityDetailPokemonInnerPokemon nature
    ) {
        this.maxChange = maxChange;
        this.nature = nature;
    }



    /**
     * Get maxChange
     * maximum: -1
     * @return maxChange
     */
    public Integer getMaxChange() {
        return maxChange;
    }

    public void setMaxChange(Integer maxChange) {
        this.maxChange = maxChange;
    }

    /**
     * Get nature
     * @return nature
     */
    public AbilityDetailPokemonInnerPokemon getNature() {
        return nature;
    }

    public void setNature(AbilityDetailPokemonInnerPokemon nature) {
        this.nature = nature;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokeathlonStatDetailAffectingNaturesDecreaseInner {\n");
        
        sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
        sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
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

