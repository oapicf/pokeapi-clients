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

/**
 * LocationAreaDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LocationAreaDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("game_index")
  private Integer gameIndex;

  @JsonProperty("encounter_method_rates")
  private List<@Valid LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates = new ArrayList<>();

  @JsonProperty("location")
  private LocationSummary location;

  @JsonProperty("names")
  private List<@Valid LocationAreaName> names = new ArrayList<>();

  @JsonProperty("pokemon_encounters")
  private List<@Valid LocationAreaDetailPokemonEncountersInner> pokemonEncounters = new ArrayList<>();

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public LocationAreaDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
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
   * Get gameIndex
   * @return gameIndex
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getGameIndex() {
    return gameIndex;
  }

  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  public LocationAreaDetail encounterMethodRates(List<@Valid LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
    return this;
  }

  public LocationAreaDetail addEncounterMethodRatesItem(LocationAreaDetailEncounterMethodRatesInner encounterMethodRatesItem) {
    this.encounterMethodRates.add(encounterMethodRatesItem);
    return this;
  }

   /**
   * Get encounterMethodRates
   * @return encounterMethodRates
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid LocationAreaDetailEncounterMethodRatesInner> getEncounterMethodRates() {
    return encounterMethodRates;
  }

  public void setEncounterMethodRates(List<@Valid LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
  }

  public LocationAreaDetail location(LocationSummary location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(required = true, value = "")
  public LocationSummary getLocation() {
    return location;
  }

  public void setLocation(LocationSummary location) {
    this.location = location;
  }

  public LocationAreaDetail names(List<@Valid LocationAreaName> names) {
    this.names = names;
    return this;
  }

  public LocationAreaDetail addNamesItem(LocationAreaName namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid LocationAreaName> getNames() {
    return names;
  }

  public void setNames(List<@Valid LocationAreaName> names) {
    this.names = names;
  }

  public LocationAreaDetail pokemonEncounters(List<@Valid LocationAreaDetailPokemonEncountersInner> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
    return this;
  }

  public LocationAreaDetail addPokemonEncountersItem(LocationAreaDetailPokemonEncountersInner pokemonEncountersItem) {
    this.pokemonEncounters.add(pokemonEncountersItem);
    return this;
  }

   /**
   * Get pokemonEncounters
   * @return pokemonEncounters
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid LocationAreaDetailPokemonEncountersInner> getPokemonEncounters() {
    return pokemonEncounters;
  }

  public void setPokemonEncounters(List<@Valid LocationAreaDetailPokemonEncountersInner> pokemonEncounters) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

