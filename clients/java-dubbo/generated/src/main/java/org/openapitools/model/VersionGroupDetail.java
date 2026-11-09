package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.MoveLearnMethodSummary;
import org.openapitools.model.PokedexSummary;
import org.openapitools.model.RegionSummary;
import org.openapitools.model.VersionSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class VersionGroupDetail implements Serializable {
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
   * Order for sorting. Almost by date of release, except similar versions are grouped together.
   */
  @JsonProperty("order")
  private Integer order;

  /**
   * The generation this version was introduced in.
   */
  @JsonProperty("generation")
  private GenerationSummary generation;

  /**
   * A list of methods in which Pokémon can learn moves in this version group.
   */
  @JsonProperty("move_learn_methods")
  private List<MoveLearnMethodSummary> moveLearnMethods = new ArrayList<>();

  /**
   * A list of Pokédexes introduces in this version group.
   */
  @JsonProperty("pokedexes")
  private List<PokedexSummary> pokedexes = new ArrayList<>();

  /**
   * A list of regions that can be visited in this version group.
   */
  @JsonProperty("regions")
  private List<RegionSummary> regions = new ArrayList<>();

  /**
   * The versions this version group owns.
   */
  @JsonProperty("versions")
  private List<VersionSummary> versions = new ArrayList<>();

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
   * Order for sorting. Almost by date of release, except similar versions are grouped together.
   * @return order
   */
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * The generation this version was introduced in.
   * @return generation
   */
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * A list of methods in which Pokémon can learn moves in this version group.
   * @return moveLearnMethods
   */
  public List<MoveLearnMethodSummary> getMoveLearnMethods() {
    return moveLearnMethods;
  }

  public void setMoveLearnMethods(List<MoveLearnMethodSummary> moveLearnMethods) {
    this.moveLearnMethods = moveLearnMethods;
  }

  /**
   * A list of Pokédexes introduces in this version group.
   * @return pokedexes
   */
  public List<PokedexSummary> getPokedexes() {
    return pokedexes;
  }

  public void setPokedexes(List<PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
  }

  /**
   * A list of regions that can be visited in this version group.
   * @return regions
   */
  public List<RegionSummary> getRegions() {
    return regions;
  }

  public void setRegions(List<RegionSummary> regions) {
    this.regions = regions;
  }

  /**
   * The versions this version group owns.
   * @return versions
   */
  public List<VersionSummary> getVersions() {
    return versions;
  }

  public void setVersions(List<VersionSummary> versions) {
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
        Objects.equals(this.order, versionGroupDetail.order) &&
        Objects.equals(this.generation, versionGroupDetail.generation) &&
        Objects.equals(this.moveLearnMethods, versionGroupDetail.moveLearnMethods) &&
        Objects.equals(this.pokedexes, versionGroupDetail.pokedexes) &&
        Objects.equals(this.regions, versionGroupDetail.regions) &&
        Objects.equals(this.versions, versionGroupDetail.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, generation, moveLearnMethods, pokedexes, regions, versions);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
