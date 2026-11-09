package org.openapitools.server.model;

import org.openapitools.server.model.VersionSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LocationAreaEncounterVersionDetail   {

    private Integer rate;
    private VersionSummary version;

    /**
     * Default constructor.
     */
    public LocationAreaEncounterVersionDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create LocationAreaEncounterVersionDetail.
     *
     * @param rate The chance of an encounter to occur.
     * @param version The version of the game in which the encounter can occur with the given chance.
     */
    public LocationAreaEncounterVersionDetail(
        Integer rate, 
        VersionSummary version
    ) {
        this.rate = rate;
        this.version = version;
    }



    /**
     * The chance of an encounter to occur.
     * @return rate
     */
    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    /**
     * The version of the game in which the encounter can occur with the given chance.
     * @return version
     */
    public VersionSummary getVersion() {
        return version;
    }

    public void setVersion(VersionSummary version) {
        this.version = version;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationAreaEncounterVersionDetail {\n");
        
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

