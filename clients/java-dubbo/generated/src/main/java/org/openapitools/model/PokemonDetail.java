package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokemonDetailAbilitiesInner;
import org.openapitools.model.PokemonDetailCries;
import org.openapitools.model.PokemonDetailHeldItems;
import org.openapitools.model.PokemonDetailMovesInner;
import org.openapitools.model.PokemonDetailPastAbilitiesInner;
import org.openapitools.model.PokemonDetailPastTypesInner;
import org.openapitools.model.PokemonDetailSprites;
import org.openapitools.model.PokemonDetailTypesInner;
import org.openapitools.model.PokemonFormSummary;
import org.openapitools.model.PokemonGameIndex;
import org.openapitools.model.PokemonSpeciesSummary;
import org.openapitools.model.PokemonStat;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PokemonDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("base_experience")
  private Integer baseExperience;

  @JsonProperty("height")
  private Integer height;

  @JsonProperty("is_default")
  private Boolean isDefault;

  @JsonProperty("order")
  private Integer order;

  @JsonProperty("weight")
  private Integer weight;

  @JsonProperty("abilities")
  private List<PokemonDetailAbilitiesInner> abilities = new ArrayList<>();

  @JsonProperty("past_abilities")
  private List<PokemonDetailPastAbilitiesInner> pastAbilities = new ArrayList<>();

  @JsonProperty("forms")
  private List<PokemonFormSummary> forms = new ArrayList<>();

  @JsonProperty("game_indices")
  private List<PokemonGameIndex> gameIndices = new ArrayList<>();

  @JsonProperty("held_items")
  private PokemonDetailHeldItems heldItems;

  @JsonProperty("location_area_encounters")
  private String locationAreaEncounters;

  @JsonProperty("moves")
  private List<PokemonDetailMovesInner> moves = new ArrayList<>();

  @JsonProperty("species")
  private PokemonSpeciesSummary species;

  @JsonProperty("sprites")
  private PokemonDetailSprites sprites;

  @JsonProperty("cries")
  private PokemonDetailCries cries;

  @JsonProperty("stats")
  private List<PokemonStat> stats = new ArrayList<>();

  @JsonProperty("types")
  private List<PokemonDetailTypesInner> types = new ArrayList<>();

  @JsonProperty("past_types")
  private List<PokemonDetailPastTypesInner> pastTypes = new ArrayList<>();

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
   * @return baseExperience
   */
  public Integer getBaseExperience() {
    return baseExperience;
  }

  public void setBaseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
  }

  /**
   * 
   * @return height
   */
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * 
   * @return isDefault
   */
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * 
   * @return order
   */
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * 
   * @return weight
   */
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  /**
   * 
   * @return abilities
   */
  public List<PokemonDetailAbilitiesInner> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
  }

  /**
   * 
   * @return pastAbilities
   */
  public List<PokemonDetailPastAbilitiesInner> getPastAbilities() {
    return pastAbilities;
  }

  public void setPastAbilities(List<PokemonDetailPastAbilitiesInner> pastAbilities) {
    this.pastAbilities = pastAbilities;
  }

  /**
   * 
   * @return forms
   */
  public List<PokemonFormSummary> getForms() {
    return forms;
  }

  public void setForms(List<PokemonFormSummary> forms) {
    this.forms = forms;
  }

  /**
   * 
   * @return gameIndices
   */
  public List<PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   * 
   * @return heldItems
   */
  public PokemonDetailHeldItems getHeldItems() {
    return heldItems;
  }

  public void setHeldItems(PokemonDetailHeldItems heldItems) {
    this.heldItems = heldItems;
  }

  /**
   * 
   * @return locationAreaEncounters
   */
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }

  public void setLocationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
  }

  /**
   * 
   * @return moves
   */
  public List<PokemonDetailMovesInner> getMoves() {
    return moves;
  }

  public void setMoves(List<PokemonDetailMovesInner> moves) {
    this.moves = moves;
  }

  /**
   * 
   * @return species
   */
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }

  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  /**
   * 
   * @return sprites
   */
  public PokemonDetailSprites getSprites() {
    return sprites;
  }

  public void setSprites(PokemonDetailSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * 
   * @return cries
   */
  public PokemonDetailCries getCries() {
    return cries;
  }

  public void setCries(PokemonDetailCries cries) {
    this.cries = cries;
  }

  /**
   * 
   * @return stats
   */
  public List<PokemonStat> getStats() {
    return stats;
  }

  public void setStats(List<PokemonStat> stats) {
    this.stats = stats;
  }

  /**
   * 
   * @return types
   */
  public List<PokemonDetailTypesInner> getTypes() {
    return types;
  }

  public void setTypes(List<PokemonDetailTypesInner> types) {
    this.types = types;
  }

  /**
   * 
   * @return pastTypes
   */
  public List<PokemonDetailPastTypesInner> getPastTypes() {
    return pastTypes;
  }

  public void setPastTypes(List<PokemonDetailPastTypesInner> pastTypes) {
    this.pastTypes = pastTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonDetail pokemonDetail = (PokemonDetail) o;
    return Objects.equals(this.id, pokemonDetail.id) &&
        Objects.equals(this.name, pokemonDetail.name) &&
        Objects.equals(this.baseExperience, pokemonDetail.baseExperience) &&
        Objects.equals(this.height, pokemonDetail.height) &&
        Objects.equals(this.isDefault, pokemonDetail.isDefault) &&
        Objects.equals(this.order, pokemonDetail.order) &&
        Objects.equals(this.weight, pokemonDetail.weight) &&
        Objects.equals(this.abilities, pokemonDetail.abilities) &&
        Objects.equals(this.pastAbilities, pokemonDetail.pastAbilities) &&
        Objects.equals(this.forms, pokemonDetail.forms) &&
        Objects.equals(this.gameIndices, pokemonDetail.gameIndices) &&
        Objects.equals(this.heldItems, pokemonDetail.heldItems) &&
        Objects.equals(this.locationAreaEncounters, pokemonDetail.locationAreaEncounters) &&
        Objects.equals(this.moves, pokemonDetail.moves) &&
        Objects.equals(this.species, pokemonDetail.species) &&
        Objects.equals(this.sprites, pokemonDetail.sprites) &&
        Objects.equals(this.cries, pokemonDetail.cries) &&
        Objects.equals(this.stats, pokemonDetail.stats) &&
        Objects.equals(this.types, pokemonDetail.types) &&
        Objects.equals(this.pastTypes, pokemonDetail.pastTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, baseExperience, height, isDefault, order, weight, abilities, pastAbilities, forms, gameIndices, heldItems, locationAreaEncounters, moves, species, sprites, cries, stats, types, pastTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    baseExperience: ").append(toIndentedString(baseExperience)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
    sb.append("    pastAbilities: ").append(toIndentedString(pastAbilities)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
    sb.append("    heldItems: ").append(toIndentedString(heldItems)).append("\n");
    sb.append("    locationAreaEncounters: ").append(toIndentedString(locationAreaEncounters)).append("\n");
    sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
    sb.append("    species: ").append(toIndentedString(species)).append("\n");
    sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
    sb.append("    cries: ").append(toIndentedString(cries)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    pastTypes: ").append(toIndentedString(pastTypes)).append("\n");
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
