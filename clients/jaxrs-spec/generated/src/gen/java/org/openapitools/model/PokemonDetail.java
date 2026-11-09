package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonDetail   {
  private Integer id;
  private String name;
  private Integer baseExperience;
  private Integer height;
  private Boolean isDefault;
  private Integer order;
  private Integer weight;
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
  }

  @JsonCreator
  public PokemonDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "abilities") List<@Valid PokemonAbility> abilities,
    @JsonProperty(required = true, value = "past_abilities") List<@Valid PokemonPastAbility> pastAbilities,
    @JsonProperty(required = true, value = "forms") List<@Valid PokemonFormSummary> forms,
    @JsonProperty(required = true, value = "game_indices") List<@Valid PokemonGameIndex> gameIndices,
    @JsonProperty(required = true, value = "held_items") List<@Valid PokemonHeldItemSummary> heldItems,
    @JsonProperty(required = true, value = "location_area_encounters") String locationAreaEncounters,
    @JsonProperty(required = true, value = "moves") List<@Valid PokemonMove> moves,
    @JsonProperty(required = true, value = "species") PokemonSpeciesSummary species,
    @JsonProperty(required = true, value = "sprites") PokemonSprites sprites,
    @JsonProperty(required = true, value = "cries") PokemonCries cries,
    @JsonProperty(required = true, value = "stats") List<@Valid PokemonStat> stats,
    @JsonProperty(required = true, value = "past_stats") List<@Valid PokemonPastStat> pastStats,
    @JsonProperty(required = true, value = "types") List<@Valid PokemonType> types,
    @JsonProperty(required = true, value = "past_types") List<@Valid PokemonPastType> pastTypes
  ) {
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

  /**
   * The identifier for this resource.
   **/
  public PokemonDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  public PokemonDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=200)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The base experience gained for defeating this Pokémon.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonDetail baseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
    return this;
  }

  
  @ApiModelProperty(value = "The base experience gained for defeating this Pokémon.")
  @JsonProperty("base_experience")
   @Min(-2147483648) @Max(2147483647)public Integer getBaseExperience() {
    return baseExperience;
  }

  @JsonProperty("base_experience")
  public void setBaseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
  }

  /**
   * The height of this Pokémon in decimetres.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonDetail height(Integer height) {
    this.height = height;
    return this;
  }

  
  @ApiModelProperty(value = "The height of this Pokémon in decimetres.")
  @JsonProperty("height")
   @Min(-2147483648) @Max(2147483647)public Integer getHeight() {
    return height;
  }

  @JsonProperty("height")
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * Set for exactly one Pokémon used as the default for each species.
   **/
  public PokemonDetail isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  
  @ApiModelProperty(value = "Set for exactly one Pokémon used as the default for each species.")
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }

  @JsonProperty("is_default")
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * Order for sorting. Almost national order, except families are grouped together.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonDetail order(Integer order) {
    this.order = order;
    return this;
  }

  
  @ApiModelProperty(value = "Order for sorting. Almost national order, except families are grouped together.")
  @JsonProperty("order")
   @Min(-2147483648) @Max(2147483647)public Integer getOrder() {
    return order;
  }

  @JsonProperty("order")
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * The weight of this Pokémon in hectograms.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonDetail weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  
  @ApiModelProperty(value = "The weight of this Pokémon in hectograms.")
  @JsonProperty("weight")
   @Min(-2147483648) @Max(2147483647)public Integer getWeight() {
    return weight;
  }

  @JsonProperty("weight")
  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  /**
   * A list of abilities this Pokémon could potentially have.
   **/
  public PokemonDetail abilities(List<@Valid PokemonAbility> abilities) {
    this.abilities = abilities;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of abilities this Pokémon could potentially have.")
  @JsonProperty(required = true, value = "abilities")
  public List<@Valid PokemonAbility> getAbilities() {
    return abilities;
  }

  @JsonProperty(required = true, value = "abilities")
  public void setAbilities(List<@Valid PokemonAbility> abilities) {
    this.abilities = abilities;
  }

  public PokemonDetail addAbilitiesItem(PokemonAbility abilitiesItem) {
    if (this.abilities == null) {
      this.abilities = new ArrayList<>();
    }

    this.abilities.add(abilitiesItem);
    return this;
  }

  public PokemonDetail removeAbilitiesItem(PokemonAbility abilitiesItem) {
    if (abilitiesItem != null && this.abilities != null) {
      this.abilities.remove(abilitiesItem);
    }

    return this;
  }
  /**
   * A list of details showing abilities this pokémon had in previous generations
   **/
  public PokemonDetail pastAbilities(List<@Valid PokemonPastAbility> pastAbilities) {
    this.pastAbilities = pastAbilities;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of details showing abilities this pokémon had in previous generations")
  @JsonProperty(required = true, value = "past_abilities")
  public List<@Valid PokemonPastAbility> getPastAbilities() {
    return pastAbilities;
  }

  @JsonProperty(required = true, value = "past_abilities")
  public void setPastAbilities(List<@Valid PokemonPastAbility> pastAbilities) {
    this.pastAbilities = pastAbilities;
  }

  public PokemonDetail addPastAbilitiesItem(PokemonPastAbility pastAbilitiesItem) {
    if (this.pastAbilities == null) {
      this.pastAbilities = new ArrayList<>();
    }

    this.pastAbilities.add(pastAbilitiesItem);
    return this;
  }

  public PokemonDetail removePastAbilitiesItem(PokemonPastAbility pastAbilitiesItem) {
    if (pastAbilitiesItem != null && this.pastAbilities != null) {
      this.pastAbilities.remove(pastAbilitiesItem);
    }

    return this;
  }
  /**
   * A list of forms this Pokémon can take on.
   **/
  public PokemonDetail forms(List<@Valid PokemonFormSummary> forms) {
    this.forms = forms;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of forms this Pokémon can take on.")
  @JsonProperty(required = true, value = "forms")
  public List<@Valid PokemonFormSummary> getForms() {
    return forms;
  }

  @JsonProperty(required = true, value = "forms")
  public void setForms(List<@Valid PokemonFormSummary> forms) {
    this.forms = forms;
  }

  public PokemonDetail addFormsItem(PokemonFormSummary formsItem) {
    if (this.forms == null) {
      this.forms = new ArrayList<>();
    }

    this.forms.add(formsItem);
    return this;
  }

  public PokemonDetail removeFormsItem(PokemonFormSummary formsItem) {
    if (formsItem != null && this.forms != null) {
      this.forms.remove(formsItem);
    }

    return this;
  }
  /**
   * A list of game indices relevent to Pokémon item by generation.
   **/
  public PokemonDetail gameIndices(List<@Valid PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of game indices relevent to Pokémon item by generation.")
  @JsonProperty(required = true, value = "game_indices")
  public List<@Valid PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }

  @JsonProperty(required = true, value = "game_indices")
  public void setGameIndices(List<@Valid PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public PokemonDetail addGameIndicesItem(PokemonGameIndex gameIndicesItem) {
    if (this.gameIndices == null) {
      this.gameIndices = new ArrayList<>();
    }

    this.gameIndices.add(gameIndicesItem);
    return this;
  }

  public PokemonDetail removeGameIndicesItem(PokemonGameIndex gameIndicesItem) {
    if (gameIndicesItem != null && this.gameIndices != null) {
      this.gameIndices.remove(gameIndicesItem);
    }

    return this;
  }
  /**
   * A list of items this Pokémon may be holding when encountered.
   **/
  public PokemonDetail heldItems(List<@Valid PokemonHeldItemSummary> heldItems) {
    this.heldItems = heldItems;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of items this Pokémon may be holding when encountered.")
  @JsonProperty(required = true, value = "held_items")
  public List<@Valid PokemonHeldItemSummary> getHeldItems() {
    return heldItems;
  }

  @JsonProperty(required = true, value = "held_items")
  public void setHeldItems(List<@Valid PokemonHeldItemSummary> heldItems) {
    this.heldItems = heldItems;
  }

  public PokemonDetail addHeldItemsItem(PokemonHeldItemSummary heldItemsItem) {
    if (this.heldItems == null) {
      this.heldItems = new ArrayList<>();
    }

    this.heldItems.add(heldItemsItem);
    return this;
  }

  public PokemonDetail removeHeldItemsItem(PokemonHeldItemSummary heldItemsItem) {
    if (heldItemsItem != null && this.heldItems != null) {
      this.heldItems.remove(heldItemsItem);
    }

    return this;
  }
  /**
   * A link to a list of location areas, as well as encounter details pertaining to specific versions.
   **/
  public PokemonDetail locationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A link to a list of location areas, as well as encounter details pertaining to specific versions.")
  @JsonProperty(required = true, value = "location_area_encounters")
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }

  @JsonProperty(required = true, value = "location_area_encounters")
  public void setLocationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
  }

  /**
   * A list of moves along with learn methods and level details pertaining to specific version groups.
   **/
  public PokemonDetail moves(List<@Valid PokemonMove> moves) {
    this.moves = moves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of moves along with learn methods and level details pertaining to specific version groups.")
  @JsonProperty(required = true, value = "moves")
  public List<@Valid PokemonMove> getMoves() {
    return moves;
  }

  @JsonProperty(required = true, value = "moves")
  public void setMoves(List<@Valid PokemonMove> moves) {
    this.moves = moves;
  }

  public PokemonDetail addMovesItem(PokemonMove movesItem) {
    if (this.moves == null) {
      this.moves = new ArrayList<>();
    }

    this.moves.add(movesItem);
    return this;
  }

  public PokemonDetail removeMovesItem(PokemonMove movesItem) {
    if (movesItem != null && this.moves != null) {
      this.moves.remove(movesItem);
    }

    return this;
  }
  /**
   * The species this Pokémon belongs to.
   **/
  public PokemonDetail species(PokemonSpeciesSummary species) {
    this.species = species;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The species this Pokémon belongs to.")
  @JsonProperty(required = true, value = "species")
  @NotNull @Valid public PokemonSpeciesSummary getSpecies() {
    return species;
  }

  @JsonProperty(required = true, value = "species")
  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  /**
   * A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt;
   **/
  public PokemonDetail sprites(PokemonSprites sprites) {
    this.sprites = sprites;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>")
  @JsonProperty(required = true, value = "sprites")
  @Valid public PokemonSprites getSprites() {
    return sprites;
  }

  @JsonProperty(required = true, value = "sprites")
  public void setSprites(PokemonSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt;
   **/
  public PokemonDetail cries(PokemonCries cries) {
    this.cries = cries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>")
  @JsonProperty(required = true, value = "cries")
  @Valid public PokemonCries getCries() {
    return cries;
  }

  @JsonProperty(required = true, value = "cries")
  public void setCries(PokemonCries cries) {
    this.cries = cries;
  }

  /**
   * A list of base stat values for this Pokémon.
   **/
  public PokemonDetail stats(List<@Valid PokemonStat> stats) {
    this.stats = stats;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of base stat values for this Pokémon.")
  @JsonProperty(required = true, value = "stats")
  public List<@Valid PokemonStat> getStats() {
    return stats;
  }

  @JsonProperty(required = true, value = "stats")
  public void setStats(List<@Valid PokemonStat> stats) {
    this.stats = stats;
  }

  public PokemonDetail addStatsItem(PokemonStat statsItem) {
    if (this.stats == null) {
      this.stats = new ArrayList<>();
    }

    this.stats.add(statsItem);
    return this;
  }

  public PokemonDetail removeStatsItem(PokemonStat statsItem) {
    if (statsItem != null && this.stats != null) {
      this.stats.remove(statsItem);
    }

    return this;
  }
  /**
   * A list of details showing stats this pokémon had in previous generations
   **/
  public PokemonDetail pastStats(List<@Valid PokemonPastStat> pastStats) {
    this.pastStats = pastStats;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of details showing stats this pokémon had in previous generations")
  @JsonProperty(required = true, value = "past_stats")
  public List<@Valid PokemonPastStat> getPastStats() {
    return pastStats;
  }

  @JsonProperty(required = true, value = "past_stats")
  public void setPastStats(List<@Valid PokemonPastStat> pastStats) {
    this.pastStats = pastStats;
  }

  public PokemonDetail addPastStatsItem(PokemonPastStat pastStatsItem) {
    if (this.pastStats == null) {
      this.pastStats = new ArrayList<>();
    }

    this.pastStats.add(pastStatsItem);
    return this;
  }

  public PokemonDetail removePastStatsItem(PokemonPastStat pastStatsItem) {
    if (pastStatsItem != null && this.pastStats != null) {
      this.pastStats.remove(pastStatsItem);
    }

    return this;
  }
  /**
   * A list of details showing types this Pokémon has.
   **/
  public PokemonDetail types(List<@Valid PokemonType> types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of details showing types this Pokémon has.")
  @JsonProperty(required = true, value = "types")
  public List<@Valid PokemonType> getTypes() {
    return types;
  }

  @JsonProperty(required = true, value = "types")
  public void setTypes(List<@Valid PokemonType> types) {
    this.types = types;
  }

  public PokemonDetail addTypesItem(PokemonType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }

    this.types.add(typesItem);
    return this;
  }

  public PokemonDetail removeTypesItem(PokemonType typesItem) {
    if (typesItem != null && this.types != null) {
      this.types.remove(typesItem);
    }

    return this;
  }
  /**
   * A list of details showing types this pokémon had in previous generations
   **/
  public PokemonDetail pastTypes(List<@Valid PokemonPastType> pastTypes) {
    this.pastTypes = pastTypes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of details showing types this pokémon had in previous generations")
  @JsonProperty(required = true, value = "past_types")
  public List<@Valid PokemonPastType> getPastTypes() {
    return pastTypes;
  }

  @JsonProperty(required = true, value = "past_types")
  public void setPastTypes(List<@Valid PokemonPastType> pastTypes) {
    this.pastTypes = pastTypes;
  }

  public PokemonDetail addPastTypesItem(PokemonPastType pastTypesItem) {
    if (this.pastTypes == null) {
      this.pastTypes = new ArrayList<>();
    }

    this.pastTypes.add(pastTypesItem);
    return this;
  }

  public PokemonDetail removePastTypesItem(PokemonPastType pastTypesItem) {
    if (pastTypesItem != null && this.pastTypes != null) {
      this.pastTypes.remove(pastTypesItem);
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
