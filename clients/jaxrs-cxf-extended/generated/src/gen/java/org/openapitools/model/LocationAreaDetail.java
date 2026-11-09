package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaEncounterRate;
import org.openapitools.model.LocationAreaName;
import org.openapitools.model.LocationAreaPokemonEncounter;
import org.openapitools.model.LocationSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LocationAreaDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  private Integer id;

 /**
  * The name for this resource.
  */
  @ApiModelProperty(required = true, value = "The name for this resource.")
  private String name;

 /**
  * The internal id of an API resource within game data.
  */
  @ApiModelProperty(required = true, value = "The internal id of an API resource within game data.")
  private Integer gameIndex;

 /**
  * A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
  */
  @ApiModelProperty(required = true, value = "A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.")
  private List<@Valid LocationAreaEncounterRate> encounterMethodRates = new ArrayList<>();

 /**
  * The region this location area can be found in.
  */
  @ApiModelProperty(required = true, value = "The region this location area can be found in.")
  @Valid
  private LocationSummary location;

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  private List<@Valid LocationAreaName> names = new ArrayList<>();

 /**
  * A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
  */
  @ApiModelProperty(required = true, value = "A list of Pokémon that can be encountered in this area along with version specific details about the encounter.")
  private List<@Valid LocationAreaPokemonEncounter> pokemonEncounters = new ArrayList<>();
 /**
  * The identifier for this resource.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public LocationAreaDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * The name for this resource.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public LocationAreaDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The internal id of an API resource within game data.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return gameIndex
  */
  @JsonProperty("game_index")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getGameIndex() {
    return gameIndex;
  }

  /**
   * Sets the <code>gameIndex</code> property.
   */
 public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  /**
   * Sets the <code>gameIndex</code> property.
   */
  public LocationAreaDetail gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

 /**
  * A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
  * @return encounterMethodRates
  */
  @JsonProperty("encounter_method_rates")
  @NotNull
  public List<@Valid LocationAreaEncounterRate> getEncounterMethodRates() {
    return encounterMethodRates;
  }

  /**
   * Sets the <code>encounterMethodRates</code> property.
   * <br><em>N.B. <code>encounterMethodRates</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setEncounterMethodRates(List<@Valid LocationAreaEncounterRate> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
  }

  /**
   * Sets the <code>encounterMethodRates</code> property.
   * <br><em>N.B. <code>encounterMethodRates</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public LocationAreaDetail encounterMethodRates(List<@Valid LocationAreaEncounterRate> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
    return this;
  }

  /**
   * Adds a new item to the <code>encounterMethodRates</code> list.
   * <br><em>N.B. <code>encounterMethodRates</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public LocationAreaDetail addEncounterMethodRatesItem(LocationAreaEncounterRate encounterMethodRatesItem) {
    this.encounterMethodRates.add(encounterMethodRatesItem);
    return this;
  }

 /**
  * The region this location area can be found in.
  * @return location
  */
  @JsonProperty("location")
  @NotNull
  public LocationSummary getLocation() {
    return location;
  }

  /**
   * Sets the <code>location</code> property.
   */
 public void setLocation(LocationSummary location) {
    this.location = location;
  }

  /**
   * Sets the <code>location</code> property.
   */
  public LocationAreaDetail location(LocationSummary location) {
    this.location = location;
    return this;
  }

 /**
  * The name of this resource listed in different languages.
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid LocationAreaName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setNames(List<@Valid LocationAreaName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public LocationAreaDetail names(List<@Valid LocationAreaName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public LocationAreaDetail addNamesItem(LocationAreaName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
  * A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
  * @return pokemonEncounters
  */
  @JsonProperty("pokemon_encounters")
  @NotNull
  public List<@Valid LocationAreaPokemonEncounter> getPokemonEncounters() {
    return pokemonEncounters;
  }

  /**
   * Sets the <code>pokemonEncounters</code> property.
   * <br><em>N.B. <code>pokemonEncounters</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPokemonEncounters(List<@Valid LocationAreaPokemonEncounter> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
  }

  /**
   * Sets the <code>pokemonEncounters</code> property.
   * <br><em>N.B. <code>pokemonEncounters</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public LocationAreaDetail pokemonEncounters(List<@Valid LocationAreaPokemonEncounter> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
    return this;
  }

  /**
   * Adds a new item to the <code>pokemonEncounters</code> list.
   * <br><em>N.B. <code>pokemonEncounters</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public LocationAreaDetail addPokemonEncountersItem(LocationAreaPokemonEncounter pokemonEncountersItem) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

