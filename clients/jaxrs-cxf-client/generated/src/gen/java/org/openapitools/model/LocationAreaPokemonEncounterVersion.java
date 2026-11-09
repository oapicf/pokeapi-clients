package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaEncounterDetail;
import org.openapitools.model.VersionSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LocationAreaPokemonEncounterVersion  {
  
 /**
  * The game version this encounter happens in.
  */
  @ApiModelProperty(required = true, value = "The game version this encounter happens in.")

  private VersionSummary version;

 /**
  * The total percentage of all encounter potential.
  */
  @ApiModelProperty(required = true, value = "The total percentage of all encounter potential.")

  private Integer maxChance;

 /**
  * A list of encounters and their specifics.
  */
  @ApiModelProperty(required = true, value = "A list of encounters and their specifics.")

  private List<LocationAreaEncounterDetail> encounterDetails = new ArrayList<>();
 /**
   * The game version this encounter happens in.
   * @return version
  **/
  @JsonProperty("version")
  public VersionSummary getVersion() {
    return version;
  }

  public void setVersion(VersionSummary version) {
    this.version = version;
  }

  public LocationAreaPokemonEncounterVersion version(VersionSummary version) {
    this.version = version;
    return this;
  }

 /**
   * The total percentage of all encounter potential.
   * @return maxChance
  **/
  @JsonProperty("max_chance")
  public Integer getMaxChance() {
    return maxChance;
  }

  public void setMaxChance(Integer maxChance) {
    this.maxChance = maxChance;
  }

  public LocationAreaPokemonEncounterVersion maxChance(Integer maxChance) {
    this.maxChance = maxChance;
    return this;
  }

 /**
   * A list of encounters and their specifics.
   * @return encounterDetails
  **/
  @JsonProperty("encounter_details")
  public List<LocationAreaEncounterDetail> getEncounterDetails() {
    return encounterDetails;
  }

  public void setEncounterDetails(List<LocationAreaEncounterDetail> encounterDetails) {
    this.encounterDetails = encounterDetails;
  }

  public LocationAreaPokemonEncounterVersion encounterDetails(List<LocationAreaEncounterDetail> encounterDetails) {
    this.encounterDetails = encounterDetails;
    return this;
  }

  public LocationAreaPokemonEncounterVersion addEncounterDetailsItem(LocationAreaEncounterDetail encounterDetailsItem) {
    this.encounterDetails.add(encounterDetailsItem);
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
    LocationAreaPokemonEncounterVersion locationAreaPokemonEncounterVersion = (LocationAreaPokemonEncounterVersion) o;
    return Objects.equals(this.version, locationAreaPokemonEncounterVersion.version) &&
        Objects.equals(this.maxChance, locationAreaPokemonEncounterVersion.maxChance) &&
        Objects.equals(this.encounterDetails, locationAreaPokemonEncounterVersion.encounterDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, maxChance, encounterDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaPokemonEncounterVersion {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    maxChance: ").append(toIndentedString(maxChance)).append("\n");
    sb.append("    encounterDetails: ").append(toIndentedString(encounterDetails)).append("\n");
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

