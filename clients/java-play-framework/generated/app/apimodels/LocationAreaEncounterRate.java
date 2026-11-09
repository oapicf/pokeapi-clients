package apimodels;

import apimodels.EncounterMethodSummary;
import apimodels.LocationAreaEncounterVersionDetail;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LocationAreaEncounterRate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LocationAreaEncounterRate   {
  @JsonProperty("encounter_method")
  @NotNull
@Valid

  private EncounterMethodSummary encounterMethod;

  @JsonProperty("version_details")
  @NotNull
@Valid

  private List<@Valid LocationAreaEncounterVersionDetail> versionDetails = new ArrayList<>();

  public LocationAreaEncounterRate encounterMethod(EncounterMethodSummary encounterMethod) {
    this.encounterMethod = encounterMethod;
    return this;
  }

   /**
   * The method in which Pokémon may be encountered in an area..
   * @return encounterMethod
  **/
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
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }
    this.versionDetails.add(versionDetailsItem);
    return this;
  }

   /**
   * The chance of the encounter to occur on a version of the game.
   * @return versionDetails
  **/
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
    return Objects.equals(encounterMethod, locationAreaEncounterRate.encounterMethod) &&
        Objects.equals(versionDetails, locationAreaEncounterRate.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encounterMethod, versionDetails);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

