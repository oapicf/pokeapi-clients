/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**](https://github.com/phalt) and other [**PokéAPI contributors**](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.
 *
 * OpenAPI document version: 2.10.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-11-09T13:49:34.675912514Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class VersionGroupDetail   {
  
  private Integer id;
  private String name;
  private Integer order;
  private GenerationSummary generation;
  private List<MoveLearnMethodSummary> moveLearnMethods = new ArrayList<>();
  private List<PokedexSummary> pokedexes = new ArrayList<>();
  private List<RegionSummary> regions = new ArrayList<>();
  private List<VersionSummary> versions = new ArrayList<>();

  /**
   * The identifier for this resource.
   */
  public VersionGroupDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   */
  public VersionGroupDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Order for sorting. Almost by date of release, except similar versions are grouped together.
   * minimum: -2147483648
   * maximum: 2147483647
   */
  public VersionGroupDetail order(Integer order) {
    this.order = order;
    return this;
  }

  
  @ApiModelProperty(value = "Order for sorting. Almost by date of release, except similar versions are grouped together.")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * The generation this version was introduced in.
   */
  public VersionGroupDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The generation this version was introduced in.")
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * A list of methods in which Pokémon can learn moves in this version group.
   */
  public VersionGroupDetail moveLearnMethods(List<MoveLearnMethodSummary> moveLearnMethods) {
    this.moveLearnMethods = moveLearnMethods;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of methods in which Pokémon can learn moves in this version group.")
  @JsonProperty("move_learn_methods")
  public List<MoveLearnMethodSummary> getMoveLearnMethods() {
    return moveLearnMethods;
  }
  public void setMoveLearnMethods(List<MoveLearnMethodSummary> moveLearnMethods) {
    this.moveLearnMethods = moveLearnMethods;
  }

  /**
   * A list of Pokédexes introduces in this version group.
   */
  public VersionGroupDetail pokedexes(List<PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of Pokédexes introduces in this version group.")
  @JsonProperty("pokedexes")
  public List<PokedexSummary> getPokedexes() {
    return pokedexes;
  }
  public void setPokedexes(List<PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
  }

  /**
   * A list of regions that can be visited in this version group.
   */
  public VersionGroupDetail regions(List<RegionSummary> regions) {
    this.regions = regions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of regions that can be visited in this version group.")
  @JsonProperty("regions")
  public List<RegionSummary> getRegions() {
    return regions;
  }
  public void setRegions(List<RegionSummary> regions) {
    this.regions = regions;
  }

  /**
   * The versions this version group owns.
   */
  public VersionGroupDetail versions(List<VersionSummary> versions) {
    this.versions = versions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The versions this version group owns.")
  @JsonProperty("versions")
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

