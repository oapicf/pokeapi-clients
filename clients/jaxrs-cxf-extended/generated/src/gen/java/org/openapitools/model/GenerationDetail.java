package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GenerationDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AbilitySummary> abilities = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RegionSummary mainRegion;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid MoveSummary> moves = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid GenerationName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid TypeSummary> types = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid VersionGroupSummary> versionGroups = new ArrayList<>();
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
  public GenerationDetail id(Integer id) {
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
  public GenerationDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get abilities
  * @return abilities
  */
  @JsonProperty("abilities")
  @NotNull
  public List<@Valid AbilitySummary> getAbilities() {
    return abilities;
  }

  /**
   * Sets the <code>abilities</code> property.
   */
 public void setAbilities(List<@Valid AbilitySummary> abilities) {
    this.abilities = abilities;
  }

  /**
   * Sets the <code>abilities</code> property.
   */
  public GenerationDetail abilities(List<@Valid AbilitySummary> abilities) {
    this.abilities = abilities;
    return this;
  }

  /**
   * Adds a new item to the <code>abilities</code> list.
   */
  public GenerationDetail addAbilitiesItem(AbilitySummary abilitiesItem) {
    this.abilities.add(abilitiesItem);
    return this;
  }

 /**
  * Get mainRegion
  * @return mainRegion
  */
  @JsonProperty("main_region")
  @NotNull
  public RegionSummary getMainRegion() {
    return mainRegion;
  }

  /**
   * Sets the <code>mainRegion</code> property.
   */
 public void setMainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
  }

  /**
   * Sets the <code>mainRegion</code> property.
   */
  public GenerationDetail mainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
    return this;
  }

 /**
  * Get moves
  * @return moves
  */
  @JsonProperty("moves")
  @NotNull
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

  /**
   * Sets the <code>moves</code> property.
   */
 public void setMoves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
  }

  /**
   * Sets the <code>moves</code> property.
   */
  public GenerationDetail moves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  /**
   * Adds a new item to the <code>moves</code> list.
   */
  public GenerationDetail addMovesItem(MoveSummary movesItem) {
    this.moves.add(movesItem);
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid GenerationName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid GenerationName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public GenerationDetail names(List<@Valid GenerationName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public GenerationDetail addNamesItem(GenerationName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
  * Get pokemonSpecies
  * @return pokemonSpecies
  */
  @JsonProperty("pokemon_species")
  @NotNull
  public List<@Valid PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }

  /**
   * Sets the <code>pokemonSpecies</code> property.
   */
 public void setPokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  /**
   * Sets the <code>pokemonSpecies</code> property.
   */
  public GenerationDetail pokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  /**
   * Adds a new item to the <code>pokemonSpecies</code> list.
   */
  public GenerationDetail addPokemonSpeciesItem(PokemonSpeciesSummary pokemonSpeciesItem) {
    this.pokemonSpecies.add(pokemonSpeciesItem);
    return this;
  }

 /**
  * Get types
  * @return types
  */
  @JsonProperty("types")
  @NotNull
  public List<@Valid TypeSummary> getTypes() {
    return types;
  }

  /**
   * Sets the <code>types</code> property.
   */
 public void setTypes(List<@Valid TypeSummary> types) {
    this.types = types;
  }

  /**
   * Sets the <code>types</code> property.
   */
  public GenerationDetail types(List<@Valid TypeSummary> types) {
    this.types = types;
    return this;
  }

  /**
   * Adds a new item to the <code>types</code> list.
   */
  public GenerationDetail addTypesItem(TypeSummary typesItem) {
    this.types.add(typesItem);
    return this;
  }

 /**
  * Get versionGroups
  * @return versionGroups
  */
  @JsonProperty("version_groups")
  @NotNull
  public List<@Valid VersionGroupSummary> getVersionGroups() {
    return versionGroups;
  }

  /**
   * Sets the <code>versionGroups</code> property.
   */
 public void setVersionGroups(List<@Valid VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
  }

  /**
   * Sets the <code>versionGroups</code> property.
   */
  public GenerationDetail versionGroups(List<@Valid VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  /**
   * Adds a new item to the <code>versionGroups</code> list.
   */
  public GenerationDetail addVersionGroupsItem(VersionGroupSummary versionGroupsItem) {
    this.versionGroups.add(versionGroupsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

