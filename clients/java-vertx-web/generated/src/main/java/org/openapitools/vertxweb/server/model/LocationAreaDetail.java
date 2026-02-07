package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.LocationAreaDetailEncounterMethodRatesInner;
import org.openapitools.vertxweb.server.model.LocationAreaDetailPokemonEncountersInner;
import org.openapitools.vertxweb.server.model.LocationAreaName;
import org.openapitools.vertxweb.server.model.LocationSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationAreaDetail   {
  
  private Integer id;
  private String name;
  private Integer gameIndex;
  private List<LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates = new ArrayList<>();
  private LocationSummary location;
  private List<LocationAreaName> names = new ArrayList<>();
  private List<LocationAreaDetailPokemonEncountersInner> pokemonEncounters = new ArrayList<>();

  public LocationAreaDetail () {

  }

  public LocationAreaDetail (Integer id, String name, Integer gameIndex, List<LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates, LocationSummary location, List<LocationAreaName> names, List<LocationAreaDetailPokemonEncountersInner> pokemonEncounters) {
    this.id = id;
    this.name = name;
    this.gameIndex = gameIndex;
    this.encounterMethodRates = encounterMethodRates;
    this.location = location;
    this.names = names;
    this.pokemonEncounters = pokemonEncounters;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("game_index")
  public Integer getGameIndex() {
    return gameIndex;
  }
  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

    
  @JsonProperty("encounter_method_rates")
  public List<LocationAreaDetailEncounterMethodRatesInner> getEncounterMethodRates() {
    return encounterMethodRates;
  }
  public void setEncounterMethodRates(List<LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
  }

    
  @JsonProperty("location")
  public LocationSummary getLocation() {
    return location;
  }
  public void setLocation(LocationSummary location) {
    this.location = location;
  }

    
  @JsonProperty("names")
  public List<LocationAreaName> getNames() {
    return names;
  }
  public void setNames(List<LocationAreaName> names) {
    this.names = names;
  }

    
  @JsonProperty("pokemon_encounters")
  public List<LocationAreaDetailPokemonEncountersInner> getPokemonEncounters() {
    return pokemonEncounters;
  }
  public void setPokemonEncounters(List<LocationAreaDetailPokemonEncountersInner> pokemonEncounters) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
