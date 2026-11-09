package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.LocationAreaEncounterRate;
import com.prokarma.pkmst.model.LocationAreaName;
import com.prokarma.pkmst.model.LocationAreaPokemonEncounter;
import com.prokarma.pkmst.model.LocationSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * LocationAreaDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("game_index")
  private Integer gameIndex;

  @JsonProperty("encounter_method_rates")
  
  private List<LocationAreaEncounterRate> encounterMethodRates = new ArrayList<>();

  @JsonProperty("location")
  private LocationSummary location;

  @JsonProperty("names")
  
  private List<LocationAreaName> names = new ArrayList<>();

  @JsonProperty("pokemon_encounters")
  
  private List<LocationAreaPokemonEncounter> pokemonEncounters = new ArrayList<>();

  public LocationAreaDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocationAreaDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for this resource.
   * @return name
   */
  @ApiModelProperty(required = true, value = "The name for this resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocationAreaDetail gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

  /**
   * The internal id of an API resource within game data.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return gameIndex
   */
  @ApiModelProperty(required = true, value = "The internal id of an API resource within game data.")
  public Integer getGameIndex() {
    return gameIndex;
  }

  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  public LocationAreaDetail encounterMethodRates(List<LocationAreaEncounterRate> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
    return this;
  }

  public LocationAreaDetail addEncounterMethodRatesItem(LocationAreaEncounterRate encounterMethodRatesItem) {
    if (this.encounterMethodRates == null) {
      this.encounterMethodRates = new ArrayList<>();
    }
    this.encounterMethodRates.add(encounterMethodRatesItem);
    return this;
  }

  /**
   * A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
   * @return encounterMethodRates
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.")
  public List<LocationAreaEncounterRate> getEncounterMethodRates() {
    return encounterMethodRates;
  }

  public void setEncounterMethodRates(List<LocationAreaEncounterRate> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
  }

  public LocationAreaDetail location(LocationSummary location) {
    this.location = location;
    return this;
  }

  /**
   * The region this location area can be found in.
   * @return location
   */
  @ApiModelProperty(required = true, value = "The region this location area can be found in.")
  public LocationSummary getLocation() {
    return location;
  }

  public void setLocation(LocationSummary location) {
    this.location = location;
  }

  public LocationAreaDetail names(List<LocationAreaName> names) {
    this.names = names;
    return this;
  }

  public LocationAreaDetail addNamesItem(LocationAreaName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The name of this resource listed in different languages.")
  public List<LocationAreaName> getNames() {
    return names;
  }

  public void setNames(List<LocationAreaName> names) {
    this.names = names;
  }

  public LocationAreaDetail pokemonEncounters(List<LocationAreaPokemonEncounter> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
    return this;
  }

  public LocationAreaDetail addPokemonEncountersItem(LocationAreaPokemonEncounter pokemonEncountersItem) {
    if (this.pokemonEncounters == null) {
      this.pokemonEncounters = new ArrayList<>();
    }
    this.pokemonEncounters.add(pokemonEncountersItem);
    return this;
  }

  /**
   * A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
   * @return pokemonEncounters
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of Pokémon that can be encountered in this area along with version specific details about the encounter.")
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

