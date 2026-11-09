package org.openapitools.model;

import org.openapitools.model.LocationAreaPokemonEncounterVersion;
import org.openapitools.model.PokemonSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class LocationAreaPokemonEncounter implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The Pokémon being encountered.
   */
  @JsonProperty("pokemon")
  private PokemonSummary pokemon;

  /**
   * A list of versions and encounters with Pokémon that might happen in the referenced location area.
   */
  @JsonProperty("version_details")
  private List<LocationAreaPokemonEncounterVersion> versionDetails = new ArrayList<>();

  /**
   * The Pokémon being encountered.
   * @return pokemon
   */
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * A list of versions and encounters with Pokémon that might happen in the referenced location area.
   * @return versionDetails
   */
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
