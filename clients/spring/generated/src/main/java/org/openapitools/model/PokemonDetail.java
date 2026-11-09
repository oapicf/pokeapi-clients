package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonDetail {

  private Integer id;

  private String name;

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> baseExperience = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> height = JsonNullable.<Integer>undefined();

  private @Nullable Boolean isDefault;

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> order = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> weight = JsonNullable.<Integer>undefined();

  private List<@Valid PokemonAbility> abilities = new ArrayList<>();

  private List<@Valid PokemonPastAbility> pastAbilities = new ArrayList<>();

  private List<@Valid PokemonFormSummary> forms = new ArrayList<>();

  private List<@Valid PokemonGameIndex> gameIndices = new ArrayList<>();

  private List<@Valid PokemonHeldItemSummary> heldItems = new ArrayList<>();

  private String locationAreaEncounters;

  private List<@Valid PokemonMove> moves = new ArrayList<>();

  private PokemonSpeciesSummary species;

  private PokemonSprites sprites;

  private PokemonCries cries;

  private List<@Valid PokemonStat> stats = new ArrayList<>();

  private List<@Valid PokemonPastStat> pastStats = new ArrayList<>();

  private List<@Valid PokemonType> types = new ArrayList<>();

  private List<@Valid PokemonPastType> pastTypes = new ArrayList<>();

  public PokemonDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonDetail(Integer id, String name, List<@Valid PokemonAbility> abilities, List<@Valid PokemonPastAbility> pastAbilities, List<@Valid PokemonFormSummary> forms, List<@Valid PokemonGameIndex> gameIndices, List<@Valid PokemonHeldItemSummary> heldItems, String locationAreaEncounters, List<@Valid PokemonMove> moves, PokemonSpeciesSummary species, PokemonSprites sprites, PokemonCries cries, List<@Valid PokemonStat> stats, List<@Valid PokemonPastStat> pastStats, List<@Valid PokemonType> types, List<@Valid PokemonPastType> pastTypes) {
    this.id = id;
    this.name = name;
    this.abilities = abilities;
    this.pastAbilities = pastAbilities;
    this.forms = forms;
    this.gameIndices = gameIndices;
    this.heldItems = heldItems;
    this.locationAreaEncounters = locationAreaEncounters;
    this.moves = moves;
    this.species = species;
    this.sprites = sprites;
    this.cries = cries;
    this.stats = stats;
    this.pastStats = pastStats;
    this.types = types;
    this.pastTypes = pastTypes;
  }

  public PokemonDetail id(Integer id) {
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

  public PokemonDetail name(String name) {
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

  public PokemonDetail baseExperience(Integer baseExperience) {
    this.baseExperience = JsonNullable.of(baseExperience);
    return this;
  }

  /**
   * The base experience gained for defeating this Pokémon.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return baseExperience
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "base_experience", description = "The base experience gained for defeating this Pokémon.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("base_experience")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getBaseExperience() {
    return baseExperience;
  }

  public void setBaseExperience(JsonNullable<Integer> baseExperience) {
    this.baseExperience = baseExperience;
  }

  public PokemonDetail height(Integer height) {
    this.height = JsonNullable.of(height);
    return this;
  }

  /**
   * The height of this Pokémon in decimetres.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return height
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "height", description = "The height of this Pokémon in decimetres.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("height")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getHeight() {
    return height;
  }

  public void setHeight(JsonNullable<Integer> height) {
    this.height = height;
  }

  public PokemonDetail isDefault(@Nullable Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Set for exactly one Pokémon used as the default for each species.
   * @return isDefault
   */
  
  @Schema(name = "is_default", description = "Set for exactly one Pokémon used as the default for each species.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_default")
  public @Nullable Boolean getIsDefault() {
    return isDefault;
  }

  @JsonProperty("is_default")
  public void setIsDefault(@Nullable Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public PokemonDetail order(Integer order) {
    this.order = JsonNullable.of(order);
    return this;
  }

  /**
   * Order for sorting. Almost national order, except families are grouped together.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return order
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "order", description = "Order for sorting. Almost national order, except families are grouped together.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("order")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getOrder() {
    return order;
  }

  public void setOrder(JsonNullable<Integer> order) {
    this.order = order;
  }

  public PokemonDetail weight(Integer weight) {
    this.weight = JsonNullable.of(weight);
    return this;
  }

  /**
   * The weight of this Pokémon in hectograms.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return weight
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "weight", description = "The weight of this Pokémon in hectograms.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("weight")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getWeight() {
    return weight;
  }

  public void setWeight(JsonNullable<Integer> weight) {
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
   */
  
  @Schema(name = "abilities", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of abilities this Pokémon could potentially have.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("abilities")
  public List<@Valid PokemonAbility> getAbilities() {
    return abilities;
  }

  @JsonProperty("abilities")
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
   */
  
  @Schema(name = "past_abilities", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of details showing abilities this pokémon had in previous generations", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("past_abilities")
  public List<@Valid PokemonPastAbility> getPastAbilities() {
    return pastAbilities;
  }

  @JsonProperty("past_abilities")
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
   */
  
  @Schema(name = "forms", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of forms this Pokémon can take on.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("forms")
  public List<@Valid PokemonFormSummary> getForms() {
    return forms;
  }

  @JsonProperty("forms")
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
   */
  
  @Schema(name = "game_indices", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of game indices relevent to Pokémon item by generation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("game_indices")
  public List<@Valid PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }

  @JsonProperty("game_indices")
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
   */
  
  @Schema(name = "held_items", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of items this Pokémon may be holding when encountered.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("held_items")
  public List<@Valid PokemonHeldItemSummary> getHeldItems() {
    return heldItems;
  }

  @JsonProperty("held_items")
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
   */
  
  @Schema(name = "location_area_encounters", accessMode = Schema.AccessMode.READ_ONLY, description = "A link to a list of location areas, as well as encounter details pertaining to specific versions.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("location_area_encounters")
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }

  @JsonProperty("location_area_encounters")
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
   */
  
  @Schema(name = "moves", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of moves along with learn methods and level details pertaining to specific version groups.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("moves")
  public List<@Valid PokemonMove> getMoves() {
    return moves;
  }

  @JsonProperty("moves")
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
   */
  @NotNull @Valid 
  @Schema(name = "species", description = "The species this Pokémon belongs to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("species")
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }

  @JsonProperty("species")
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
  @Valid 
  @Schema(name = "sprites", accessMode = Schema.AccessMode.READ_ONLY, description = "A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sprites")
  public PokemonSprites getSprites() {
    return sprites;
  }

  @JsonProperty("sprites")
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
  @Valid 
  @Schema(name = "cries", accessMode = Schema.AccessMode.READ_ONLY, description = "A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cries")
  public PokemonCries getCries() {
    return cries;
  }

  @JsonProperty("cries")
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
   */
  
  @Schema(name = "stats", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of base stat values for this Pokémon.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stats")
  public List<@Valid PokemonStat> getStats() {
    return stats;
  }

  @JsonProperty("stats")
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
   */
  
  @Schema(name = "past_stats", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of details showing stats this pokémon had in previous generations", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("past_stats")
  public List<@Valid PokemonPastStat> getPastStats() {
    return pastStats;
  }

  @JsonProperty("past_stats")
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
   */
  
  @Schema(name = "types", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of details showing types this Pokémon has.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("types")
  public List<@Valid PokemonType> getTypes() {
    return types;
  }

  @JsonProperty("types")
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
   */
  
  @Schema(name = "past_types", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of details showing types this pokémon had in previous generations", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("past_types")
  public List<@Valid PokemonPastType> getPastTypes() {
    return pastTypes;
  }

  @JsonProperty("past_types")
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
    return Objects.equals(this.id, pokemonDetail.id) &&
        Objects.equals(this.name, pokemonDetail.name) &&
        equalsNullable(this.baseExperience, pokemonDetail.baseExperience) &&
        equalsNullable(this.height, pokemonDetail.height) &&
        Objects.equals(this.isDefault, pokemonDetail.isDefault) &&
        equalsNullable(this.order, pokemonDetail.order) &&
        equalsNullable(this.weight, pokemonDetail.weight) &&
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

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, hashCodeNullable(baseExperience), hashCodeNullable(height), isDefault, hashCodeNullable(order), hashCodeNullable(weight), abilities, pastAbilities, forms, gameIndices, heldItems, locationAreaEncounters, moves, species, sprites, cries, stats, pastStats, types, pastTypes);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

