package apimodels;

import apimodels.PokedexDescription;
import apimodels.PokedexName;
import apimodels.PokemonDexNumber;
import apimodels.RegionSummary;
import apimodels.VersionGroupSummary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokedexDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokedexDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("is_main_series")
  
  private Boolean isMainSeries;

  @JsonProperty("descriptions")
  @NotNull
@Valid

  private List<@Valid PokedexDescription> descriptions = new ArrayList<>();

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid PokedexName> names = new ArrayList<>();

  @JsonProperty("pokemon_entries")
  @NotNull
@Valid

  private List<@Valid PokemonDexNumber> pokemonEntries = new ArrayList<>();

  @JsonProperty("region")
  @NotNull
@Valid

  private RegionSummary region;

  @JsonProperty("version_groups")
  @NotNull
@Valid

  private List<@Valid VersionGroupSummary> versionGroups = new ArrayList<>();

  public PokedexDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier for this resource.
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PokedexDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this resource.
   * @return name
  **/
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
  public Boolean getIsMainSeries() {
    return isMainSeries;
  }

  public void setIsMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
  }

  public PokedexDetail descriptions(List<@Valid PokedexDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public PokedexDetail addDescriptionsItem(PokedexDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * The description of this resource listed in different languages.
   * @return descriptions
  **/
  public List<@Valid PokedexDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<@Valid PokedexDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public PokedexDetail names(List<@Valid PokedexName> names) {
    this.names = names;
    return this;
  }

  public PokedexDetail addNamesItem(PokedexName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  public List<@Valid PokedexName> getNames() {
    return names;
  }

  public void setNames(List<@Valid PokedexName> names) {
    this.names = names;
  }

  public PokedexDetail pokemonEntries(List<@Valid PokemonDexNumber> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
    return this;
  }

  public PokedexDetail addPokemonEntriesItem(PokemonDexNumber pokemonEntriesItem) {
    if (this.pokemonEntries == null) {
      this.pokemonEntries = new ArrayList<>();
    }
    this.pokemonEntries.add(pokemonEntriesItem);
    return this;
  }

   /**
   * A list of Pokémon catalogued in this Pokédex and their indexes.
   * @return pokemonEntries
  **/
  public List<@Valid PokemonDexNumber> getPokemonEntries() {
    return pokemonEntries;
  }

  public void setPokemonEntries(List<@Valid PokemonDexNumber> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
  }

  public PokedexDetail region(RegionSummary region) {
    this.region = region;
    return this;
  }

   /**
   * The region this Pokédex catalogues Pokémon for.
   * @return region
  **/
  public RegionSummary getRegion() {
    return region;
  }

  public void setRegion(RegionSummary region) {
    this.region = region;
  }

  public PokedexDetail versionGroups(List<@Valid VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  public PokedexDetail addVersionGroupsItem(VersionGroupSummary versionGroupsItem) {
    if (this.versionGroups == null) {
      this.versionGroups = new ArrayList<>();
    }
    this.versionGroups.add(versionGroupsItem);
    return this;
  }

   /**
   * A list of version groups this Pokédex is relevant to.
   * @return versionGroups
  **/
  public List<@Valid VersionGroupSummary> getVersionGroups() {
    return versionGroups;
  }

  public void setVersionGroups(List<@Valid VersionGroupSummary> versionGroups) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

