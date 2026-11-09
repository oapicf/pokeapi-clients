package org.openapitools.model;

import org.openapitools.model.LocationAreaEncounterRate;
import org.openapitools.model.LocationAreaName;
import org.openapitools.model.LocationAreaPokemonEncounter;
import org.openapitools.model.LocationSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class LocationAreaDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The identifier for this resource.
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * The name for this resource.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The internal id of an API resource within game data.
   */
  @JsonProperty("game_index")
  private Integer gameIndex;

  /**
   * A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
   */
  @JsonProperty("encounter_method_rates")
  private List<LocationAreaEncounterRate> encounterMethodRates = new ArrayList<>();

  /**
   * The region this location area can be found in.
   */
  @JsonProperty("location")
  private LocationSummary location;

  /**
   * The name of this resource listed in different languages.
   */
  @JsonProperty("names")
  private List<LocationAreaName> names = new ArrayList<>();

  /**
   * A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
   */
  @JsonProperty("pokemon_encounters")
  private List<LocationAreaPokemonEncounter> pokemonEncounters = new ArrayList<>();

  /**
   * The identifier for this resource.
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The internal id of an API resource within game data.
   * @return gameIndex
   */
  public Integer getGameIndex() {
    return gameIndex;
  }

  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  /**
   * A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
   * @return encounterMethodRates
   */
  public List<LocationAreaEncounterRate> getEncounterMethodRates() {
    return encounterMethodRates;
  }

  public void setEncounterMethodRates(List<LocationAreaEncounterRate> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
  }

  /**
   * The region this location area can be found in.
   * @return location
   */
  public LocationSummary getLocation() {
    return location;
  }

  public void setLocation(LocationSummary location) {
    this.location = location;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
  public List<LocationAreaName> getNames() {
    return names;
  }

  public void setNames(List<LocationAreaName> names) {
    this.names = names;
  }

  /**
   * A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
   * @return pokemonEncounters
   */
  public List<LocationAreaPokemonEncounter> getPokemonEncounters() {
    return pokemonEncounters;
  }

  public void setPokemonEncounters(List<LocationAreaPokemonEncounter> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAreaDetail locationAreaDetail = (LocationAreaDetail) o;
    return Objects.equals(this.id, locationAreaDetail.id) &&
        Objects.equals(this.name, locationAreaDetail.name) &&
        Objects.equals(this.gameIndex, locationAreaDetail.gameIndex) &&
        Objects.equals(this.encounterMethodRates, locationAreaDetail.encounterMethodRates) &&
        Objects.equals(this.location, locationAreaDetail.location) &&
        Objects.equals(this.names, locationAreaDetail.names) &&
        Objects.equals(this.pokemonEncounters, locationAreaDetail.pokemonEncounters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, gameIndex, encounterMethodRates, location, names, pokemonEncounters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gameIndex: ").append(toIndentedString(gameIndex)).append("\n");
    sb.append("    encounterMethodRates: ").append(toIndentedString(encounterMethodRates)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pokemonEncounters: ").append(toIndentedString(pokemonEncounters)).append("\n");
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
