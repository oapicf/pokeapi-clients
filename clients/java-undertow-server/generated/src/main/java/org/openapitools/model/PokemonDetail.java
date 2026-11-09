/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**](https://github.com/phalt) and other [**PokéAPI contributors**](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.
 *
 * OpenAPI document version: 2.10.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-11-09T13:49:34.675912514Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonDetail   {
  
  private Integer id;
  private String name;
  private Integer baseExperience;
  private Integer height;
  private Boolean isDefault;
  private Integer order;
  private Integer weight;
  private List<PokemonAbility> abilities = new ArrayList<>();
  private List<PokemonPastAbility> pastAbilities = new ArrayList<>();
  private List<PokemonFormSummary> forms = new ArrayList<>();
  private List<PokemonGameIndex> gameIndices = new ArrayList<>();
  private List<PokemonHeldItemSummary> heldItems = new ArrayList<>();
  private String locationAreaEncounters;
  private List<PokemonMove> moves = new ArrayList<>();
  private PokemonSpeciesSummary species;
  private PokemonSprites sprites;
  private PokemonCries cries;
  private List<PokemonStat> stats = new ArrayList<>();
  private List<PokemonPastStat> pastStats = new ArrayList<>();
  private List<PokemonType> types = new ArrayList<>();
  private List<PokemonPastType> pastTypes = new ArrayList<>();

  /**
   * The identifier for this resource.
   */
  public PokemonDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   */
  public PokemonDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The base experience gained for defeating this Pokémon.
   * minimum: -2147483648
   * maximum: 2147483647
   */
  public PokemonDetail baseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
    return this;
  }

  
  @ApiModelProperty(value = "The base experience gained for defeating this Pokémon.")
  @JsonProperty("base_experience")
  public Integer getBaseExperience() {
    return baseExperience;
  }
  public void setBaseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
  }

  /**
   * The height of this Pokémon in decimetres.
   * minimum: -2147483648
   * maximum: 2147483647
   */
  public PokemonDetail height(Integer height) {
    this.height = height;
    return this;
  }

  
  @ApiModelProperty(value = "The height of this Pokémon in decimetres.")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * Set for exactly one Pokémon used as the default for each species.
   */
  public PokemonDetail isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  
  @ApiModelProperty(value = "Set for exactly one Pokémon used as the default for each species.")
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * Order for sorting. Almost national order, except families are grouped together.
   * minimum: -2147483648
   * maximum: 2147483647
   */
  public PokemonDetail order(Integer order) {
    this.order = order;
    return this;
  }

  
  @ApiModelProperty(value = "Order for sorting. Almost national order, except families are grouped together.")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * The weight of this Pokémon in hectograms.
   * minimum: -2147483648
   * maximum: 2147483647
   */
  public PokemonDetail weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  
  @ApiModelProperty(value = "The weight of this Pokémon in hectograms.")
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }
  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  /**
   * A list of abilities this Pokémon could potentially have.
   */
  public PokemonDetail abilities(List<PokemonAbility> abilities) {
    this.abilities = abilities;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of abilities this Pokémon could potentially have.")
  @JsonProperty("abilities")
  public List<PokemonAbility> getAbilities() {
    return abilities;
  }
  public void setAbilities(List<PokemonAbility> abilities) {
    this.abilities = abilities;
  }

  /**
   * A list of details showing abilities this pokémon had in previous generations
   */
  public PokemonDetail pastAbilities(List<PokemonPastAbility> pastAbilities) {
    this.pastAbilities = pastAbilities;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of details showing abilities this pokémon had in previous generations")
  @JsonProperty("past_abilities")
  public List<PokemonPastAbility> getPastAbilities() {
    return pastAbilities;
  }
  public void setPastAbilities(List<PokemonPastAbility> pastAbilities) {
    this.pastAbilities = pastAbilities;
  }

  /**
   * A list of forms this Pokémon can take on.
   */
  public PokemonDetail forms(List<PokemonFormSummary> forms) {
    this.forms = forms;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of forms this Pokémon can take on.")
  @JsonProperty("forms")
  public List<PokemonFormSummary> getForms() {
    return forms;
  }
  public void setForms(List<PokemonFormSummary> forms) {
    this.forms = forms;
  }

  /**
   * A list of game indices relevent to Pokémon item by generation.
   */
  public PokemonDetail gameIndices(List<PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of game indices relevent to Pokémon item by generation.")
  @JsonProperty("game_indices")
  public List<PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }
  public void setGameIndices(List<PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   * A list of items this Pokémon may be holding when encountered.
   */
  public PokemonDetail heldItems(List<PokemonHeldItemSummary> heldItems) {
    this.heldItems = heldItems;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of items this Pokémon may be holding when encountered.")
  @JsonProperty("held_items")
  public List<PokemonHeldItemSummary> getHeldItems() {
    return heldItems;
  }
  public void setHeldItems(List<PokemonHeldItemSummary> heldItems) {
    this.heldItems = heldItems;
  }

  /**
   * A link to a list of location areas, as well as encounter details pertaining to specific versions.
   */
  public PokemonDetail locationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A link to a list of location areas, as well as encounter details pertaining to specific versions.")
  @JsonProperty("location_area_encounters")
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }
  public void setLocationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
  }

  /**
   * A list of moves along with learn methods and level details pertaining to specific version groups.
   */
  public PokemonDetail moves(List<PokemonMove> moves) {
    this.moves = moves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of moves along with learn methods and level details pertaining to specific version groups.")
  @JsonProperty("moves")
  public List<PokemonMove> getMoves() {
    return moves;
  }
  public void setMoves(List<PokemonMove> moves) {
    this.moves = moves;
  }

  /**
   * The species this Pokémon belongs to.
   */
  public PokemonDetail species(PokemonSpeciesSummary species) {
    this.species = species;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The species this Pokémon belongs to.")
  @JsonProperty("species")
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }
  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  /**
   * A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
   */
  public PokemonDetail sprites(PokemonSprites sprites) {
    this.sprites = sprites;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>")
  @JsonProperty("sprites")
  public PokemonSprites getSprites() {
    return sprites;
  }
  public void setSprites(PokemonSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
   */
  public PokemonDetail cries(PokemonCries cries) {
    this.cries = cries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>")
  @JsonProperty("cries")
  public PokemonCries getCries() {
    return cries;
  }
  public void setCries(PokemonCries cries) {
    this.cries = cries;
  }

  /**
   * A list of base stat values for this Pokémon.
   */
  public PokemonDetail stats(List<PokemonStat> stats) {
    this.stats = stats;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of base stat values for this Pokémon.")
  @JsonProperty("stats")
  public List<PokemonStat> getStats() {
    return stats;
  }
  public void setStats(List<PokemonStat> stats) {
    this.stats = stats;
  }

  /**
   * A list of details showing stats this pokémon had in previous generations
   */
  public PokemonDetail pastStats(List<PokemonPastStat> pastStats) {
    this.pastStats = pastStats;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of details showing stats this pokémon had in previous generations")
  @JsonProperty("past_stats")
  public List<PokemonPastStat> getPastStats() {
    return pastStats;
  }
  public void setPastStats(List<PokemonPastStat> pastStats) {
    this.pastStats = pastStats;
  }

  /**
   * A list of details showing types this Pokémon has.
   */
  public PokemonDetail types(List<PokemonType> types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of details showing types this Pokémon has.")
  @JsonProperty("types")
  public List<PokemonType> getTypes() {
    return types;
  }
  public void setTypes(List<PokemonType> types) {
    this.types = types;
  }

  /**
   * A list of details showing types this pokémon had in previous generations
   */
  public PokemonDetail pastTypes(List<PokemonPastType> pastTypes) {
    this.pastTypes = pastTypes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of details showing types this pokémon had in previous generations")
  @JsonProperty("past_types")
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

