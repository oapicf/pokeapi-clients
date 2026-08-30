package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner   {

    private AbilityDetailPokemonInnerPokemon version;
    private Integer maxChance;
    private LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails encounterDetails;

    /**
     * Default constructor.
     */
    public LocationAreaDetailPokemonEncountersInnerVersionDetailsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create LocationAreaDetailPokemonEncountersInnerVersionDetailsInner.
     *
     * @param version version
     * @param maxChance maxChance
     * @param encounterDetails encounterDetails
     */
    public LocationAreaDetailPokemonEncountersInnerVersionDetailsInner(
        AbilityDetailPokemonInnerPokemon version, 
        Integer maxChance, 
        LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails encounterDetails
    ) {
        this.version = version;
        this.maxChance = maxChance;
        this.encounterDetails = encounterDetails;
    }



    /**
     * Get version
     * @return version
     */
    public AbilityDetailPokemonInnerPokemon getVersion() {
        return version;
    }

    public void setVersion(AbilityDetailPokemonInnerPokemon version) {
        this.version = version;
    }

    /**
     * Get maxChance
     * @return maxChance
     */
    public Integer getMaxChance() {
        return maxChance;
    }

    public void setMaxChance(Integer maxChance) {
        this.maxChance = maxChance;
    }

    /**
     * Get encounterDetails
     * @return encounterDetails
     */
    public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails getEncounterDetails() {
        return encounterDetails;
    }

    public void setEncounterDetails(LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails encounterDetails) {
        this.encounterDetails = encounterDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner {\n");
        
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    maxChance: ").append(toIndentedString(maxChance)).append("\n");
        sb.append("    encounterDetails: ").append(toIndentedString(encounterDetails)).append("\n");
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

