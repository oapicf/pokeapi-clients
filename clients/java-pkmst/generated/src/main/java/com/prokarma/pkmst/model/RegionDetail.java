package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AbilityDetailPokemonInnerPokemon;
import com.prokarma.pkmst.model.GenerationSummary;
import com.prokarma.pkmst.model.LocationSummary;
import com.prokarma.pkmst.model.PokedexSummary;
import com.prokarma.pkmst.model.RegionName;
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
 * RegionDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RegionDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("locations")
  
  private List<LocationSummary> locations = new ArrayList<>();

  @JsonProperty("main_generation")
  private GenerationSummary mainGeneration;

  @JsonProperty("names")
  
  private List<RegionName> names = new ArrayList<>();

  @JsonProperty("pokedexes")
  
  private List<PokedexSummary> pokedexes = new ArrayList<>();

  @JsonProperty("version_groups")
  
  private List<AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();

  public RegionDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RegionDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RegionDetail locations(List<LocationSummary> locations) {
    this.locations = locations;
    return this;
  }

  public RegionDetail addLocationsItem(LocationSummary locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * Get locations
   * @return locations
   */
  @ApiModelProperty(required = true, value = "")
  public List<LocationSummary> getLocations() {
    return locations;
  }

  public void setLocations(List<LocationSummary> locations) {
    this.locations = locations;
  }

  public RegionDetail mainGeneration(GenerationSummary mainGeneration) {
    this.mainGeneration = mainGeneration;
    return this;
  }

  /**
   * Get mainGeneration
   * @return mainGeneration
   */
  @ApiModelProperty(required = true, readOnly = true, value = "")
  public GenerationSummary getMainGeneration() {
    return mainGeneration;
  }

  public void setMainGeneration(GenerationSummary mainGeneration) {
    this.mainGeneration = mainGeneration;
  }

  public RegionDetail names(List<RegionName> names) {
    this.names = names;
    return this;
  }

  public RegionDetail addNamesItem(RegionName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * Get names
   * @return names
   */
  @ApiModelProperty(required = true, value = "")
  public List<RegionName> getNames() {
    return names;
  }

  public void setNames(List<RegionName> names) {
    this.names = names;
  }

  public RegionDetail pokedexes(List<PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
    return this;
  }

  public RegionDetail addPokedexesItem(PokedexSummary pokedexesItem) {
    if (this.pokedexes == null) {
      this.pokedexes = new ArrayList<>();
    }
    this.pokedexes.add(pokedexesItem);
    return this;
  }

  /**
   * Get pokedexes
   * @return pokedexes
   */
  @ApiModelProperty(required = true, value = "")
  public List<PokedexSummary> getPokedexes() {
    return pokedexes;
  }

  public void setPokedexes(List<PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
  }

  public RegionDetail versionGroups(List<AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  public RegionDetail addVersionGroupsItem(AbilityDetailPokemonInnerPokemon versionGroupsItem) {
    if (this.versionGroups == null) {
      this.versionGroups = new ArrayList<>();
    }
    this.versionGroups.add(versionGroupsItem);
    return this;
  }

  /**
   * Get versionGroups
   * @return versionGroups
   */
  @ApiModelProperty(required = true, value = "")
  public List<AbilityDetailPokemonInnerPokemon> getVersionGroups() {
    return versionGroups;
  }

  public void setVersionGroups(List<AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

