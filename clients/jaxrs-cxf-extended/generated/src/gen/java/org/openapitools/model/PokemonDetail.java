package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokemonAbility;
import org.openapitools.model.PokemonCries;
import org.openapitools.model.PokemonFormSummary;
import org.openapitools.model.PokemonGameIndex;
import org.openapitools.model.PokemonHeldItemSummary;
import org.openapitools.model.PokemonMove;
import org.openapitools.model.PokemonPastAbility;
import org.openapitools.model.PokemonPastStat;
import org.openapitools.model.PokemonPastType;
import org.openapitools.model.PokemonSpeciesSummary;
import org.openapitools.model.PokemonSprites;
import org.openapitools.model.PokemonStat;
import org.openapitools.model.PokemonType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonDetail  {
  
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
  * The base experience gained for defeating this Pokémon.
  */
  @ApiModelProperty(value = "The base experience gained for defeating this Pokémon.")
  private Integer baseExperience;

 /**
  * The height of this Pokémon in decimetres.
  */
  @ApiModelProperty(value = "The height of this Pokémon in decimetres.")
  private Integer height;

 /**
  * Set for exactly one Pokémon used as the default for each species.
  */
  @ApiModelProperty(value = "Set for exactly one Pokémon used as the default for each species.")
  private Boolean isDefault;

 /**
  * Order for sorting. Almost national order, except families are grouped together.
  */
  @ApiModelProperty(value = "Order for sorting. Almost national order, except families are grouped together.")
  private Integer order;

 /**
  * The weight of this Pokémon in hectograms.
  */
  @ApiModelProperty(value = "The weight of this Pokémon in hectograms.")
  private Integer weight;

 /**
  * A list of abilities this Pokémon could potentially have.
  */
  @ApiModelProperty(required = true, value = "A list of abilities this Pokémon could potentially have.")
  private List<@Valid PokemonAbility> abilities = new ArrayList<>();

 /**
  * A list of details showing abilities this pokémon had in previous generations
  */
  @ApiModelProperty(required = true, value = "A list of details showing abilities this pokémon had in previous generations")
  private List<@Valid PokemonPastAbility> pastAbilities = new ArrayList<>();

 /**
  * A list of forms this Pokémon can take on.
  */
  @ApiModelProperty(required = true, value = "A list of forms this Pokémon can take on.")
  private List<@Valid PokemonFormSummary> forms = new ArrayList<>();

 /**
  * A list of game indices relevent to Pokémon item by generation.
  */
  @ApiModelProperty(required = true, value = "A list of game indices relevent to Pokémon item by generation.")
  private List<@Valid PokemonGameIndex> gameIndices = new ArrayList<>();

 /**
  * A list of items this Pokémon may be holding when encountered.
  */
  @ApiModelProperty(required = true, value = "A list of items this Pokémon may be holding when encountered.")
  private List<@Valid PokemonHeldItemSummary> heldItems = new ArrayList<>();

 /**
  * A link to a list of location areas, as well as encounter details pertaining to specific versions.
  */
  @ApiModelProperty(required = true, value = "A link to a list of location areas, as well as encounter details pertaining to specific versions.")
  private String locationAreaEncounters;

 /**
  * A list of moves along with learn methods and level details pertaining to specific version groups.
  */
  @ApiModelProperty(required = true, value = "A list of moves along with learn methods and level details pertaining to specific version groups.")
  private List<@Valid PokemonMove> moves = new ArrayList<>();

 /**
  * The species this Pokémon belongs to.
  */
  @ApiModelProperty(required = true, value = "The species this Pokémon belongs to.")
  @Valid
  private PokemonSpeciesSummary species;

 /**
  * A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
  */
  @ApiModelProperty(required = true, value = "A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>")
  @Valid
  private PokemonSprites sprites;

 /**
  * A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
  */
  @ApiModelProperty(required = true, value = "A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>")
  @Valid
  private PokemonCries cries;

 /**
  * A list of base stat values for this Pokémon.
  */
  @ApiModelProperty(required = true, value = "A list of base stat values for this Pokémon.")
  private List<@Valid PokemonStat> stats = new ArrayList<>();

 /**
  * A list of details showing stats this pokémon had in previous generations
  */
  @ApiModelProperty(required = true, value = "A list of details showing stats this pokémon had in previous generations")
  private List<@Valid PokemonPastStat> pastStats = new ArrayList<>();

 /**
  * A list of details showing types this Pokémon has.
  */
  @ApiModelProperty(required = true, value = "A list of details showing types this Pokémon has.")
  private List<@Valid PokemonType> types = new ArrayList<>();

 /**
  * A list of details showing types this pokémon had in previous generations
  */
  @ApiModelProperty(required = true, value = "A list of details showing types this pokémon had in previous generations")
  private List<@Valid PokemonPastType> pastTypes = new ArrayList<>();
 /**
  * The identifier for this resource.
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
  * The name for this resource.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
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
  * The base experience gained for defeating this Pokémon.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return baseExperience
  */
  @JsonProperty("base_experience")
 @Min(-2147483648) @Max(2147483647)  public Integer getBaseExperience() {
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
  * The height of this Pokémon in decimetres.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return height
  */
  @JsonProperty("height")
 @Min(-2147483648) @Max(2147483647)  public Integer getHeight() {
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
  * Set for exactly one Pokémon used as the default for each species.
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
  * Order for sorting. Almost national order, except families are grouped together.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return order
  */
  @JsonProperty("order")
 @Min(-2147483648) @Max(2147483647)  public Integer getOrder() {
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
  * The weight of this Pokémon in hectograms.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return weight
  */
  @JsonProperty("weight")
 @Min(-2147483648) @Max(2147483647)  public Integer getWeight() {
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
  * A list of abilities this Pokémon could potentially have.
  * @return abilities
  */
  @JsonProperty("abilities")
  @NotNull
  public List<@Valid PokemonAbility> getAbilities() {
    return abilities;
  }

  /**
   * Sets the <code>abilities</code> property.
   * <br><em>N.B. <code>abilities</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setAbilities(List<@Valid PokemonAbility> abilities) {
    this.abilities = abilities;
  }

  /**
   * Sets the <code>abilities</code> property.
   * <br><em>N.B. <code>abilities</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail abilities(List<@Valid PokemonAbility> abilities) {
    this.abilities = abilities;
    return this;
  }

  /**
   * Adds a new item to the <code>abilities</code> list.
   * <br><em>N.B. <code>abilities</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail addAbilitiesItem(PokemonAbility abilitiesItem) {
    this.abilities.add(abilitiesItem);
    return this;
  }

 /**
  * A list of details showing abilities this pokémon had in previous generations
  * @return pastAbilities
  */
  @JsonProperty("past_abilities")
  @NotNull
  public List<@Valid PokemonPastAbility> getPastAbilities() {
    return pastAbilities;
  }

  /**
   * Sets the <code>pastAbilities</code> property.
   * <br><em>N.B. <code>pastAbilities</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPastAbilities(List<@Valid PokemonPastAbility> pastAbilities) {
    this.pastAbilities = pastAbilities;
  }

  /**
   * Sets the <code>pastAbilities</code> property.
   * <br><em>N.B. <code>pastAbilities</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail pastAbilities(List<@Valid PokemonPastAbility> pastAbilities) {
    this.pastAbilities = pastAbilities;
    return this;
  }

  /**
   * Adds a new item to the <code>pastAbilities</code> list.
   * <br><em>N.B. <code>pastAbilities</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail addPastAbilitiesItem(PokemonPastAbility pastAbilitiesItem) {
    this.pastAbilities.add(pastAbilitiesItem);
    return this;
  }

 /**
  * A list of forms this Pokémon can take on.
  * @return forms
  */
  @JsonProperty("forms")
  @NotNull
  public List<@Valid PokemonFormSummary> getForms() {
    return forms;
  }

  /**
   * Sets the <code>forms</code> property.
   * <br><em>N.B. <code>forms</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setForms(List<@Valid PokemonFormSummary> forms) {
    this.forms = forms;
  }

  /**
   * Sets the <code>forms</code> property.
   * <br><em>N.B. <code>forms</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail forms(List<@Valid PokemonFormSummary> forms) {
    this.forms = forms;
    return this;
  }

  /**
   * Adds a new item to the <code>forms</code> list.
   * <br><em>N.B. <code>forms</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail addFormsItem(PokemonFormSummary formsItem) {
    this.forms.add(formsItem);
    return this;
  }

 /**
  * A list of game indices relevent to Pokémon item by generation.
  * @return gameIndices
  */
  @JsonProperty("game_indices")
  @NotNull
  public List<@Valid PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }

  /**
   * Sets the <code>gameIndices</code> property.
   * <br><em>N.B. <code>gameIndices</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setGameIndices(List<@Valid PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   * Sets the <code>gameIndices</code> property.
   * <br><em>N.B. <code>gameIndices</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail gameIndices(List<@Valid PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  /**
   * Adds a new item to the <code>gameIndices</code> list.
   * <br><em>N.B. <code>gameIndices</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail addGameIndicesItem(PokemonGameIndex gameIndicesItem) {
    this.gameIndices.add(gameIndicesItem);
    return this;
  }

 /**
  * A list of items this Pokémon may be holding when encountered.
  * @return heldItems
  */
  @JsonProperty("held_items")
  @NotNull
  public List<@Valid PokemonHeldItemSummary> getHeldItems() {
    return heldItems;
  }

  /**
   * Sets the <code>heldItems</code> property.
   * <br><em>N.B. <code>heldItems</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setHeldItems(List<@Valid PokemonHeldItemSummary> heldItems) {
    this.heldItems = heldItems;
  }

  /**
   * Sets the <code>heldItems</code> property.
   * <br><em>N.B. <code>heldItems</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail heldItems(List<@Valid PokemonHeldItemSummary> heldItems) {
    this.heldItems = heldItems;
    return this;
  }

  /**
   * Adds a new item to the <code>heldItems</code> list.
   * <br><em>N.B. <code>heldItems</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail addHeldItemsItem(PokemonHeldItemSummary heldItemsItem) {
    this.heldItems.add(heldItemsItem);
    return this;
  }

 /**
  * A link to a list of location areas, as well as encounter details pertaining to specific versions.
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
  * A list of moves along with learn methods and level details pertaining to specific version groups.
  * @return moves
  */
  @JsonProperty("moves")
  @NotNull
  public List<@Valid PokemonMove> getMoves() {
    return moves;
  }

  /**
   * Sets the <code>moves</code> property.
   * <br><em>N.B. <code>moves</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setMoves(List<@Valid PokemonMove> moves) {
    this.moves = moves;
  }

  /**
   * Sets the <code>moves</code> property.
   * <br><em>N.B. <code>moves</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail moves(List<@Valid PokemonMove> moves) {
    this.moves = moves;
    return this;
  }

  /**
   * Adds a new item to the <code>moves</code> list.
   * <br><em>N.B. <code>moves</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail addMovesItem(PokemonMove movesItem) {
    this.moves.add(movesItem);
    return this;
  }

 /**
  * The species this Pokémon belongs to.
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
  * A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt;
  * @return sprites
  */
  @JsonProperty("sprites")
  @NotNull
  public PokemonSprites getSprites() {
    return sprites;
  }

  /**
   * Sets the <code>sprites</code> property.
   * <br><em>N.B. <code>sprites</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setSprites(PokemonSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * Sets the <code>sprites</code> property.
   * <br><em>N.B. <code>sprites</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail sprites(PokemonSprites sprites) {
    this.sprites = sprites;
    return this;
  }

 /**
  * A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt;
  * @return cries
  */
  @JsonProperty("cries")
  @NotNull
  public PokemonCries getCries() {
    return cries;
  }

  /**
   * Sets the <code>cries</code> property.
   * <br><em>N.B. <code>cries</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCries(PokemonCries cries) {
    this.cries = cries;
  }

  /**
   * Sets the <code>cries</code> property.
   * <br><em>N.B. <code>cries</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail cries(PokemonCries cries) {
    this.cries = cries;
    return this;
  }

 /**
  * A list of base stat values for this Pokémon.
  * @return stats
  */
  @JsonProperty("stats")
  @NotNull
  public List<@Valid PokemonStat> getStats() {
    return stats;
  }

  /**
   * Sets the <code>stats</code> property.
   * <br><em>N.B. <code>stats</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setStats(List<@Valid PokemonStat> stats) {
    this.stats = stats;
  }

  /**
   * Sets the <code>stats</code> property.
   * <br><em>N.B. <code>stats</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail stats(List<@Valid PokemonStat> stats) {
    this.stats = stats;
    return this;
  }

  /**
   * Adds a new item to the <code>stats</code> list.
   * <br><em>N.B. <code>stats</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail addStatsItem(PokemonStat statsItem) {
    this.stats.add(statsItem);
    return this;
  }

 /**
  * A list of details showing stats this pokémon had in previous generations
  * @return pastStats
  */
  @JsonProperty("past_stats")
  @NotNull
  public List<@Valid PokemonPastStat> getPastStats() {
    return pastStats;
  }

  /**
   * Sets the <code>pastStats</code> property.
   * <br><em>N.B. <code>pastStats</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPastStats(List<@Valid PokemonPastStat> pastStats) {
    this.pastStats = pastStats;
  }

  /**
   * Sets the <code>pastStats</code> property.
   * <br><em>N.B. <code>pastStats</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail pastStats(List<@Valid PokemonPastStat> pastStats) {
    this.pastStats = pastStats;
    return this;
  }

  /**
   * Adds a new item to the <code>pastStats</code> list.
   * <br><em>N.B. <code>pastStats</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail addPastStatsItem(PokemonPastStat pastStatsItem) {
    this.pastStats.add(pastStatsItem);
    return this;
  }

 /**
  * A list of details showing types this Pokémon has.
  * @return types
  */
  @JsonProperty("types")
  @NotNull
  public List<@Valid PokemonType> getTypes() {
    return types;
  }

  /**
   * Sets the <code>types</code> property.
   * <br><em>N.B. <code>types</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setTypes(List<@Valid PokemonType> types) {
    this.types = types;
  }

  /**
   * Sets the <code>types</code> property.
   * <br><em>N.B. <code>types</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail types(List<@Valid PokemonType> types) {
    this.types = types;
    return this;
  }

  /**
   * Adds a new item to the <code>types</code> list.
   * <br><em>N.B. <code>types</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail addTypesItem(PokemonType typesItem) {
    this.types.add(typesItem);
    return this;
  }

 /**
  * A list of details showing types this pokémon had in previous generations
  * @return pastTypes
  */
  @JsonProperty("past_types")
  @NotNull
  public List<@Valid PokemonPastType> getPastTypes() {
    return pastTypes;
  }

  /**
   * Sets the <code>pastTypes</code> property.
   * <br><em>N.B. <code>pastTypes</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPastTypes(List<@Valid PokemonPastType> pastTypes) {
    this.pastTypes = pastTypes;
  }

  /**
   * Sets the <code>pastTypes</code> property.
   * <br><em>N.B. <code>pastTypes</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail pastTypes(List<@Valid PokemonPastType> pastTypes) {
    this.pastTypes = pastTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>pastTypes</code> list.
   * <br><em>N.B. <code>pastTypes</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonDetail addPastTypesItem(PokemonPastType pastTypesItem) {
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
        Objects.equals(this.pastStats, pokemonDetail.pastStats) &&
        Objects.equals(this.types, pokemonDetail.types) &&
        Objects.equals(this.pastTypes, pokemonDetail.pastTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, baseExperience, height, isDefault, order, weight, abilities, pastAbilities, forms, gameIndices, heldItems, locationAreaEncounters, moves, species, sprites, cries, stats, pastStats, types, pastTypes);
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
    sb.append("    pastStats: ").append(toIndentedString(pastStats)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

