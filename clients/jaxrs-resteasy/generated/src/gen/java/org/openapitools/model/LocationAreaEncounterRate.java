package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterMethodSummary;
import org.openapitools.model.LocationAreaEncounterVersionDetail;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaEncounterRate   {
  
  private EncounterMethodSummary encounterMethod;
  private List<@Valid LocationAreaEncounterVersionDetail> versionDetails = new ArrayList<>();

  /**
   * The method in which Pokémon may be encountered in an area..
   **/
  
  @ApiModelProperty(required = true, value = "The method in which Pokémon may be encountered in an area..")
  @JsonProperty("encounter_method")
  @NotNull
  @Valid
  public EncounterMethodSummary getEncounterMethod() {
    return encounterMethod;
  }
  public void setEncounterMethod(EncounterMethodSummary encounterMethod) {
    this.encounterMethod = encounterMethod;
  }

  /**
   * The chance of the encounter to occur on a version of the game.
   **/
  
  @ApiModelProperty(required = true, value = "The chance of the encounter to occur on a version of the game.")
  @JsonProperty("version_details")
  @NotNull
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

