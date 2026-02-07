package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.VersionSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("VersionGroupDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VersionGroupDetail   {
  private Integer id;
  private String name;
  private Integer order;
  private GenerationSummary generation;
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> moveLearnMethods = new ArrayList<>();
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> pokedexes = new ArrayList<>();
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> regions = new ArrayList<>();
  private @Valid List<@Valid VersionSummary> versions = new ArrayList<>();

  public VersionGroupDetail() {
  }

  @JsonCreator
  public VersionGroupDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "generation") GenerationSummary generation,
    @JsonProperty(required = true, value = "move_learn_methods") List<@Valid AbilityDetailPokemonInnerPokemon> moveLearnMethods,
    @JsonProperty(required = true, value = "pokedexes") List<@Valid AbilityDetailPokemonInnerPokemon> pokedexes,
    @JsonProperty(required = true, value = "regions") List<@Valid AbilityDetailPokemonInnerPokemon> regions,
    @JsonProperty(required = true, value = "versions") List<@Valid VersionSummary> versions
  ) {
    this.id = id;
    this.name = name;
    this.generation = generation;
    this.moveLearnMethods = moveLearnMethods;
    this.pokedexes = pokedexes;
    this.regions = regions;
    this.versions = versions;
  }

  /**
   **/
  public VersionGroupDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public VersionGroupDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=100)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public VersionGroupDetail order(Integer order) {
    this.order = order;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }

  @JsonProperty("order")
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   **/
  public VersionGroupDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "generation")
  @NotNull @Valid public GenerationSummary getGeneration() {
    return generation;
  }

  @JsonProperty(required = true, value = "generation")
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   **/
  public VersionGroupDetail moveLearnMethods(List<@Valid AbilityDetailPokemonInnerPokemon> moveLearnMethods) {
    this.moveLearnMethods = moveLearnMethods;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "move_learn_methods")
  @NotNull @Valid public List<@Valid AbilityDetailPokemonInnerPokemon> getMoveLearnMethods() {
    return moveLearnMethods;
  }

  @JsonProperty(required = true, value = "move_learn_methods")
  public void setMoveLearnMethods(List<@Valid AbilityDetailPokemonInnerPokemon> moveLearnMethods) {
    this.moveLearnMethods = moveLearnMethods;
  }

  public VersionGroupDetail addMoveLearnMethodsItem(AbilityDetailPokemonInnerPokemon moveLearnMethodsItem) {
    if (this.moveLearnMethods == null) {
      this.moveLearnMethods = new ArrayList<>();
    }

    this.moveLearnMethods.add(moveLearnMethodsItem);
    return this;
  }

  public VersionGroupDetail removeMoveLearnMethodsItem(AbilityDetailPokemonInnerPokemon moveLearnMethodsItem) {
    if (moveLearnMethodsItem != null && this.moveLearnMethods != null) {
      this.moveLearnMethods.remove(moveLearnMethodsItem);
    }

    return this;
  }
  /**
   **/
  public VersionGroupDetail pokedexes(List<@Valid AbilityDetailPokemonInnerPokemon> pokedexes) {
    this.pokedexes = pokedexes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "pokedexes")
  @NotNull @Valid public List<@Valid AbilityDetailPokemonInnerPokemon> getPokedexes() {
    return pokedexes;
  }

  @JsonProperty(required = true, value = "pokedexes")
  public void setPokedexes(List<@Valid AbilityDetailPokemonInnerPokemon> pokedexes) {
    this.pokedexes = pokedexes;
  }

  public VersionGroupDetail addPokedexesItem(AbilityDetailPokemonInnerPokemon pokedexesItem) {
    if (this.pokedexes == null) {
      this.pokedexes = new ArrayList<>();
    }

    this.pokedexes.add(pokedexesItem);
    return this;
  }

  public VersionGroupDetail removePokedexesItem(AbilityDetailPokemonInnerPokemon pokedexesItem) {
    if (pokedexesItem != null && this.pokedexes != null) {
      this.pokedexes.remove(pokedexesItem);
    }

    return this;
  }
  /**
   **/
  public VersionGroupDetail regions(List<@Valid AbilityDetailPokemonInnerPokemon> regions) {
    this.regions = regions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "regions")
  @NotNull @Valid public List<@Valid AbilityDetailPokemonInnerPokemon> getRegions() {
    return regions;
  }

  @JsonProperty(required = true, value = "regions")
  public void setRegions(List<@Valid AbilityDetailPokemonInnerPokemon> regions) {
    this.regions = regions;
  }

  public VersionGroupDetail addRegionsItem(AbilityDetailPokemonInnerPokemon regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }

    this.regions.add(regionsItem);
    return this;
  }

  public VersionGroupDetail removeRegionsItem(AbilityDetailPokemonInnerPokemon regionsItem) {
    if (regionsItem != null && this.regions != null) {
      this.regions.remove(regionsItem);
    }

    return this;
  }
  /**
   **/
  public VersionGroupDetail versions(List<@Valid VersionSummary> versions) {
    this.versions = versions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "versions")
  @NotNull @Valid public List<@Valid VersionSummary> getVersions() {
    return versions;
  }

  @JsonProperty(required = true, value = "versions")
  public void setVersions(List<@Valid VersionSummary> versions) {
    this.versions = versions;
  }

  public VersionGroupDetail addVersionsItem(VersionSummary versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }

    this.versions.add(versionsItem);
    return this;
  }

  public VersionGroupDetail removeVersionsItem(VersionSummary versionsItem) {
    if (versionsItem != null && this.versions != null) {
      this.versions.remove(versionsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

