package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.PokedexDescription;
import org.openapitools.model.PokedexDetailPokemonEntriesInner;
import org.openapitools.model.PokedexName;
import org.openapitools.model.RegionSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokedexDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(value = "")
  private Boolean isMainSeries;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokedexDescription> descriptions = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokedexName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokedexDetailPokemonEntriesInner> pokemonEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RegionSummary region;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokedexDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public PokedexDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get isMainSeries
  * @return isMainSeries
  */
  @JsonProperty("is_main_series")
  public Boolean getIsMainSeries() {
    return isMainSeries;
  }

  /**
   * Sets the <code>isMainSeries</code> property.
   */
 public void setIsMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
  }

  /**
   * Sets the <code>isMainSeries</code> property.
   */
  public PokedexDetail isMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
    return this;
  }

 /**
  * Get descriptions
  * @return descriptions
  */
  @JsonProperty("descriptions")
  @NotNull
  public List<@Valid PokedexDescription> getDescriptions() {
    return descriptions;
  }

  /**
   * Sets the <code>descriptions</code> property.
   */
 public void setDescriptions(List<@Valid PokedexDescription> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   * Sets the <code>descriptions</code> property.
   */
  public PokedexDetail descriptions(List<@Valid PokedexDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  /**
   * Adds a new item to the <code>descriptions</code> list.
   */
  public PokedexDetail addDescriptionsItem(PokedexDescription descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid PokedexName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid PokedexName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public PokedexDetail names(List<@Valid PokedexName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public PokedexDetail addNamesItem(PokedexName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
  * Get pokemonEntries
  * @return pokemonEntries
  */
  @JsonProperty("pokemon_entries")
  @NotNull
  public List<@Valid PokedexDetailPokemonEntriesInner> getPokemonEntries() {
    return pokemonEntries;
  }

  /**
   * Sets the <code>pokemonEntries</code> property.
   */
 public void setPokemonEntries(List<@Valid PokedexDetailPokemonEntriesInner> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
  }

  /**
   * Sets the <code>pokemonEntries</code> property.
   */
  public PokedexDetail pokemonEntries(List<@Valid PokedexDetailPokemonEntriesInner> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
    return this;
  }

  /**
   * Adds a new item to the <code>pokemonEntries</code> list.
   */
  public PokedexDetail addPokemonEntriesItem(PokedexDetailPokemonEntriesInner pokemonEntriesItem) {
    this.pokemonEntries.add(pokemonEntriesItem);
    return this;
  }

 /**
  * Get region
  * @return region
  */
  @JsonProperty("region")
  @NotNull
  public RegionSummary getRegion() {
    return region;
  }

  /**
   * Sets the <code>region</code> property.
   */
 public void setRegion(RegionSummary region) {
    this.region = region;
  }

  /**
   * Sets the <code>region</code> property.
   */
  public PokedexDetail region(RegionSummary region) {
    this.region = region;
    return this;
  }

 /**
  * Get versionGroups
  * @return versionGroups
  */
  @JsonProperty("version_groups")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getVersionGroups() {
    return versionGroups;
  }

  /**
   * Sets the <code>versionGroups</code> property.
   */
 public void setVersionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
  }

  /**
   * Sets the <code>versionGroups</code> property.
   */
  public PokedexDetail versionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  /**
   * Adds a new item to the <code>versionGroups</code> list.
   */
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

