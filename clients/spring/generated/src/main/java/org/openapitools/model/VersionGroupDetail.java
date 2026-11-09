package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.MoveLearnMethodSummary;
import org.openapitools.model.PokedexSummary;
import org.openapitools.model.RegionSummary;
import org.openapitools.model.VersionSummary;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VersionGroupDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class VersionGroupDetail {

  private Integer id;

  private String name;

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> order = JsonNullable.<Integer>undefined();

  private GenerationSummary generation;

  private List<@Valid MoveLearnMethodSummary> moveLearnMethods = new ArrayList<>();

  private List<@Valid PokedexSummary> pokedexes = new ArrayList<>();

  private List<@Valid RegionSummary> regions = new ArrayList<>();

  private List<@Valid VersionSummary> versions = new ArrayList<>();

  public VersionGroupDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VersionGroupDetail(Integer id, String name, GenerationSummary generation, List<@Valid MoveLearnMethodSummary> moveLearnMethods, List<@Valid PokedexSummary> pokedexes, List<@Valid RegionSummary> regions, List<@Valid VersionSummary> versions) {
    this.id = id;
    this.name = name;
    this.generation = generation;
    this.moveLearnMethods = moveLearnMethods;
    this.pokedexes = pokedexes;
    this.regions = regions;
    this.versions = versions;
  }

  public VersionGroupDetail id(Integer id) {
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

  public VersionGroupDetail name(String name) {
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

  public VersionGroupDetail order(Integer order) {
    this.order = JsonNullable.of(order);
    return this;
  }

  /**
   * Order for sorting. Almost by date of release, except similar versions are grouped together.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return order
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "order", description = "Order for sorting. Almost by date of release, except similar versions are grouped together.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("order")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getOrder() {
    return order;
  }

  public void setOrder(JsonNullable<Integer> order) {
    this.order = order;
  }

  public VersionGroupDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  /**
   * The generation this version was introduced in.
   * @return generation
   */
  @NotNull @Valid 
  @Schema(name = "generation", description = "The generation this version was introduced in.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }

  @JsonProperty("generation")
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public VersionGroupDetail moveLearnMethods(List<@Valid MoveLearnMethodSummary> moveLearnMethods) {
    this.moveLearnMethods = moveLearnMethods;
    return this;
  }

  public VersionGroupDetail addMoveLearnMethodsItem(MoveLearnMethodSummary moveLearnMethodsItem) {
    if (this.moveLearnMethods == null) {
      this.moveLearnMethods = new ArrayList<>();
    }
    this.moveLearnMethods.add(moveLearnMethodsItem);
    return this;
  }

  /**
   * A list of methods in which Pokémon can learn moves in this version group.
   * @return moveLearnMethods
   */
  
  @Schema(name = "move_learn_methods", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of methods in which Pokémon can learn moves in this version group.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("move_learn_methods")
  public List<@Valid MoveLearnMethodSummary> getMoveLearnMethods() {
    return moveLearnMethods;
  }

  @JsonProperty("move_learn_methods")
  public void setMoveLearnMethods(List<@Valid MoveLearnMethodSummary> moveLearnMethods) {
    this.moveLearnMethods = moveLearnMethods;
  }

  public VersionGroupDetail pokedexes(List<@Valid PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
    return this;
  }

  public VersionGroupDetail addPokedexesItem(PokedexSummary pokedexesItem) {
    if (this.pokedexes == null) {
      this.pokedexes = new ArrayList<>();
    }
    this.pokedexes.add(pokedexesItem);
    return this;
  }

  /**
   * A list of Pokédexes introduces in this version group.
   * @return pokedexes
   */
  
  @Schema(name = "pokedexes", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of Pokédexes introduces in this version group.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokedexes")
  public List<@Valid PokedexSummary> getPokedexes() {
    return pokedexes;
  }

  @JsonProperty("pokedexes")
  public void setPokedexes(List<@Valid PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
  }

  public VersionGroupDetail regions(List<@Valid RegionSummary> regions) {
    this.regions = regions;
    return this;
  }

  public VersionGroupDetail addRegionsItem(RegionSummary regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

  /**
   * A list of regions that can be visited in this version group.
   * @return regions
   */
  
  @Schema(name = "regions", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of regions that can be visited in this version group.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("regions")
  public List<@Valid RegionSummary> getRegions() {
    return regions;
  }

  @JsonProperty("regions")
  public void setRegions(List<@Valid RegionSummary> regions) {
    this.regions = regions;
  }

  public VersionGroupDetail versions(List<@Valid VersionSummary> versions) {
    this.versions = versions;
    return this;
  }

  public VersionGroupDetail addVersionsItem(VersionSummary versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

  /**
   * The versions this version group owns.
   * @return versions
   */
  
  @Schema(name = "versions", accessMode = Schema.AccessMode.READ_ONLY, description = "The versions this version group owns.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("versions")
  public List<@Valid VersionSummary> getVersions() {
    return versions;
  }

  @JsonProperty("versions")
  public void setVersions(List<@Valid VersionSummary> versions) {
    this.versions = versions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionGroupDetail versionGroupDetail = (VersionGroupDetail) o;
    return Objects.equals(this.id, versionGroupDetail.id) &&
        Objects.equals(this.name, versionGroupDetail.name) &&
        equalsNullable(this.order, versionGroupDetail.order) &&
        Objects.equals(this.generation, versionGroupDetail.generation) &&
        Objects.equals(this.moveLearnMethods, versionGroupDetail.moveLearnMethods) &&
        Objects.equals(this.pokedexes, versionGroupDetail.pokedexes) &&
        Objects.equals(this.regions, versionGroupDetail.regions) &&
        Objects.equals(this.versions, versionGroupDetail.versions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, hashCodeNullable(order), generation, moveLearnMethods, pokedexes, regions, versions);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionGroupDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    moveLearnMethods: ").append(toIndentedString(moveLearnMethods)).append("\n");
    sb.append("    pokedexes: ").append(toIndentedString(pokedexes)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

