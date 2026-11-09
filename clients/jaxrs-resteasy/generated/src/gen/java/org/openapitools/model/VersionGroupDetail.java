package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class VersionGroupDetail   {
  
  private Integer id;
  private String name;
  private Integer order;
  private GenerationSummary generation;
  private List<@Valid MoveLearnMethodSummary> moveLearnMethods = new ArrayList<>();
  private List<@Valid PokedexSummary> pokedexes = new ArrayList<>();
  private List<@Valid RegionSummary> regions = new ArrayList<>();
  private List<@Valid VersionSummary> versions = new ArrayList<>();

  /**
   * The identifier for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Order for sorting. Almost by date of release, except similar versions are grouped together.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "Order for sorting. Almost by date of release, except similar versions are grouped together.")
  @JsonProperty("order")
 @Min(-2147483648) @Max(2147483647)  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * The generation this version was introduced in.
   **/
  
  @ApiModelProperty(required = true, value = "The generation this version was introduced in.")
  @JsonProperty("generation")
  @NotNull
  @Valid
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * A list of methods in which Pokémon can learn moves in this version group.
   **/
  
  @ApiModelProperty(required = true, value = "A list of methods in which Pokémon can learn moves in this version group.")
  @JsonProperty("move_learn_methods")
  @NotNull
  public List<@Valid MoveLearnMethodSummary> getMoveLearnMethods() {
    return moveLearnMethods;
  }
  public void setMoveLearnMethods(List<@Valid MoveLearnMethodSummary> moveLearnMethods) {
    this.moveLearnMethods = moveLearnMethods;
  }

  /**
   * A list of Pokédexes introduces in this version group.
   **/
  
  @ApiModelProperty(required = true, value = "A list of Pokédexes introduces in this version group.")
  @JsonProperty("pokedexes")
  @NotNull
  public List<@Valid PokedexSummary> getPokedexes() {
    return pokedexes;
  }
  public void setPokedexes(List<@Valid PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
  }

  /**
   * A list of regions that can be visited in this version group.
   **/
  
  @ApiModelProperty(required = true, value = "A list of regions that can be visited in this version group.")
  @JsonProperty("regions")
  @NotNull
  public List<@Valid RegionSummary> getRegions() {
    return regions;
  }
  public void setRegions(List<@Valid RegionSummary> regions) {
    this.regions = regions;
  }

  /**
   * The versions this version group owns.
   **/
  
  @ApiModelProperty(required = true, value = "The versions this version group owns.")
  @JsonProperty("versions")
  @NotNull
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

