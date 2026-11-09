package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterMethodSummary;
import org.openapitools.model.LocationAreaEncounterVersionDetail;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LocationAreaEncounterRate  {
  
 /**
  * The method in which Pokémon may be encountered in an area..
  */
  @ApiModelProperty(required = true, value = "The method in which Pokémon may be encountered in an area..")
  @Valid
  private EncounterMethodSummary encounterMethod;

 /**
  * The chance of the encounter to occur on a version of the game.
  */
  @ApiModelProperty(required = true, value = "The chance of the encounter to occur on a version of the game.")
  private List<@Valid LocationAreaEncounterVersionDetail> versionDetails = new ArrayList<>();
 /**
  * The method in which Pokémon may be encountered in an area..
  * @return encounterMethod
  */
  @JsonProperty("encounter_method")
  @NotNull
  public EncounterMethodSummary getEncounterMethod() {
    return encounterMethod;
  }

  /**
   * Sets the <code>encounterMethod</code> property.
   */
 public void setEncounterMethod(EncounterMethodSummary encounterMethod) {
    this.encounterMethod = encounterMethod;
  }

  /**
   * Sets the <code>encounterMethod</code> property.
   */
  public LocationAreaEncounterRate encounterMethod(EncounterMethodSummary encounterMethod) {
    this.encounterMethod = encounterMethod;
    return this;
  }

 /**
  * The chance of the encounter to occur on a version of the game.
  * @return versionDetails
  */
  @JsonProperty("version_details")
  @NotNull
  public List<@Valid LocationAreaEncounterVersionDetail> getVersionDetails() {
    return versionDetails;
  }

  /**
   * Sets the <code>versionDetails</code> property.
   */
 public void setVersionDetails(List<@Valid LocationAreaEncounterVersionDetail> versionDetails) {
    this.versionDetails = versionDetails;
  }

  /**
   * Sets the <code>versionDetails</code> property.
   */
  public LocationAreaEncounterRate versionDetails(List<@Valid LocationAreaEncounterVersionDetail> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  /**
   * Adds a new item to the <code>versionDetails</code> list.
   */
  public LocationAreaEncounterRate addVersionDetailsItem(LocationAreaEncounterVersionDetail versionDetailsItem) {
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
    LocationAreaEncounterRate locationAreaEncounterRate = (LocationAreaEncounterRate) o;
    return Objects.equals(this.encounterMethod, locationAreaEncounterRate.encounterMethod) &&
        Objects.equals(this.versionDetails, locationAreaEncounterRate.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encounterMethod, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaEncounterRate {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

