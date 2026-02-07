package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.GenerationSummary;
import org.openapitools.vertxweb.server.model.VersionSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VersionGroupDetail   {
  
  private Integer id;
  private String name;
  private Integer order;
  private GenerationSummary generation;
  private List<AbilityDetailPokemonInnerPokemon> moveLearnMethods = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> pokedexes = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> regions = new ArrayList<>();
  private List<VersionSummary> versions = new ArrayList<>();

  public VersionGroupDetail () {

  }

  public VersionGroupDetail (Integer id, String name, Integer order, GenerationSummary generation, List<AbilityDetailPokemonInnerPokemon> moveLearnMethods, List<AbilityDetailPokemonInnerPokemon> pokedexes, List<AbilityDetailPokemonInnerPokemon> regions, List<VersionSummary> versions) {
    this.id = id;
    this.name = name;
    this.order = order;
    this.generation = generation;
    this.moveLearnMethods = moveLearnMethods;
    this.pokedexes = pokedexes;
    this.regions = regions;
    this.versions = versions;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

    
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

    
  @JsonProperty("move_learn_methods")
  public List<AbilityDetailPokemonInnerPokemon> getMoveLearnMethods() {
    return moveLearnMethods;
  }
  public void setMoveLearnMethods(List<AbilityDetailPokemonInnerPokemon> moveLearnMethods) {
    this.moveLearnMethods = moveLearnMethods;
  }

    
  @JsonProperty("pokedexes")
  public List<AbilityDetailPokemonInnerPokemon> getPokedexes() {
    return pokedexes;
  }
  public void setPokedexes(List<AbilityDetailPokemonInnerPokemon> pokedexes) {
    this.pokedexes = pokedexes;
  }

    
  @JsonProperty("regions")
  public List<AbilityDetailPokemonInnerPokemon> getRegions() {
    return regions;
  }
  public void setRegions(List<AbilityDetailPokemonInnerPokemon> regions) {
    this.regions = regions;
  }

    
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
