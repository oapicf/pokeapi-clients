package org.openapitools.model;

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
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The identifier for this resource.
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * The name for this resource.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The base experience gained for defeating this Pokémon.
   */
  @JsonProperty("base_experience")
  private Integer baseExperience;

  /**
   * The height of this Pokémon in decimetres.
   */
  @JsonProperty("height")
  private Integer height;

  /**
   * Set for exactly one Pokémon used as the default for each species.
   */
  @JsonProperty("is_default")
  private Boolean isDefault;

  /**
   * Order for sorting. Almost national order, except families are grouped together.
   */
  @JsonProperty("order")
  private Integer order;

  /**
   * The weight of this Pokémon in hectograms.
   */
  @JsonProperty("weight")
  private Integer weight;

  /**
   * A list of abilities this Pokémon could potentially have.
   */
  @JsonProperty("abilities")
  private List<PokemonAbility> abilities = new ArrayList<>();

  /**
   * A list of details showing abilities this pokémon had in previous generations
   */
  @JsonProperty("past_abilities")
  private List<PokemonPastAbility> pastAbilities = new ArrayList<>();

  /**
   * A list of forms this Pokémon can take on.
   */
  @JsonProperty("forms")
  private List<PokemonFormSummary> forms = new ArrayList<>();

  /**
   * A list of game indices relevent to Pokémon item by generation.
   */
  @JsonProperty("game_indices")
  private List<PokemonGameIndex> gameIndices = new ArrayList<>();

  /**
   * A list of items this Pokémon may be holding when encountered.
   */
  @JsonProperty("held_items")
  private List<PokemonHeldItemSummary> heldItems = new ArrayList<>();

  /**
   * A link to a list of location areas, as well as encounter details pertaining to specific versions.
   */
  @JsonProperty("location_area_encounters")
  private String locationAreaEncounters;

  /**
   * A list of moves along with learn methods and level details pertaining to specific version groups.
   */
  @JsonProperty("moves")
  private List<PokemonMove> moves = new ArrayList<>();

  /**
   * The species this Pokémon belongs to.
   */
  @JsonProperty("species")
  private PokemonSpeciesSummary species;

  /**
   * A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt;
   */
  @JsonProperty("sprites")
  private PokemonSprites sprites;

  /**
   * A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt;
   */
  @JsonProperty("cries")
  private PokemonCries cries;

  /**
   * A list of base stat values for this Pokémon.
   */
  @JsonProperty("stats")
  private List<PokemonStat> stats = new ArrayList<>();

  /**
   * A list of details showing stats this pokémon had in previous generations
   */
  @JsonProperty("past_stats")
  private List<PokemonPastStat> pastStats = new ArrayList<>();

  /**
   * A list of details showing types this Pokémon has.
   */
  @JsonProperty("types")
  private List<PokemonType> types = new ArrayList<>();

  /**
   * A list of details showing types this pokémon had in previous generations
   */
  @JsonProperty("past_types")
  private List<PokemonPastType> pastTypes = new ArrayList<>();

  /**
   * The identifier for this resource.
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The base experience gained for defeating this Pokémon.
   * @return baseExperience
   */
  public Integer getBaseExperience() {
    return baseExperience;
  }

  public void setBaseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
  }

  /**
   * The height of this Pokémon in decimetres.
   * @return height
   */
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * Set for exactly one Pokémon used as the default for each species.
   * @return isDefault
   */
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * Order for sorting. Almost national order, except families are grouped together.
   * @return order
   */
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * The weight of this Pokémon in hectograms.
   * @return weight
   */
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  /**
   * A list of abilities this Pokémon could potentially have.
   * @return abilities
   */
  public List<PokemonAbility> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<PokemonAbility> abilities) {
    this.abilities = abilities;
  }

  /**
   * A list of details showing abilities this pokémon had in previous generations
   * @return pastAbilities
   */
  public List<PokemonPastAbility> getPastAbilities() {
    return pastAbilities;
  }

  public void setPastAbilities(List<PokemonPastAbility> pastAbilities) {
    this.pastAbilities = pastAbilities;
  }

  /**
   * A list of forms this Pokémon can take on.
   * @return forms
   */
  public List<PokemonFormSummary> getForms() {
    return forms;
  }

  public void setForms(List<PokemonFormSummary> forms) {
    this.forms = forms;
  }

  /**
   * A list of game indices relevent to Pokémon item by generation.
   * @return gameIndices
   */
  public List<PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   * A list of items this Pokémon may be holding when encountered.
   * @return heldItems
   */
  public List<PokemonHeldItemSummary> getHeldItems() {
    return heldItems;
  }

  public void setHeldItems(List<PokemonHeldItemSummary> heldItems) {
    this.heldItems = heldItems;
  }

  /**
   * A link to a list of location areas, as well as encounter details pertaining to specific versions.
   * @return locationAreaEncounters
   */
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }

  public void setLocationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
  }

  /**
   * A list of moves along with learn methods and level details pertaining to specific version groups.
   * @return moves
   */
  public List<PokemonMove> getMoves() {
    return moves;
  }

  public void setMoves(List<PokemonMove> moves) {
    this.moves = moves;
  }

  /**
   * The species this Pokémon belongs to.
   * @return species
   */
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }

  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  /**
   * A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt;
   * @return sprites
   */
  public PokemonSprites getSprites() {
    return sprites;
  }

  public void setSprites(PokemonSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt;
   * @return cries
   */
  public PokemonCries getCries() {
    return cries;
  }

  public void setCries(PokemonCries cries) {
    this.cries = cries;
  }

  /**
   * A list of base stat values for this Pokémon.
   * @return stats
   */
  public List<PokemonStat> getStats() {
    return stats;
  }

  public void setStats(List<PokemonStat> stats) {
    this.stats = stats;
  }

  /**
   * A list of details showing stats this pokémon had in previous generations
   * @return pastStats
   */
  public List<PokemonPastStat> getPastStats() {
    return pastStats;
  }

  public void setPastStats(List<PokemonPastStat> pastStats) {
    this.pastStats = pastStats;
  }

  /**
   * A list of details showing types this Pokémon has.
   * @return types
   */
  public List<PokemonType> getTypes() {
    return types;
  }

  public void setTypes(List<PokemonType> types) {
    this.types = types;
  }

  /**
   * A list of details showing types this pokémon had in previous generations
   * @return pastTypes
   */
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
