package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LocationAreaDetailEncounterMethodRatesInner  {
  
  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon encounterMethod;

  @ApiModelProperty(required = true, value = "")

  private List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails = new ArrayList<>();
 /**
   * Get encounterMethod
   * @return encounterMethod
  **/
  @JsonProperty("encounter_method")
  public AbilityDetailPokemonInnerPokemon getEncounterMethod() {
    return encounterMethod;
  }

  public void setEncounterMethod(AbilityDetailPokemonInnerPokemon encounterMethod) {
    this.encounterMethod = encounterMethod;
  }

  public LocationAreaDetailEncounterMethodRatesInner encounterMethod(AbilityDetailPokemonInnerPokemon encounterMethod) {
    this.encounterMethod = encounterMethod;
    return this;
  }

 /**
   * Get versionDetails
   * @return versionDetails
  **/
  @JsonProperty("version_details")
  public List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
  }

  public LocationAreaDetailEncounterMethodRatesInner versionDetails(List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public LocationAreaDetailEncounterMethodRatesInner addVersionDetailsItem(LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner versionDetailsItem) {
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
    LocationAreaDetailEncounterMethodRatesInner locationAreaDetailEncounterMethodRatesInner = (LocationAreaDetailEncounterMethodRatesInner) o;
    return Objects.equals(this.encounterMethod, locationAreaDetailEncounterMethodRatesInner.encounterMethod) &&
        Objects.equals(this.versionDetails, locationAreaDetailEncounterMethodRatesInner.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encounterMethod, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaDetailEncounterMethodRatesInner {\n");
    
    sb.append("    encounterMethod: ").append(toIndentedString(encounterMethod)).append("\n");
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

