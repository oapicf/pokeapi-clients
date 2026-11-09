package org.openapitools.model;

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

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokedexDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  private Integer id;

 /**
  * The name for this resource.
  */
  @ApiModelProperty(required = true, value = "The name for this resource.")
  private String name;

 /**
  * Whether or not this Pokédex originated in the main series of the video games.
  */
  @ApiModelProperty(value = "Whether or not this Pokédex originated in the main series of the video games.")
  private Boolean isMainSeries;

 /**
  * The description of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The description of this resource listed in different languages.")
  private List<@Valid PokedexDescription> descriptions = new ArrayList<>();

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  private List<@Valid PokedexName> names = new ArrayList<>();

 /**
  * A list of Pokémon catalogued in this Pokédex and their indexes.
  */
  @ApiModelProperty(required = true, value = "A list of Pokémon catalogued in this Pokédex and their indexes.")
  private List<@Valid PokemonDexNumber> pokemonEntries = new ArrayList<>();

 /**
  * The region this Pokédex catalogues Pokémon for.
  */
  @ApiModelProperty(required = true, value = "The region this Pokédex catalogues Pokémon for.")
  @Valid
  private RegionSummary region;

 /**
  * A list of version groups this Pokédex is relevant to.
  */
  @ApiModelProperty(required = true, value = "A list of version groups this Pokédex is relevant to.")
  private List<@Valid VersionGroupSummary> versionGroups = new ArrayList<>();
 /**
  * The identifier for this resource.
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
  * The name for this resource.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
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
  * Whether or not this Pokédex originated in the main series of the video games.
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
  * The description of this resource listed in different languages.
  * @return descriptions
  */
  @JsonProperty("descriptions")
  @NotNull
  public List<@Valid PokedexDescription> getDescriptions() {
    return descriptions;
  }

  /**
   * Sets the <code>descriptions</code> property.
   * <br><em>N.B. <code>descriptions</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setDescriptions(List<@Valid PokedexDescription> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   * Sets the <code>descriptions</code> property.
   * <br><em>N.B. <code>descriptions</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokedexDetail descriptions(List<@Valid PokedexDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  /**
   * Adds a new item to the <code>descriptions</code> list.
   * <br><em>N.B. <code>descriptions</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokedexDetail addDescriptionsItem(PokedexDescription descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

 /**
  * The name of this resource listed in different languages.
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid PokedexName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setNames(List<@Valid PokedexName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokedexDetail names(List<@Valid PokedexName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokedexDetail addNamesItem(PokedexName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
  * A list of Pokémon catalogued in this Pokédex and their indexes.
  * @return pokemonEntries
  */
  @JsonProperty("pokemon_entries")
  @NotNull
  public List<@Valid PokemonDexNumber> getPokemonEntries() {
    return pokemonEntries;
  }

  /**
   * Sets the <code>pokemonEntries</code> property.
   * <br><em>N.B. <code>pokemonEntries</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPokemonEntries(List<@Valid PokemonDexNumber> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
  }

  /**
   * Sets the <code>pokemonEntries</code> property.
   * <br><em>N.B. <code>pokemonEntries</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokedexDetail pokemonEntries(List<@Valid PokemonDexNumber> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
    return this;
  }

  /**
   * Adds a new item to the <code>pokemonEntries</code> list.
   * <br><em>N.B. <code>pokemonEntries</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokedexDetail addPokemonEntriesItem(PokemonDexNumber pokemonEntriesItem) {
    this.pokemonEntries.add(pokemonEntriesItem);
    return this;
  }

 /**
  * The region this Pokédex catalogues Pokémon for.
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
  * A list of version groups this Pokédex is relevant to.
  * @return versionGroups
  */
  @JsonProperty("version_groups")
  @NotNull
  public List<@Valid VersionGroupSummary> getVersionGroups() {
    return versionGroups;
  }

  /**
   * Sets the <code>versionGroups</code> property.
   * <br><em>N.B. <code>versionGroups</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setVersionGroups(List<@Valid VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
  }

  /**
   * Sets the <code>versionGroups</code> property.
   * <br><em>N.B. <code>versionGroups</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokedexDetail versionGroups(List<@Valid VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  /**
   * Adds a new item to the <code>versionGroups</code> list.
   * <br><em>N.B. <code>versionGroups</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokedexDetail addVersionGroupsItem(VersionGroupSummary versionGroupsItem) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

