package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerLocationArea;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokemonEncountersRetrieve200ResponseInner   {
  
  private PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea;

  private List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails = new ArrayList<>();

  /**
   **/
  public PokemonEncountersRetrieve200ResponseInner locationArea(PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea) {
    this.locationArea = locationArea;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("location_area")
  @NotNull
  public PokemonEncountersRetrieve200ResponseInnerLocationArea getLocationArea() {
    return locationArea;
  }
  public void setLocationArea(PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea) {
    this.locationArea = locationArea;
  }


  /**
   **/
  public PokemonEncountersRetrieve200ResponseInner versionDetails(List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("version_details")
  @NotNull
  public List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> getVersionDetails() {
    return versionDetails;
  }
  public void setVersionDetails(List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
  }

  public PokemonEncountersRetrieve200ResponseInner addVersionDetailsItem(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

