package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.EncounterConditionValueSummary;
import org.openapitools.server.model.EncounterMethodSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonEncounterDetailResponse   {

    private Integer chance;
    private List<@Valid EncounterConditionValueSummary> conditionValues = new ArrayList<>();
    private Integer maxLevel;
    private EncounterMethodSummary method;
    private Integer minLevel;

    /**
     * Default constructor.
     */
    public PokemonEncounterDetailResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonEncounterDetailResponse.
     *
     * @param chance Percent chance that this encounter will occur.
     * @param conditionValues A list of condition values that must be in effect for this encounter to occur.
     * @param maxLevel The highest level the Pokémon could be encountered at.
     * @param method The method by which this encounter happens.
     * @param minLevel The lowest level the Pokémon could be encountered at.
     */
    public PokemonEncounterDetailResponse(
        Integer chance, 
        List<@Valid EncounterConditionValueSummary> conditionValues, 
        Integer maxLevel, 
        EncounterMethodSummary method, 
        Integer minLevel
    ) {
        this.chance = chance;
        this.conditionValues = conditionValues;
        this.maxLevel = maxLevel;
        this.method = method;
        this.minLevel = minLevel;
    }



    /**
     * Percent chance that this encounter will occur.
     * @return chance
     */
    public Integer getChance() {
        return chance;
    }

    public void setChance(Integer chance) {
        this.chance = chance;
    }

    /**
     * A list of condition values that must be in effect for this encounter to occur.
     * @return conditionValues
     */
    public List<@Valid EncounterConditionValueSummary> getConditionValues() {
        return conditionValues;
    }

    public void setConditionValues(List<@Valid EncounterConditionValueSummary> conditionValues) {
        this.conditionValues = conditionValues;
    }

    /**
     * The highest level the Pokémon could be encountered at.
     * @return maxLevel
     */
    public Integer getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    /**
     * The method by which this encounter happens.
     * @return method
     */
    public EncounterMethodSummary getMethod() {
        return method;
    }

    public void setMethod(EncounterMethodSummary method) {
        this.method = method;
    }

    /**
     * The lowest level the Pokémon could be encountered at.
     * @return minLevel
     */
    public Integer getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonEncounterDetailResponse {\n");
        
        sb.append("    chance: ").append(toIndentedString(chance)).append("\n");
        sb.append("    conditionValues: ").append(toIndentedString(conditionValues)).append("\n");
        sb.append("    maxLevel: ").append(toIndentedString(maxLevel)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    minLevel: ").append(toIndentedString(minLevel)).append("\n");
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

