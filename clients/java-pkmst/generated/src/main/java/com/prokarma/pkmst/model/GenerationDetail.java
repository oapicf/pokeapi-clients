package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AbilitySummary;
import com.prokarma.pkmst.model.GenerationName;
import com.prokarma.pkmst.model.MoveSummary;
import com.prokarma.pkmst.model.PokemonSpeciesSummary;
import com.prokarma.pkmst.model.RegionSummary;
import com.prokarma.pkmst.model.TypeSummary;
import com.prokarma.pkmst.model.VersionGroupSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * GenerationDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

  public GenerationDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GenerationDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for this resource.
   * @return name
   */
  @ApiModelProperty(required = true, value = "The name for this resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GenerationDetail abilities(List<AbilitySummary> abilities) {
    this.abilities = abilities;
    return this;
  }

  public GenerationDetail addAbilitiesItem(AbilitySummary abilitiesItem) {
    if (this.abilities == null) {
      this.abilities = new ArrayList<>();
    }
    this.abilities.add(abilitiesItem);
    return this;
  }

  /**
   * A list of abilities that were introduced in this generation.
   * @return abilities
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of abilities that were introduced in this generation.")
  public List<AbilitySummary> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<AbilitySummary> abilities) {
    this.abilities = abilities;
  }

  public GenerationDetail mainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
    return this;
  }

  /**
   * The main region travelled in this generation.
   * @return mainRegion
   */
  @ApiModelProperty(required = true, value = "The main region travelled in this generation.")
  public RegionSummary getMainRegion() {
    return mainRegion;
  }

  public void setMainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
  }

  public GenerationDetail moves(List<MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  public GenerationDetail addMovesItem(MoveSummary movesItem) {
    if (this.moves == null) {
      this.moves = new ArrayList<>();
    }
    this.moves.add(movesItem);
    return this;
  }

  /**
   * A list of moves that were introduced in this generation.
   * @return moves
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of moves that were introduced in this generation.")
  public List<MoveSummary> getMoves() {
    return moves;
  }

  public void setMoves(List<MoveSummary> moves) {
    this.moves = moves;
  }

  public GenerationDetail names(List<GenerationName> names) {
    this.names = names;
    return this;
  }

  public GenerationDetail addNamesItem(GenerationName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The name of this resource listed in different languages.")
  public List<GenerationName> getNames() {
    return names;
  }

  public void setNames(List<GenerationName> names) {
    this.names = names;
  }

  public GenerationDetail pokemonSpecies(List<PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  public GenerationDetail addPokemonSpeciesItem(PokemonSpeciesSummary pokemonSpeciesItem) {
    if (this.pokemonSpecies == null) {
      this.pokemonSpecies = new ArrayList<>();
    }
    this.pokemonSpecies.add(pokemonSpeciesItem);
    return this;
  }

  /**
   * A list of Pokémon species that were introduced in this generation.
   * @return pokemonSpecies
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of Pokémon species that were introduced in this generation.")
  public List<PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(List<PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  public GenerationDetail types(List<TypeSummary> types) {
    this.types = types;
    return this;
  }

  public GenerationDetail addTypesItem(TypeSummary typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * A list of types that were introduced in this generation.
   * @return types
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of types that were introduced in this generation.")
  public List<TypeSummary> getTypes() {
    return types;
  }

  public void setTypes(List<TypeSummary> types) {
    this.types = types;
  }

  public GenerationDetail versionGroups(List<VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  public GenerationDetail addVersionGroupsItem(VersionGroupSummary versionGroupsItem) {
    if (this.versionGroups == null) {
      this.versionGroups = new ArrayList<>();
    }
    this.versionGroups.add(versionGroupsItem);
    return this;
  }

  /**
   * A list of version groups that were introduced in this generation.
   * @return versionGroups
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of version groups that were introduced in this generation.")
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

