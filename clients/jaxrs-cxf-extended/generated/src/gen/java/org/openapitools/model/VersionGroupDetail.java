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
import com.fasterxml.jackson.annotation.JsonFormat;
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
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public VersionGroupDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public VersionGroupDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get order
  * @return order
  */
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }

  /**
   * Sets the <code>order</code> property.
   */
 public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * Sets the <code>order</code> property.
   */
  public VersionGroupDetail order(Integer order) {
    this.order = order;
    return this;
  }

 /**
  * Get generation
  * @return generation
  */
  @JsonProperty("generation")
  @NotNull
  public GenerationSummary getGeneration() {
    return generation;
  }

  /**
   * Sets the <code>generation</code> property.
   */
 public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * Sets the <code>generation</code> property.
   */
  public VersionGroupDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

 /**
  * Get moveLearnMethods
  * @return moveLearnMethods
  */
  @JsonProperty("move_learn_methods")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getMoveLearnMethods() {
    return moveLearnMethods;
  }

  /**
   * Sets the <code>moveLearnMethods</code> property.
   */
 public void setMoveLearnMethods(List<@Valid AbilityDetailPokemonInnerPokemon> moveLearnMethods) {
    this.moveLearnMethods = moveLearnMethods;
  }

  /**
   * Sets the <code>moveLearnMethods</code> property.
   */
  public VersionGroupDetail moveLearnMethods(List<@Valid AbilityDetailPokemonInnerPokemon> moveLearnMethods) {
    this.moveLearnMethods = moveLearnMethods;
    return this;
  }

  /**
   * Adds a new item to the <code>moveLearnMethods</code> list.
   */
  public VersionGroupDetail addMoveLearnMethodsItem(AbilityDetailPokemonInnerPokemon moveLearnMethodsItem) {
    this.moveLearnMethods.add(moveLearnMethodsItem);
    return this;
  }

 /**
  * Get pokedexes
  * @return pokedexes
  */
  @JsonProperty("pokedexes")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getPokedexes() {
    return pokedexes;
  }

  /**
   * Sets the <code>pokedexes</code> property.
   */
 public void setPokedexes(List<@Valid AbilityDetailPokemonInnerPokemon> pokedexes) {
    this.pokedexes = pokedexes;
  }

  /**
   * Sets the <code>pokedexes</code> property.
   */
  public VersionGroupDetail pokedexes(List<@Valid AbilityDetailPokemonInnerPokemon> pokedexes) {
    this.pokedexes = pokedexes;
    return this;
  }

  /**
   * Adds a new item to the <code>pokedexes</code> list.
   */
  public VersionGroupDetail addPokedexesItem(AbilityDetailPokemonInnerPokemon pokedexesItem) {
    this.pokedexes.add(pokedexesItem);
    return this;
  }

 /**
  * Get regions
  * @return regions
  */
  @JsonProperty("regions")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getRegions() {
    return regions;
  }

  /**
   * Sets the <code>regions</code> property.
   */
 public void setRegions(List<@Valid AbilityDetailPokemonInnerPokemon> regions) {
    this.regions = regions;
  }

  /**
   * Sets the <code>regions</code> property.
   */
  public VersionGroupDetail regions(List<@Valid AbilityDetailPokemonInnerPokemon> regions) {
    this.regions = regions;
    return this;
  }

  /**
   * Adds a new item to the <code>regions</code> list.
   */
  public VersionGroupDetail addRegionsItem(AbilityDetailPokemonInnerPokemon regionsItem) {
    this.regions.add(regionsItem);
    return this;
  }

 /**
  * Get versions
  * @return versions
  */
  @JsonProperty("versions")
  @NotNull
  public List<@Valid VersionSummary> getVersions() {
    return versions;
  }

  /**
   * Sets the <code>versions</code> property.
   */
 public void setVersions(List<@Valid VersionSummary> versions) {
    this.versions = versions;
  }

  /**
   * Sets the <code>versions</code> property.
   */
  public VersionGroupDetail versions(List<@Valid VersionSummary> versions) {
    this.versions = versions;
    return this;
  }

  /**
   * Adds a new item to the <code>versions</code> list.
   */
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

