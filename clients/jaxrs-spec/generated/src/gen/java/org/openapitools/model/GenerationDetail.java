package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("GenerationDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class GenerationDetail   {
  private Integer id;
  private String name;
  private @Valid List<@Valid AbilitySummary> abilities = new ArrayList<>();
  private RegionSummary mainRegion;
  private @Valid List<@Valid MoveSummary> moves = new ArrayList<>();
  private @Valid List<@Valid GenerationName> names = new ArrayList<>();
  private @Valid List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();
  private @Valid List<@Valid TypeSummary> types = new ArrayList<>();
  private @Valid List<@Valid VersionGroupSummary> versionGroups = new ArrayList<>();

  public GenerationDetail() {
  }

  @JsonCreator
  public GenerationDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "abilities") List<@Valid AbilitySummary> abilities,
    @JsonProperty(required = true, value = "main_region") RegionSummary mainRegion,
    @JsonProperty(required = true, value = "moves") List<@Valid MoveSummary> moves,
    @JsonProperty(required = true, value = "names") List<@Valid GenerationName> names,
    @JsonProperty(required = true, value = "pokemon_species") List<@Valid PokemonSpeciesSummary> pokemonSpecies,
    @JsonProperty(required = true, value = "types") List<@Valid TypeSummary> types,
    @JsonProperty(required = true, value = "version_groups") List<@Valid VersionGroupSummary> versionGroups
  ) {
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

  /**
   **/
  public GenerationDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public GenerationDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=100)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public GenerationDetail abilities(List<@Valid AbilitySummary> abilities) {
    this.abilities = abilities;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "abilities")
  @NotNull @Valid public List<@Valid AbilitySummary> getAbilities() {
    return abilities;
  }

  @JsonProperty(required = true, value = "abilities")
  public void setAbilities(List<@Valid AbilitySummary> abilities) {
    this.abilities = abilities;
  }

  public GenerationDetail addAbilitiesItem(AbilitySummary abilitiesItem) {
    if (this.abilities == null) {
      this.abilities = new ArrayList<>();
    }

    this.abilities.add(abilitiesItem);
    return this;
  }

  public GenerationDetail removeAbilitiesItem(AbilitySummary abilitiesItem) {
    if (abilitiesItem != null && this.abilities != null) {
      this.abilities.remove(abilitiesItem);
    }

    return this;
  }
  /**
   **/
  public GenerationDetail mainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "main_region")
  @NotNull @Valid public RegionSummary getMainRegion() {
    return mainRegion;
  }

  @JsonProperty(required = true, value = "main_region")
  public void setMainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
  }

  /**
   **/
  public GenerationDetail moves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "moves")
  @NotNull @Valid public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

  @JsonProperty(required = true, value = "moves")
  public void setMoves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
  }

  public GenerationDetail addMovesItem(MoveSummary movesItem) {
    if (this.moves == null) {
      this.moves = new ArrayList<>();
    }

    this.moves.add(movesItem);
    return this;
  }

  public GenerationDetail removeMovesItem(MoveSummary movesItem) {
    if (movesItem != null && this.moves != null) {
      this.moves.remove(movesItem);
    }

    return this;
  }
  /**
   **/
  public GenerationDetail names(List<@Valid GenerationName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid GenerationName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid GenerationName> names) {
    this.names = names;
  }

  public GenerationDetail addNamesItem(GenerationName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public GenerationDetail removeNamesItem(GenerationName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

    return this;
  }
  /**
   **/
  public GenerationDetail pokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "pokemon_species")
  @NotNull @Valid public List<@Valid PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }

  @JsonProperty(required = true, value = "pokemon_species")
  public void setPokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  public GenerationDetail addPokemonSpeciesItem(PokemonSpeciesSummary pokemonSpeciesItem) {
    if (this.pokemonSpecies == null) {
      this.pokemonSpecies = new ArrayList<>();
    }

    this.pokemonSpecies.add(pokemonSpeciesItem);
    return this;
  }

  public GenerationDetail removePokemonSpeciesItem(PokemonSpeciesSummary pokemonSpeciesItem) {
    if (pokemonSpeciesItem != null && this.pokemonSpecies != null) {
      this.pokemonSpecies.remove(pokemonSpeciesItem);
    }

    return this;
  }
  /**
   **/
  public GenerationDetail types(List<@Valid TypeSummary> types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "types")
  @NotNull @Valid public List<@Valid TypeSummary> getTypes() {
    return types;
  }

  @JsonProperty(required = true, value = "types")
  public void setTypes(List<@Valid TypeSummary> types) {
    this.types = types;
  }

  public GenerationDetail addTypesItem(TypeSummary typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }

    this.types.add(typesItem);
    return this;
  }

  public GenerationDetail removeTypesItem(TypeSummary typesItem) {
    if (typesItem != null && this.types != null) {
      this.types.remove(typesItem);
    }

    return this;
  }
  /**
   **/
  public GenerationDetail versionGroups(List<@Valid VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "version_groups")
  @NotNull @Valid public List<@Valid VersionGroupSummary> getVersionGroups() {
    return versionGroups;
  }

  @JsonProperty(required = true, value = "version_groups")
  public void setVersionGroups(List<@Valid VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
  }

  public GenerationDetail addVersionGroupsItem(VersionGroupSummary versionGroupsItem) {
    if (this.versionGroups == null) {
      this.versionGroups = new ArrayList<>();
    }

    this.versionGroups.add(versionGroupsItem);
    return this;
  }

  public GenerationDetail removeVersionGroupsItem(VersionGroupSummary versionGroupsItem) {
    if (versionGroupsItem != null && this.versionGroups != null) {
      this.versionGroups.remove(versionGroupsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

