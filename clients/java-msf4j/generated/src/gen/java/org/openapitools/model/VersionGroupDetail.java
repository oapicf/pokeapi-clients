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
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.VersionSummary;

/**
 * VersionGroupDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
  private List<@Valid AbilityDetailPokemonInnerPokemon> moveLearnMethods = new ArrayList<>();

  @JsonProperty("pokedexes")
  private List<@Valid AbilityDetailPokemonInnerPokemon> pokedexes = new ArrayList<>();

  @JsonProperty("regions")
  private List<@Valid AbilityDetailPokemonInnerPokemon> regions = new ArrayList<>();

  @JsonProperty("versions")
  private List<@Valid VersionSummary> versions = new ArrayList<>();

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public VersionGroupDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
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
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")
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
   * Get generation
   * @return generation
  **/
  @ApiModelProperty(required = true, value = "")
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public VersionGroupDetail moveLearnMethods(List<@Valid AbilityDetailPokemonInnerPokemon> moveLearnMethods) {
    this.moveLearnMethods = moveLearnMethods;
    return this;
  }

  public VersionGroupDetail addMoveLearnMethodsItem(AbilityDetailPokemonInnerPokemon moveLearnMethodsItem) {
    this.moveLearnMethods.add(moveLearnMethodsItem);
    return this;
  }

   /**
   * Get moveLearnMethods
   * @return moveLearnMethods
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid AbilityDetailPokemonInnerPokemon> getMoveLearnMethods() {
    return moveLearnMethods;
  }

  public void setMoveLearnMethods(List<@Valid AbilityDetailPokemonInnerPokemon> moveLearnMethods) {
    this.moveLearnMethods = moveLearnMethods;
  }

  public VersionGroupDetail pokedexes(List<@Valid AbilityDetailPokemonInnerPokemon> pokedexes) {
    this.pokedexes = pokedexes;
    return this;
  }

  public VersionGroupDetail addPokedexesItem(AbilityDetailPokemonInnerPokemon pokedexesItem) {
    this.pokedexes.add(pokedexesItem);
    return this;
  }

   /**
   * Get pokedexes
   * @return pokedexes
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid AbilityDetailPokemonInnerPokemon> getPokedexes() {
    return pokedexes;
  }

  public void setPokedexes(List<@Valid AbilityDetailPokemonInnerPokemon> pokedexes) {
    this.pokedexes = pokedexes;
  }

  public VersionGroupDetail regions(List<@Valid AbilityDetailPokemonInnerPokemon> regions) {
    this.regions = regions;
    return this;
  }

  public VersionGroupDetail addRegionsItem(AbilityDetailPokemonInnerPokemon regionsItem) {
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid AbilityDetailPokemonInnerPokemon> getRegions() {
    return regions;
  }

  public void setRegions(List<@Valid AbilityDetailPokemonInnerPokemon> regions) {
    this.regions = regions;
  }

  public VersionGroupDetail versions(List<@Valid VersionSummary> versions) {
    this.versions = versions;
    return this;
  }

  public VersionGroupDetail addVersionsItem(VersionSummary versionsItem) {
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * Get versions
   * @return versions
  **/
  @ApiModelProperty(required = true, value = "")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

