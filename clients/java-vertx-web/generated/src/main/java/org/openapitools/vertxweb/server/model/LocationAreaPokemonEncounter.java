package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.LocationAreaPokemonEncounterVersion;
import org.openapitools.vertxweb.server.model.PokemonSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationAreaPokemonEncounter   {
  
  private PokemonSummary pokemon;
  private List<LocationAreaPokemonEncounterVersion> versionDetails = new ArrayList<>();

  public LocationAreaPokemonEncounter () {

  }

  public LocationAreaPokemonEncounter (PokemonSummary pokemon, List<LocationAreaPokemonEncounterVersion> versionDetails) {
    this.pokemon = pokemon;
    this.versionDetails = versionDetails;
  }

    
  @JsonProperty("pokemon")
  public PokemonSummary getPokemon() {
    return pokemon;
  }
  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

    
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
