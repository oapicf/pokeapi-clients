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
import org.openapitools.model.PokedexDescription;
import org.openapitools.model.PokedexDetailPokemonEntriesInner;
import org.openapitools.model.PokedexName;
import org.openapitools.model.RegionSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokedexDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("is_main_series")
  private Boolean isMainSeries;

  @JsonProperty("descriptions")
  private List<PokedexDescription> descriptions = new ArrayList<>();

  @JsonProperty("names")
  private List<PokedexName> names = new ArrayList<>();

  @JsonProperty("pokemon_entries")
  private List<PokedexDetailPokemonEntriesInner> pokemonEntries = new ArrayList<>();

  @JsonProperty("region")
  private RegionSummary region;

  @JsonProperty("version_groups")
  private List<AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();

  /**
   **/
  public PokedexDetail id(Integer id) {
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
  public PokedexDetail name(String name) {
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
  public PokedexDetail isMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_main_series")
  public Boolean getIsMainSeries() {
    return isMainSeries;
  }
  public void setIsMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
  }

  /**
   **/
  public PokedexDetail descriptions(List<PokedexDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("descriptions")
  public List<PokedexDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<PokedexDescription> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   **/
  public PokedexDetail names(List<PokedexName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  public List<PokedexName> getNames() {
    return names;
  }
  public void setNames(List<PokedexName> names) {
    this.names = names;
  }

  /**
   **/
  public PokedexDetail pokemonEntries(List<PokedexDetailPokemonEntriesInner> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokemon_entries")
  public List<PokedexDetailPokemonEntriesInner> getPokemonEntries() {
    return pokemonEntries;
  }
  public void setPokemonEntries(List<PokedexDetailPokemonEntriesInner> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
  }

  /**
   **/
  public PokedexDetail region(RegionSummary region) {
    this.region = region;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("region")
  public RegionSummary getRegion() {
    return region;
  }
  public void setRegion(RegionSummary region) {
    this.region = region;
  }

  /**
   **/
  public PokedexDetail versionGroups(List<AbilityDetailPokemonInnerPokemon> versionGroups) {
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
    PokedexDetail pokedexDetail = (PokedexDetail) o;
    return Objects.equals(id, pokedexDetail.id) &&
        Objects.equals(name, pokedexDetail.name) &&
        Objects.equals(isMainSeries, pokedexDetail.isMainSeries) &&
        Objects.equals(descriptions, pokedexDetail.descriptions) &&
        Objects.equals(names, pokedexDetail.names) &&
        Objects.equals(pokemonEntries, pokedexDetail.pokemonEntries) &&
        Objects.equals(region, pokedexDetail.region) &&
        Objects.equals(versionGroups, pokedexDetail.versionGroups);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

