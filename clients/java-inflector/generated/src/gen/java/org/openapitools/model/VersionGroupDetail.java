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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
  private List<AbilityDetailPokemonInnerPokemon> moveLearnMethods = new ArrayList<>();

  @JsonProperty("pokedexes")
  private List<AbilityDetailPokemonInnerPokemon> pokedexes = new ArrayList<>();

  @JsonProperty("regions")
  private List<AbilityDetailPokemonInnerPokemon> regions = new ArrayList<>();

  @JsonProperty("versions")
  private List<VersionSummary> versions = new ArrayList<>();

  /**
   **/
  public VersionGroupDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
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
  @JsonProperty("name")
  public String getName() {
    return name;
  }
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
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   **/
  public VersionGroupDetail moveLearnMethods(List<AbilityDetailPokemonInnerPokemon> moveLearnMethods) {
    this.moveLearnMethods = moveLearnMethods;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("move_learn_methods")
  public List<AbilityDetailPokemonInnerPokemon> getMoveLearnMethods() {
    return moveLearnMethods;
  }
  public void setMoveLearnMethods(List<AbilityDetailPokemonInnerPokemon> moveLearnMethods) {
    this.moveLearnMethods = moveLearnMethods;
  }

  /**
   **/
  public VersionGroupDetail pokedexes(List<AbilityDetailPokemonInnerPokemon> pokedexes) {
    this.pokedexes = pokedexes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokedexes")
  public List<AbilityDetailPokemonInnerPokemon> getPokedexes() {
    return pokedexes;
  }
  public void setPokedexes(List<AbilityDetailPokemonInnerPokemon> pokedexes) {
    this.pokedexes = pokedexes;
  }

  /**
   **/
  public VersionGroupDetail regions(List<AbilityDetailPokemonInnerPokemon> regions) {
    this.regions = regions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("regions")
  public List<AbilityDetailPokemonInnerPokemon> getRegions() {
    return regions;
  }
  public void setRegions(List<AbilityDetailPokemonInnerPokemon> regions) {
    this.regions = regions;
  }

  /**
   **/
  public VersionGroupDetail versions(List<VersionSummary> versions) {
    this.versions = versions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

