package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.PokedexDescription;
import org.openapitools.model.PokedexDetailPokemonEntriesInner;
import org.openapitools.model.PokedexName;
import org.openapitools.model.RegionSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokedexDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(value = "")

  private Boolean isMainSeries;

  @ApiModelProperty(required = true, value = "")

  private List<PokedexDescription> descriptions = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<PokedexName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<PokedexDetailPokemonEntriesInner> pokemonEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private RegionSummary region;

  @ApiModelProperty(required = true, value = "")

  private List<AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();
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

  public PokedexDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get isMainSeries
   * @return isMainSeries
  **/
  @JsonProperty("is_main_series")
  public Boolean getIsMainSeries() {
    return isMainSeries;
  }

  public void setIsMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
  }

  public PokedexDetail isMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
    return this;
  }

 /**
   * Get descriptions
   * @return descriptions
  **/
  @JsonProperty("descriptions")
  public List<PokedexDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<PokedexDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public PokedexDetail descriptions(List<PokedexDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public PokedexDetail addDescriptionsItem(PokedexDescription descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<PokedexName> getNames() {
    return names;
  }

  public void setNames(List<PokedexName> names) {
    this.names = names;
  }

  public PokedexDetail names(List<PokedexName> names) {
    this.names = names;
    return this;
  }

  public PokedexDetail addNamesItem(PokedexName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
   * Get pokemonEntries
   * @return pokemonEntries
  **/
  @JsonProperty("pokemon_entries")
  public List<PokedexDetailPokemonEntriesInner> getPokemonEntries() {
    return pokemonEntries;
  }

  public void setPokemonEntries(List<PokedexDetailPokemonEntriesInner> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
  }

  public PokedexDetail pokemonEntries(List<PokedexDetailPokemonEntriesInner> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
    return this;
  }

  public PokedexDetail addPokemonEntriesItem(PokedexDetailPokemonEntriesInner pokemonEntriesItem) {
    this.pokemonEntries.add(pokemonEntriesItem);
    return this;
  }

 /**
   * Get region
   * @return region
  **/
  @JsonProperty("region")
  public RegionSummary getRegion() {
    return region;
  }

  public void setRegion(RegionSummary region) {
    this.region = region;
  }

  public PokedexDetail region(RegionSummary region) {
    this.region = region;
    return this;
  }

 /**
   * Get versionGroups
   * @return versionGroups
  **/
  @JsonProperty("version_groups")
  public List<AbilityDetailPokemonInnerPokemon> getVersionGroups() {
    return versionGroups;
  }

  public void setVersionGroups(List<AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
  }

  public PokedexDetail versionGroups(List<AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  public PokedexDetail addVersionGroupsItem(AbilityDetailPokemonInnerPokemon versionGroupsItem) {
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
    PokedexDetail pokedexDetail = (PokedexDetail) o;
    return Objects.equals(this.id, pokedexDetail.id) &&
        Objects.equals(this.name, pokedexDetail.name) &&
        Objects.equals(this.isMainSeries, pokedexDetail.isMainSeries) &&
        Objects.equals(this.descriptions, pokedexDetail.descriptions) &&
        Objects.equals(this.names, pokedexDetail.names) &&
        Objects.equals(this.pokemonEntries, pokedexDetail.pokemonEntries) &&
        Objects.equals(this.region, pokedexDetail.region) &&
        Objects.equals(this.versionGroups, pokedexDetail.versionGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isMainSeries, descriptions, names, pokemonEntries, region, versionGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokedexDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isMainSeries: ").append(toIndentedString(isMainSeries)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pokemonEntries: ").append(toIndentedString(pokemonEntries)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

