package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.LocationSummary;
import org.openapitools.model.PokedexSummary;
import org.openapitools.model.RegionName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RegionDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T02:00:43.960184425Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RegionDetail {

  private Integer id;

  private String name;

  private List<@Valid LocationSummary> locations = new ArrayList<>();

  private GenerationSummary mainGeneration;

  private List<@Valid RegionName> names = new ArrayList<>();

  private List<@Valid PokedexSummary> pokedexes = new ArrayList<>();

  private List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();

  public RegionDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RegionDetail(Integer id, String name, List<@Valid LocationSummary> locations, GenerationSummary mainGeneration, List<@Valid RegionName> names, List<@Valid PokedexSummary> pokedexes, List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.id = id;
    this.name = name;
    this.locations = locations;
    this.mainGeneration = mainGeneration;
    this.names = names;
    this.pokedexes = pokedexes;
    this.versionGroups = versionGroups;
  }

  public RegionDetail id(Integer id) {
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

  public RegionDetail name(String name) {
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

  public RegionDetail locations(List<@Valid LocationSummary> locations) {
    this.locations = locations;
    return this;
  }

  public RegionDetail addLocationsItem(LocationSummary locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * Get locations
   * @return locations
   */
  @Valid 
  @Schema(name = "locations", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("locations")
  public List<@Valid LocationSummary> getLocations() {
    return locations;
  }

  @JsonProperty("locations")
  public void setLocations(List<@Valid LocationSummary> locations) {
    this.locations = locations;
  }

  public RegionDetail mainGeneration(GenerationSummary mainGeneration) {
    this.mainGeneration = mainGeneration;
    return this;
  }

  /**
   * Get mainGeneration
   * @return mainGeneration
   */
  @Valid 
  @Schema(name = "main_generation", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("main_generation")
  public GenerationSummary getMainGeneration() {
    return mainGeneration;
  }

  @JsonProperty("main_generation")
  public void setMainGeneration(GenerationSummary mainGeneration) {
    this.mainGeneration = mainGeneration;
  }

  public RegionDetail names(List<@Valid RegionName> names) {
    this.names = names;
    return this;
  }

  public RegionDetail addNamesItem(RegionName namesItem) {
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
  public List<@Valid RegionName> getNames() {
    return names;
  }

  @JsonProperty("names")
  public void setNames(List<@Valid RegionName> names) {
    this.names = names;
  }

  public RegionDetail pokedexes(List<@Valid PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
    return this;
  }

  public RegionDetail addPokedexesItem(PokedexSummary pokedexesItem) {
    if (this.pokedexes == null) {
      this.pokedexes = new ArrayList<>();
    }
    this.pokedexes.add(pokedexesItem);
    return this;
  }

  /**
   * Get pokedexes
   * @return pokedexes
   */
  @Valid 
  @Schema(name = "pokedexes", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokedexes")
  public List<@Valid PokedexSummary> getPokedexes() {
    return pokedexes;
  }

  @JsonProperty("pokedexes")
  public void setPokedexes(List<@Valid PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
  }

  public RegionDetail versionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  public RegionDetail addVersionGroupsItem(AbilityDetailPokemonInnerPokemon versionGroupsItem) {
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
    RegionDetail regionDetail = (RegionDetail) o;
    return Objects.equals(this.id, regionDetail.id) &&
        Objects.equals(this.name, regionDetail.name) &&
        Objects.equals(this.locations, regionDetail.locations) &&
        Objects.equals(this.mainGeneration, regionDetail.mainGeneration) &&
        Objects.equals(this.names, regionDetail.names) &&
        Objects.equals(this.pokedexes, regionDetail.pokedexes) &&
        Objects.equals(this.versionGroups, regionDetail.versionGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, locations, mainGeneration, names, pokedexes, versionGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    mainGeneration: ").append(toIndentedString(mainGeneration)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pokedexes: ").append(toIndentedString(pokedexes)).append("\n");
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

