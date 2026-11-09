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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaEncounterRate   {
  @JsonProperty("encounter_method")
  private EncounterMethodSummary encounterMethod;

  @JsonProperty("version_details")
  private List<LocationAreaEncounterVersionDetail> versionDetails = new ArrayList<>();

  /**
   * The method in which Pokémon may be encountered in an area..
   **/
  public LocationAreaEncounterRate encounterMethod(EncounterMethodSummary encounterMethod) {
    this.encounterMethod = encounterMethod;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The method in which Pokémon may be encountered in an area..")
  @JsonProperty("encounter_method")
  public EncounterMethodSummary getEncounterMethod() {
    return encounterMethod;
  }
  public void setEncounterMethod(EncounterMethodSummary encounterMethod) {
    this.encounterMethod = encounterMethod;
  }

  /**
   * The chance of the encounter to occur on a version of the game.
   **/
  public LocationAreaEncounterRate versionDetails(List<LocationAreaEncounterVersionDetail> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The chance of the encounter to occur on a version of the game.")
  @JsonProperty("version_details")
  public List<LocationAreaEncounterVersionDetail> getVersionDetails() {
    return versionDetails;
  }
  public void setVersionDetails(List<LocationAreaEncounterVersionDetail> versionDetails) {
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
    return Objects.equals(encounterMethod, locationAreaEncounterRate.encounterMethod) &&
        Objects.equals(versionDetails, locationAreaEncounterRate.versionDetails);
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

