package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaDetailEncounterMethodRatesInner;
import org.openapitools.model.LocationAreaDetailPokemonEncountersInner;
import org.openapitools.model.LocationAreaName;
import org.openapitools.model.LocationSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LocationAreaDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private Integer gameIndex;

  @ApiModelProperty(required = true, value = "")

  private List<LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private LocationSummary location;

  @ApiModelProperty(required = true, value = "")

  private List<LocationAreaName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<LocationAreaDetailPokemonEncountersInner> pokemonEncounters = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocationAreaDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get gameIndex
   * @return gameIndex
  **/
  @JsonProperty("game_index")
  public Integer getGameIndex() {
    return gameIndex;
  }

  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  public LocationAreaDetail gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

 /**
   * Get encounterMethodRates
   * @return encounterMethodRates
  **/
  @JsonProperty("encounter_method_rates")
  public List<LocationAreaDetailEncounterMethodRatesInner> getEncounterMethodRates() {
    return encounterMethodRates;
  }

  public void setEncounterMethodRates(List<LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
  }

  public LocationAreaDetail encounterMethodRates(List<LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
    return this;
  }

  public LocationAreaDetail addEncounterMethodRatesItem(LocationAreaDetailEncounterMethodRatesInner encounterMethodRatesItem) {
    this.encounterMethodRates.add(encounterMethodRatesItem);
    return this;
  }

 /**
   * Get location
   * @return location
  **/
  @JsonProperty("location")
  public LocationSummary getLocation() {
    return location;
  }

  public void setLocation(LocationSummary location) {
    this.location = location;
  }

  public LocationAreaDetail location(LocationSummary location) {
    this.location = location;
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<LocationAreaName> getNames() {
    return names;
  }

  public void setNames(List<LocationAreaName> names) {
    this.names = names;
  }

  public LocationAreaDetail names(List<LocationAreaName> names) {
    this.names = names;
    return this;
  }

  public LocationAreaDetail addNamesItem(LocationAreaName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
   * Get pokemonEncounters
   * @return pokemonEncounters
  **/
  @JsonProperty("pokemon_encounters")
  public List<LocationAreaDetailPokemonEncountersInner> getPokemonEncounters() {
    return pokemonEncounters;
  }

  public void setPokemonEncounters(List<LocationAreaDetailPokemonEncountersInner> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
  }

  public LocationAreaDetail pokemonEncounters(List<LocationAreaDetailPokemonEncountersInner> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
    return this;
  }

  public LocationAreaDetail addPokemonEncountersItem(LocationAreaDetailPokemonEncountersInner pokemonEncountersItem) {
    this.pokemonEncounters.add(pokemonEncountersItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

