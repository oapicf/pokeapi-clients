package org.openapitools.model;

import org.openapitools.model.LocationAreaEncounterDetail;
import org.openapitools.model.VersionSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class LocationAreaPokemonEncounterVersion implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The game version this encounter happens in.
   */
  @JsonProperty("version")
  private VersionSummary version;

  /**
   * The total percentage of all encounter potential.
   */
  @JsonProperty("max_chance")
  private Integer maxChance;

  /**
   * A list of encounters and their specifics.
   */
  @JsonProperty("encounter_details")
  private List<LocationAreaEncounterDetail> encounterDetails = new ArrayList<>();

  /**
   * The game version this encounter happens in.
   * @return version
   */
  public VersionSummary getVersion() {
    return version;
  }

  public void setVersion(VersionSummary version) {
    this.version = version;
  }

  /**
   * The total percentage of all encounter potential.
   * @return maxChance
   */
  public Integer getMaxChance() {
    return maxChance;
  }

  public void setMaxChance(Integer maxChance) {
    this.maxChance = maxChance;
  }

  /**
   * A list of encounters and their specifics.
   * @return encounterDetails
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
