package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.PokedexDescription;
import org.openapitools.vertxweb.server.model.PokedexDetailPokemonEntriesInner;
import org.openapitools.vertxweb.server.model.PokedexName;
import org.openapitools.vertxweb.server.model.RegionSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokedexDetail   {
  
  private Integer id;
  private String name;
  private Boolean isMainSeries;
  private List<PokedexDescription> descriptions = new ArrayList<>();
  private List<PokedexName> names = new ArrayList<>();
  private List<PokedexDetailPokemonEntriesInner> pokemonEntries = new ArrayList<>();
  private RegionSummary region;
  private List<AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();

  public PokedexDetail () {

  }

  public PokedexDetail (Integer id, String name, Boolean isMainSeries, List<PokedexDescription> descriptions, List<PokedexName> names, List<PokedexDetailPokemonEntriesInner> pokemonEntries, RegionSummary region, List<AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.id = id;
    this.name = name;
    this.isMainSeries = isMainSeries;
    this.descriptions = descriptions;
    this.names = names;
    this.pokemonEntries = pokemonEntries;
    this.region = region;
    this.versionGroups = versionGroups;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("is_main_series")
  public Boolean getIsMainSeries() {
    return isMainSeries;
  }
  public void setIsMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
  }

    
  @JsonProperty("descriptions")
  public List<PokedexDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<PokedexDescription> descriptions) {
    this.descriptions = descriptions;
  }

    
  @JsonProperty("names")
  public List<PokedexName> getNames() {
    return names;
  }
  public void setNames(List<PokedexName> names) {
    this.names = names;
  }

    
  @JsonProperty("pokemon_entries")
  public List<PokedexDetailPokemonEntriesInner> getPokemonEntries() {
    return pokemonEntries;
  }
  public void setPokemonEntries(List<PokedexDetailPokemonEntriesInner> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
  }

    
  @JsonProperty("region")
  public RegionSummary getRegion() {
    return region;
  }
  public void setRegion(RegionSummary region) {
    this.region = region;
  }

    
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
