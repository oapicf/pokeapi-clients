package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaDetailEncounterMethodRatesInner;
import org.openapitools.model.LocationAreaDetailPokemonEncountersInner;
import org.openapitools.model.LocationAreaName;
import org.openapitools.model.LocationSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LocationAreaDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("game_index")
  private Integer gameIndex;

  @JsonProperty("encounter_method_rates")
  private List<LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates = new ArrayList<>();

  @JsonProperty("location")
  private LocationSummary location;

  @JsonProperty("names")
  private List<LocationAreaName> names = new ArrayList<>();

  @JsonProperty("pokemon_encounters")
  private List<LocationAreaDetailPokemonEncountersInner> pokemonEncounters = new ArrayList<>();

  /**
   **/
  public LocationAreaDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public LocationAreaDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public LocationAreaDetail gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("game_index")
  public Integer getGameIndex() {
    return gameIndex;
  }
  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  /**
   **/
  public LocationAreaDetail encounterMethodRates(List<LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("encounter_method_rates")
  public List<LocationAreaDetailEncounterMethodRatesInner> getEncounterMethodRates() {
    return encounterMethodRates;
  }
  public void setEncounterMethodRates(List<LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
  }

  /**
   **/
  public LocationAreaDetail location(LocationSummary location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("location")
  public LocationSummary getLocation() {
    return location;
  }
  public void setLocation(LocationSummary location) {
    this.location = location;
  }

  /**
   **/
  public LocationAreaDetail names(List<LocationAreaName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  public List<LocationAreaName> getNames() {
    return names;
  }
  public void setNames(List<LocationAreaName> names) {
    this.names = names;
  }

  /**
   **/
  public LocationAreaDetail pokemonEncounters(List<LocationAreaDetailPokemonEncountersInner> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

