/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
 *
 * OpenAPI document version: 2.7.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-02-07T04:17:17.108399996Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class GenerationDetail   {
  
  private Integer id;
  private String name;
  private List<AbilitySummary> abilities = new ArrayList<>();
  private RegionSummary mainRegion;
  private List<MoveSummary> moves = new ArrayList<>();
  private List<GenerationName> names = new ArrayList<>();
  private List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();
  private List<TypeSummary> types = new ArrayList<>();
  private List<VersionGroupSummary> versionGroups = new ArrayList<>();

  /**
   */
  public GenerationDetail id(Integer id) {
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
   */
  public GenerationDetail name(String name) {
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
   */
  public GenerationDetail abilities(List<AbilitySummary> abilities) {
    this.abilities = abilities;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("abilities")
  public List<AbilitySummary> getAbilities() {
    return abilities;
  }
  public void setAbilities(List<AbilitySummary> abilities) {
    this.abilities = abilities;
  }

  /**
   */
  public GenerationDetail mainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("main_region")
  public RegionSummary getMainRegion() {
    return mainRegion;
  }
  public void setMainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
  }

  /**
   */
  public GenerationDetail moves(List<MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("moves")
  public List<MoveSummary> getMoves() {
    return moves;
  }
  public void setMoves(List<MoveSummary> moves) {
    this.moves = moves;
  }

  /**
   */
  public GenerationDetail names(List<GenerationName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  public List<GenerationName> getNames() {
    return names;
  }
  public void setNames(List<GenerationName> names) {
    this.names = names;
  }

  /**
   */
  public GenerationDetail pokemonSpecies(List<PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokemon_species")
  public List<PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }
  public void setPokemonSpecies(List<PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  /**
   */
  public GenerationDetail types(List<TypeSummary> types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("types")
  public List<TypeSummary> getTypes() {
    return types;
  }
  public void setTypes(List<TypeSummary> types) {
    this.types = types;
  }

  /**
   */
  public GenerationDetail versionGroups(List<VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

