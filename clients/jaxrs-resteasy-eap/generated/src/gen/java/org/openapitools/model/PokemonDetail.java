package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-11-09T13:50:03.149615362Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

  /**
   * The identifier for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The base experience gained for defeating this Pokémon.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The base experience gained for defeating this Pokémon.")
  @JsonProperty("base_experience")
 @Min(-2147483648) @Max(2147483647)  public Integer getBaseExperience() {
    return baseExperience;
  }
  public void setBaseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
  }

  /**
   * The height of this Pokémon in decimetres.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The height of this Pokémon in decimetres.")
  @JsonProperty("height")
 @Min(-2147483648) @Max(2147483647)  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * Set for exactly one Pokémon used as the default for each species.
   **/
  
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
   **/
  
  @ApiModelProperty(value = "Order for sorting. Almost national order, except families are grouped together.")
  @JsonProperty("order")
 @Min(-2147483648) @Max(2147483647)  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * The weight of this Pokémon in hectograms.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The weight of this Pokémon in hectograms.")
  @JsonProperty("weight")
 @Min(-2147483648) @Max(2147483647)  public Integer getWeight() {
    return weight;
  }
  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  /**
   * A list of abilities this Pokémon could potentially have.
   **/
  
  @ApiModelProperty(required = true, value = "A list of abilities this Pokémon could potentially have.")
  @JsonProperty("abilities")
  @NotNull
  public List<@Valid PokemonAbility> getAbilities() {
    return abilities;
  }
  public void setAbilities(List<@Valid PokemonAbility> abilities) {
    this.abilities = abilities;
  }

  /**
   * A list of details showing abilities this pokémon had in previous generations
   **/
  
  @ApiModelProperty(required = true, value = "A list of details showing abilities this pokémon had in previous generations")
  @JsonProperty("past_abilities")
  @NotNull
  public List<@Valid PokemonPastAbility> getPastAbilities() {
    return pastAbilities;
  }
  public void setPastAbilities(List<@Valid PokemonPastAbility> pastAbilities) {
    this.pastAbilities = pastAbilities;
  }

  /**
   * A list of forms this Pokémon can take on.
   **/
  
  @ApiModelProperty(required = true, value = "A list of forms this Pokémon can take on.")
  @JsonProperty("forms")
  @NotNull
  public List<@Valid PokemonFormSummary> getForms() {
    return forms;
  }
  public void setForms(List<@Valid PokemonFormSummary> forms) {
    this.forms = forms;
  }

  /**
   * A list of game indices relevent to Pokémon item by generation.
   **/
  
  @ApiModelProperty(required = true, value = "A list of game indices relevent to Pokémon item by generation.")
  @JsonProperty("game_indices")
  @NotNull
  public List<@Valid PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }
  public void setGameIndices(List<@Valid PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   * A list of items this Pokémon may be holding when encountered.
   **/
  
  @ApiModelProperty(required = true, value = "A list of items this Pokémon may be holding when encountered.")
  @JsonProperty("held_items")
  @NotNull
  public List<@Valid PokemonHeldItemSummary> getHeldItems() {
    return heldItems;
  }
  public void setHeldItems(List<@Valid PokemonHeldItemSummary> heldItems) {
    this.heldItems = heldItems;
  }

  /**
   * A link to a list of location areas, as well as encounter details pertaining to specific versions.
   **/
  
  @ApiModelProperty(required = true, value = "A link to a list of location areas, as well as encounter details pertaining to specific versions.")
  @JsonProperty("location_area_encounters")
  @NotNull
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }
  public void setLocationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
  }

  /**
   * A list of moves along with learn methods and level details pertaining to specific version groups.
   **/
  
  @ApiModelProperty(required = true, value = "A list of moves along with learn methods and level details pertaining to specific version groups.")
  @JsonProperty("moves")
  @NotNull
  public List<@Valid PokemonMove> getMoves() {
    return moves;
  }
  public void setMoves(List<@Valid PokemonMove> moves) {
    this.moves = moves;
  }

  /**
   * The species this Pokémon belongs to.
   **/
  
  @ApiModelProperty(required = true, value = "The species this Pokémon belongs to.")
  @JsonProperty("species")
  @NotNull
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }
  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  /**
   * A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt;
   **/
  
  @ApiModelProperty(required = true, value = "A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>")
  @JsonProperty("sprites")
  @NotNull
  public PokemonSprites getSprites() {
    return sprites;
  }
  public void setSprites(PokemonSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt;
   **/
  
  @ApiModelProperty(required = true, value = "A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>")
  @JsonProperty("cries")
  @NotNull
  public PokemonCries getCries() {
    return cries;
  }
  public void setCries(PokemonCries cries) {
    this.cries = cries;
  }

  /**
   * A list of base stat values for this Pokémon.
   **/
  
  @ApiModelProperty(required = true, value = "A list of base stat values for this Pokémon.")
  @JsonProperty("stats")
  @NotNull
  public List<@Valid PokemonStat> getStats() {
    return stats;
  }
  public void setStats(List<@Valid PokemonStat> stats) {
    this.stats = stats;
  }

  /**
   * A list of details showing stats this pokémon had in previous generations
   **/
  
  @ApiModelProperty(required = true, value = "A list of details showing stats this pokémon had in previous generations")
  @JsonProperty("past_stats")
  @NotNull
  public List<@Valid PokemonPastStat> getPastStats() {
    return pastStats;
  }
  public void setPastStats(List<@Valid PokemonPastStat> pastStats) {
    this.pastStats = pastStats;
  }

  /**
   * A list of details showing types this Pokémon has.
   **/
  
  @ApiModelProperty(required = true, value = "A list of details showing types this Pokémon has.")
  @JsonProperty("types")
  @NotNull
  public List<@Valid PokemonType> getTypes() {
    return types;
  }
  public void setTypes(List<@Valid PokemonType> types) {
    this.types = types;
  }

  /**
   * A list of details showing types this pokémon had in previous generations
   **/
  
  @ApiModelProperty(required = true, value = "A list of details showing types this pokémon had in previous generations")
  @JsonProperty("past_types")
  @NotNull
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

