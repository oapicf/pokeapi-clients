package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaPokemonEncounterVersion;
import org.openapitools.model.PokemonSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LocationAreaPokemonEncounter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaPokemonEncounter   {
  private PokemonSummary pokemon;
  private List<@Valid LocationAreaPokemonEncounterVersion> versionDetails = new ArrayList<>();

  public LocationAreaPokemonEncounter() {
  }

  @JsonCreator
  public LocationAreaPokemonEncounter(
    @JsonProperty(required = true, value = "pokemon") PokemonSummary pokemon,
    @JsonProperty(required = true, value = "version_details") List<@Valid LocationAreaPokemonEncounterVersion> versionDetails
  ) {
    this.pokemon = pokemon;
    this.versionDetails = versionDetails;
  }

  /**
   * The Pokémon being encountered.
   **/
  public LocationAreaPokemonEncounter pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Pokémon being encountered.")
  @JsonProperty(required = true, value = "pokemon")
  @NotNull @Valid public PokemonSummary getPokemon() {
    return pokemon;
  }

  @JsonProperty(required = true, value = "pokemon")
  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * A list of versions and encounters with Pokémon that might happen in the referenced location area.
   **/
  public LocationAreaPokemonEncounter versionDetails(List<@Valid LocationAreaPokemonEncounterVersion> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of versions and encounters with Pokémon that might happen in the referenced location area.")
  @JsonProperty(required = true, value = "version_details")
  @NotNull public List<@Valid LocationAreaPokemonEncounterVersion> getVersionDetails() {
    return versionDetails;
  }

  @JsonProperty(required = true, value = "version_details")
  public void setVersionDetails(List<@Valid LocationAreaPokemonEncounterVersion> versionDetails) {
    this.versionDetails = versionDetails;
  }

  public LocationAreaPokemonEncounter addVersionDetailsItem(LocationAreaPokemonEncounterVersion versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }

    this.versionDetails.add(versionDetailsItem);
    return this;
  }

  public LocationAreaPokemonEncounter removeVersionDetailsItem(LocationAreaPokemonEncounterVersion versionDetailsItem) {
    if (versionDetailsItem != null && this.versionDetails != null) {
      this.versionDetails.remove(versionDetailsItem);
    }

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
    LocationAreaPokemonEncounter locationAreaPokemonEncounter = (LocationAreaPokemonEncounter) o;
    return Objects.equals(this.pokemon, locationAreaPokemonEncounter.pokemon) &&
        Objects.equals(this.versionDetails, locationAreaPokemonEncounter.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pokemon, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaPokemonEncounter {\n");
    
    sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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
