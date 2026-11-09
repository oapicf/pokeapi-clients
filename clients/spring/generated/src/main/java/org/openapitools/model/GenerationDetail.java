package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GenerationDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class GenerationDetail {

  private Integer id;

  private String name;

  private List<@Valid AbilitySummary> abilities = new ArrayList<>();

  private RegionSummary mainRegion;

  private List<@Valid MoveSummary> moves = new ArrayList<>();

  private List<@Valid GenerationName> names = new ArrayList<>();

  private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  private List<@Valid TypeSummary> types = new ArrayList<>();

  private List<@Valid VersionGroupSummary> versionGroups = new ArrayList<>();

  public GenerationDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenerationDetail(Integer id, String name, List<@Valid AbilitySummary> abilities, RegionSummary mainRegion, List<@Valid MoveSummary> moves, List<@Valid GenerationName> names, List<@Valid PokemonSpeciesSummary> pokemonSpecies, List<@Valid TypeSummary> types, List<@Valid VersionGroupSummary> versionGroups) {
    this.id = id;
    this.name = name;
    this.abilities = abilities;
    this.mainRegion = mainRegion;
    this.moves = moves;
    this.names = names;
    this.pokemonSpecies = pokemonSpecies;
    this.types = types;
    this.versionGroups = versionGroups;
  }

  public GenerationDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The identifier for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
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
  @NotNull @Size(max = 200) 
  @Schema(name = "name", description = "The name for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public GenerationDetail abilities(List<@Valid AbilitySummary> abilities) {
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
  
  @Schema(name = "abilities", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of abilities that were introduced in this generation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("abilities")
  public List<@Valid AbilitySummary> getAbilities() {
    return abilities;
  }

  @JsonProperty("abilities")
  public void setAbilities(List<@Valid AbilitySummary> abilities) {
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
  @NotNull @Valid 
  @Schema(name = "main_region", description = "The main region travelled in this generation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("main_region")
  public RegionSummary getMainRegion() {
    return mainRegion;
  }

  @JsonProperty("main_region")
  public void setMainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
  }

  public GenerationDetail moves(List<@Valid MoveSummary> moves) {
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
  
  @Schema(name = "moves", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of moves that were introduced in this generation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("moves")
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

  @JsonProperty("moves")
  public void setMoves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
  }

  public GenerationDetail names(List<@Valid GenerationName> names) {
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
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of this resource listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid GenerationName> getNames() {
    return names;
  }

  @JsonProperty("names")
  public void setNames(List<@Valid GenerationName> names) {
    this.names = names;
  }

  public GenerationDetail pokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
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
  
  @Schema(name = "pokemon_species", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of Pokémon species that were introduced in this generation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon_species")
  public List<@Valid PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }

  @JsonProperty("pokemon_species")
  public void setPokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  public GenerationDetail types(List<@Valid TypeSummary> types) {
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
  
  @Schema(name = "types", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of types that were introduced in this generation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("types")
  public List<@Valid TypeSummary> getTypes() {
    return types;
  }

  @JsonProperty("types")
  public void setTypes(List<@Valid TypeSummary> types) {
    this.types = types;
  }

  public GenerationDetail versionGroups(List<@Valid VersionGroupSummary> versionGroups) {
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
  
  @Schema(name = "version_groups", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of version groups that were introduced in this generation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_groups")
  public List<@Valid VersionGroupSummary> getVersionGroups() {
    return versionGroups;
  }

  @JsonProperty("version_groups")
  public void setVersionGroups(List<@Valid VersionGroupSummary> versionGroups) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

