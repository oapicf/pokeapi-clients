package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaPokemonEncounterVersion;
import org.openapitools.model.PokemonSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LocationAreaPokemonEncounter  {
  
 /**
  * The Pokémon being encountered.
  */
  @ApiModelProperty(required = true, value = "The Pokémon being encountered.")

  private PokemonSummary pokemon;

 /**
  * A list of versions and encounters with Pokémon that might happen in the referenced location area.
  */
  @ApiModelProperty(required = true, value = "A list of versions and encounters with Pokémon that might happen in the referenced location area.")

  private List<LocationAreaPokemonEncounterVersion> versionDetails = new ArrayList<>();
 /**
   * The Pokémon being encountered.
   * @return pokemon
  **/
  @JsonProperty("pokemon")
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  public LocationAreaPokemonEncounter pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
    return this;
  }

 /**
   * A list of versions and encounters with Pokémon that might happen in the referenced location area.
   * @return versionDetails
  **/
  @JsonProperty("version_details")
  public List<LocationAreaPokemonEncounterVersion> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<LocationAreaPokemonEncounterVersion> versionDetails) {
    this.versionDetails = versionDetails;
  }

  public LocationAreaPokemonEncounter versionDetails(List<LocationAreaPokemonEncounterVersion> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public LocationAreaPokemonEncounter addVersionDetailsItem(LocationAreaPokemonEncounterVersion versionDetailsItem) {
    this.versionDetails.add(versionDetailsItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

