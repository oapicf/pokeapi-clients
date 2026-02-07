package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokemonDetail   {
  
  private Integer id;

  private String name;

  private Integer baseExperience;

  private Integer height;

  private Boolean isDefault;

  private Integer order;

  private Integer weight;

  private List<@Valid PokemonDetailAbilitiesInner> abilities = new ArrayList<>();

  private List<@Valid PokemonDetailPastAbilitiesInner> pastAbilities = new ArrayList<>();

  private List<@Valid PokemonFormSummary> forms = new ArrayList<>();

  private List<@Valid PokemonGameIndex> gameIndices = new ArrayList<>();

  private PokemonDetailHeldItems heldItems;

  private String locationAreaEncounters;

  private List<@Valid PokemonDetailMovesInner> moves = new ArrayList<>();

  private PokemonSpeciesSummary species;

  private PokemonDetailSprites sprites;

  private PokemonDetailCries cries;

  private List<@Valid PokemonStat> stats = new ArrayList<>();

  private List<@Valid PokemonDetailTypesInner> types = new ArrayList<>();

  private List<@Valid PokemonDetailPastTypesInner> pastTypes = new ArrayList<>();

  /**
   **/
  public PokemonDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
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
  @NotNull
 @Size(max=100)  public String getName() {
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
  public PokemonDetail abilities(List<@Valid PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("abilities")
  @NotNull
  public List<@Valid PokemonDetailAbilitiesInner> getAbilities() {
    return abilities;
  }
  public void setAbilities(List<@Valid PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
  }

  public PokemonDetail addAbilitiesItem(PokemonDetailAbilitiesInner abilitiesItem) {
    if (this.abilities == null) {
      this.abilities = new ArrayList<>();
    }
    this.abilities.add(abilitiesItem);
    return this;
  }


  /**
   **/
  public PokemonDetail pastAbilities(List<@Valid PokemonDetailPastAbilitiesInner> pastAbilities) {
    this.pastAbilities = pastAbilities;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("past_abilities")
  @NotNull
  public List<@Valid PokemonDetailPastAbilitiesInner> getPastAbilities() {
    return pastAbilities;
  }
  public void setPastAbilities(List<@Valid PokemonDetailPastAbilitiesInner> pastAbilities) {
    this.pastAbilities = pastAbilities;
  }

  public PokemonDetail addPastAbilitiesItem(PokemonDetailPastAbilitiesInner pastAbilitiesItem) {
    if (this.pastAbilities == null) {
      this.pastAbilities = new ArrayList<>();
    }
    this.pastAbilities.add(pastAbilitiesItem);
    return this;
  }


  /**
   **/
  public PokemonDetail forms(List<@Valid PokemonFormSummary> forms) {
    this.forms = forms;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("forms")
  @NotNull
  public List<@Valid PokemonFormSummary> getForms() {
    return forms;
  }
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


  /**
   **/
  public PokemonDetail gameIndices(List<@Valid PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("game_indices")
  @NotNull
  public List<@Valid PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }
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


  /**
   **/
  public PokemonDetail heldItems(PokemonDetailHeldItems heldItems) {
    this.heldItems = heldItems;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("held_items")
  @NotNull
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
  @NotNull
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }
  public void setLocationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
  }


  /**
   **/
  public PokemonDetail moves(List<@Valid PokemonDetailMovesInner> moves) {
    this.moves = moves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("moves")
  @NotNull
  public List<@Valid PokemonDetailMovesInner> getMoves() {
    return moves;
  }
  public void setMoves(List<@Valid PokemonDetailMovesInner> moves) {
    this.moves = moves;
  }

  public PokemonDetail addMovesItem(PokemonDetailMovesInner movesItem) {
    if (this.moves == null) {
      this.moves = new ArrayList<>();
    }
    this.moves.add(movesItem);
    return this;
  }


  /**
   **/
  public PokemonDetail species(PokemonSpeciesSummary species) {
    this.species = species;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("species")
  @NotNull
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
  @NotNull
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
  @NotNull
  public PokemonDetailCries getCries() {
    return cries;
  }
  public void setCries(PokemonDetailCries cries) {
    this.cries = cries;
  }


  /**
   **/
  public PokemonDetail stats(List<@Valid PokemonStat> stats) {
    this.stats = stats;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("stats")
  @NotNull
  public List<@Valid PokemonStat> getStats() {
    return stats;
  }
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


  /**
   **/
  public PokemonDetail types(List<@Valid PokemonDetailTypesInner> types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("types")
  @NotNull
  public List<@Valid PokemonDetailTypesInner> getTypes() {
    return types;
  }
  public void setTypes(List<@Valid PokemonDetailTypesInner> types) {
    this.types = types;
  }

  public PokemonDetail addTypesItem(PokemonDetailTypesInner typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }


  /**
   **/
  public PokemonDetail pastTypes(List<@Valid PokemonDetailPastTypesInner> pastTypes) {
    this.pastTypes = pastTypes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("past_types")
  @NotNull
  public List<@Valid PokemonDetailPastTypesInner> getPastTypes() {
    return pastTypes;
  }
  public void setPastTypes(List<@Valid PokemonDetailPastTypesInner> pastTypes) {
    this.pastTypes = pastTypes;
  }

  public PokemonDetail addPastTypesItem(PokemonDetailPastTypesInner pastTypesItem) {
    if (this.pastTypes == null) {
      this.pastTypes = new ArrayList<>();
    }
    this.pastTypes.add(pastTypesItem);
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

