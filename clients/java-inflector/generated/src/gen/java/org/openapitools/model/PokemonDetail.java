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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T15:22:50.575598517Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  /**
   **/
  public PokemonDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public PokemonDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public PokemonDetail baseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("base_experience")
  public Integer getBaseExperience() {
    return baseExperience;
  }
  public void setBaseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
  }

  /**
   **/
  public PokemonDetail height(Integer height) {
    this.height = height;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   **/
  public PokemonDetail isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   **/
  public PokemonDetail order(Integer order) {
    this.order = order;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   **/
  public PokemonDetail weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }
  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  /**
   **/
  public PokemonDetail abilities(List<PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("abilities")
  public List<PokemonDetailAbilitiesInner> getAbilities() {
    return abilities;
  }
  public void setAbilities(List<PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
  }

  /**
   **/
  public PokemonDetail pastAbilities(List<PokemonDetailPastAbilitiesInner> pastAbilities) {
    this.pastAbilities = pastAbilities;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("past_abilities")
  public List<PokemonDetailPastAbilitiesInner> getPastAbilities() {
    return pastAbilities;
  }
  public void setPastAbilities(List<PokemonDetailPastAbilitiesInner> pastAbilities) {
    this.pastAbilities = pastAbilities;
  }

  /**
   **/
  public PokemonDetail forms(List<PokemonFormSummary> forms) {
    this.forms = forms;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("forms")
  public List<PokemonFormSummary> getForms() {
    return forms;
  }
  public void setForms(List<PokemonFormSummary> forms) {
    this.forms = forms;
  }

  /**
   **/
  public PokemonDetail gameIndices(List<PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("game_indices")
  public List<PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }
  public void setGameIndices(List<PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   **/
  public PokemonDetail heldItems(PokemonDetailHeldItems heldItems) {
    this.heldItems = heldItems;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("held_items")
  public PokemonDetailHeldItems getHeldItems() {
    return heldItems;
  }
  public void setHeldItems(PokemonDetailHeldItems heldItems) {
    this.heldItems = heldItems;
  }

  /**
   **/
  public PokemonDetail locationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("location_area_encounters")
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }
  public void setLocationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
  }

  /**
   **/
  public PokemonDetail moves(List<PokemonDetailMovesInner> moves) {
    this.moves = moves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("moves")
  public List<PokemonDetailMovesInner> getMoves() {
    return moves;
  }
  public void setMoves(List<PokemonDetailMovesInner> moves) {
    this.moves = moves;
  }

  /**
   **/
  public PokemonDetail species(PokemonSpeciesSummary species) {
    this.species = species;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("species")
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }
  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  /**
   **/
  public PokemonDetail sprites(PokemonDetailSprites sprites) {
    this.sprites = sprites;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sprites")
  public PokemonDetailSprites getSprites() {
    return sprites;
  }
  public void setSprites(PokemonDetailSprites sprites) {
    this.sprites = sprites;
  }

  /**
   **/
  public PokemonDetail cries(PokemonDetailCries cries) {
    this.cries = cries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("cries")
  public PokemonDetailCries getCries() {
    return cries;
  }
  public void setCries(PokemonDetailCries cries) {
    this.cries = cries;
  }

  /**
   **/
  public PokemonDetail stats(List<PokemonStat> stats) {
    this.stats = stats;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("stats")
  public List<PokemonStat> getStats() {
    return stats;
  }
  public void setStats(List<PokemonStat> stats) {
    this.stats = stats;
  }

  /**
   **/
  public PokemonDetail types(List<PokemonDetailTypesInner> types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("types")
  public List<PokemonDetailTypesInner> getTypes() {
    return types;
  }
  public void setTypes(List<PokemonDetailTypesInner> types) {
    this.types = types;
  }

  /**
   **/
  public PokemonDetail pastTypes(List<PokemonDetailPastTypesInner> pastTypes) {
    this.pastTypes = pastTypes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("past_types")
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

