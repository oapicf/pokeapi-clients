package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.MoveLearnMethodSummary;
import org.openapitools.model.PokedexSummary;
import org.openapitools.model.RegionSummary;
import org.openapitools.model.VersionSummary;

/**
 * VersionGroupDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class VersionGroupDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("order")
  private Integer order;

  @JsonProperty("generation")
  private GenerationSummary generation;

  @JsonProperty("move_learn_methods")
  private List<@Valid MoveLearnMethodSummary> moveLearnMethods = new ArrayList<>();

  @JsonProperty("pokedexes")
  private List<@Valid PokedexSummary> pokedexes = new ArrayList<>();

  @JsonProperty("regions")
  private List<@Valid RegionSummary> regions = new ArrayList<>();

  @JsonProperty("versions")
  private List<@Valid VersionSummary> versions = new ArrayList<>();

   /**
   * The identifier for this resource.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public VersionGroupDetail name(String name) {
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
  @ApiModelProperty(value = "Order for sorting. Almost by date of release, except similar versions are grouped together.")
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
  @ApiModelProperty(required = true, value = "The generation this version was introduced in.")
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

   /**
   * A list of methods in which Pokémon can learn moves in this version group.
   * @return moveLearnMethods
  **/
  @ApiModelProperty(required = true, value = "A list of methods in which Pokémon can learn moves in this version group.")
  public List<@Valid MoveLearnMethodSummary> getMoveLearnMethods() {
    return moveLearnMethods;
  }

   /**
   * A list of Pokédexes introduces in this version group.
   * @return pokedexes
  **/
  @ApiModelProperty(required = true, value = "A list of Pokédexes introduces in this version group.")
  public List<@Valid PokedexSummary> getPokedexes() {
    return pokedexes;
  }

   /**
   * A list of regions that can be visited in this version group.
   * @return regions
  **/
  @ApiModelProperty(required = true, value = "A list of regions that can be visited in this version group.")
  public List<@Valid RegionSummary> getRegions() {
    return regions;
  }

   /**
   * The versions this version group owns.
   * @return versions
  **/
  @ApiModelProperty(required = true, value = "The versions this version group owns.")
  public List<@Valid VersionSummary> getVersions() {
    return versions;
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

