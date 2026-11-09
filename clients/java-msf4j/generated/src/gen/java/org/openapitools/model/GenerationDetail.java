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

/**
 * GenerationDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class GenerationDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("abilities")
  private List<@Valid AbilitySummary> abilities = new ArrayList<>();

  @JsonProperty("main_region")
  private RegionSummary mainRegion;

  @JsonProperty("moves")
  private List<@Valid MoveSummary> moves = new ArrayList<>();

  @JsonProperty("names")
  private List<@Valid GenerationName> names = new ArrayList<>();

  @JsonProperty("pokemon_species")
  private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  @JsonProperty("types")
  private List<@Valid TypeSummary> types = new ArrayList<>();

  @JsonProperty("version_groups")
  private List<@Valid VersionGroupSummary> versionGroups = new ArrayList<>();

   /**
   * The identifier for this resource.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public GenerationDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this resource.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name for this resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * A list of abilities that were introduced in this generation.
   * @return abilities
  **/
  @ApiModelProperty(required = true, value = "A list of abilities that were introduced in this generation.")
  public List<@Valid AbilitySummary> getAbilities() {
    return abilities;
  }

  public GenerationDetail mainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
    return this;
  }

   /**
   * The main region travelled in this generation.
   * @return mainRegion
  **/
  @ApiModelProperty(required = true, value = "The main region travelled in this generation.")
  public RegionSummary getMainRegion() {
    return mainRegion;
  }

  public void setMainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
  }

   /**
   * A list of moves that were introduced in this generation.
   * @return moves
  **/
  @ApiModelProperty(required = true, value = "A list of moves that were introduced in this generation.")
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

   /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  public List<@Valid GenerationName> getNames() {
    return names;
  }

   /**
   * A list of Pokémon species that were introduced in this generation.
   * @return pokemonSpecies
  **/
  @ApiModelProperty(required = true, value = "A list of Pokémon species that were introduced in this generation.")
  public List<@Valid PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }

   /**
   * A list of types that were introduced in this generation.
   * @return types
  **/
  @ApiModelProperty(required = true, value = "A list of types that were introduced in this generation.")
  public List<@Valid TypeSummary> getTypes() {
    return types;
  }

   /**
   * A list of version groups that were introduced in this generation.
   * @return versionGroups
  **/
  @ApiModelProperty(required = true, value = "A list of version groups that were introduced in this generation.")
  public List<@Valid VersionGroupSummary> getVersionGroups() {
    return versionGroups;
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

