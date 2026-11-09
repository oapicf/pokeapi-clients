package org.openapitools.model;

import org.openapitools.model.EncounterMethodSummary;
import org.openapitools.model.LocationAreaEncounterVersionDetail;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class LocationAreaEncounterRate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The method in which Pokémon may be encountered in an area..
   */
  @JsonProperty("encounter_method")
  private EncounterMethodSummary encounterMethod;

  /**
   * The chance of the encounter to occur on a version of the game.
   */
  @JsonProperty("version_details")
  private List<LocationAreaEncounterVersionDetail> versionDetails = new ArrayList<>();

  /**
   * The method in which Pokémon may be encountered in an area..
   * @return encounterMethod
   */
  public EncounterMethodSummary getEncounterMethod() {
    return encounterMethod;
  }

  public void setEncounterMethod(EncounterMethodSummary encounterMethod) {
    this.encounterMethod = encounterMethod;
  }

  /**
   * The chance of the encounter to occur on a version of the game.
   * @return versionDetails
   */
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
