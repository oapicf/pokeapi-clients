package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.VersionSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VersionGroupDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(value = "")

  private Integer order;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private GenerationSummary generation;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> moveLearnMethods = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> pokedexes = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> regions = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid VersionSummary> versions = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
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
   * Get order
   * @return order
  **/
  @JsonProperty("order")
  public Integer getOrder() {
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
   * Get generation
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
   * Get moveLearnMethods
   * @return moveLearnMethods
  **/
  @JsonProperty("move_learn_methods")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getMoveLearnMethods() {
    return moveLearnMethods;
  }

  public void setMoveLearnMethods(List<@Valid AbilityDetailPokemonInnerPokemon> moveLearnMethods) {
    this.moveLearnMethods = moveLearnMethods;
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
   * Get pokedexes
   * @return pokedexes
  **/
  @JsonProperty("pokedexes")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getPokedexes() {
    return pokedexes;
  }

  public void setPokedexes(List<@Valid AbilityDetailPokemonInnerPokemon> pokedexes) {
    this.pokedexes = pokedexes;
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
   * Get regions
   * @return regions
  **/
  @JsonProperty("regions")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getRegions() {
    return regions;
  }

  public void setRegions(List<@Valid AbilityDetailPokemonInnerPokemon> regions) {
    this.regions = regions;
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
   * Get versions
   * @return versions
  **/
  @JsonProperty("versions")
  @NotNull
  public List<@Valid VersionSummary> getVersions() {
    return versions;
  }

  public void setVersions(List<@Valid VersionSummary> versions) {
    this.versions = versions;
  }

  public VersionGroupDetail versions(List<@Valid VersionSummary> versions) {
    this.versions = versions;
    return this;
  }

  public VersionGroupDetail addVersionsItem(VersionSummary versionsItem) {
    this.versions.add(versionsItem);
    return this;
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

