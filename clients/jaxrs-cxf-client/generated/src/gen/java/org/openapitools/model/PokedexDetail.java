package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokedexDescription;
import org.openapitools.model.PokedexName;
import org.openapitools.model.PokemonDexNumber;
import org.openapitools.model.RegionSummary;
import org.openapitools.model.VersionGroupSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
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

  private List<PokedexDescription> descriptions = new ArrayList<>();

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")

  private List<PokedexName> names = new ArrayList<>();

 /**
  * A list of Pokémon catalogued in this Pokédex and their indexes.
  */
  @ApiModelProperty(required = true, value = "A list of Pokémon catalogued in this Pokédex and their indexes.")

  private List<PokemonDexNumber> pokemonEntries = new ArrayList<>();

 /**
  * The region this Pokédex catalogues Pokémon for.
  */
  @ApiModelProperty(required = true, value = "The region this Pokédex catalogues Pokémon for.")

  private RegionSummary region;

 /**
  * A list of version groups this Pokédex is relevant to.
  */
  @ApiModelProperty(required = true, value = "A list of version groups this Pokédex is relevant to.")

  private List<VersionGroupSummary> versionGroups = new ArrayList<>();
 /**
   * The identifier for this resource.
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * The name for this resource.
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
   * Whether or not this Pokédex originated in the main series of the video games.
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
   * The description of this resource listed in different languages.
   * @return descriptions
  **/
  @JsonProperty("descriptions")
  public List<PokedexDescription> getDescriptions() {
    return descriptions;
  }


 /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  @JsonProperty("names")
  public List<PokedexName> getNames() {
    return names;
  }


 /**
   * A list of Pokémon catalogued in this Pokédex and their indexes.
   * @return pokemonEntries
  **/
  @JsonProperty("pokemon_entries")
  public List<PokemonDexNumber> getPokemonEntries() {
    return pokemonEntries;
  }


 /**
   * The region this Pokédex catalogues Pokémon for.
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
   * A list of version groups this Pokédex is relevant to.
   * @return versionGroups
  **/
  @JsonProperty("version_groups")
  public List<VersionGroupSummary> getVersionGroups() {
    return versionGroups;
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

