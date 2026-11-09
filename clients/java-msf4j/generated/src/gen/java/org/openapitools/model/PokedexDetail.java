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

/**
 * PokedexDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokedexDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("is_main_series")
  private Boolean isMainSeries;

  @JsonProperty("descriptions")
  private List<@Valid PokedexDescription> descriptions = new ArrayList<>();

  @JsonProperty("names")
  private List<@Valid PokedexName> names = new ArrayList<>();

  @JsonProperty("pokemon_entries")
  private List<@Valid PokemonDexNumber> pokemonEntries = new ArrayList<>();

  @JsonProperty("region")
  private RegionSummary region;

  @JsonProperty("version_groups")
  private List<@Valid VersionGroupSummary> versionGroups = new ArrayList<>();

   /**
   * The identifier for this resource.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public PokedexDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this resource.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name for this resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokedexDetail isMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
    return this;
  }

   /**
   * Whether or not this Pokédex originated in the main series of the video games.
   * @return isMainSeries
  **/
  @ApiModelProperty(value = "Whether or not this Pokédex originated in the main series of the video games.")
  public Boolean getIsMainSeries() {
    return isMainSeries;
  }

  public void setIsMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
  }

   /**
   * The description of this resource listed in different languages.
   * @return descriptions
  **/
  @ApiModelProperty(required = true, value = "The description of this resource listed in different languages.")
  public List<@Valid PokedexDescription> getDescriptions() {
    return descriptions;
  }

   /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  public List<@Valid PokedexName> getNames() {
    return names;
  }

   /**
   * A list of Pokémon catalogued in this Pokédex and their indexes.
   * @return pokemonEntries
  **/
  @ApiModelProperty(required = true, value = "A list of Pokémon catalogued in this Pokédex and their indexes.")
  public List<@Valid PokemonDexNumber> getPokemonEntries() {
    return pokemonEntries;
  }

  public PokedexDetail region(RegionSummary region) {
    this.region = region;
    return this;
  }

   /**
   * The region this Pokédex catalogues Pokémon for.
   * @return region
  **/
  @ApiModelProperty(required = true, value = "The region this Pokédex catalogues Pokémon for.")
  public RegionSummary getRegion() {
    return region;
  }

  public void setRegion(RegionSummary region) {
    this.region = region;
  }

   /**
   * A list of version groups this Pokédex is relevant to.
   * @return versionGroups
  **/
  @ApiModelProperty(required = true, value = "A list of version groups this Pokédex is relevant to.")
  public List<@Valid VersionGroupSummary> getVersionGroups() {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

