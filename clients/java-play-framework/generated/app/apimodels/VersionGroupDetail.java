package apimodels;

import apimodels.GenerationSummary;
import apimodels.MoveLearnMethodSummary;
import apimodels.PokedexSummary;
import apimodels.RegionSummary;
import apimodels.VersionSummary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VersionGroupDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class VersionGroupDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("order")
  @Min(-2147483648)
@Max(2147483647)

  private Integer order;

  @JsonProperty("generation")
  @NotNull
@Valid

  private GenerationSummary generation;

  @JsonProperty("move_learn_methods")
  @NotNull
@Valid

  private List<@Valid MoveLearnMethodSummary> moveLearnMethods = new ArrayList<>();

  @JsonProperty("pokedexes")
  @NotNull
@Valid

  private List<@Valid PokedexSummary> pokedexes = new ArrayList<>();

  @JsonProperty("regions")
  @NotNull
@Valid

  private List<@Valid RegionSummary> regions = new ArrayList<>();

  @JsonProperty("versions")
  @NotNull
@Valid

  private List<@Valid VersionSummary> versions = new ArrayList<>();

  public VersionGroupDetail id(Integer id) {
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

  public VersionGroupDetail name(String name) {
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

  public VersionGroupDetail order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Order for sorting. Almost by date of release, except similar versions are grouped together.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return order
  **/
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public VersionGroupDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

   /**
   * The generation this version was introduced in.
   * @return generation
  **/
  public GenerationSummary getGeneration() {
    return generation;
  }

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
  **/
  public List<@Valid MoveLearnMethodSummary> getMoveLearnMethods() {
    return moveLearnMethods;
  }

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
  **/
  public List<@Valid PokedexSummary> getPokedexes() {
    return pokedexes;
  }

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
  **/
  public List<@Valid RegionSummary> getRegions() {
    return regions;
  }

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
  **/
  public List<@Valid VersionSummary> getVersions() {
    return versions;
  }

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
    return Objects.equals(id, versionGroupDetail.id) &&
        Objects.equals(name, versionGroupDetail.name) &&
        Objects.equals(order, versionGroupDetail.order) &&
        Objects.equals(generation, versionGroupDetail.generation) &&
        Objects.equals(moveLearnMethods, versionGroupDetail.moveLearnMethods) &&
        Objects.equals(pokedexes, versionGroupDetail.pokedexes) &&
        Objects.equals(regions, versionGroupDetail.regions) &&
        Objects.equals(versions, versionGroupDetail.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, generation, moveLearnMethods, pokedexes, regions, versions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

