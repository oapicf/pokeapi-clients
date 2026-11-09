package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.LocationAreaEncounterDetail;
import org.openapitools.vertxweb.server.model.VersionSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationAreaPokemonEncounterVersion   {
  
  private VersionSummary version;
  private Integer maxChance;
  private List<LocationAreaEncounterDetail> encounterDetails = new ArrayList<>();

  public LocationAreaPokemonEncounterVersion () {

  }

  public LocationAreaPokemonEncounterVersion (VersionSummary version, Integer maxChance, List<LocationAreaEncounterDetail> encounterDetails) {
    this.version = version;
    this.maxChance = maxChance;
    this.encounterDetails = encounterDetails;
  }

    
  @JsonProperty("version")
  public VersionSummary getVersion() {
    return version;
  }
  public void setVersion(VersionSummary version) {
    this.version = version;
  }

    
  @JsonProperty("max_chance")
  public Integer getMaxChance() {
    return maxChance;
  }
  public void setMaxChance(Integer maxChance) {
    this.maxChance = maxChance;
  }

    
  @JsonProperty("encounter_details")
  public List<LocationAreaEncounterDetail> getEncounterDetails() {
    return encounterDetails;
  }
  public void setEncounterDetails(List<LocationAreaEncounterDetail> encounterDetails) {
    this.encounterDetails = encounterDetails;
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
    return Objects.equals(version, locationAreaPokemonEncounterVersion.version) &&
        Objects.equals(maxChance, locationAreaPokemonEncounterVersion.maxChance) &&
        Objects.equals(encounterDetails, locationAreaPokemonEncounterVersion.encounterDetails);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
