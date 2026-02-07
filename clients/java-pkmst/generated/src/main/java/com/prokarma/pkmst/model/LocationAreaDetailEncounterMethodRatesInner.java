package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.AbilityDetailPokemonInnerPokemon;
import com.prokarma.pkmst.model.LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner;
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
 * LocationAreaDetailEncounterMethodRatesInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T15:23:15.032724200Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LocationAreaDetailEncounterMethodRatesInner   {
  @JsonProperty("encounter_method")
  private AbilityDetailPokemonInnerPokemon encounterMethod;

  @JsonProperty("version_details")
  
  private List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails = new ArrayList<>();

  public LocationAreaDetailEncounterMethodRatesInner encounterMethod(AbilityDetailPokemonInnerPokemon encounterMethod) {
    this.encounterMethod = encounterMethod;
    return this;
  }

  /**
   * Get encounterMethod
   * @return encounterMethod
   */
  @ApiModelProperty(required = true, value = "")
  public AbilityDetailPokemonInnerPokemon getEncounterMethod() {
    return encounterMethod;
  }

  public void setEncounterMethod(AbilityDetailPokemonInnerPokemon encounterMethod) {
    this.encounterMethod = encounterMethod;
  }

  public LocationAreaDetailEncounterMethodRatesInner versionDetails(List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public LocationAreaDetailEncounterMethodRatesInner addVersionDetailsItem(LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }
    this.versionDetails.add(versionDetailsItem);
    return this;
  }

  /**
   * Get versionDetails
   * @return versionDetails
   */
  @ApiModelProperty(required = true, value = "")
  public List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

