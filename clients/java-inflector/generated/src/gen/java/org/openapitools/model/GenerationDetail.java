package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilitySummary;
import org.openapitools.model.GenerationName;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.PokemonSpeciesSummary;
import org.openapitools.model.RegionSummary;
import org.openapitools.model.TypeSummary;
import org.openapitools.model.VersionGroupSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class GenerationDetail   {
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
   * The identifier for this resource.
   **/
  public GenerationDetail id(Integer id) {
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
   **/
  public GenerationDetail name(String name) {
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
   * A list of abilities that were introduced in this generation.
   **/
  public GenerationDetail abilities(List<AbilitySummary> abilities) {
    this.abilities = abilities;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of abilities that were introduced in this generation.")
  @JsonProperty("abilities")
  public List<AbilitySummary> getAbilities() {
    return abilities;
  }
  public void setAbilities(List<AbilitySummary> abilities) {
    this.abilities = abilities;
  }

  /**
   * The main region travelled in this generation.
   **/
  public GenerationDetail mainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The main region travelled in this generation.")
  @JsonProperty("main_region")
  public RegionSummary getMainRegion() {
    return mainRegion;
  }
  public void setMainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
  }

  /**
   * A list of moves that were introduced in this generation.
   **/
  public GenerationDetail moves(List<MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of moves that were introduced in this generation.")
  @JsonProperty("moves")
  public List<MoveSummary> getMoves() {
    return moves;
  }
  public void setMoves(List<MoveSummary> moves) {
    this.moves = moves;
  }

  /**
   * The name of this resource listed in different languages.
   **/
  public GenerationDetail names(List<GenerationName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty("names")
  public List<GenerationName> getNames() {
    return names;
  }
  public void setNames(List<GenerationName> names) {
    this.names = names;
  }

  /**
   * A list of Pokémon species that were introduced in this generation.
   **/
  public GenerationDetail pokemonSpecies(List<PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of Pokémon species that were introduced in this generation.")
  @JsonProperty("pokemon_species")
  public List<PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }
  public void setPokemonSpecies(List<PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  /**
   * A list of types that were introduced in this generation.
   **/
  public GenerationDetail types(List<TypeSummary> types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of types that were introduced in this generation.")
  @JsonProperty("types")
  public List<TypeSummary> getTypes() {
    return types;
  }
  public void setTypes(List<TypeSummary> types) {
    this.types = types;
  }

  /**
   * A list of version groups that were introduced in this generation.
   **/
  public GenerationDetail versionGroups(List<VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of version groups that were introduced in this generation.")
  @JsonProperty("version_groups")
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
    return Objects.equals(id, generationDetail.id) &&
        Objects.equals(name, generationDetail.name) &&
        Objects.equals(abilities, generationDetail.abilities) &&
        Objects.equals(mainRegion, generationDetail.mainRegion) &&
        Objects.equals(moves, generationDetail.moves) &&
        Objects.equals(names, generationDetail.names) &&
        Objects.equals(pokemonSpecies, generationDetail.pokemonSpecies) &&
        Objects.equals(types, generationDetail.types) &&
        Objects.equals(versionGroups, generationDetail.versionGroups);
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

