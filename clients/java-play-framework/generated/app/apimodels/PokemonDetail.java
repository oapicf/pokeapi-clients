package apimodels;

import apimodels.PokemonDetailAbilitiesInner;
import apimodels.PokemonDetailCries;
import apimodels.PokemonDetailHeldItems;
import apimodels.PokemonDetailMovesInner;
import apimodels.PokemonDetailPastAbilitiesInner;
import apimodels.PokemonDetailPastTypesInner;
import apimodels.PokemonDetailSprites;
import apimodels.PokemonDetailTypesInner;
import apimodels.PokemonFormSummary;
import apimodels.PokemonGameIndex;
import apimodels.PokemonSpeciesSummary;
import apimodels.PokemonStat;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=100)

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
  @NotNull
@Valid

  private List<@Valid PokemonDetailAbilitiesInner> abilities = new ArrayList<>();

  @JsonProperty("past_abilities")
  @NotNull
@Valid

  private List<@Valid PokemonDetailPastAbilitiesInner> pastAbilities = new ArrayList<>();

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

  private PokemonDetailHeldItems heldItems;

  @JsonProperty("location_area_encounters")
  @NotNull

  private String locationAreaEncounters;

  @JsonProperty("moves")
  @NotNull
@Valid

  private List<@Valid PokemonDetailMovesInner> moves = new ArrayList<>();

  @JsonProperty("species")
  @NotNull
@Valid

  private PokemonSpeciesSummary species;

  @JsonProperty("sprites")
  @NotNull
@Valid

  private PokemonDetailSprites sprites;

  @JsonProperty("cries")
  @NotNull
@Valid

  private PokemonDetailCries cries;

  @JsonProperty("stats")
  @NotNull
@Valid

  private List<@Valid PokemonStat> stats = new ArrayList<>();

  @JsonProperty("types")
  @NotNull
@Valid

  private List<@Valid PokemonDetailTypesInner> types = new ArrayList<>();

  @JsonProperty("past_types")
  @NotNull
@Valid

  private List<@Valid PokemonDetailPastTypesInner> pastTypes = new ArrayList<>();

  public PokemonDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
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
   * Get name
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
   * Get baseExperience
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
   * Get height
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
   * Get isDefault
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
   * Get order
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
   * Get weight
   * @return weight
  **/
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public PokemonDetail abilities(List<@Valid PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
    return this;
  }

  public PokemonDetail addAbilitiesItem(PokemonDetailAbilitiesInner abilitiesItem) {
    if (this.abilities == null) {
      this.abilities = new ArrayList<>();
    }
    this.abilities.add(abilitiesItem);
    return this;
  }

   /**
   * Get abilities
   * @return abilities
  **/
  public List<@Valid PokemonDetailAbilitiesInner> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<@Valid PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
  }

  public PokemonDetail pastAbilities(List<@Valid PokemonDetailPastAbilitiesInner> pastAbilities) {
    this.pastAbilities = pastAbilities;
    return this;
  }

  public PokemonDetail addPastAbilitiesItem(PokemonDetailPastAbilitiesInner pastAbilitiesItem) {
    if (this.pastAbilities == null) {
      this.pastAbilities = new ArrayList<>();
    }
    this.pastAbilities.add(pastAbilitiesItem);
    return this;
  }

   /**
   * Get pastAbilities
   * @return pastAbilities
  **/
  public List<@Valid PokemonDetailPastAbilitiesInner> getPastAbilities() {
    return pastAbilities;
  }

  public void setPastAbilities(List<@Valid PokemonDetailPastAbilitiesInner> pastAbilities) {
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
   * Get forms
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
   * Get gameIndices
   * @return gameIndices
  **/
  public List<@Valid PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<@Valid PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public PokemonDetail heldItems(PokemonDetailHeldItems heldItems) {
    this.heldItems = heldItems;
    return this;
  }

   /**
   * Get heldItems
   * @return heldItems
  **/
  public PokemonDetailHeldItems getHeldItems() {
    return heldItems;
  }

  public void setHeldItems(PokemonDetailHeldItems heldItems) {
    this.heldItems = heldItems;
  }

  public PokemonDetail locationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
    return this;
  }

   /**
   * Get locationAreaEncounters
   * @return locationAreaEncounters
  **/
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }

  public void setLocationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
  }

  public PokemonDetail moves(List<@Valid PokemonDetailMovesInner> moves) {
    this.moves = moves;
    return this;
  }

  public PokemonDetail addMovesItem(PokemonDetailMovesInner movesItem) {
    if (this.moves == null) {
      this.moves = new ArrayList<>();
    }
    this.moves.add(movesItem);
    return this;
  }

   /**
   * Get moves
   * @return moves
  **/
  public List<@Valid PokemonDetailMovesInner> getMoves() {
    return moves;
  }

  public void setMoves(List<@Valid PokemonDetailMovesInner> moves) {
    this.moves = moves;
  }

  public PokemonDetail species(PokemonSpeciesSummary species) {
    this.species = species;
    return this;
  }

   /**
   * Get species
   * @return species
  **/
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }

  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  public PokemonDetail sprites(PokemonDetailSprites sprites) {
    this.sprites = sprites;
    return this;
  }

   /**
   * Get sprites
   * @return sprites
  **/
  public PokemonDetailSprites getSprites() {
    return sprites;
  }

  public void setSprites(PokemonDetailSprites sprites) {
    this.sprites = sprites;
  }

  public PokemonDetail cries(PokemonDetailCries cries) {
    this.cries = cries;
    return this;
  }

   /**
   * Get cries
   * @return cries
  **/
  public PokemonDetailCries getCries() {
    return cries;
  }

  public void setCries(PokemonDetailCries cries) {
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
   * Get stats
   * @return stats
  **/
  public List<@Valid PokemonStat> getStats() {
    return stats;
  }

  public void setStats(List<@Valid PokemonStat> stats) {
    this.stats = stats;
  }

  public PokemonDetail types(List<@Valid PokemonDetailTypesInner> types) {
    this.types = types;
    return this;
  }

  public PokemonDetail addTypesItem(PokemonDetailTypesInner typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  public List<@Valid PokemonDetailTypesInner> getTypes() {
    return types;
  }

  public void setTypes(List<@Valid PokemonDetailTypesInner> types) {
    this.types = types;
  }

  public PokemonDetail pastTypes(List<@Valid PokemonDetailPastTypesInner> pastTypes) {
    this.pastTypes = pastTypes;
    return this;
  }

  public PokemonDetail addPastTypesItem(PokemonDetailPastTypesInner pastTypesItem) {
    if (this.pastTypes == null) {
      this.pastTypes = new ArrayList<>();
    }
    this.pastTypes.add(pastTypesItem);
    return this;
  }

   /**
   * Get pastTypes
   * @return pastTypes
  **/
  public List<@Valid PokemonDetailPastTypesInner> getPastTypes() {
    return pastTypes;
  }

  public void setPastTypes(List<@Valid PokemonDetailPastTypesInner> pastTypes) {
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
        Objects.equals(types, pokemonDetail.types) &&
        Objects.equals(pastTypes, pokemonDetail.pastTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, baseExperience, height, isDefault, order, weight, abilities, pastAbilities, forms, gameIndices, heldItems, locationAreaEncounters, moves, species, sprites, cries, stats, types, pastTypes);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

