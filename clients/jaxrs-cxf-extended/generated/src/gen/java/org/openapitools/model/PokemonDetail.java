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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  @Valid
  private List<@Valid PokemonDetailAbilitiesInner> abilities = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonDetailPastAbilitiesInner> pastAbilities = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonFormSummary> forms = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonGameIndex> gameIndices = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PokemonDetailHeldItems heldItems;

  @ApiModelProperty(required = true, value = "")
  private String locationAreaEncounters;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonDetailMovesInner> moves = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PokemonSpeciesSummary species;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PokemonDetailSprites sprites;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PokemonDetailCries cries;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonStat> stats = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonDetailTypesInner> types = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonDetailPastTypesInner> pastTypes = new ArrayList<>();
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
  public PokemonDetail id(Integer id) {
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
  public PokemonDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get baseExperience
  * @return baseExperience
  */
  @JsonProperty("base_experience")
  public Integer getBaseExperience() {
    return baseExperience;
  }

  /**
   * Sets the <code>baseExperience</code> property.
   */
 public void setBaseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
  }

  /**
   * Sets the <code>baseExperience</code> property.
   */
  public PokemonDetail baseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
    return this;
  }

 /**
  * Get height
  * @return height
  */
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  /**
   * Sets the <code>height</code> property.
   */
 public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * Sets the <code>height</code> property.
   */
  public PokemonDetail height(Integer height) {
    this.height = height;
    return this;
  }

 /**
  * Get isDefault
  * @return isDefault
  */
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * Sets the <code>isDefault</code> property.
   */
 public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * Sets the <code>isDefault</code> property.
   */
  public PokemonDetail isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

 /**
  * Get order
  * @return order
  */
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }

  /**
   * Sets the <code>order</code> property.
   */
 public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * Sets the <code>order</code> property.
   */
  public PokemonDetail order(Integer order) {
    this.order = order;
    return this;
  }

 /**
  * Get weight
  * @return weight
  */
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }

  /**
   * Sets the <code>weight</code> property.
   */
 public void setWeight(Integer weight) {
    this.weight = weight;
  }

  /**
   * Sets the <code>weight</code> property.
   */
  public PokemonDetail weight(Integer weight) {
    this.weight = weight;
    return this;
  }

 /**
  * Get abilities
  * @return abilities
  */
  @JsonProperty("abilities")
  @NotNull
  public List<@Valid PokemonDetailAbilitiesInner> getAbilities() {
    return abilities;
  }

  /**
   * Sets the <code>abilities</code> property.
   */
 public void setAbilities(List<@Valid PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
  }

  /**
   * Sets the <code>abilities</code> property.
   */
  public PokemonDetail abilities(List<@Valid PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
    return this;
  }

  /**
   * Adds a new item to the <code>abilities</code> list.
   */
  public PokemonDetail addAbilitiesItem(PokemonDetailAbilitiesInner abilitiesItem) {
    this.abilities.add(abilitiesItem);
    return this;
  }

 /**
  * Get pastAbilities
  * @return pastAbilities
  */
  @JsonProperty("past_abilities")
  @NotNull
  public List<@Valid PokemonDetailPastAbilitiesInner> getPastAbilities() {
    return pastAbilities;
  }

  /**
   * Sets the <code>pastAbilities</code> property.
   */
 public void setPastAbilities(List<@Valid PokemonDetailPastAbilitiesInner> pastAbilities) {
    this.pastAbilities = pastAbilities;
  }

  /**
   * Sets the <code>pastAbilities</code> property.
   */
  public PokemonDetail pastAbilities(List<@Valid PokemonDetailPastAbilitiesInner> pastAbilities) {
    this.pastAbilities = pastAbilities;
    return this;
  }

  /**
   * Adds a new item to the <code>pastAbilities</code> list.
   */
  public PokemonDetail addPastAbilitiesItem(PokemonDetailPastAbilitiesInner pastAbilitiesItem) {
    this.pastAbilities.add(pastAbilitiesItem);
    return this;
  }

 /**
  * Get forms
  * @return forms
  */
  @JsonProperty("forms")
  @NotNull
  public List<@Valid PokemonFormSummary> getForms() {
    return forms;
  }

  /**
   * Sets the <code>forms</code> property.
   */
 public void setForms(List<@Valid PokemonFormSummary> forms) {
    this.forms = forms;
  }

  /**
   * Sets the <code>forms</code> property.
   */
  public PokemonDetail forms(List<@Valid PokemonFormSummary> forms) {
    this.forms = forms;
    return this;
  }

  /**
   * Adds a new item to the <code>forms</code> list.
   */
  public PokemonDetail addFormsItem(PokemonFormSummary formsItem) {
    this.forms.add(formsItem);
    return this;
  }

 /**
  * Get gameIndices
  * @return gameIndices
  */
  @JsonProperty("game_indices")
  @NotNull
  public List<@Valid PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }

  /**
   * Sets the <code>gameIndices</code> property.
   */
 public void setGameIndices(List<@Valid PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   * Sets the <code>gameIndices</code> property.
   */
  public PokemonDetail gameIndices(List<@Valid PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  /**
   * Adds a new item to the <code>gameIndices</code> list.
   */
  public PokemonDetail addGameIndicesItem(PokemonGameIndex gameIndicesItem) {
    this.gameIndices.add(gameIndicesItem);
    return this;
  }

 /**
  * Get heldItems
  * @return heldItems
  */
  @JsonProperty("held_items")
  @NotNull
  public PokemonDetailHeldItems getHeldItems() {
    return heldItems;
  }

  /**
   * Sets the <code>heldItems</code> property.
   */
 public void setHeldItems(PokemonDetailHeldItems heldItems) {
    this.heldItems = heldItems;
  }

  /**
   * Sets the <code>heldItems</code> property.
   */
  public PokemonDetail heldItems(PokemonDetailHeldItems heldItems) {
    this.heldItems = heldItems;
    return this;
  }

 /**
  * Get locationAreaEncounters
  * @return locationAreaEncounters
  */
  @JsonProperty("location_area_encounters")
  @NotNull
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }

  /**
   * Sets the <code>locationAreaEncounters</code> property.
   * <br><em>N.B. <code>locationAreaEncounters</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setLocationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
  }

  /**
   * Sets the <code>locationAreaEncounters</code> property.
   * <br><em>N.B. <code>locationAreaEncounters</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail locationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
    return this;
  }

 /**
  * Get moves
  * @return moves
  */
  @JsonProperty("moves")
  @NotNull
  public List<@Valid PokemonDetailMovesInner> getMoves() {
    return moves;
  }

  /**
   * Sets the <code>moves</code> property.
   */
 public void setMoves(List<@Valid PokemonDetailMovesInner> moves) {
    this.moves = moves;
  }

  /**
   * Sets the <code>moves</code> property.
   */
  public PokemonDetail moves(List<@Valid PokemonDetailMovesInner> moves) {
    this.moves = moves;
    return this;
  }

  /**
   * Adds a new item to the <code>moves</code> list.
   */
  public PokemonDetail addMovesItem(PokemonDetailMovesInner movesItem) {
    this.moves.add(movesItem);
    return this;
  }

 /**
  * Get species
  * @return species
  */
  @JsonProperty("species")
  @NotNull
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }

  /**
   * Sets the <code>species</code> property.
   */
 public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  /**
   * Sets the <code>species</code> property.
   */
  public PokemonDetail species(PokemonSpeciesSummary species) {
    this.species = species;
    return this;
  }

 /**
  * Get sprites
  * @return sprites
  */
  @JsonProperty("sprites")
  @NotNull
  public PokemonDetailSprites getSprites() {
    return sprites;
  }

  /**
   * Sets the <code>sprites</code> property.
   */
 public void setSprites(PokemonDetailSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * Sets the <code>sprites</code> property.
   */
  public PokemonDetail sprites(PokemonDetailSprites sprites) {
    this.sprites = sprites;
    return this;
  }

 /**
  * Get cries
  * @return cries
  */
  @JsonProperty("cries")
  @NotNull
  public PokemonDetailCries getCries() {
    return cries;
  }

  /**
   * Sets the <code>cries</code> property.
   */
 public void setCries(PokemonDetailCries cries) {
    this.cries = cries;
  }

  /**
   * Sets the <code>cries</code> property.
   */
  public PokemonDetail cries(PokemonDetailCries cries) {
    this.cries = cries;
    return this;
  }

 /**
  * Get stats
  * @return stats
  */
  @JsonProperty("stats")
  @NotNull
  public List<@Valid PokemonStat> getStats() {
    return stats;
  }

  /**
   * Sets the <code>stats</code> property.
   */
 public void setStats(List<@Valid PokemonStat> stats) {
    this.stats = stats;
  }

  /**
   * Sets the <code>stats</code> property.
   */
  public PokemonDetail stats(List<@Valid PokemonStat> stats) {
    this.stats = stats;
    return this;
  }

  /**
   * Adds a new item to the <code>stats</code> list.
   */
  public PokemonDetail addStatsItem(PokemonStat statsItem) {
    this.stats.add(statsItem);
    return this;
  }

 /**
  * Get types
  * @return types
  */
  @JsonProperty("types")
  @NotNull
  public List<@Valid PokemonDetailTypesInner> getTypes() {
    return types;
  }

  /**
   * Sets the <code>types</code> property.
   */
 public void setTypes(List<@Valid PokemonDetailTypesInner> types) {
    this.types = types;
  }

  /**
   * Sets the <code>types</code> property.
   */
  public PokemonDetail types(List<@Valid PokemonDetailTypesInner> types) {
    this.types = types;
    return this;
  }

  /**
   * Adds a new item to the <code>types</code> list.
   */
  public PokemonDetail addTypesItem(PokemonDetailTypesInner typesItem) {
    this.types.add(typesItem);
    return this;
  }

 /**
  * Get pastTypes
  * @return pastTypes
  */
  @JsonProperty("past_types")
  @NotNull
  public List<@Valid PokemonDetailPastTypesInner> getPastTypes() {
    return pastTypes;
  }

  /**
   * Sets the <code>pastTypes</code> property.
   */
 public void setPastTypes(List<@Valid PokemonDetailPastTypesInner> pastTypes) {
    this.pastTypes = pastTypes;
  }

  /**
   * Sets the <code>pastTypes</code> property.
   */
  public PokemonDetail pastTypes(List<@Valid PokemonDetailPastTypesInner> pastTypes) {
    this.pastTypes = pastTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>pastTypes</code> list.
   */
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

