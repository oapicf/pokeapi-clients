package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokedexDescription;
import org.openapitools.model.PokedexName;
import org.openapitools.model.PokemonDexNumber;
import org.openapitools.model.RegionSummary;
import org.openapitools.model.VersionGroupSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokedexDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokedexDetail {

  private Integer id;

  private String name;

  private Boolean isMainSeries;

  private List<@Valid PokedexDescription> descriptions = new ArrayList<>();

  private List<@Valid PokedexName> names = new ArrayList<>();

  private List<@Valid PokemonDexNumber> pokemonEntries = new ArrayList<>();

  private JsonNullable<RegionSummary> region = JsonNullable.<RegionSummary>undefined();

  private List<@Valid VersionGroupSummary> versionGroups = new ArrayList<>();

  public PokedexDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokedexDetail(Integer id, String name, List<@Valid PokedexDescription> descriptions, List<@Valid PokedexName> names, List<@Valid PokemonDexNumber> pokemonEntries, RegionSummary region, List<@Valid VersionGroupSummary> versionGroups) {
    this.id = id;
    this.name = name;
    this.descriptions = descriptions;
    this.names = names;
    this.pokemonEntries = pokemonEntries;
    this.region = JsonNullable.of(region);
    this.versionGroups = versionGroups;
  }

  public PokedexDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The identifier for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   */
  @NotNull @Size(max = 200) 
  @Schema(name = "name", description = "The name for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
   */
  
  @Schema(name = "is_main_series", description = "Whether or not this Pokédex originated in the main series of the video games.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_main_series")
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
   */
  
  @Schema(name = "descriptions", accessMode = Schema.AccessMode.READ_ONLY, description = "The description of this resource listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("descriptions")
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
   */
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of this resource listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
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
   */
  
  @Schema(name = "pokemon_entries", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of Pokémon catalogued in this Pokédex and their indexes.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon_entries")
  public List<@Valid PokemonDexNumber> getPokemonEntries() {
    return pokemonEntries;
  }

  public void setPokemonEntries(List<@Valid PokemonDexNumber> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
  }

  public PokedexDetail region(RegionSummary region) {
    this.region = JsonNullable.of(region);
    return this;
  }

  /**
   * The region this Pokédex catalogues Pokémon for.
   * @return region
   */
  /* @Present */ @Valid 
  @Schema(name = "region", description = "The region this Pokédex catalogues Pokémon for.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("region")
  public JsonNullable<RegionSummary> getRegion() {
    return region;
  }

  public void setRegion(JsonNullable<RegionSummary> region) {
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
   */
  
  @Schema(name = "version_groups", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of version groups this Pokédex is relevant to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_groups")
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

