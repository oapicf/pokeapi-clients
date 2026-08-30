package org.openapitools.model;

import org.openapitools.model.AbilitySummary;
import org.openapitools.model.GenerationName;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.PokemonSpeciesSummary;
import org.openapitools.model.RegionSummary;
import org.openapitools.model.TypeSummary;
import org.openapitools.model.VersionGroupSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class GenerationDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("abilities")
  private List<AbilitySummary> abilities = new ArrayList<>();

  @JsonProperty("main_region")
  private RegionSummary mainRegion;

  @JsonProperty("moves")
  private List<MoveSummary> moves = new ArrayList<>();

  @JsonProperty("names")
  private List<GenerationName> names = new ArrayList<>();

  @JsonProperty("pokemon_species")
  private List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  @JsonProperty("types")
  private List<TypeSummary> types = new ArrayList<>();

  @JsonProperty("version_groups")
  private List<VersionGroupSummary> versionGroups = new ArrayList<>();

  /**
   * 
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * 
   * @return abilities
   */
  public List<AbilitySummary> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<AbilitySummary> abilities) {
    this.abilities = abilities;
  }

  /**
   * 
   * @return mainRegion
   */
  public RegionSummary getMainRegion() {
    return mainRegion;
  }

  public void setMainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
  }

  /**
   * 
   * @return moves
   */
  public List<MoveSummary> getMoves() {
    return moves;
  }

  public void setMoves(List<MoveSummary> moves) {
    this.moves = moves;
  }

  /**
   * 
   * @return names
   */
  public List<GenerationName> getNames() {
    return names;
  }

  public void setNames(List<GenerationName> names) {
    this.names = names;
  }

  /**
   * 
   * @return pokemonSpecies
   */
  public List<PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(List<PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  /**
   * 
   * @return types
   */
  public List<TypeSummary> getTypes() {
    return types;
  }

  public void setTypes(List<TypeSummary> types) {
    this.types = types;
  }

  /**
   * 
   * @return versionGroups
   */
  public List<VersionGroupSummary> getVersionGroups() {
    return versionGroups;
  }

  public void setVersionGroups(List<VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerationDetail generationDetail = (GenerationDetail) o;
    return Objects.equals(this.id, generationDetail.id) &&
        Objects.equals(this.name, generationDetail.name) &&
        Objects.equals(this.abilities, generationDetail.abilities) &&
        Objects.equals(this.mainRegion, generationDetail.mainRegion) &&
        Objects.equals(this.moves, generationDetail.moves) &&
        Objects.equals(this.names, generationDetail.names) &&
        Objects.equals(this.pokemonSpecies, generationDetail.pokemonSpecies) &&
        Objects.equals(this.types, generationDetail.types) &&
        Objects.equals(this.versionGroups, generationDetail.versionGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, abilities, mainRegion, moves, names, pokemonSpecies, types, versionGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerationDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
    sb.append("    mainRegion: ").append(toIndentedString(mainRegion)).append("\n");
    sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    versionGroups: ").append(toIndentedString(versionGroups)).append("\n");
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
