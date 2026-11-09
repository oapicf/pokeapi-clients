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
import java.util.Objects;
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
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * The name for this resource.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
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
   * The base experience gained for defeating this Pokémon.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return baseExperience
  **/
  @JsonProperty("base_experience")
 @Min(-2147483648) @Max(2147483647)  public Integer getBaseExperience() {
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
   * The height of this Pokémon in decimetres.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return height
  **/
  @JsonProperty("height")
 @Min(-2147483648) @Max(2147483647)  public Integer getHeight() {
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
   * Set for exactly one Pokémon used as the default for each species.
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
   * Order for sorting. Almost national order, except families are grouped together.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return order
  **/
  @JsonProperty("order")
 @Min(-2147483648) @Max(2147483647)  public Integer getOrder() {
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
   * The weight of this Pokémon in hectograms.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return weight
  **/
  @JsonProperty("weight")
 @Min(-2147483648) @Max(2147483647)  public Integer getWeight() {
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
   * A list of abilities this Pokémon could potentially have.
   * @return abilities
  **/
  @JsonProperty("abilities")
  @NotNull
  public List<@Valid PokemonAbility> getAbilities() {
    return abilities;
  }


 /**
   * A list of details showing abilities this pokémon had in previous generations
   * @return pastAbilities
  **/
  @JsonProperty("past_abilities")
  @NotNull
  public List<@Valid PokemonPastAbility> getPastAbilities() {
    return pastAbilities;
  }


 /**
   * A list of forms this Pokémon can take on.
   * @return forms
  **/
  @JsonProperty("forms")
  @NotNull
  public List<@Valid PokemonFormSummary> getForms() {
    return forms;
  }


 /**
   * A list of game indices relevent to Pokémon item by generation.
   * @return gameIndices
  **/
  @JsonProperty("game_indices")
  @NotNull
  public List<@Valid PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }


 /**
   * A list of items this Pokémon may be holding when encountered.
   * @return heldItems
  **/
  @JsonProperty("held_items")
  @NotNull
  public List<@Valid PokemonHeldItemSummary> getHeldItems() {
    return heldItems;
  }


 /**
   * A link to a list of location areas, as well as encounter details pertaining to specific versions.
   * @return locationAreaEncounters
  **/
  @JsonProperty("location_area_encounters")
  @NotNull
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }


 /**
   * A list of moves along with learn methods and level details pertaining to specific version groups.
   * @return moves
  **/
  @JsonProperty("moves")
  @NotNull
  public List<@Valid PokemonMove> getMoves() {
    return moves;
  }


 /**
   * The species this Pokémon belongs to.
   * @return species
  **/
  @JsonProperty("species")
  @NotNull
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
   * A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt;
   * @return sprites
  **/
  @JsonProperty("sprites")
  @NotNull
  public PokemonSprites getSprites() {
    return sprites;
  }


 /**
   * A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt;
   * @return cries
  **/
  @JsonProperty("cries")
  @NotNull
  public PokemonCries getCries() {
    return cries;
  }


 /**
   * A list of base stat values for this Pokémon.
   * @return stats
  **/
  @JsonProperty("stats")
  @NotNull
  public List<@Valid PokemonStat> getStats() {
    return stats;
  }


 /**
   * A list of details showing stats this pokémon had in previous generations
   * @return pastStats
  **/
  @JsonProperty("past_stats")
  @NotNull
  public List<@Valid PokemonPastStat> getPastStats() {
    return pastStats;
  }


 /**
   * A list of details showing types this Pokémon has.
   * @return types
  **/
  @JsonProperty("types")
  @NotNull
  public List<@Valid PokemonType> getTypes() {
    return types;
  }


 /**
   * A list of details showing types this pokémon had in previous generations
   * @return pastTypes
  **/
  @JsonProperty("past_types")
  @NotNull
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

