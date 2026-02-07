package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokemonDetailAbilitiesInner;
import org.openapitools.model.PokemonDetailCries;
import org.openapitools.model.PokemonDetailHeldItems;
import org.openapitools.model.PokemonDetailMovesInner;
import org.openapitools.model.PokemonDetailPastAbilitiesInner;
import org.openapitools.model.PokemonDetailPastTypesInner;
import org.openapitools.model.PokemonDetailSprites;
import org.openapitools.model.PokemonDetailTypesInner;
import org.openapitools.model.PokemonFormSummary;
import org.openapitools.model.PokemonGameIndex;
import org.openapitools.model.PokemonSpeciesSummary;
import org.openapitools.model.PokemonStat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PokemonDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetail {

  private Integer id;

  private String name;

  private JsonNullable<Integer> baseExperience = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> height = JsonNullable.<Integer>undefined();

  private Boolean isDefault;

  private JsonNullable<Integer> order = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> weight = JsonNullable.<Integer>undefined();

  @Valid
  private List<@Valid PokemonDetailAbilitiesInner> abilities = new ArrayList<>();

  @Valid
  private List<@Valid PokemonDetailPastAbilitiesInner> pastAbilities = new ArrayList<>();

  @Valid
  private List<@Valid PokemonFormSummary> forms = new ArrayList<>();

  @Valid
  private List<@Valid PokemonGameIndex> gameIndices = new ArrayList<>();

  private PokemonDetailHeldItems heldItems;

  private String locationAreaEncounters;

  @Valid
  private List<@Valid PokemonDetailMovesInner> moves = new ArrayList<>();

  private PokemonSpeciesSummary species;

  private PokemonDetailSprites sprites;

  private PokemonDetailCries cries;

  @Valid
  private List<@Valid PokemonStat> stats = new ArrayList<>();

  @Valid
  private List<@Valid PokemonDetailTypesInner> types = new ArrayList<>();

  @Valid
  private List<@Valid PokemonDetailPastTypesInner> pastTypes = new ArrayList<>();

  public PokemonDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonDetail(Integer id, String name, List<@Valid PokemonDetailAbilitiesInner> abilities, List<@Valid PokemonDetailPastAbilitiesInner> pastAbilities, List<@Valid PokemonFormSummary> forms, List<@Valid PokemonGameIndex> gameIndices, PokemonDetailHeldItems heldItems, String locationAreaEncounters, List<@Valid PokemonDetailMovesInner> moves, PokemonSpeciesSummary species, PokemonDetailSprites sprites, PokemonDetailCries cries, List<@Valid PokemonStat> stats, List<@Valid PokemonDetailTypesInner> types, List<@Valid PokemonDetailPastTypesInner> pastTypes) {
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
    this.types = types;
    this.pastTypes = pastTypes;
  }

  public PokemonDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokemonDetail baseExperience(Integer baseExperience) {
    this.baseExperience = JsonNullable.of(baseExperience);
    return this;
  }

  /**
   * Get baseExperience
   * @return baseExperience
   */
  
  @Schema(name = "base_experience", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("base_experience")
  public JsonNullable<Integer> getBaseExperience() {
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
   * Get height
   * @return height
   */
  
  @Schema(name = "height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public JsonNullable<Integer> getHeight() {
    return height;
  }

  public void setHeight(JsonNullable<Integer> height) {
    this.height = height;
  }

  public PokemonDetail isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Get isDefault
   * @return isDefault
   */
  
  @Schema(name = "is_default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public PokemonDetail order(Integer order) {
    this.order = JsonNullable.of(order);
    return this;
  }

  /**
   * Get order
   * @return order
   */
  
  @Schema(name = "order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order")
  public JsonNullable<Integer> getOrder() {
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
   * Get weight
   * @return weight
   */
  
  @Schema(name = "weight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weight")
  public JsonNullable<Integer> getWeight() {
    return weight;
  }

  public void setWeight(JsonNullable<Integer> weight) {
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
   */
  @NotNull @Valid 
  @Schema(name = "abilities", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("abilities")
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
   */
  @NotNull @Valid 
  @Schema(name = "past_abilities", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("past_abilities")
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
   */
  @NotNull @Valid 
  @Schema(name = "forms", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("forms")
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
   */
  @NotNull @Valid 
  @Schema(name = "game_indices", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("game_indices")
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
   */
  @NotNull @Valid 
  @Schema(name = "held_items", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("held_items")
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
   */
  
  @Schema(name = "location_area_encounters", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("location_area_encounters")
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
   */
  @NotNull @Valid 
  @Schema(name = "moves", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("moves")
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
   */
  @NotNull @Valid 
  @Schema(name = "species", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("species")
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
   */
  @NotNull @Valid 
  @Schema(name = "sprites", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sprites")
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
   */
  @NotNull @Valid 
  @Schema(name = "cries", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cries")
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
   */
  @NotNull @Valid 
  @Schema(name = "stats", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stats")
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
   */
  @NotNull @Valid 
  @Schema(name = "types", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("types")
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
   */
  @NotNull @Valid 
  @Schema(name = "past_types", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("past_types")
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
        Objects.equals(this.types, pokemonDetail.types) &&
        Objects.equals(this.pastTypes, pokemonDetail.pastTypes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, hashCodeNullable(baseExperience), hashCodeNullable(height), isDefault, hashCodeNullable(order), hashCodeNullable(weight), abilities, pastAbilities, forms, gameIndices, heldItems, locationAreaEncounters, moves, species, sprites, cries, stats, types, pastTypes);
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

