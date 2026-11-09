package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.EncounterMethodSummary;
import org.openapitools.server.model.LocationAreaEncounterVersionDetail;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LocationAreaEncounterRate   {

    private EncounterMethodSummary encounterMethod;
    private List<@Valid LocationAreaEncounterVersionDetail> versionDetails = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LocationAreaEncounterRate() {
    // JSON-B / Jackson
    }

    /**
     * Create LocationAreaEncounterRate.
     *
     * @param encounterMethod The method in which Pokémon may be encountered in an area..
     * @param versionDetails The chance of the encounter to occur on a version of the game.
     */
    public LocationAreaEncounterRate(
        EncounterMethodSummary encounterMethod, 
        List<@Valid LocationAreaEncounterVersionDetail> versionDetails
    ) {
        this.encounterMethod = encounterMethod;
        this.versionDetails = versionDetails;
    }



    /**
     * The method in which Pokémon may be encountered in an area..
     * @return encounterMethod
     */
    public EncounterMethodSummary getEncounterMethod() {
        return encounterMethod;
    }

    public void setEncounterMethod(EncounterMethodSummary encounterMethod) {
        this.encounterMethod = encounterMethod;
    }

    /**
     * The chance of the encounter to occur on a version of the game.
     * @return versionDetails
     */
    public List<@Valid LocationAreaEncounterVersionDetail> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<@Valid LocationAreaEncounterVersionDetail> versionDetails) {
        this.versionDetails = versionDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationAreaEncounterRate {\n");
        
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

