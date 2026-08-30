package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.PokedexDescription;
import org.openapitools.model.PokedexDetailPokemonEntriesInner;
import org.openapitools.model.PokedexName;
import org.openapitools.model.RegionSummary;
import org.springframework.lang.Nullable;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T02:00:43.960184425Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PokedexDetail {

  private Integer id;

  private String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isMainSeries;

  private List<@Valid PokedexDescription> descriptions = new ArrayList<>();

  private List<@Valid PokedexName> names = new ArrayList<>();

  private List<@Valid PokedexDetailPokemonEntriesInner> pokemonEntries = new ArrayList<>();

  private RegionSummary region;

  private List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();

  public PokedexDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokedexDetail(Integer id, String name, List<@Valid PokedexDescription> descriptions, List<@Valid PokedexName> names, List<@Valid PokedexDetailPokemonEntriesInner> pokemonEntries, RegionSummary region, List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.id = id;
    this.name = name;
    this.descriptions = descriptions;
    this.names = names;
    this.pokemonEntries = pokemonEntries;
    this.region = region;
    this.versionGroups = versionGroups;
  }

  public PokedexDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Integer id) {
    this.id = id;
  }

  public PokedexDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public PokedexDetail isMainSeries(@Nullable Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
    return this;
  }

  /**
   * Get isMainSeries
   * @return isMainSeries
   */
  
  @Schema(name = "is_main_series", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_main_series")
  public @Nullable Boolean getIsMainSeries() {
    return isMainSeries;
  }

  @JsonProperty("is_main_series")
  public void setIsMainSeries(@Nullable Boolean isMainSeries) {
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
   * Get descriptions
   * @return descriptions
   */
  @Valid 
  @Schema(name = "descriptions", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("descriptions")
  public List<@Valid PokedexDescription> getDescriptions() {
    return descriptions;
  }

  @JsonProperty("descriptions")
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
   * Get names
   * @return names
   */
  @Valid 
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid PokedexName> getNames() {
    return names;
  }

  @JsonProperty("names")
  public void setNames(List<@Valid PokedexName> names) {
    this.names = names;
  }

  public PokedexDetail pokemonEntries(List<@Valid PokedexDetailPokemonEntriesInner> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
    return this;
  }

  public PokedexDetail addPokemonEntriesItem(PokedexDetailPokemonEntriesInner pokemonEntriesItem) {
    if (this.pokemonEntries == null) {
      this.pokemonEntries = new ArrayList<>();
    }
    this.pokemonEntries.add(pokemonEntriesItem);
    return this;
  }

  /**
   * Get pokemonEntries
   * @return pokemonEntries
   */
  @Valid 
  @Schema(name = "pokemon_entries", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon_entries")
  public List<@Valid PokedexDetailPokemonEntriesInner> getPokemonEntries() {
    return pokemonEntries;
  }

  @JsonProperty("pokemon_entries")
  public void setPokemonEntries(List<@Valid PokedexDetailPokemonEntriesInner> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
  }

  public PokedexDetail region(RegionSummary region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   */
  @NotNull @Valid 
  @Schema(name = "region", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("region")
  public RegionSummary getRegion() {
    return region;
  }

  @JsonProperty("region")
  public void setRegion(RegionSummary region) {
    this.region = region;
  }

  public PokedexDetail versionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  public PokedexDetail addVersionGroupsItem(AbilityDetailPokemonInnerPokemon versionGroupsItem) {
    if (this.versionGroups == null) {
      this.versionGroups = new ArrayList<>();
    }
    this.versionGroups.add(versionGroupsItem);
    return this;
  }

  /**
   * Get versionGroups
   * @return versionGroups
   */
  @Valid 
  @Schema(name = "version_groups", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_groups")
  public List<@Valid AbilityDetailPokemonInnerPokemon> getVersionGroups() {
    return versionGroups;
  }

  @JsonProperty("version_groups")
  public void setVersionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

