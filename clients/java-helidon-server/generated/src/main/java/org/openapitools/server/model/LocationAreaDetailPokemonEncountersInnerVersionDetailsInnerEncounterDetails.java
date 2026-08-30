package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails   {

    private Integer minLevel;
    private Integer maxLevel;
    private AbilityDetailPokemonInnerPokemon conditionValues;
    private Integer chance;
    private AbilityDetailPokemonInnerPokemon method;

    /**
     * Default constructor.
     */
    public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails() {
    // JSON-B / Jackson
    }

    /**
     * Create LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.
     *
     * @param minLevel minLevel
     * @param maxLevel maxLevel
     * @param conditionValues conditionValues
     * @param chance chance
     * @param method method
     */
    public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails(
        Integer minLevel, 
        Integer maxLevel, 
        AbilityDetailPokemonInnerPokemon conditionValues, 
        Integer chance, 
        AbilityDetailPokemonInnerPokemon method
    ) {
        this.minLevel = minLevel;
        this.maxLevel = maxLevel;
        this.conditionValues = conditionValues;
        this.chance = chance;
        this.method = method;
    }



    /**
     * Get minLevel
     * @return minLevel
     */
    public Integer getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    /**
     * Get maxLevel
     * @return maxLevel
     */
    public Integer getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    /**
     * Get conditionValues
     * @return conditionValues
     */
    public AbilityDetailPokemonInnerPokemon getConditionValues() {
        return conditionValues;
    }

    public void setConditionValues(AbilityDetailPokemonInnerPokemon conditionValues) {
        this.conditionValues = conditionValues;
    }

    /**
     * Get chance
     * @return chance
     */
    public Integer getChance() {
        return chance;
    }

    public void setChance(Integer chance) {
        this.chance = chance;
    }

    /**
     * Get method
     * @return method
     */
    public AbilityDetailPokemonInnerPokemon getMethod() {
        return method;
    }

    public void setMethod(AbilityDetailPokemonInnerPokemon method) {
        this.method = method;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails {\n");
        
        sb.append("    minLevel: ").append(toIndentedString(minLevel)).append("\n");
        sb.append("    maxLevel: ").append(toIndentedString(maxLevel)).append("\n");
        sb.append("    conditionValues: ").append(toIndentedString(conditionValues)).append("\n");
        sb.append("    chance: ").append(toIndentedString(chance)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

