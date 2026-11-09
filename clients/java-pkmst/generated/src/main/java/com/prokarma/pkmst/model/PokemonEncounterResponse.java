package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.LocationAreaSummary;
import com.prokarma.pkmst.model.PokemonEncounterVersionDetailResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokemonEncounterResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonEncounterResponse   {
  @JsonProperty("location_area")
  private LocationAreaSummary locationArea;

  @JsonProperty("version_details")
  
  private List<PokemonEncounterVersionDetailResponse> versionDetails = new ArrayList<>();

  public PokemonEncounterResponse locationArea(LocationAreaSummary locationArea) {
    this.locationArea = locationArea;
    return this;
  }

  /**
   * The location area the referenced Pokémon can be encountered in.
   * @return locationArea
   */
  @ApiModelProperty(required = true, value = "The location area the referenced Pokémon can be encountered in.")
  public LocationAreaSummary getLocationArea() {
    return locationArea;
  }

  public void setLocationArea(LocationAreaSummary locationArea) {
    this.locationArea = locationArea;
  }

  public PokemonEncounterResponse versionDetails(List<PokemonEncounterVersionDetailResponse> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public PokemonEncounterResponse addVersionDetailsItem(PokemonEncounterVersionDetailResponse versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }
    this.versionDetails.add(versionDetailsItem);
    return this;
  }

  /**
   * A list of versions and encounters with the referenced Pokémon that might happen.
   * @return versionDetails
   */
  @ApiModelProperty(required = true, value = "A list of versions and encounters with the referenced Pokémon that might happen.")
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

