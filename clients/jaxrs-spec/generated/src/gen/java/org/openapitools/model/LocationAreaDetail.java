package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaEncounterRate;
import org.openapitools.model.LocationAreaName;
import org.openapitools.model.LocationAreaPokemonEncounter;
import org.openapitools.model.LocationSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LocationAreaDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationAreaDetail   {
  private Integer id;
  private String name;
  private Integer gameIndex;
  private List<@Valid LocationAreaEncounterRate> encounterMethodRates = new ArrayList<>();
  private LocationSummary location;
  private List<@Valid LocationAreaName> names = new ArrayList<>();
  private List<@Valid LocationAreaPokemonEncounter> pokemonEncounters = new ArrayList<>();

  public LocationAreaDetail() {
  }

  @JsonCreator
  public LocationAreaDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "game_index") Integer gameIndex,
    @JsonProperty(required = true, value = "encounter_method_rates") List<@Valid LocationAreaEncounterRate> encounterMethodRates,
    @JsonProperty(required = true, value = "location") LocationSummary location,
    @JsonProperty(required = true, value = "names") List<@Valid LocationAreaName> names,
    @JsonProperty(required = true, value = "pokemon_encounters") List<@Valid LocationAreaPokemonEncounter> pokemonEncounters
  ) {
    this.id = id;
    this.name = name;
    this.gameIndex = gameIndex;
    this.encounterMethodRates = encounterMethodRates;
    this.location = location;
    this.names = names;
    this.pokemonEncounters = pokemonEncounters;
  }

  /**
   * The identifier for this resource.
   **/
  public LocationAreaDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  public LocationAreaDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=200)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The internal id of an API resource within game data.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public LocationAreaDetail gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The internal id of an API resource within game data.")
  @JsonProperty(required = true, value = "game_index")
  @NotNull  @Min(-2147483648) @Max(2147483647)public Integer getGameIndex() {
    return gameIndex;
  }

  @JsonProperty(required = true, value = "game_index")
  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  /**
   * A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
   **/
  public LocationAreaDetail encounterMethodRates(List<@Valid LocationAreaEncounterRate> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.")
  @JsonProperty(required = true, value = "encounter_method_rates")
  public List<@Valid LocationAreaEncounterRate> getEncounterMethodRates() {
    return encounterMethodRates;
  }

  @JsonProperty(required = true, value = "encounter_method_rates")
  public void setEncounterMethodRates(List<@Valid LocationAreaEncounterRate> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
  }

  public LocationAreaDetail addEncounterMethodRatesItem(LocationAreaEncounterRate encounterMethodRatesItem) {
    if (this.encounterMethodRates == null) {
      this.encounterMethodRates = new ArrayList<>();
    }

    this.encounterMethodRates.add(encounterMethodRatesItem);
    return this;
  }

  public LocationAreaDetail removeEncounterMethodRatesItem(LocationAreaEncounterRate encounterMethodRatesItem) {
    if (encounterMethodRatesItem != null && this.encounterMethodRates != null) {
      this.encounterMethodRates.remove(encounterMethodRatesItem);
    }

    return this;
  }
  /**
   * The region this location area can be found in.
   **/
  public LocationAreaDetail location(LocationSummary location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The region this location area can be found in.")
  @JsonProperty(required = true, value = "location")
  @NotNull @Valid public LocationSummary getLocation() {
    return location;
  }

  @JsonProperty(required = true, value = "location")
  public void setLocation(LocationSummary location) {
    this.location = location;
  }

  /**
   * The name of this resource listed in different languages.
   **/
  public LocationAreaDetail names(List<@Valid LocationAreaName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty(required = true, value = "names")
  public List<@Valid LocationAreaName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid LocationAreaName> names) {
    this.names = names;
  }

  public LocationAreaDetail addNamesItem(LocationAreaName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public LocationAreaDetail removeNamesItem(LocationAreaName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

    return this;
  }
  /**
   * A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
   **/
  public LocationAreaDetail pokemonEncounters(List<@Valid LocationAreaPokemonEncounter> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of Pokémon that can be encountered in this area along with version specific details about the encounter.")
  @JsonProperty(required = true, value = "pokemon_encounters")
  public List<@Valid LocationAreaPokemonEncounter> getPokemonEncounters() {
    return pokemonEncounters;
  }

  @JsonProperty(required = true, value = "pokemon_encounters")
  public void setPokemonEncounters(List<@Valid LocationAreaPokemonEncounter> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
  }

  public LocationAreaDetail addPokemonEncountersItem(LocationAreaPokemonEncounter pokemonEncountersItem) {
    if (this.pokemonEncounters == null) {
      this.pokemonEncounters = new ArrayList<>();
    }

    this.pokemonEncounters.add(pokemonEncountersItem);
    return this;
  }

  public LocationAreaDetail removePokemonEncountersItem(LocationAreaPokemonEncounter pokemonEncountersItem) {
    if (pokemonEncountersItem != null && this.pokemonEncounters != null) {
      this.pokemonEncounters.remove(pokemonEncountersItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
