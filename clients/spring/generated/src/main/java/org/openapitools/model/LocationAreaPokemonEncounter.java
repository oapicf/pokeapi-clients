package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaPokemonEncounterVersion;
import org.openapitools.model.PokemonSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LocationAreaPokemonEncounter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaPokemonEncounter {

  private PokemonSummary pokemon;

  private List<@Valid LocationAreaPokemonEncounterVersion> versionDetails = new ArrayList<>();

  public LocationAreaPokemonEncounter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocationAreaPokemonEncounter(PokemonSummary pokemon, List<@Valid LocationAreaPokemonEncounterVersion> versionDetails) {
    this.pokemon = pokemon;
    this.versionDetails = versionDetails;
  }

  public LocationAreaPokemonEncounter pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  /**
   * The Pokémon being encountered.
   * @return pokemon
   */
  @NotNull @Valid 
  @Schema(name = "pokemon", description = "The Pokémon being encountered.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon")
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  @JsonProperty("pokemon")
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
   */
  @NotNull 
  @Schema(name = "version_details", description = "A list of versions and encounters with Pokémon that might happen in the referenced location area.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_details")
  public List<@Valid LocationAreaPokemonEncounterVersion> getVersionDetails() {
    return versionDetails;
  }

  @JsonProperty("version_details")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

