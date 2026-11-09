package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.LocationAreaSummary;
import org.openapitools.vertxweb.server.model.PokemonEncounterVersionDetailResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonEncounterResponse   {
  
  private LocationAreaSummary locationArea;
  private List<PokemonEncounterVersionDetailResponse> versionDetails = new ArrayList<>();

  public PokemonEncounterResponse () {

  }

  public PokemonEncounterResponse (LocationAreaSummary locationArea, List<PokemonEncounterVersionDetailResponse> versionDetails) {
    this.locationArea = locationArea;
    this.versionDetails = versionDetails;
  }

    
  @JsonProperty("location_area")
  public LocationAreaSummary getLocationArea() {
    return locationArea;
  }
  public void setLocationArea(LocationAreaSummary locationArea) {
    this.locationArea = locationArea;
  }

    
  @JsonProperty("version_details")
  public List<PokemonEncounterVersionDetailResponse> getVersionDetails() {
    return versionDetails;
  }
  public void setVersionDetails(List<PokemonEncounterVersionDetailResponse> versionDetails) {
    this.versionDetails = versionDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonEncounterResponse pokemonEncounterResponse = (PokemonEncounterResponse) o;
    return Objects.equals(locationArea, pokemonEncounterResponse.locationArea) &&
        Objects.equals(versionDetails, pokemonEncounterResponse.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationArea, versionDetails);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
