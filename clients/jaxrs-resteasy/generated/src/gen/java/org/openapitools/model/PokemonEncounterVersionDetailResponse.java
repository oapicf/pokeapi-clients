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
import org.openapitools.model.PokemonEncounterDetailResponse;
import org.openapitools.model.VersionSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonEncounterVersionDetailResponse   {
  
  private VersionSummary version;
  private Integer maxChance;
  private List<@Valid PokemonEncounterDetailResponse> encounterDetails = new ArrayList<>();

  /**
   * The game version this encounter happens in.
   **/
  
  @ApiModelProperty(required = true, value = "The game version this encounter happens in.")
  @JsonProperty("version")
  @NotNull
  @Valid
  public VersionSummary getVersion() {
    return version;
  }
  public void setVersion(VersionSummary version) {
    this.version = version;
  }

  /**
   * The total percentage of all encounter potential.
   **/
  
  @ApiModelProperty(required = true, value = "The total percentage of all encounter potential.")
  @JsonProperty("max_chance")
  @NotNull
  public Integer getMaxChance() {
    return maxChance;
  }
  public void setMaxChance(Integer maxChance) {
    this.maxChance = maxChance;
  }

  /**
   * A list of encounters and their specifics.
   **/
  
  @ApiModelProperty(required = true, value = "A list of encounters and their specifics.")
  @JsonProperty("encounter_details")
  @NotNull
  public List<@Valid PokemonEncounterDetailResponse> getEncounterDetails() {
    return encounterDetails;
  }
  public void setEncounterDetails(List<@Valid PokemonEncounterDetailResponse> encounterDetails) {
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
    PokemonEncounterVersionDetailResponse pokemonEncounterVersionDetailResponse = (PokemonEncounterVersionDetailResponse) o;
    return Objects.equals(this.version, pokemonEncounterVersionDetailResponse.version) &&
        Objects.equals(this.maxChance, pokemonEncounterVersionDetailResponse.maxChance) &&
        Objects.equals(this.encounterDetails, pokemonEncounterVersionDetailResponse.encounterDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, maxChance, encounterDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonEncounterVersionDetailResponse {\n");
    
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

