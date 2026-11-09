package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.MoveLearnMethodSummary;
import org.openapitools.model.PokedexSummary;
import org.openapitools.model.RegionSummary;
import org.openapitools.model.VersionSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VersionGroupDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")

  private Integer id;

 /**
  * The name for this resource.
  */
  @ApiModelProperty(required = true, value = "The name for this resource.")

  private String name;

 /**
  * Order for sorting. Almost by date of release, except similar versions are grouped together.
  */
  @ApiModelProperty(value = "Order for sorting. Almost by date of release, except similar versions are grouped together.")

  private Integer order;

 /**
  * The generation this version was introduced in.
  */
  @ApiModelProperty(required = true, value = "The generation this version was introduced in.")

  @Valid

  private GenerationSummary generation;

 /**
  * A list of methods in which Pokémon can learn moves in this version group.
  */
  @ApiModelProperty(required = true, value = "A list of methods in which Pokémon can learn moves in this version group.")

  private List<@Valid MoveLearnMethodSummary> moveLearnMethods = new ArrayList<>();

 /**
  * A list of Pokédexes introduces in this version group.
  */
  @ApiModelProperty(required = true, value = "A list of Pokédexes introduces in this version group.")

  private List<@Valid PokedexSummary> pokedexes = new ArrayList<>();

 /**
  * A list of regions that can be visited in this version group.
  */
  @ApiModelProperty(required = true, value = "A list of regions that can be visited in this version group.")

  private List<@Valid RegionSummary> regions = new ArrayList<>();

 /**
  * The versions this version group owns.
  */
  @ApiModelProperty(required = true, value = "The versions this version group owns.")

  private List<@Valid VersionSummary> versions = new ArrayList<>();
 /**
   * The identifier for this resource.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * The name for this resource.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VersionGroupDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Order for sorting. Almost by date of release, except similar versions are grouped together.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return order
  **/
  @JsonProperty("order")
 @Min(-2147483648) @Max(2147483647)  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public VersionGroupDetail order(Integer order) {
    this.order = order;
    return this;
  }

 /**
   * The generation this version was introduced in.
   * @return generation
  **/
  @JsonProperty("generation")
  @NotNull
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public VersionGroupDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

 /**
   * A list of methods in which Pokémon can learn moves in this version group.
   * @return moveLearnMethods
  **/
  @JsonProperty("move_learn_methods")
  @NotNull
  public List<@Valid MoveLearnMethodSummary> getMoveLearnMethods() {
    return moveLearnMethods;
  }


 /**
   * A list of Pokédexes introduces in this version group.
   * @return pokedexes
  **/
  @JsonProperty("pokedexes")
  @NotNull
  public List<@Valid PokedexSummary> getPokedexes() {
    return pokedexes;
  }


 /**
   * A list of regions that can be visited in this version group.
   * @return regions
  **/
  @JsonProperty("regions")
  @NotNull
  public List<@Valid RegionSummary> getRegions() {
    return regions;
  }


 /**
   * The versions this version group owns.
   * @return versions
  **/
  @JsonProperty("versions")
  @NotNull
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

