package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.EncounterMethodSummary;
import org.openapitools.vertxweb.server.model.LocationAreaEncounterVersionDetail;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationAreaEncounterRate   {
  
  private EncounterMethodSummary encounterMethod;
  private List<LocationAreaEncounterVersionDetail> versionDetails = new ArrayList<>();

  public LocationAreaEncounterRate () {

  }

  public LocationAreaEncounterRate (EncounterMethodSummary encounterMethod, List<LocationAreaEncounterVersionDetail> versionDetails) {
    this.encounterMethod = encounterMethod;
    this.versionDetails = versionDetails;
  }

    
  @JsonProperty("encounter_method")
  public EncounterMethodSummary getEncounterMethod() {
    return encounterMethod;
  }
  public void setEncounterMethod(EncounterMethodSummary encounterMethod) {
    this.encounterMethod = encounterMethod;
  }

    
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
