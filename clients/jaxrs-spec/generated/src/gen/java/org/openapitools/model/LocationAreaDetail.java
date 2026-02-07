package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaDetailEncounterMethodRatesInner;
import org.openapitools.model.LocationAreaDetailPokemonEncountersInner;
import org.openapitools.model.LocationAreaName;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LocationAreaDetail   {
  private Integer id;
  private String name;
  private Integer gameIndex;
  private @Valid List<@Valid LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates = new ArrayList<>();
  private LocationSummary location;
  private @Valid List<@Valid LocationAreaName> names = new ArrayList<>();
  private @Valid List<@Valid LocationAreaDetailPokemonEncountersInner> pokemonEncounters = new ArrayList<>();

  public LocationAreaDetail() {
  }

  @JsonCreator
  public LocationAreaDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "game_index") Integer gameIndex,
    @JsonProperty(required = true, value = "encounter_method_rates") List<@Valid LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates,
    @JsonProperty(required = true, value = "location") LocationSummary location,
    @JsonProperty(required = true, value = "names") List<@Valid LocationAreaName> names,
    @JsonProperty(required = true, value = "pokemon_encounters") List<@Valid LocationAreaDetailPokemonEncountersInner> pokemonEncounters
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
   **/
  public LocationAreaDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
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
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=100)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
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
  @JsonProperty(required = true, value = "game_index")
  @NotNull public Integer getGameIndex() {
    return gameIndex;
  }

  @JsonProperty(required = true, value = "game_index")
  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  /**
   **/
  public LocationAreaDetail encounterMethodRates(List<@Valid LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "encounter_method_rates")
  @NotNull @Valid public List<@Valid LocationAreaDetailEncounterMethodRatesInner> getEncounterMethodRates() {
    return encounterMethodRates;
  }

  @JsonProperty(required = true, value = "encounter_method_rates")
  public void setEncounterMethodRates(List<@Valid LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates) {
    this.encounterMethodRates = encounterMethodRates;
  }

  public LocationAreaDetail addEncounterMethodRatesItem(LocationAreaDetailEncounterMethodRatesInner encounterMethodRatesItem) {
    if (this.encounterMethodRates == null) {
      this.encounterMethodRates = new ArrayList<>();
    }

    this.encounterMethodRates.add(encounterMethodRatesItem);
    return this;
  }

  public LocationAreaDetail removeEncounterMethodRatesItem(LocationAreaDetailEncounterMethodRatesInner encounterMethodRatesItem) {
    if (encounterMethodRatesItem != null && this.encounterMethodRates != null) {
      this.encounterMethodRates.remove(encounterMethodRatesItem);
    }

    return this;
  }
  /**
   **/
  public LocationAreaDetail location(LocationSummary location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "location")
  @NotNull @Valid public LocationSummary getLocation() {
    return location;
  }

  @JsonProperty(required = true, value = "location")
  public void setLocation(LocationSummary location) {
    this.location = location;
  }

  /**
   **/
  public LocationAreaDetail names(List<@Valid LocationAreaName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid LocationAreaName> getNames() {
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
   **/
  public LocationAreaDetail pokemonEncounters(List<@Valid LocationAreaDetailPokemonEncountersInner> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "pokemon_encounters")
  @NotNull @Valid public List<@Valid LocationAreaDetailPokemonEncountersInner> getPokemonEncounters() {
    return pokemonEncounters;
  }

  @JsonProperty(required = true, value = "pokemon_encounters")
  public void setPokemonEncounters(List<@Valid LocationAreaDetailPokemonEncountersInner> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
  }

  public LocationAreaDetail addPokemonEncountersItem(LocationAreaDetailPokemonEncountersInner pokemonEncountersItem) {
    if (this.pokemonEncounters == null) {
      this.pokemonEncounters = new ArrayList<>();
    }

    this.pokemonEncounters.add(pokemonEncountersItem);
    return this;
  }

  public LocationAreaDetail removePokemonEncountersItem(LocationAreaDetailPokemonEncountersInner pokemonEncountersItem) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

