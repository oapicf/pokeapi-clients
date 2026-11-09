package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokedexDetail   {
  
  private Integer id;

  private String name;

  private Boolean isMainSeries;

  private List<@Valid PokedexDescription> descriptions = new ArrayList<>();

  private List<@Valid PokedexName> names = new ArrayList<>();

  private List<@Valid PokemonDexNumber> pokemonEntries = new ArrayList<>();

  private RegionSummary region;

  private List<@Valid VersionGroupSummary> versionGroups = new ArrayList<>();

  /**
   * The identifier for this resource.
   **/
  public PokedexDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  @NotNull
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
  @NotNull
 @Size(max=200)  public String getName() {
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
  public PokedexDetail descriptions(List<@Valid PokedexDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The description of this resource listed in different languages.")
  @JsonProperty("descriptions")
  @NotNull
  public List<@Valid PokedexDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<@Valid PokedexDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public PokedexDetail addDescriptionsItem(PokedexDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }


  /**
   * The name of this resource listed in different languages.
   **/
  public PokedexDetail names(List<@Valid PokedexName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty("names")
  @NotNull
  public List<@Valid PokedexName> getNames() {
    return names;
  }
  public void setNames(List<@Valid PokedexName> names) {
    this.names = names;
  }

  public PokedexDetail addNamesItem(PokedexName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }


  /**
   * A list of Pokémon catalogued in this Pokédex and their indexes.
   **/
  public PokedexDetail pokemonEntries(List<@Valid PokemonDexNumber> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of Pokémon catalogued in this Pokédex and their indexes.")
  @JsonProperty("pokemon_entries")
  @NotNull
  public List<@Valid PokemonDexNumber> getPokemonEntries() {
    return pokemonEntries;
  }
  public void setPokemonEntries(List<@Valid PokemonDexNumber> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
  }

  public PokedexDetail addPokemonEntriesItem(PokemonDexNumber pokemonEntriesItem) {
    if (this.pokemonEntries == null) {
      this.pokemonEntries = new ArrayList<>();
    }
    this.pokemonEntries.add(pokemonEntriesItem);
    return this;
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
  @NotNull
  public RegionSummary getRegion() {
    return region;
  }
  public void setRegion(RegionSummary region) {
    this.region = region;
  }


  /**
   * A list of version groups this Pokédex is relevant to.
   **/
  public PokedexDetail versionGroups(List<@Valid VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of version groups this Pokédex is relevant to.")
  @JsonProperty("version_groups")
  @NotNull
  public List<@Valid VersionGroupSummary> getVersionGroups() {
    return versionGroups;
  }
  public void setVersionGroups(List<@Valid VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
  }

  public PokedexDetail addVersionGroupsItem(VersionGroupSummary versionGroupsItem) {
    if (this.versionGroups == null) {
      this.versionGroups = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

