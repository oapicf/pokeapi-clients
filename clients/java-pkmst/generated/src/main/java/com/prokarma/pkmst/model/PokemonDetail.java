package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.PokemonAbility;
import com.prokarma.pkmst.model.PokemonCries;
import com.prokarma.pkmst.model.PokemonFormSummary;
import com.prokarma.pkmst.model.PokemonGameIndex;
import com.prokarma.pkmst.model.PokemonHeldItemSummary;
import com.prokarma.pkmst.model.PokemonMove;
import com.prokarma.pkmst.model.PokemonPastAbility;
import com.prokarma.pkmst.model.PokemonPastStat;
import com.prokarma.pkmst.model.PokemonPastType;
import com.prokarma.pkmst.model.PokemonSpeciesSummary;
import com.prokarma.pkmst.model.PokemonSprites;
import com.prokarma.pkmst.model.PokemonStat;
import com.prokarma.pkmst.model.PokemonType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokemonDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonDetail   {
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
  
  private List<PokemonAbility> abilities = new ArrayList<>();

  @JsonProperty("past_abilities")
  
  private List<PokemonPastAbility> pastAbilities = new ArrayList<>();

  @JsonProperty("forms")
  
  private List<PokemonFormSummary> forms = new ArrayList<>();

  @JsonProperty("game_indices")
  
  private List<PokemonGameIndex> gameIndices = new ArrayList<>();

  @JsonProperty("held_items")
  
  private List<PokemonHeldItemSummary> heldItems = new ArrayList<>();

  @JsonProperty("location_area_encounters")
  private String locationAreaEncounters;

  @JsonProperty("moves")
  
  private List<PokemonMove> moves = new ArrayList<>();

  @JsonProperty("species")
  private PokemonSpeciesSummary species;

  @JsonProperty("sprites")
  private PokemonSprites sprites;

  @JsonProperty("cries")
  private PokemonCries cries;

  @JsonProperty("stats")
  
  private List<PokemonStat> stats = new ArrayList<>();

  @JsonProperty("past_stats")
  
  private List<PokemonPastStat> pastStats = new ArrayList<>();

  @JsonProperty("types")
  
  private List<PokemonType> types = new ArrayList<>();

  @JsonProperty("past_types")
  
  private List<PokemonPastType> pastTypes = new ArrayList<>();

  public PokemonDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PokemonDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for this resource.
   * @return name
   */
  @ApiModelProperty(required = true, value = "The name for this resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokemonDetail baseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
    return this;
  }

  /**
   * The base experience gained for defeating this Pokémon.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return baseExperience
   */
  @ApiModelProperty(value = "The base experience gained for defeating this Pokémon.")
  public Integer getBaseExperience() {
    return baseExperience;
  }

  public void setBaseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
  }

  public PokemonDetail height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * The height of this Pokémon in decimetres.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return height
   */
  @ApiModelProperty(value = "The height of this Pokémon in decimetres.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PokemonDetail isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Set for exactly one Pokémon used as the default for each species.
   * @return isDefault
   */
  @ApiModelProperty(value = "Set for exactly one Pokémon used as the default for each species.")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public PokemonDetail order(Integer order) {
    this.order = order;
    return this;
  }

  /**
   * Order for sorting. Almost national order, except families are grouped together.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return order
   */
  @ApiModelProperty(value = "Order for sorting. Almost national order, except families are grouped together.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public PokemonDetail weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * The weight of this Pokémon in hectograms.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return weight
   */
  @ApiModelProperty(value = "The weight of this Pokémon in hectograms.")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public PokemonDetail abilities(List<PokemonAbility> abilities) {
    this.abilities = abilities;
    return this;
  }

  public PokemonDetail addAbilitiesItem(PokemonAbility abilitiesItem) {
    if (this.abilities == null) {
      this.abilities = new ArrayList<>();
    }
    this.abilities.add(abilitiesItem);
    return this;
  }

  /**
   * A list of abilities this Pokémon could potentially have.
   * @return abilities
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of abilities this Pokémon could potentially have.")
  public List<PokemonAbility> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<PokemonAbility> abilities) {
    this.abilities = abilities;
  }

  public PokemonDetail pastAbilities(List<PokemonPastAbility> pastAbilities) {
    this.pastAbilities = pastAbilities;
    return this;
  }

  public PokemonDetail addPastAbilitiesItem(PokemonPastAbility pastAbilitiesItem) {
    if (this.pastAbilities == null) {
      this.pastAbilities = new ArrayList<>();
    }
    this.pastAbilities.add(pastAbilitiesItem);
    return this;
  }

  /**
   * A list of details showing abilities this pokémon had in previous generations
   * @return pastAbilities
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of details showing abilities this pokémon had in previous generations")
  public List<PokemonPastAbility> getPastAbilities() {
    return pastAbilities;
  }

  public void setPastAbilities(List<PokemonPastAbility> pastAbilities) {
    this.pastAbilities = pastAbilities;
  }

  public PokemonDetail forms(List<PokemonFormSummary> forms) {
    this.forms = forms;
    return this;
  }

  public PokemonDetail addFormsItem(PokemonFormSummary formsItem) {
    if (this.forms == null) {
      this.forms = new ArrayList<>();
    }
    this.forms.add(formsItem);
    return this;
  }

  /**
   * A list of forms this Pokémon can take on.
   * @return forms
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of forms this Pokémon can take on.")
  public List<PokemonFormSummary> getForms() {
    return forms;
  }

  public void setForms(List<PokemonFormSummary> forms) {
    this.forms = forms;
  }

  public PokemonDetail gameIndices(List<PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  public PokemonDetail addGameIndicesItem(PokemonGameIndex gameIndicesItem) {
    if (this.gameIndices == null) {
      this.gameIndices = new ArrayList<>();
    }
    this.gameIndices.add(gameIndicesItem);
    return this;
  }

  /**
   * A list of game indices relevent to Pokémon item by generation.
   * @return gameIndices
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of game indices relevent to Pokémon item by generation.")
  public List<PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public PokemonDetail heldItems(List<PokemonHeldItemSummary> heldItems) {
    this.heldItems = heldItems;
    return this;
  }

  public PokemonDetail addHeldItemsItem(PokemonHeldItemSummary heldItemsItem) {
    if (this.heldItems == null) {
      this.heldItems = new ArrayList<>();
    }
    this.heldItems.add(heldItemsItem);
    return this;
  }

  /**
   * A list of items this Pokémon may be holding when encountered.
   * @return heldItems
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of items this Pokémon may be holding when encountered.")
  public List<PokemonHeldItemSummary> getHeldItems() {
    return heldItems;
  }

  public void setHeldItems(List<PokemonHeldItemSummary> heldItems) {
    this.heldItems = heldItems;
  }

  public PokemonDetail locationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
    return this;
  }

  /**
   * A link to a list of location areas, as well as encounter details pertaining to specific versions.
   * @return locationAreaEncounters
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A link to a list of location areas, as well as encounter details pertaining to specific versions.")
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }

  public void setLocationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
  }

  public PokemonDetail moves(List<PokemonMove> moves) {
    this.moves = moves;
    return this;
  }

  public PokemonDetail addMovesItem(PokemonMove movesItem) {
    if (this.moves == null) {
      this.moves = new ArrayList<>();
    }
    this.moves.add(movesItem);
    return this;
  }

  /**
   * A list of moves along with learn methods and level details pertaining to specific version groups.
   * @return moves
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of moves along with learn methods and level details pertaining to specific version groups.")
  public List<PokemonMove> getMoves() {
    return moves;
  }

  public void setMoves(List<PokemonMove> moves) {
    this.moves = moves;
  }

  public PokemonDetail species(PokemonSpeciesSummary species) {
    this.species = species;
    return this;
  }

  /**
   * The species this Pokémon belongs to.
   * @return species
   */
  @ApiModelProperty(required = true, value = "The species this Pokémon belongs to.")
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }

  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  public PokemonDetail sprites(PokemonSprites sprites) {
    this.sprites = sprites;
    return this;
  }

  /**
   * A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
   * @return sprites
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>")
  public PokemonSprites getSprites() {
    return sprites;
  }

  public void setSprites(PokemonSprites sprites) {
    this.sprites = sprites;
  }

  public PokemonDetail cries(PokemonCries cries) {
    this.cries = cries;
    return this;
  }

  /**
   * A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
   * @return cries
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>")
  public PokemonCries getCries() {
    return cries;
  }

  public void setCries(PokemonCries cries) {
    this.cries = cries;
  }

  public PokemonDetail stats(List<PokemonStat> stats) {
    this.stats = stats;
    return this;
  }

  public PokemonDetail addStatsItem(PokemonStat statsItem) {
    if (this.stats == null) {
      this.stats = new ArrayList<>();
    }
    this.stats.add(statsItem);
    return this;
  }

  /**
   * A list of base stat values for this Pokémon.
   * @return stats
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of base stat values for this Pokémon.")
  public List<PokemonStat> getStats() {
    return stats;
  }

  public void setStats(List<PokemonStat> stats) {
    this.stats = stats;
  }

  public PokemonDetail pastStats(List<PokemonPastStat> pastStats) {
    this.pastStats = pastStats;
    return this;
  }

  public PokemonDetail addPastStatsItem(PokemonPastStat pastStatsItem) {
    if (this.pastStats == null) {
      this.pastStats = new ArrayList<>();
    }
    this.pastStats.add(pastStatsItem);
    return this;
  }

  /**
   * A list of details showing stats this pokémon had in previous generations
   * @return pastStats
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of details showing stats this pokémon had in previous generations")
  public List<PokemonPastStat> getPastStats() {
    return pastStats;
  }

  public void setPastStats(List<PokemonPastStat> pastStats) {
    this.pastStats = pastStats;
  }

  public PokemonDetail types(List<PokemonType> types) {
    this.types = types;
    return this;
  }

  public PokemonDetail addTypesItem(PokemonType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * A list of details showing types this Pokémon has.
   * @return types
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of details showing types this Pokémon has.")
  public List<PokemonType> getTypes() {
    return types;
  }

  public void setTypes(List<PokemonType> types) {
    this.types = types;
  }

  public PokemonDetail pastTypes(List<PokemonPastType> pastTypes) {
    this.pastTypes = pastTypes;
    return this;
  }

  public PokemonDetail addPastTypesItem(PokemonPastType pastTypesItem) {
    if (this.pastTypes == null) {
      this.pastTypes = new ArrayList<>();
    }
    this.pastTypes.add(pastTypesItem);
    return this;
  }

  /**
   * A list of details showing types this pokémon had in previous generations
   * @return pastTypes
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of details showing types this pokémon had in previous generations")
  public List<PokemonPastType> getPastTypes() {
    return pastTypes;
  }

  public void setPastTypes(List<PokemonPastType> pastTypes) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

