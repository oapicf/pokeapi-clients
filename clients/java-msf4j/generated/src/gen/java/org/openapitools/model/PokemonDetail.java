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

/**
 * PokemonDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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
  private List<@Valid PokemonAbility> abilities = new ArrayList<>();

  @JsonProperty("past_abilities")
  private List<@Valid PokemonPastAbility> pastAbilities = new ArrayList<>();

  @JsonProperty("forms")
  private List<@Valid PokemonFormSummary> forms = new ArrayList<>();

  @JsonProperty("game_indices")
  private List<@Valid PokemonGameIndex> gameIndices = new ArrayList<>();

  @JsonProperty("held_items")
  private List<@Valid PokemonHeldItemSummary> heldItems = new ArrayList<>();

  @JsonProperty("location_area_encounters")
  private String locationAreaEncounters;

  @JsonProperty("moves")
  private List<@Valid PokemonMove> moves = new ArrayList<>();

  @JsonProperty("species")
  private PokemonSpeciesSummary species;

  @JsonProperty("sprites")
  private PokemonSprites sprites;

  @JsonProperty("cries")
  private PokemonCries cries;

  @JsonProperty("stats")
  private List<@Valid PokemonStat> stats = new ArrayList<>();

  @JsonProperty("past_stats")
  private List<@Valid PokemonPastStat> pastStats = new ArrayList<>();

  @JsonProperty("types")
  private List<@Valid PokemonType> types = new ArrayList<>();

  @JsonProperty("past_types")
  private List<@Valid PokemonPastType> pastTypes = new ArrayList<>();

   /**
   * The identifier for this resource.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public PokemonDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this resource.
   * @return name
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
  @ApiModelProperty(value = "The weight of this Pokémon in hectograms.")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

   /**
   * A list of abilities this Pokémon could potentially have.
   * @return abilities
  **/
  @ApiModelProperty(required = true, value = "A list of abilities this Pokémon could potentially have.")
  public List<@Valid PokemonAbility> getAbilities() {
    return abilities;
  }

   /**
   * A list of details showing abilities this pokémon had in previous generations
   * @return pastAbilities
  **/
  @ApiModelProperty(required = true, value = "A list of details showing abilities this pokémon had in previous generations")
  public List<@Valid PokemonPastAbility> getPastAbilities() {
    return pastAbilities;
  }

   /**
   * A list of forms this Pokémon can take on.
   * @return forms
  **/
  @ApiModelProperty(required = true, value = "A list of forms this Pokémon can take on.")
  public List<@Valid PokemonFormSummary> getForms() {
    return forms;
  }

   /**
   * A list of game indices relevent to Pokémon item by generation.
   * @return gameIndices
  **/
  @ApiModelProperty(required = true, value = "A list of game indices relevent to Pokémon item by generation.")
  public List<@Valid PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }

   /**
   * A list of items this Pokémon may be holding when encountered.
   * @return heldItems
  **/
  @ApiModelProperty(required = true, value = "A list of items this Pokémon may be holding when encountered.")
  public List<@Valid PokemonHeldItemSummary> getHeldItems() {
    return heldItems;
  }

   /**
   * A link to a list of location areas, as well as encounter details pertaining to specific versions.
   * @return locationAreaEncounters
  **/
  @ApiModelProperty(required = true, value = "A link to a list of location areas, as well as encounter details pertaining to specific versions.")
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }

   /**
   * A list of moves along with learn methods and level details pertaining to specific version groups.
   * @return moves
  **/
  @ApiModelProperty(required = true, value = "A list of moves along with learn methods and level details pertaining to specific version groups.")
  public List<@Valid PokemonMove> getMoves() {
    return moves;
  }

  public PokemonDetail species(PokemonSpeciesSummary species) {
    this.species = species;
    return this;
  }

   /**
   * The species this Pokémon belongs to.
   * @return species
  **/
  @ApiModelProperty(required = true, value = "The species this Pokémon belongs to.")
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }

  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

   /**
   * A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
   * @return sprites
  **/
  @ApiModelProperty(required = true, value = "A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>")
  public PokemonSprites getSprites() {
    return sprites;
  }

   /**
   * A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
   * @return cries
  **/
  @ApiModelProperty(required = true, value = "A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>")
  public PokemonCries getCries() {
    return cries;
  }

   /**
   * A list of base stat values for this Pokémon.
   * @return stats
  **/
  @ApiModelProperty(required = true, value = "A list of base stat values for this Pokémon.")
  public List<@Valid PokemonStat> getStats() {
    return stats;
  }

   /**
   * A list of details showing stats this pokémon had in previous generations
   * @return pastStats
  **/
  @ApiModelProperty(required = true, value = "A list of details showing stats this pokémon had in previous generations")
  public List<@Valid PokemonPastStat> getPastStats() {
    return pastStats;
  }

   /**
   * A list of details showing types this Pokémon has.
   * @return types
  **/
  @ApiModelProperty(required = true, value = "A list of details showing types this Pokémon has.")
  public List<@Valid PokemonType> getTypes() {
    return types;
  }

   /**
   * A list of details showing types this pokémon had in previous generations
   * @return pastTypes
  **/
  @ApiModelProperty(required = true, value = "A list of details showing types this pokémon had in previous generations")
  public List<@Valid PokemonPastType> getPastTypes() {
    return pastTypes;
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

