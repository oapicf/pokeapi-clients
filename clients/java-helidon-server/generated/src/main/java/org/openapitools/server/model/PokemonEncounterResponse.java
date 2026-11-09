package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.LocationAreaSummary;
import org.openapitools.server.model.PokemonEncounterVersionDetailResponse;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonEncounterResponse   {

    private LocationAreaSummary locationArea;
    private List<@Valid PokemonEncounterVersionDetailResponse> versionDetails = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokemonEncounterResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonEncounterResponse.
     *
     * @param locationArea The location area the referenced Pokémon can be encountered in.
     * @param versionDetails A list of versions and encounters with the referenced Pokémon that might happen.
     */
    public PokemonEncounterResponse(
        LocationAreaSummary locationArea, 
        List<@Valid PokemonEncounterVersionDetailResponse> versionDetails
    ) {
        this.locationArea = locationArea;
        this.versionDetails = versionDetails;
    }



    /**
     * The location area the referenced Pokémon can be encountered in.
     * @return locationArea
     */
    public LocationAreaSummary getLocationArea() {
        return locationArea;
    }

    public void setLocationArea(LocationAreaSummary locationArea) {
        this.locationArea = locationArea;
    }

    /**
     * A list of versions and encounters with the referenced Pokémon that might happen.
     * @return versionDetails
     */
    public List<@Valid PokemonEncounterVersionDetailResponse> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<@Valid PokemonEncounterVersionDetailResponse> versionDetails) {
        this.versionDetails = versionDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonEncounterResponse {\n");
        
        sb.append("    locationArea: ").append(toIndentedString(locationArea)).append("\n");
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

