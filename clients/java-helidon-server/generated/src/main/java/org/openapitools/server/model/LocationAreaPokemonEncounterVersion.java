package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.LocationAreaEncounterDetail;
import org.openapitools.server.model.VersionSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LocationAreaPokemonEncounterVersion   {

    private VersionSummary version;
    private Integer maxChance;
    private List<@Valid LocationAreaEncounterDetail> encounterDetails = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LocationAreaPokemonEncounterVersion() {
    // JSON-B / Jackson
    }

    /**
     * Create LocationAreaPokemonEncounterVersion.
     *
     * @param version The game version this encounter happens in.
     * @param maxChance The total percentage of all encounter potential.
     * @param encounterDetails A list of encounters and their specifics.
     */
    public LocationAreaPokemonEncounterVersion(
        VersionSummary version, 
        Integer maxChance, 
        List<@Valid LocationAreaEncounterDetail> encounterDetails
    ) {
        this.version = version;
        this.maxChance = maxChance;
        this.encounterDetails = encounterDetails;
    }



    /**
     * The game version this encounter happens in.
     * @return version
     */
    public VersionSummary getVersion() {
        return version;
    }

    public void setVersion(VersionSummary version) {
        this.version = version;
    }

    /**
     * The total percentage of all encounter potential.
     * @return maxChance
     */
    public Integer getMaxChance() {
        return maxChance;
    }

    public void setMaxChance(Integer maxChance) {
        this.maxChance = maxChance;
    }

    /**
     * A list of encounters and their specifics.
     * @return encounterDetails
     */
    public List<@Valid LocationAreaEncounterDetail> getEncounterDetails() {
        return encounterDetails;
    }

    public void setEncounterDetails(List<@Valid LocationAreaEncounterDetail> encounterDetails) {
        this.encounterDetails = encounterDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationAreaPokemonEncounterVersion {\n");
        
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

