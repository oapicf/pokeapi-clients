package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterMethodSummary;
import org.openapitools.model.LocationAreaEncounterVersionDetail;

/**
 * LocationAreaEncounterRate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaEncounterRate   {
  @JsonProperty("encounter_method")
  private EncounterMethodSummary encounterMethod;

  @JsonProperty("version_details")
  private List<@Valid LocationAreaEncounterVersionDetail> versionDetails = new ArrayList<>();

  public LocationAreaEncounterRate encounterMethod(EncounterMethodSummary encounterMethod) {
    this.encounterMethod = encounterMethod;
    return this;
  }

   /**
   * The method in which Pokémon may be encountered in an area..
   * @return encounterMethod
  **/
  @ApiModelProperty(required = true, value = "The method in which Pokémon may be encountered in an area..")
  public EncounterMethodSummary getEncounterMethod() {
    return encounterMethod;
  }

  public void setEncounterMethod(EncounterMethodSummary encounterMethod) {
    this.encounterMethod = encounterMethod;
  }

  public LocationAreaEncounterRate versionDetails(List<@Valid LocationAreaEncounterVersionDetail> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public LocationAreaEncounterRate addVersionDetailsItem(LocationAreaEncounterVersionDetail versionDetailsItem) {
    this.versionDetails.add(versionDetailsItem);
    return this;
  }

   /**
   * The chance of the encounter to occur on a version of the game.
   * @return versionDetails
  **/
  @ApiModelProperty(required = true, value = "The chance of the encounter to occur on a version of the game.")
  public List<@Valid LocationAreaEncounterVersionDetail> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<@Valid LocationAreaEncounterVersionDetail> versionDetails) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

