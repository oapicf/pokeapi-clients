package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.EncounterConditionValueSummary;
import org.openapitools.server.model.EncounterMethodSummary;
import org.openapitools.server.model.EncounterPokemonDetail;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LocationAreaEncounterDetail   {

    private Integer minLevel;
    private Integer maxLevel;
    private Integer chance = 0;
    private EncounterMethodSummary method;
    private List<@Valid EncounterConditionValueSummary> conditionValues = new ArrayList<>();
    private EncounterPokemonDetail pokemonDetails;

    /**
     * Default constructor.
     */
    public LocationAreaEncounterDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create LocationAreaEncounterDetail.
     *
     * @param minLevel The lowest level the Pokémon could be encountered at.
     * @param maxLevel The highest level the Pokémon could be encountered at.
     * @param chance Percent chance that this encounter will occur.
     * @param method The method by which this encounter happens.
     * @param conditionValues A list of condition values that must be in effect for this encounter to occur.
     * @param pokemonDetails Additional properties of the encountered Pokémon, or null if unspecified.
     */
    public LocationAreaEncounterDetail(
        Integer minLevel, 
        Integer maxLevel, 
        Integer chance, 
        EncounterMethodSummary method, 
        List<@Valid EncounterConditionValueSummary> conditionValues, 
        EncounterPokemonDetail pokemonDetails
    ) {
        this.minLevel = minLevel;
        this.maxLevel = maxLevel;
        this.chance = chance;
        this.method = method;
        this.conditionValues = conditionValues;
        this.pokemonDetails = pokemonDetails;
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
     * Additional properties of the encountered Pokémon, or null if unspecified.
     * @return pokemonDetails
     */
    public EncounterPokemonDetail getPokemonDetails() {
        return pokemonDetails;
    }

    public void setPokemonDetails(EncounterPokemonDetail pokemonDetails) {
        this.pokemonDetails = pokemonDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationAreaEncounterDetail {\n");
        
        sb.append("    minLevel: ").append(toIndentedString(minLevel)).append("\n");
        sb.append("    maxLevel: ").append(toIndentedString(maxLevel)).append("\n");
        sb.append("    chance: ").append(toIndentedString(chance)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    conditionValues: ").append(toIndentedString(conditionValues)).append("\n");
        sb.append("    pokemonDetails: ").append(toIndentedString(pokemonDetails)).append("\n");
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

