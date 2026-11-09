package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaSummary;
import org.openapitools.model.PokemonEncounterVersionDetailResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonEncounterResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonEncounterResponse   {
  private LocationAreaSummary locationArea;
  private List<@Valid PokemonEncounterVersionDetailResponse> versionDetails = new ArrayList<>();

  public PokemonEncounterResponse() {
  }

  @JsonCreator
  public PokemonEncounterResponse(
    @JsonProperty(required = true, value = "location_area") LocationAreaSummary locationArea,
    @JsonProperty(required = true, value = "version_details") List<@Valid PokemonEncounterVersionDetailResponse> versionDetails
  ) {
    this.locationArea = locationArea;
    this.versionDetails = versionDetails;
  }

  /**
   * The location area the referenced Pokémon can be encountered in.
   **/
  public PokemonEncounterResponse locationArea(LocationAreaSummary locationArea) {
    this.locationArea = locationArea;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The location area the referenced Pokémon can be encountered in.")
  @JsonProperty(required = true, value = "location_area")
  @NotNull @Valid public LocationAreaSummary getLocationArea() {
    return locationArea;
  }

  @JsonProperty(required = true, value = "location_area")
  public void setLocationArea(LocationAreaSummary locationArea) {
    this.locationArea = locationArea;
  }

  /**
   * A list of versions and encounters with the referenced Pokémon that might happen.
   **/
  public PokemonEncounterResponse versionDetails(List<@Valid PokemonEncounterVersionDetailResponse> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of versions and encounters with the referenced Pokémon that might happen.")
  @JsonProperty(required = true, value = "version_details")
  @NotNull public List<@Valid PokemonEncounterVersionDetailResponse> getVersionDetails() {
    return versionDetails;
  }

  @JsonProperty(required = true, value = "version_details")
  public void setVersionDetails(List<@Valid PokemonEncounterVersionDetailResponse> versionDetails) {
    this.versionDetails = versionDetails;
  }

  public PokemonEncounterResponse addVersionDetailsItem(PokemonEncounterVersionDetailResponse versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }

    this.versionDetails.add(versionDetailsItem);
    return this;
  }

  public PokemonEncounterResponse removeVersionDetailsItem(PokemonEncounterVersionDetailResponse versionDetailsItem) {
    if (versionDetailsItem != null && this.versionDetails != null) {
      this.versionDetails.remove(versionDetailsItem);
    }

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
