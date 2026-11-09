package apimodels;

import apimodels.PokemonAbility;
import apimodels.PokemonCries;
import apimodels.PokemonFormSummary;
import apimodels.PokemonGameIndex;
import apimodels.PokemonHeldItemSummary;
import apimodels.PokemonMove;
import apimodels.PokemonPastAbility;
import apimodels.PokemonPastStat;
import apimodels.PokemonPastType;
import apimodels.PokemonSpeciesSummary;
import apimodels.PokemonSprites;
import apimodels.PokemonStat;
import apimodels.PokemonType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("base_experience")
  @Min(-2147483648)
@Max(2147483647)

  private Integer baseExperience;

  @JsonProperty("height")
  @Min(-2147483648)
@Max(2147483647)

  private Integer height;

  @JsonProperty("is_default")
  
  private Boolean isDefault;

  @JsonProperty("order")
  @Min(-2147483648)
@Max(2147483647)

  private Integer order;

  @JsonProperty("weight")
  @Min(-2147483648)
@Max(2147483647)

  private Integer weight;

  @JsonProperty("abilities")
  @NotNull
@Valid

  private List<@Valid PokemonAbility> abilities = new ArrayList<>();

  @JsonProperty("past_abilities")
  @NotNull
@Valid

  private List<@Valid PokemonPastAbility> pastAbilities = new ArrayList<>();

  @JsonProperty("forms")
  @NotNull
@Valid

  private List<@Valid PokemonFormSummary> forms = new ArrayList<>();

  @JsonProperty("game_indices")
  @NotNull
@Valid

  private List<@Valid PokemonGameIndex> gameIndices = new ArrayList<>();

  @JsonProperty("held_items")
  @NotNull
@Valid

  private List<@Valid PokemonHeldItemSummary> heldItems = new ArrayList<>();

  @JsonProperty("location_area_encounters")
  @NotNull

  private String locationAreaEncounters;

  @JsonProperty("moves")
  @NotNull
@Valid

  private List<@Valid PokemonMove> moves = new ArrayList<>();

  @JsonProperty("species")
  @NotNull
@Valid

  private PokemonSpeciesSummary species;

  @JsonProperty("sprites")
  @NotNull
@Valid

  private PokemonSprites sprites;

  @JsonProperty("cries")
  @NotNull
@Valid

  private PokemonCries cries;

  @JsonProperty("stats")
  @NotNull
@Valid

  private List<@Valid PokemonStat> stats = new ArrayList<>();

  @JsonProperty("past_stats")
  @NotNull
@Valid

  private List<@Valid PokemonPastStat> pastStats = new ArrayList<>();

  @JsonProperty("types")
  @NotNull
@Valid

  private List<@Valid PokemonType> types = new ArrayList<>();

  @JsonProperty("past_types")
  @NotNull
@Valid

  private List<@Valid PokemonPastType> pastTypes = new ArrayList<>();

  public PokemonDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier for this resource.
   * @return id
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public PokemonDetail abilities(List<@Valid PokemonAbility> abilities) {
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
  **/
  public List<@Valid PokemonAbility> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<@Valid PokemonAbility> abilities) {
    this.abilities = abilities;
  }

  public PokemonDetail pastAbilities(List<@Valid PokemonPastAbility> pastAbilities) {
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
  **/
  public List<@Valid PokemonPastAbility> getPastAbilities() {
    return pastAbilities;
  }

  public void setPastAbilities(List<@Valid PokemonPastAbility> pastAbilities) {
    this.pastAbilities = pastAbilities;
  }

  public PokemonDetail forms(List<@Valid PokemonFormSummary> forms) {
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
  **/
  public List<@Valid PokemonFormSummary> getForms() {
    return forms;
  }

  public void setForms(List<@Valid PokemonFormSummary> forms) {
    this.forms = forms;
  }

  public PokemonDetail gameIndices(List<@Valid PokemonGameIndex> gameIndices) {
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
  **/
  public List<@Valid PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<@Valid PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public PokemonDetail heldItems(List<@Valid PokemonHeldItemSummary> heldItems) {
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
  **/
  public List<@Valid PokemonHeldItemSummary> getHeldItems() {
    return heldItems;
  }

  public void setHeldItems(List<@Valid PokemonHeldItemSummary> heldItems) {
    this.heldItems = heldItems;
  }

  public PokemonDetail locationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
    return this;
  }

   /**
   * A link to a list of location areas, as well as encounter details pertaining to specific versions.
   * @return locationAreaEncounters
  **/
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }

  public void setLocationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
  }

  public PokemonDetail moves(List<@Valid PokemonMove> moves) {
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
  **/
  public List<@Valid PokemonMove> getMoves() {
    return moves;
  }

  public void setMoves(List<@Valid PokemonMove> moves) {
    this.moves = moves;
  }

  public PokemonDetail species(PokemonSpeciesSummary species) {
    this.species = species;
    return this;
  }

   /**
   * The species this Pokémon belongs to.
   * @return species
  **/
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
  **/
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
  **/
  public PokemonCries getCries() {
    return cries;
  }

  public void setCries(PokemonCries cries) {
    this.cries = cries;
  }

  public PokemonDetail stats(List<@Valid PokemonStat> stats) {
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
  **/
  public List<@Valid PokemonStat> getStats() {
    return stats;
  }

  public void setStats(List<@Valid PokemonStat> stats) {
    this.stats = stats;
  }

  public PokemonDetail pastStats(List<@Valid PokemonPastStat> pastStats) {
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
  **/
  public List<@Valid PokemonPastStat> getPastStats() {
    return pastStats;
  }

  public void setPastStats(List<@Valid PokemonPastStat> pastStats) {
    this.pastStats = pastStats;
  }

  public PokemonDetail types(List<@Valid PokemonType> types) {
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
  **/
  public List<@Valid PokemonType> getTypes() {
    return types;
  }

  public void setTypes(List<@Valid PokemonType> types) {
    this.types = types;
  }

  public PokemonDetail pastTypes(List<@Valid PokemonPastType> pastTypes) {
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
  **/
  public List<@Valid PokemonPastType> getPastTypes() {
    return pastTypes;
  }

  public void setPastTypes(List<@Valid PokemonPastType> pastTypes) {
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
    return Objects.equals(id, pokemonDetail.id) &&
        Objects.equals(name, pokemonDetail.name) &&
        Objects.equals(baseExperience, pokemonDetail.baseExperience) &&
        Objects.equals(height, pokemonDetail.height) &&
        Objects.equals(isDefault, pokemonDetail.isDefault) &&
        Objects.equals(order, pokemonDetail.order) &&
        Objects.equals(weight, pokemonDetail.weight) &&
        Objects.equals(abilities, pokemonDetail.abilities) &&
        Objects.equals(pastAbilities, pokemonDetail.pastAbilities) &&
        Objects.equals(forms, pokemonDetail.forms) &&
        Objects.equals(gameIndices, pokemonDetail.gameIndices) &&
        Objects.equals(heldItems, pokemonDetail.heldItems) &&
        Objects.equals(locationAreaEncounters, pokemonDetail.locationAreaEncounters) &&
        Objects.equals(moves, pokemonDetail.moves) &&
        Objects.equals(species, pokemonDetail.species) &&
        Objects.equals(sprites, pokemonDetail.sprites) &&
        Objects.equals(cries, pokemonDetail.cries) &&
        Objects.equals(stats, pokemonDetail.stats) &&
        Objects.equals(pastStats, pokemonDetail.pastStats) &&
        Objects.equals(types, pokemonDetail.types) &&
        Objects.equals(pastTypes, pokemonDetail.pastTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, baseExperience, height, isDefault, order, weight, abilities, pastAbilities, forms, gameIndices, heldItems, locationAreaEncounters, moves, species, sprites, cries, stats, pastStats, types, pastTypes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

