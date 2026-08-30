package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LocationAreaDetailEncounterMethodRatesInner   {

    private AbilityDetailPokemonInnerPokemon encounterMethod;
    private List<@Valid LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LocationAreaDetailEncounterMethodRatesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create LocationAreaDetailEncounterMethodRatesInner.
     *
     * @param encounterMethod encounterMethod
     * @param versionDetails versionDetails
     */
    public LocationAreaDetailEncounterMethodRatesInner(
        AbilityDetailPokemonInnerPokemon encounterMethod, 
        List<@Valid LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails
    ) {
        this.encounterMethod = encounterMethod;
        this.versionDetails = versionDetails;
    }



    /**
     * Get encounterMethod
     * @return encounterMethod
     */
    public AbilityDetailPokemonInnerPokemon getEncounterMethod() {
        return encounterMethod;
    }

    public void setEncounterMethod(AbilityDetailPokemonInnerPokemon encounterMethod) {
        this.encounterMethod = encounterMethod;
    }

    /**
     * Get versionDetails
     * @return versionDetails
     */
    public List<@Valid LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<@Valid LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails) {
        this.versionDetails = versionDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationAreaDetailEncounterMethodRatesInner {\n");
        
        sb.append("    encounterMethod: ").append(toIndentedString(encounterMethod)).append("\n");
        sb.append("    versionDetails: ").append(toIndentedString(versionDetails)).append("\n");
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

