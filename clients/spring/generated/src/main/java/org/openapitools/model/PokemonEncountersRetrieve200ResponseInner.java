package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerLocationArea;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PokemonEncountersRetrieve200ResponseInner
 */

@JsonTypeName("pokemon_encounters_retrieve_200_response_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonEncountersRetrieve200ResponseInner {

  private PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea;

  @Valid
  private List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails = new ArrayList<>();

  public PokemonEncountersRetrieve200ResponseInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonEncountersRetrieve200ResponseInner(PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea, List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails) {
    this.locationArea = locationArea;
    this.versionDetails = versionDetails;
  }

  public PokemonEncountersRetrieve200ResponseInner locationArea(PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea) {
    this.locationArea = locationArea;
    return this;
  }

  /**
   * Get locationArea
   * @return locationArea
   */
  @NotNull @Valid 
  @Schema(name = "location_area", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("location_area")
  public PokemonEncountersRetrieve200ResponseInnerLocationArea getLocationArea() {
    return locationArea;
  }

  public void setLocationArea(PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea) {
    this.locationArea = locationArea;
  }

  public PokemonEncountersRetrieve200ResponseInner versionDetails(List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public PokemonEncountersRetrieve200ResponseInner addVersionDetailsItem(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }
    this.versionDetails.add(versionDetailsItem);
    return this;
  }

  /**
   * Get versionDetails
   * @return versionDetails
   */
  @NotNull @Valid 
  @Schema(name = "version_details", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_details")
  public List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails) {
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
    PokemonEncountersRetrieve200ResponseInner pokemonEncountersRetrieve200ResponseInner = (PokemonEncountersRetrieve200ResponseInner) o;
    return Objects.equals(this.locationArea, pokemonEncountersRetrieve200ResponseInner.locationArea) &&
        Objects.equals(this.versionDetails, pokemonEncountersRetrieve200ResponseInner.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationArea, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonEncountersRetrieve200ResponseInner {\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

