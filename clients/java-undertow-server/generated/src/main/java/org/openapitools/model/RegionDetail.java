/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
 *
 * OpenAPI document version: 2.7.0
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
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.LocationSummary;
import org.openapitools.model.PokedexSummary;
import org.openapitools.model.RegionName;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-02-07T04:17:17.108399996Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RegionDetail   {
  
  private Integer id;
  private String name;
  private List<LocationSummary> locations = new ArrayList<>();
  private GenerationSummary mainGeneration;
  private List<RegionName> names = new ArrayList<>();
  private List<PokedexSummary> pokedexes = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();

  /**
   */
  public RegionDetail id(Integer id) {
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
   */
  public RegionDetail name(String name) {
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
   */
  public RegionDetail locations(List<LocationSummary> locations) {
    this.locations = locations;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("locations")
  public List<LocationSummary> getLocations() {
    return locations;
  }
  public void setLocations(List<LocationSummary> locations) {
    this.locations = locations;
  }

  /**
   */
  public RegionDetail mainGeneration(GenerationSummary mainGeneration) {
    this.mainGeneration = mainGeneration;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("main_generation")
  public GenerationSummary getMainGeneration() {
    return mainGeneration;
  }
  public void setMainGeneration(GenerationSummary mainGeneration) {
    this.mainGeneration = mainGeneration;
  }

  /**
   */
  public RegionDetail names(List<RegionName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  public List<RegionName> getNames() {
    return names;
  }
  public void setNames(List<RegionName> names) {
    this.names = names;
  }

  /**
   */
  public RegionDetail pokedexes(List<PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokedexes")
  public List<PokedexSummary> getPokedexes() {
    return pokedexes;
  }
  public void setPokedexes(List<PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
  }

  /**
   */
  public RegionDetail versionGroups(List<AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("version_groups")
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
    return Objects.equals(id, regionDetail.id) &&
        Objects.equals(name, regionDetail.name) &&
        Objects.equals(locations, regionDetail.locations) &&
        Objects.equals(mainGeneration, regionDetail.mainGeneration) &&
        Objects.equals(names, regionDetail.names) &&
        Objects.equals(pokedexes, regionDetail.pokedexes) &&
        Objects.equals(versionGroups, regionDetail.versionGroups);
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

