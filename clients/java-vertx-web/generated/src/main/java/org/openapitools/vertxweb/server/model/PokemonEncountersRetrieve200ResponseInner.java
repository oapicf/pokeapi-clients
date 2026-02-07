package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.PokemonEncountersRetrieve200ResponseInnerLocationArea;
import org.openapitools.vertxweb.server.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonEncountersRetrieve200ResponseInner   {
  
  private PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea;
  private List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails = new ArrayList<>();

  public PokemonEncountersRetrieve200ResponseInner () {

  }

  public PokemonEncountersRetrieve200ResponseInner (PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea, List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails) {
    this.locationArea = locationArea;
    this.versionDetails = versionDetails;
  }

    
  @JsonProperty("location_area")
  public PokemonEncountersRetrieve200ResponseInnerLocationArea getLocationArea() {
    return locationArea;
  }
  public void setLocationArea(PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea) {
    this.locationArea = locationArea;
  }

    
  @JsonProperty("version_details")
  public List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> getVersionDetails() {
    return versionDetails;
  }
  public void setVersionDetails(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails) {
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
    PokemonEncountersRetrieve200ResponseInner pokemonEncountersRetrieve200ResponseInner = (PokemonEncountersRetrieve200ResponseInner) o;
    return Objects.equals(locationArea, pokemonEncountersRetrieve200ResponseInner.locationArea) &&
        Objects.equals(versionDetails, pokemonEncountersRetrieve200ResponseInner.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationArea, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonEncountersRetrieve200ResponseInner {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
