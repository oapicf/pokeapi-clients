package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilitySummary;
import org.openapitools.vertxweb.server.model.GenerationName;
import org.openapitools.vertxweb.server.model.MoveSummary;
import org.openapitools.vertxweb.server.model.PokemonSpeciesSummary;
import org.openapitools.vertxweb.server.model.RegionSummary;
import org.openapitools.vertxweb.server.model.TypeSummary;
import org.openapitools.vertxweb.server.model.VersionGroupSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public GenerationDetail () {

  }

  public GenerationDetail (Integer id, String name, List<AbilitySummary> abilities, RegionSummary mainRegion, List<MoveSummary> moves, List<GenerationName> names, List<PokemonSpeciesSummary> pokemonSpecies, List<TypeSummary> types, List<VersionGroupSummary> versionGroups) {
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

    
  @JsonProperty("abilities")
  public List<AbilitySummary> getAbilities() {
    return abilities;
  }
  public void setAbilities(List<AbilitySummary> abilities) {
    this.abilities = abilities;
  }

    
  @JsonProperty("main_region")
  public RegionSummary getMainRegion() {
    return mainRegion;
  }
  public void setMainRegion(RegionSummary mainRegion) {
    this.mainRegion = mainRegion;
  }

    
  @JsonProperty("moves")
  public List<MoveSummary> getMoves() {
    return moves;
  }
  public void setMoves(List<MoveSummary> moves) {
    this.moves = moves;
  }

    
  @JsonProperty("names")
  public List<GenerationName> getNames() {
    return names;
  }
  public void setNames(List<GenerationName> names) {
    this.names = names;
  }

    
  @JsonProperty("pokemon_species")
  public List<PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }
  public void setPokemonSpecies(List<PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

    
  @JsonProperty("types")
  public List<TypeSummary> getTypes() {
    return types;
  }
  public void setTypes(List<TypeSummary> types) {
    this.types = types;
  }

    
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
