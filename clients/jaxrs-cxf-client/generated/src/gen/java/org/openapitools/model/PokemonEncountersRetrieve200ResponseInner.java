package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerLocationArea;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonEncountersRetrieve200ResponseInner  {
  
  @ApiModelProperty(required = true, value = "")

  private PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea;

  @ApiModelProperty(required = true, value = "")

  private List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails = new ArrayList<>();
 /**
   * Get locationArea
   * @return locationArea
  **/
  @JsonProperty("location_area")
  public PokemonEncountersRetrieve200ResponseInnerLocationArea getLocationArea() {
    return locationArea;
  }

  public void setLocationArea(PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea) {
    this.locationArea = locationArea;
  }

  public PokemonEncountersRetrieve200ResponseInner locationArea(PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea) {
    this.locationArea = locationArea;
    return this;
  }

 /**
   * Get versionDetails
   * @return versionDetails
  **/
  @JsonProperty("version_details")
  public List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
  }

  public PokemonEncountersRetrieve200ResponseInner versionDetails(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public PokemonEncountersRetrieve200ResponseInner addVersionDetailsItem(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner versionDetailsItem) {
    this.versionDetails.add(versionDetailsItem);
    return this;
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
    return Objects.equals(this.locationArea, pokemonEncountersRetrieve200ResponseInner.locationArea) &&
        Objects.equals(this.versionDetails, pokemonEncountersRetrieve200ResponseInner.versionDetails);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

