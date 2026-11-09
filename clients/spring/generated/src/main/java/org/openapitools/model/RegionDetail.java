package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.LocationSummary;
import org.openapitools.model.PokedexSummary;
import org.openapitools.model.RegionName;
import org.openapitools.model.VersionGroupSummary;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class RegionDetail {

  private Integer id;

  private String name;

  private List<@Valid LocationSummary> locations = new ArrayList<>();

  private JsonNullable<GenerationSummary> mainGeneration = JsonNullable.<GenerationSummary>undefined();

  private List<@Valid RegionName> names = new ArrayList<>();

  private List<@Valid PokedexSummary> pokedexes = new ArrayList<>();

  private List<@Valid VersionGroupSummary> versionGroups = new ArrayList<>();

  public RegionDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RegionDetail(Integer id, String name, List<@Valid LocationSummary> locations, GenerationSummary mainGeneration, List<@Valid RegionName> names, List<@Valid PokedexSummary> pokedexes, List<@Valid VersionGroupSummary> versionGroups) {
    this.id = id;
    this.name = name;
    this.locations = locations;
    this.mainGeneration = JsonNullable.of(mainGeneration);
    this.names = names;
    this.pokedexes = pokedexes;
    this.versionGroups = versionGroups;
  }

  public RegionDetail id(Integer id) {
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

  @JsonProperty("id")
  public void setId(Integer id) {
    this.id = id;
  }

  public RegionDetail name(String name) {
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
   * A list of locations that can be found in this region.
   * @return locations
   */
  
  @Schema(name = "locations", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of locations that can be found in this region.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("locations")
  public List<@Valid LocationSummary> getLocations() {
    return locations;
  }

  @JsonProperty("locations")
  public void setLocations(List<@Valid LocationSummary> locations) {
    this.locations = locations;
  }

  public RegionDetail mainGeneration(GenerationSummary mainGeneration) {
    this.mainGeneration = JsonNullable.of(mainGeneration);
    return this;
  }

  /**
   * The generation this region was introduced in.
   * @return mainGeneration
   */
  @Valid 
  @Schema(name = "main_generation", accessMode = Schema.AccessMode.READ_ONLY, description = "The generation this region was introduced in.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("main_generation")
  public JsonNullable<GenerationSummary> getMainGeneration() {
    return mainGeneration;
  }

  @JsonProperty("main_generation")
  public void setMainGeneration(JsonNullable<GenerationSummary> mainGeneration) {
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
   * The name of this resource listed in different languages.
   * @return names
   */
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of this resource listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
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
   * A list of pokédexes that catalogue Pokémon in this region.
   * @return pokedexes
   */
  
  @Schema(name = "pokedexes", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of pokédexes that catalogue Pokémon in this region.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokedexes")
  public List<@Valid PokedexSummary> getPokedexes() {
    return pokedexes;
  }

  @JsonProperty("pokedexes")
  public void setPokedexes(List<@Valid PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
  }

  public RegionDetail versionGroups(List<@Valid VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  public RegionDetail addVersionGroupsItem(VersionGroupSummary versionGroupsItem) {
    if (this.versionGroups == null) {
      this.versionGroups = new ArrayList<>();
    }
    this.versionGroups.add(versionGroupsItem);
    return this;
  }

  /**
   * A list of version groups where this region can be visited.
   * @return versionGroups
   */
  
  @Schema(name = "version_groups", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of version groups where this region can be visited.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_groups")
  public List<@Valid VersionGroupSummary> getVersionGroups() {
    return versionGroups;
  }

  @JsonProperty("version_groups")
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

