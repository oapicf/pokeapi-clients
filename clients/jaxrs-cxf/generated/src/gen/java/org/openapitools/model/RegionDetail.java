package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.LocationSummary;
import org.openapitools.model.PokedexSummary;
import org.openapitools.model.RegionName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RegionDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid LocationSummary> locations = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private GenerationSummary mainGeneration;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid RegionName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid PokedexSummary> pokedexes = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RegionDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get locations
   * @return locations
  **/
  @JsonProperty("locations")
  @NotNull
  public List<@Valid LocationSummary> getLocations() {
    return locations;
  }

  public void setLocations(List<@Valid LocationSummary> locations) {
    this.locations = locations;
  }

  public RegionDetail locations(List<@Valid LocationSummary> locations) {
    this.locations = locations;
    return this;
  }

  public RegionDetail addLocationsItem(LocationSummary locationsItem) {
    this.locations.add(locationsItem);
    return this;
  }

 /**
   * Get mainGeneration
   * @return mainGeneration
  **/
  @JsonProperty("main_generation")
  @NotNull
  public GenerationSummary getMainGeneration() {
    return mainGeneration;
  }


 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  @NotNull
  public List<@Valid RegionName> getNames() {
    return names;
  }

  public void setNames(List<@Valid RegionName> names) {
    this.names = names;
  }

  public RegionDetail names(List<@Valid RegionName> names) {
    this.names = names;
    return this;
  }

  public RegionDetail addNamesItem(RegionName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
   * Get pokedexes
   * @return pokedexes
  **/
  @JsonProperty("pokedexes")
  @NotNull
  public List<@Valid PokedexSummary> getPokedexes() {
    return pokedexes;
  }

  public void setPokedexes(List<@Valid PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
  }

  public RegionDetail pokedexes(List<@Valid PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
    return this;
  }

  public RegionDetail addPokedexesItem(PokedexSummary pokedexesItem) {
    this.pokedexes.add(pokedexesItem);
    return this;
  }

 /**
   * Get versionGroups
   * @return versionGroups
  **/
  @JsonProperty("version_groups")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getVersionGroups() {
    return versionGroups;
  }

  public void setVersionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
  }

  public RegionDetail versionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  public RegionDetail addVersionGroupsItem(AbilityDetailPokemonInnerPokemon versionGroupsItem) {
    this.versionGroups.add(versionGroupsItem);
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
    RegionDetail regionDetail = (RegionDetail) o;
    return Objects.equals(this.id, regionDetail.id) &&
        Objects.equals(this.name, regionDetail.name) &&
        Objects.equals(this.locations, regionDetail.locations) &&
        Objects.equals(this.mainGeneration, regionDetail.mainGeneration) &&
        Objects.equals(this.names, regionDetail.names) &&
        Objects.equals(this.pokedexes, regionDetail.pokedexes) &&
        Objects.equals(this.versionGroups, regionDetail.versionGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, locations, mainGeneration, names, pokedexes, versionGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    mainGeneration: ").append(toIndentedString(mainGeneration)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pokedexes: ").append(toIndentedString(pokedexes)).append("\n");
    sb.append("    versionGroups: ").append(toIndentedString(versionGroups)).append("\n");
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

