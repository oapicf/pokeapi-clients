package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class NatureDetailPokeathlonStatChangesInner   {

    private Integer maxChange;
    private AbilityDetailPokemonInnerPokemon pokeathlonStat;

    /**
     * Default constructor.
     */
    public NatureDetailPokeathlonStatChangesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create NatureDetailPokeathlonStatChangesInner.
     *
     * @param maxChange maxChange
     * @param pokeathlonStat pokeathlonStat
     */
    public NatureDetailPokeathlonStatChangesInner(
        Integer maxChange, 
        AbilityDetailPokemonInnerPokemon pokeathlonStat
    ) {
        this.maxChange = maxChange;
        this.pokeathlonStat = pokeathlonStat;
    }



    /**
     * Get maxChange
     * @return maxChange
     */
    public Integer getMaxChange() {
        return maxChange;
    }

    public void setMaxChange(Integer maxChange) {
        this.maxChange = maxChange;
    }

    /**
     * Get pokeathlonStat
     * @return pokeathlonStat
     */
    public AbilityDetailPokemonInnerPokemon getPokeathlonStat() {
        return pokeathlonStat;
    }

    public void setPokeathlonStat(AbilityDetailPokemonInnerPokemon pokeathlonStat) {
        this.pokeathlonStat = pokeathlonStat;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NatureDetailPokeathlonStatChangesInner {\n");
        
        sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
        sb.append("    pokeathlonStat: ").append(toIndentedString(pokeathlonStat)).append("\n");
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

