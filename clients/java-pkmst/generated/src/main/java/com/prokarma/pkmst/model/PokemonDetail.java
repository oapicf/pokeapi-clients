package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.PokemonDetailAbilitiesInner;
import com.prokarma.pkmst.model.PokemonDetailCries;
import com.prokarma.pkmst.model.PokemonDetailHeldItems;
import com.prokarma.pkmst.model.PokemonDetailMovesInner;
import com.prokarma.pkmst.model.PokemonDetailPastAbilitiesInner;
import com.prokarma.pkmst.model.PokemonDetailPastTypesInner;
import com.prokarma.pkmst.model.PokemonDetailSprites;
import com.prokarma.pkmst.model.PokemonDetailTypesInner;
import com.prokarma.pkmst.model.PokemonFormSummary;
import com.prokarma.pkmst.model.PokemonGameIndex;
import com.prokarma.pkmst.model.PokemonSpeciesSummary;
import com.prokarma.pkmst.model.PokemonStat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokemonDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
  
  private List<PokemonDetailAbilitiesInner> abilities = new ArrayList<>();

  @JsonProperty("past_abilities")
  
  private List<PokemonDetailPastAbilitiesInner> pastAbilities = new ArrayList<>();

  @JsonProperty("forms")
  
  private List<PokemonFormSummary> forms = new ArrayList<>();

  @JsonProperty("game_indices")
  
  private List<PokemonGameIndex> gameIndices = new ArrayList<>();

  @JsonProperty("held_items")
  private PokemonDetailHeldItems heldItems;

  @JsonProperty("location_area_encounters")
  private String locationAreaEncounters;

  @JsonProperty("moves")
  
  private List<PokemonDetailMovesInner> moves = new ArrayList<>();

  @JsonProperty("species")
  private PokemonSpeciesSummary species;

  @JsonProperty("sprites")
  private PokemonDetailSprites sprites;

  @JsonProperty("cries")
  private PokemonDetailCries cries;

  @JsonProperty("stats")
  
  private List<PokemonStat> stats = new ArrayList<>();

  @JsonProperty("types")
  
  private List<PokemonDetailTypesInner> types = new ArrayList<>();

  @JsonProperty("past_types")
  
  private List<PokemonDetailPastTypesInner> pastTypes = new ArrayList<>();

  public PokemonDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
   */
  @ApiModelProperty(value = "")
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
   */
  @ApiModelProperty(value = "")
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
   */
  @ApiModelProperty(value = "")
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
   */
  @ApiModelProperty(value = "")
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
   */
  @ApiModelProperty(value = "")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public PokemonDetail abilities(List<PokemonDetailAbilitiesInner> abilities) {
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
  @ApiModelProperty(required = true, value = "")
  public List<PokemonDetailAbilitiesInner> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
  }

  public PokemonDetail pastAbilities(List<PokemonDetailPastAbilitiesInner> pastAbilities) {
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
  @ApiModelProperty(required = true, value = "")
  public List<PokemonDetailPastAbilitiesInner> getPastAbilities() {
    return pastAbilities;
  }

  public void setPastAbilities(List<PokemonDetailPastAbilitiesInner> pastAbilities) {
    this.pastAbilities = pastAbilities;
  }

  public PokemonDetail forms(List<PokemonFormSummary> forms) {
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
  @ApiModelProperty(required = true, value = "")
  public List<PokemonFormSummary> getForms() {
    return forms;
  }

  public void setForms(List<PokemonFormSummary> forms) {
    this.forms = forms;
  }

  public PokemonDetail gameIndices(List<PokemonGameIndex> gameIndices) {
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
  @ApiModelProperty(required = true, value = "")
  public List<PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<PokemonGameIndex> gameIndices) {
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, readOnly = true, value = "")
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }

  public void setLocationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
  }

  public PokemonDetail moves(List<PokemonDetailMovesInner> moves) {
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
  @ApiModelProperty(required = true, value = "")
  public List<PokemonDetailMovesInner> getMoves() {
    return moves;
  }

  public void setMoves(List<PokemonDetailMovesInner> moves) {
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
  public PokemonDetailCries getCries() {
    return cries;
  }

  public void setCries(PokemonDetailCries cries) {
    this.cries = cries;
  }

  public PokemonDetail stats(List<PokemonStat> stats) {
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
  @ApiModelProperty(required = true, value = "")
  public List<PokemonStat> getStats() {
    return stats;
  }

  public void setStats(List<PokemonStat> stats) {
    this.stats = stats;
  }

  public PokemonDetail types(List<PokemonDetailTypesInner> types) {
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
  @ApiModelProperty(required = true, value = "")
  public List<PokemonDetailTypesInner> getTypes() {
    return types;
  }

  public void setTypes(List<PokemonDetailTypesInner> types) {
    this.types = types;
  }

  public PokemonDetail pastTypes(List<PokemonDetailPastTypesInner> pastTypes) {
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
  @ApiModelProperty(required = true, value = "")
  public List<PokemonDetailPastTypesInner> getPastTypes() {
    return pastTypes;
  }

  public void setPastTypes(List<PokemonDetailPastTypesInner> pastTypes) {
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
        Objects.equals(this.types, pokemonDetail.types) &&
        Objects.equals(this.pastTypes, pokemonDetail.pastTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, baseExperience, height, isDefault, order, weight, abilities, pastAbilities, forms, gameIndices, heldItems, locationAreaEncounters, moves, species, sprites, cries, stats, types, pastTypes);
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

