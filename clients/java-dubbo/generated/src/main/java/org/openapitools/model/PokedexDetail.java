package org.openapitools.model;

import org.openapitools.model.PokedexDescription;
import org.openapitools.model.PokedexName;
import org.openapitools.model.PokemonDexNumber;
import org.openapitools.model.RegionSummary;
import org.openapitools.model.VersionGroupSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokedexDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The identifier for this resource.
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * The name for this resource.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Whether or not this Pokédex originated in the main series of the video games.
   */
  @JsonProperty("is_main_series")
  private Boolean isMainSeries;

  /**
   * The description of this resource listed in different languages.
   */
  @JsonProperty("descriptions")
  private List<PokedexDescription> descriptions = new ArrayList<>();

  /**
   * The name of this resource listed in different languages.
   */
  @JsonProperty("names")
  private List<PokedexName> names = new ArrayList<>();

  /**
   * A list of Pokémon catalogued in this Pokédex and their indexes.
   */
  @JsonProperty("pokemon_entries")
  private List<PokemonDexNumber> pokemonEntries = new ArrayList<>();

  /**
   * The region this Pokédex catalogues Pokémon for.
   */
  @JsonProperty("region")
  private RegionSummary region;

  /**
   * A list of version groups this Pokédex is relevant to.
   */
  @JsonProperty("version_groups")
  private List<VersionGroupSummary> versionGroups = new ArrayList<>();

  /**
   * The identifier for this resource.
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether or not this Pokédex originated in the main series of the video games.
   * @return isMainSeries
   */
  public Boolean getIsMainSeries() {
    return isMainSeries;
  }

  public void setIsMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
  }

  /**
   * The description of this resource listed in different languages.
   * @return descriptions
   */
  public List<PokedexDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<PokedexDescription> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
  public List<PokedexName> getNames() {
    return names;
  }

  public void setNames(List<PokedexName> names) {
    this.names = names;
  }

  /**
   * A list of Pokémon catalogued in this Pokédex and their indexes.
   * @return pokemonEntries
   */
  public List<PokemonDexNumber> getPokemonEntries() {
    return pokemonEntries;
  }

  public void setPokemonEntries(List<PokemonDexNumber> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
  }

  /**
   * The region this Pokédex catalogues Pokémon for.
   * @return region
   */
  public RegionSummary getRegion() {
    return region;
  }

  public void setRegion(RegionSummary region) {
    this.region = region;
  }

  /**
   * A list of version groups this Pokédex is relevant to.
   * @return versionGroups
   */
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
