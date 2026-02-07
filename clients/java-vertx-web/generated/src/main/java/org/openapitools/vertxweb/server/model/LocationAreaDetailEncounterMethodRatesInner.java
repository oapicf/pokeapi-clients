package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationAreaDetailEncounterMethodRatesInner   {
  
  private AbilityDetailPokemonInnerPokemon encounterMethod;
  private List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails = new ArrayList<>();

  public LocationAreaDetailEncounterMethodRatesInner () {

  }

  public LocationAreaDetailEncounterMethodRatesInner (AbilityDetailPokemonInnerPokemon encounterMethod, List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails) {
    this.encounterMethod = encounterMethod;
    this.versionDetails = versionDetails;
  }

    
  @JsonProperty("encounter_method")
  public AbilityDetailPokemonInnerPokemon getEncounterMethod() {
    return encounterMethod;
  }
  public void setEncounterMethod(AbilityDetailPokemonInnerPokemon encounterMethod) {
    this.encounterMethod = encounterMethod;
  }

    
  @JsonProperty("version_details")
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
    return Objects.equals(encounterMethod, locationAreaDetailEncounterMethodRatesInner.encounterMethod) &&
        Objects.equals(versionDetails, locationAreaDetailEncounterMethodRatesInner.versionDetails);
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
