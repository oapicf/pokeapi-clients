package apimodels;

import apimodels.LocationAreaPokemonEncounterVersion;
import apimodels.PokemonSummary;
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
 * LocationAreaPokemonEncounter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LocationAreaPokemonEncounter   {
  @JsonProperty("pokemon")
  @NotNull
@Valid

  private PokemonSummary pokemon;

  @JsonProperty("version_details")
  @NotNull
@Valid

  private List<@Valid LocationAreaPokemonEncounterVersion> versionDetails = new ArrayList<>();

  public LocationAreaPokemonEncounter pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
    return this;
  }

   /**
   * The Pokémon being encountered.
   * @return pokemon
  **/
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  public LocationAreaPokemonEncounter versionDetails(List<@Valid LocationAreaPokemonEncounterVersion> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public LocationAreaPokemonEncounter addVersionDetailsItem(LocationAreaPokemonEncounterVersion versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }
    this.versionDetails.add(versionDetailsItem);
    return this;
  }

   /**
   * A list of versions and encounters with Pokémon that might happen in the referenced location area.
   * @return versionDetails
  **/
  public List<@Valid LocationAreaPokemonEncounterVersion> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<@Valid LocationAreaPokemonEncounterVersion> versionDetails) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

