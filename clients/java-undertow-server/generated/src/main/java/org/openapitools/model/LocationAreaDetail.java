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
import org.openapitools.model.LocationAreaEncounterRate;
import org.openapitools.model.LocationAreaName;
import org.openapitools.model.LocationAreaPokemonEncounter;
import org.openapitools.model.LocationSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-11-09T13:49:34.675912514Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaDetail   {
  
  private Integer id;
  private String name;
  private Integer gameIndex;
  private List<LocationAreaEncounterRate> encounterMethodRates = new ArrayList<>();
  private LocationSummary location;
  private List<LocationAreaName> names = new ArrayList<>();
  private List<LocationAreaPokemonEncounter> pokemonEncounters = new ArrayList<>();

  /**
   * The identifier for this resource.
   */
  public LocationAreaDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   */
  public LocationAreaDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The internal id of an API resource within game data.
   * minimum: -2147483648
   * maximum: 2147483647
   */
  public LocationAreaDetail gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The internal id of an API resource within game data.")
  @JsonProperty("game_index")
  public Integer getGameIndex() {
    return gameIndex;
  }
  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  /**
   * A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
   */
  public LocationAreaDetail encounterMethodRates(List<LocationAreaEncounterRate> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.")
  @JsonProperty("encounter_method_rates")
  public List<LocationAreaEncounterRate> getEncounterMethodRates() {
    return encounterMethodRates;
  }
  public void setEncounterMethodRates(List<LocationAreaEncounterRate> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
  }

  /**
   * The region this location area can be found in.
   */
  public LocationAreaDetail location(LocationSummary location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The region this location area can be found in.")
  @JsonProperty("location")
  public LocationSummary getLocation() {
    return location;
  }
  public void setLocation(LocationSummary location) {
    this.location = location;
  }

  /**
   * The name of this resource listed in different languages.
   */
  public LocationAreaDetail names(List<LocationAreaName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty("names")
  public List<LocationAreaName> getNames() {
    return names;
  }
  public void setNames(List<LocationAreaName> names) {
    this.names = names;
  }

  /**
   * A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
   */
  public LocationAreaDetail pokemonEncounters(List<LocationAreaPokemonEncounter> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of Pokémon that can be encountered in this area along with version specific details about the encounter.")
  @JsonProperty("pokemon_encounters")
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
    return Objects.equals(id, locationAreaDetail.id) &&
        Objects.equals(name, locationAreaDetail.name) &&
        Objects.equals(gameIndex, locationAreaDetail.gameIndex) &&
        Objects.equals(encounterMethodRates, locationAreaDetail.encounterMethodRates) &&
        Objects.equals(location, locationAreaDetail.location) &&
        Objects.equals(names, locationAreaDetail.names) &&
        Objects.equals(pokemonEncounters, locationAreaDetail.pokemonEncounters);
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

