package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokedexDescription;
import org.openapitools.model.PokedexName;
import org.openapitools.model.PokemonDexNumber;
import org.openapitools.model.RegionSummary;
import org.openapitools.model.VersionGroupSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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
  private List<PokemonDexNumber> pokemonEntries = new ArrayList<>();

  @JsonProperty("region")
  private RegionSummary region;

  @JsonProperty("version_groups")
  private List<VersionGroupSummary> versionGroups = new ArrayList<>();

  /**
   * The identifier for this resource.
   **/
  public PokedexDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  public PokedexDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether or not this Pokédex originated in the main series of the video games.
   **/
  public PokedexDetail isMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not this Pokédex originated in the main series of the video games.")
  @JsonProperty("is_main_series")
  public Boolean getIsMainSeries() {
    return isMainSeries;
  }
  public void setIsMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
  }

  /**
   * The description of this resource listed in different languages.
   **/
  public PokedexDetail descriptions(List<PokedexDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The description of this resource listed in different languages.")
  @JsonProperty("descriptions")
  public List<PokedexDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<PokedexDescription> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   * The name of this resource listed in different languages.
   **/
  public PokedexDetail names(List<PokedexName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty("names")
  public List<PokedexName> getNames() {
    return names;
  }
  public void setNames(List<PokedexName> names) {
    this.names = names;
  }

  /**
   * A list of Pokémon catalogued in this Pokédex and their indexes.
   **/
  public PokedexDetail pokemonEntries(List<PokemonDexNumber> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of Pokémon catalogued in this Pokédex and their indexes.")
  @JsonProperty("pokemon_entries")
  public List<PokemonDexNumber> getPokemonEntries() {
    return pokemonEntries;
  }
  public void setPokemonEntries(List<PokemonDexNumber> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
  }

  /**
   * The region this Pokédex catalogues Pokémon for.
   **/
  public PokedexDetail region(RegionSummary region) {
    this.region = region;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The region this Pokédex catalogues Pokémon for.")
  @JsonProperty("region")
  public RegionSummary getRegion() {
    return region;
  }
  public void setRegion(RegionSummary region) {
    this.region = region;
  }

  /**
   * A list of version groups this Pokédex is relevant to.
   **/
  public PokedexDetail versionGroups(List<VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of version groups this Pokédex is relevant to.")
  @JsonProperty("version_groups")
  public List<VersionGroupSummary> getVersionGroups() {
    return versionGroups;
  }
  public void setVersionGroups(List<VersionGroupSummary> versionGroups) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

