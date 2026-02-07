package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(value = "")

  private Integer baseExperience;

  @ApiModelProperty(value = "")

  private Integer height;

  @ApiModelProperty(value = "")

  private Boolean isDefault;

  @ApiModelProperty(value = "")

  private Integer order;

  @ApiModelProperty(value = "")

  private Integer weight;

  @ApiModelProperty(required = true, value = "")

  private List<PokemonDetailAbilitiesInner> abilities = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<PokemonDetailPastAbilitiesInner> pastAbilities = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<PokemonFormSummary> forms = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<PokemonGameIndex> gameIndices = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private PokemonDetailHeldItems heldItems;

  @ApiModelProperty(required = true, value = "")

  private String locationAreaEncounters;

  @ApiModelProperty(required = true, value = "")

  private List<PokemonDetailMovesInner> moves = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private PokemonSpeciesSummary species;

  @ApiModelProperty(required = true, value = "")

  private PokemonDetailSprites sprites;

  @ApiModelProperty(required = true, value = "")

  private PokemonDetailCries cries;

  @ApiModelProperty(required = true, value = "")

  private List<PokemonStat> stats = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<PokemonDetailTypesInner> types = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<PokemonDetailPastTypesInner> pastTypes = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokemonDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get baseExperience
   * @return baseExperience
  **/
  @JsonProperty("base_experience")
  public Integer getBaseExperience() {
    return baseExperience;
  }

  public void setBaseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
  }

  public PokemonDetail baseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
    return this;
  }

 /**
   * Get height
   * @return height
  **/
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PokemonDetail height(Integer height) {
    this.height = height;
    return this;
  }

 /**
   * Get isDefault
   * @return isDefault
  **/
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public PokemonDetail isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

 /**
   * Get order
   * @return order
  **/
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public PokemonDetail order(Integer order) {
    this.order = order;
    return this;
  }

 /**
   * Get weight
   * @return weight
  **/
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public PokemonDetail weight(Integer weight) {
    this.weight = weight;
    return this;
  }

 /**
   * Get abilities
   * @return abilities
  **/
  @JsonProperty("abilities")
  public List<PokemonDetailAbilitiesInner> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
  }

  public PokemonDetail abilities(List<PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
    return this;
  }

  public PokemonDetail addAbilitiesItem(PokemonDetailAbilitiesInner abilitiesItem) {
    this.abilities.add(abilitiesItem);
    return this;
  }

 /**
   * Get pastAbilities
   * @return pastAbilities
  **/
  @JsonProperty("past_abilities")
  public List<PokemonDetailPastAbilitiesInner> getPastAbilities() {
    return pastAbilities;
  }

  public void setPastAbilities(List<PokemonDetailPastAbilitiesInner> pastAbilities) {
    this.pastAbilities = pastAbilities;
  }

  public PokemonDetail pastAbilities(List<PokemonDetailPastAbilitiesInner> pastAbilities) {
    this.pastAbilities = pastAbilities;
    return this;
  }

  public PokemonDetail addPastAbilitiesItem(PokemonDetailPastAbilitiesInner pastAbilitiesItem) {
    this.pastAbilities.add(pastAbilitiesItem);
    return this;
  }

 /**
   * Get forms
   * @return forms
  **/
  @JsonProperty("forms")
  public List<PokemonFormSummary> getForms() {
    return forms;
  }

  public void setForms(List<PokemonFormSummary> forms) {
    this.forms = forms;
  }

  public PokemonDetail forms(List<PokemonFormSummary> forms) {
    this.forms = forms;
    return this;
  }

  public PokemonDetail addFormsItem(PokemonFormSummary formsItem) {
    this.forms.add(formsItem);
    return this;
  }

 /**
   * Get gameIndices
   * @return gameIndices
  **/
  @JsonProperty("game_indices")
  public List<PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public PokemonDetail gameIndices(List<PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  public PokemonDetail addGameIndicesItem(PokemonGameIndex gameIndicesItem) {
    this.gameIndices.add(gameIndicesItem);
    return this;
  }

 /**
   * Get heldItems
   * @return heldItems
  **/
  @JsonProperty("held_items")
  public PokemonDetailHeldItems getHeldItems() {
    return heldItems;
  }

  public void setHeldItems(PokemonDetailHeldItems heldItems) {
    this.heldItems = heldItems;
  }

  public PokemonDetail heldItems(PokemonDetailHeldItems heldItems) {
    this.heldItems = heldItems;
    return this;
  }

 /**
   * Get locationAreaEncounters
   * @return locationAreaEncounters
  **/
  @JsonProperty("location_area_encounters")
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }


 /**
   * Get moves
   * @return moves
  **/
  @JsonProperty("moves")
  public List<PokemonDetailMovesInner> getMoves() {
    return moves;
  }

  public void setMoves(List<PokemonDetailMovesInner> moves) {
    this.moves = moves;
  }

  public PokemonDetail moves(List<PokemonDetailMovesInner> moves) {
    this.moves = moves;
    return this;
  }

  public PokemonDetail addMovesItem(PokemonDetailMovesInner movesItem) {
    this.moves.add(movesItem);
    return this;
  }

 /**
   * Get species
   * @return species
  **/
  @JsonProperty("species")
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }

  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  public PokemonDetail species(PokemonSpeciesSummary species) {
    this.species = species;
    return this;
  }

 /**
   * Get sprites
   * @return sprites
  **/
  @JsonProperty("sprites")
  public PokemonDetailSprites getSprites() {
    return sprites;
  }

  public void setSprites(PokemonDetailSprites sprites) {
    this.sprites = sprites;
  }

  public PokemonDetail sprites(PokemonDetailSprites sprites) {
    this.sprites = sprites;
    return this;
  }

 /**
   * Get cries
   * @return cries
  **/
  @JsonProperty("cries")
  public PokemonDetailCries getCries() {
    return cries;
  }

  public void setCries(PokemonDetailCries cries) {
    this.cries = cries;
  }

  public PokemonDetail cries(PokemonDetailCries cries) {
    this.cries = cries;
    return this;
  }

 /**
   * Get stats
   * @return stats
  **/
  @JsonProperty("stats")
  public List<PokemonStat> getStats() {
    return stats;
  }

  public void setStats(List<PokemonStat> stats) {
    this.stats = stats;
  }

  public PokemonDetail stats(List<PokemonStat> stats) {
    this.stats = stats;
    return this;
  }

  public PokemonDetail addStatsItem(PokemonStat statsItem) {
    this.stats.add(statsItem);
    return this;
  }

 /**
   * Get types
   * @return types
  **/
  @JsonProperty("types")
  public List<PokemonDetailTypesInner> getTypes() {
    return types;
  }

  public void setTypes(List<PokemonDetailTypesInner> types) {
    this.types = types;
  }

  public PokemonDetail types(List<PokemonDetailTypesInner> types) {
    this.types = types;
    return this;
  }

  public PokemonDetail addTypesItem(PokemonDetailTypesInner typesItem) {
    this.types.add(typesItem);
    return this;
  }

 /**
   * Get pastTypes
   * @return pastTypes
  **/
  @JsonProperty("past_types")
  public List<PokemonDetailPastTypesInner> getPastTypes() {
    return pastTypes;
  }

  public void setPastTypes(List<PokemonDetailPastTypesInner> pastTypes) {
    this.pastTypes = pastTypes;
  }

  public PokemonDetail pastTypes(List<PokemonDetailPastTypesInner> pastTypes) {
    this.pastTypes = pastTypes;
    return this;
  }

  public PokemonDetail addPastTypesItem(PokemonDetailPastTypesInner pastTypesItem) {
    this.pastTypes.add(pastTypesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

