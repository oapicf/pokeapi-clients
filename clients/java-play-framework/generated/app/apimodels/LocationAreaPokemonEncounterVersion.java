package apimodels;

import apimodels.LocationAreaEncounterDetail;
import apimodels.VersionSummary;
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
 * LocationAreaPokemonEncounterVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LocationAreaPokemonEncounterVersion   {
  @JsonProperty("version")
  @NotNull
@Valid

  private VersionSummary version;

  @JsonProperty("max_chance")
  @NotNull

  private Integer maxChance;

  @JsonProperty("encounter_details")
  @NotNull
@Valid

  private List<@Valid LocationAreaEncounterDetail> encounterDetails = new ArrayList<>();

  public LocationAreaPokemonEncounterVersion version(VersionSummary version) {
    this.version = version;
    return this;
  }

   /**
   * The game version this encounter happens in.
   * @return version
  **/
  public VersionSummary getVersion() {
    return version;
  }

  public void setVersion(VersionSummary version) {
    this.version = version;
  }

  public LocationAreaPokemonEncounterVersion maxChance(Integer maxChance) {
    this.maxChance = maxChance;
    return this;
  }

   /**
   * The total percentage of all encounter potential.
   * @return maxChance
  **/
  public Integer getMaxChance() {
    return maxChance;
  }

  public void setMaxChance(Integer maxChance) {
    this.maxChance = maxChance;
  }

  public LocationAreaPokemonEncounterVersion encounterDetails(List<@Valid LocationAreaEncounterDetail> encounterDetails) {
    this.encounterDetails = encounterDetails;
    return this;
  }

  public LocationAreaPokemonEncounterVersion addEncounterDetailsItem(LocationAreaEncounterDetail encounterDetailsItem) {
    if (this.encounterDetails == null) {
      this.encounterDetails = new ArrayList<>();
    }
    this.encounterDetails.add(encounterDetailsItem);
    return this;
  }

   /**
   * A list of encounters and their specifics.
   * @return encounterDetails
  **/
  public List<@Valid LocationAreaEncounterDetail> getEncounterDetails() {
    return encounterDetails;
  }

  public void setEncounterDetails(List<@Valid LocationAreaEncounterDetail> encounterDetails) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

