package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaPokemonEncounterVersion;
import org.openapitools.model.PokemonSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaPokemonEncounter   {
  @JsonProperty("pokemon")
  private PokemonSummary pokemon;

  @JsonProperty("version_details")
  private List<LocationAreaPokemonEncounterVersion> versionDetails = new ArrayList<>();

  /**
   * The Pokémon being encountered.
   **/
  public LocationAreaPokemonEncounter pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Pokémon being encountered.")
  @JsonProperty("pokemon")
  public PokemonSummary getPokemon() {
    return pokemon;
  }
  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * A list of versions and encounters with Pokémon that might happen in the referenced location area.
   **/
  public LocationAreaPokemonEncounter versionDetails(List<LocationAreaPokemonEncounterVersion> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of versions and encounters with Pokémon that might happen in the referenced location area.")
  @JsonProperty("version_details")
  public List<LocationAreaPokemonEncounterVersion> getVersionDetails() {
    return versionDetails;
  }
  public void setVersionDetails(List<LocationAreaPokemonEncounterVersion> versionDetails) {
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
    LocationAreaPokemonEncounter locationAreaPokemonEncounter = (LocationAreaPokemonEncounter) o;
    return Objects.equals(pokemon, locationAreaPokemonEncounter.pokemon) &&
        Objects.equals(versionDetails, locationAreaPokemonEncounter.versionDetails);
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

