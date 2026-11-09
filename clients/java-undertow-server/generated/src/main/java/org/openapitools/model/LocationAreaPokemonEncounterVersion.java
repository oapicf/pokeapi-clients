/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**](https://github.com/phalt) and other [**PokéAPI contributors**](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.
 *
 * OpenAPI document version: 2.10.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaEncounterDetail;
import org.openapitools.model.VersionSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-11-09T13:49:34.675912514Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaPokemonEncounterVersion   {
  
  private VersionSummary version;
  private Integer maxChance;
  private List<LocationAreaEncounterDetail> encounterDetails = new ArrayList<>();

  /**
   * The game version this encounter happens in.
   */
  public LocationAreaPokemonEncounterVersion version(VersionSummary version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The game version this encounter happens in.")
  @JsonProperty("version")
  public VersionSummary getVersion() {
    return version;
  }
  public void setVersion(VersionSummary version) {
    this.version = version;
  }

  /**
   * The total percentage of all encounter potential.
   */
  public LocationAreaPokemonEncounterVersion maxChance(Integer maxChance) {
    this.maxChance = maxChance;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The total percentage of all encounter potential.")
  @JsonProperty("max_chance")
  public Integer getMaxChance() {
    return maxChance;
  }
  public void setMaxChance(Integer maxChance) {
    this.maxChance = maxChance;
  }

  /**
   * A list of encounters and their specifics.
   */
  public LocationAreaPokemonEncounterVersion encounterDetails(List<LocationAreaEncounterDetail> encounterDetails) {
    this.encounterDetails = encounterDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of encounters and their specifics.")
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

