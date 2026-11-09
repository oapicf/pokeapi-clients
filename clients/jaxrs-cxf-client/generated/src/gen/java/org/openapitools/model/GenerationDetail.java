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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GenerationDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")

  private Integer id;

 /**
  * The name for this resource.
  */
  @ApiModelProperty(required = true, value = "The name for this resource.")

  private String name;

 /**
  * A list of abilities that were introduced in this generation.
  */
  @ApiModelProperty(required = true, value = "A list of abilities that were introduced in this generation.")

  private List<AbilitySummary> abilities = new ArrayList<>();

 /**
  * The main region travelled in this generation.
  */
  @ApiModelProperty(required = true, value = "The main region travelled in this generation.")

  private RegionSummary mainRegion;

 /**
  * A list of moves that were introduced in this generation.
  */
  @ApiModelProperty(required = true, value = "A list of moves that were introduced in this generation.")

  private List<MoveSummary> moves = new ArrayList<>();

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")

  private List<GenerationName> names = new ArrayList<>();

 /**
  * A list of Pokémon species that were introduced in this generation.
  */
  @ApiModelProperty(required = true, value = "A list of Pokémon species that were introduced in this generation.")

  private List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

 /**
  * A list of types that were introduced in this generation.
  */
  @ApiModelProperty(required = true, value = "A list of types that were introduced in this generation.")

  private List<TypeSummary> types = new ArrayList<>();

 /**
  * A list of version groups that were introduced in this generation.
  */
  @ApiModelProperty(required = true, value = "A list of version groups that were introduced in this generation.")

  private List<VersionGroupSummary> versionGroups = new ArrayList<>();
 /**
   * The identifier for this resource.
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * The name for this resource.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GenerationDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * A list of abilities that were introduced in this generation.
   * @return abilities
  **/
  @JsonProperty("abilities")
  public List<AbilitySummary> getAbilities() {
    return abilities;
  }


 /**
   * The main region travelled in this generation.
   * @return mainRegion
  **/
  @JsonProperty("main_region")
  public RegionSummary getMainRegion() {
    return mainRegion;
  }

  public void setMainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
  }

  public GenerationDetail mainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
    return this;
  }

 /**
   * A list of moves that were introduced in this generation.
   * @return moves
  **/
  @JsonProperty("moves")
  public List<MoveSummary> getMoves() {
    return moves;
  }


 /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  @JsonProperty("names")
  public List<GenerationName> getNames() {
    return names;
  }


 /**
   * A list of Pokémon species that were introduced in this generation.
   * @return pokemonSpecies
  **/
  @JsonProperty("pokemon_species")
  public List<PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }


 /**
   * A list of types that were introduced in this generation.
   * @return types
  **/
  @JsonProperty("types")
  public List<TypeSummary> getTypes() {
    return types;
  }


 /**
   * A list of version groups that were introduced in this generation.
   * @return versionGroups
  **/
  @JsonProperty("version_groups")
  public List<VersionGroupSummary> getVersionGroups() {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

