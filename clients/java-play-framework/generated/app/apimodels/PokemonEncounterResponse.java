package apimodels;

import apimodels.LocationAreaSummary;
import apimodels.PokemonEncounterVersionDetailResponse;
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
 * PokemonEncounterResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonEncounterResponse   {
  @JsonProperty("location_area")
  @NotNull
@Valid

  private LocationAreaSummary locationArea;

  @JsonProperty("version_details")
  @NotNull
@Valid

  private List<@Valid PokemonEncounterVersionDetailResponse> versionDetails = new ArrayList<>();

  public PokemonEncounterResponse locationArea(LocationAreaSummary locationArea) {
    this.locationArea = locationArea;
    return this;
  }

   /**
   * The location area the referenced Pokémon can be encountered in.
   * @return locationArea
  **/
  public LocationAreaSummary getLocationArea() {
    return locationArea;
  }

  public void setLocationArea(LocationAreaSummary locationArea) {
    this.locationArea = locationArea;
  }

  public PokemonEncounterResponse versionDetails(List<@Valid PokemonEncounterVersionDetailResponse> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public PokemonEncounterResponse addVersionDetailsItem(PokemonEncounterVersionDetailResponse versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }
    this.versionDetails.add(versionDetailsItem);
    return this;
  }

   /**
   * A list of versions and encounters with the referenced Pokémon that might happen.
   * @return versionDetails
  **/
  public List<@Valid PokemonEncounterVersionDetailResponse> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<@Valid PokemonEncounterVersionDetailResponse> versionDetails) {
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
    PokemonEncounterResponse pokemonEncounterResponse = (PokemonEncounterResponse) o;
    return Objects.equals(locationArea, pokemonEncounterResponse.locationArea) &&
        Objects.equals(versionDetails, pokemonEncounterResponse.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationArea, versionDetails);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonEncounterResponse {\n");
    
    sb.append("    locationArea: ").append(toIndentedString(locationArea)).append("\n");
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

