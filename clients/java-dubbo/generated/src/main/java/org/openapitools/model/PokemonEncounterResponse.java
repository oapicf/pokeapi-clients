package org.openapitools.model;

import org.openapitools.model.LocationAreaSummary;
import org.openapitools.model.PokemonEncounterVersionDetailResponse;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonEncounterResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The location area the referenced Pokémon can be encountered in.
   */
  @JsonProperty("location_area")
  private LocationAreaSummary locationArea;

  /**
   * A list of versions and encounters with the referenced Pokémon that might happen.
   */
  @JsonProperty("version_details")
  private List<PokemonEncounterVersionDetailResponse> versionDetails = new ArrayList<>();

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
    return Objects.equals(this.locationArea, pokemonEncounterResponse.locationArea) &&
        Objects.equals(this.versionDetails, pokemonEncounterResponse.versionDetails);
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
