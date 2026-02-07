package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.PokemonDetailAbilitiesInner;
import org.openapitools.vertxweb.server.model.PokemonDetailCries;
import org.openapitools.vertxweb.server.model.PokemonDetailHeldItems;
import org.openapitools.vertxweb.server.model.PokemonDetailMovesInner;
import org.openapitools.vertxweb.server.model.PokemonDetailPastAbilitiesInner;
import org.openapitools.vertxweb.server.model.PokemonDetailPastTypesInner;
import org.openapitools.vertxweb.server.model.PokemonDetailSprites;
import org.openapitools.vertxweb.server.model.PokemonDetailTypesInner;
import org.openapitools.vertxweb.server.model.PokemonFormSummary;
import org.openapitools.vertxweb.server.model.PokemonGameIndex;
import org.openapitools.vertxweb.server.model.PokemonSpeciesSummary;
import org.openapitools.vertxweb.server.model.PokemonStat;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonDetail   {
  
  private Integer id;
  private String name;
  private Integer baseExperience;
  private Integer height;
  private Boolean isDefault;
  private Integer order;
  private Integer weight;
  private List<PokemonDetailAbilitiesInner> abilities = new ArrayList<>();
  private List<PokemonDetailPastAbilitiesInner> pastAbilities = new ArrayList<>();
  private List<PokemonFormSummary> forms = new ArrayList<>();
  private List<PokemonGameIndex> gameIndices = new ArrayList<>();
  private PokemonDetailHeldItems heldItems;
  private String locationAreaEncounters;
  private List<PokemonDetailMovesInner> moves = new ArrayList<>();
  private PokemonSpeciesSummary species;
  private PokemonDetailSprites sprites;
  private PokemonDetailCries cries;
  private List<PokemonStat> stats = new ArrayList<>();
  private List<PokemonDetailTypesInner> types = new ArrayList<>();
  private List<PokemonDetailPastTypesInner> pastTypes = new ArrayList<>();

  public PokemonDetail () {

  }

  public PokemonDetail (Integer id, String name, Integer baseExperience, Integer height, Boolean isDefault, Integer order, Integer weight, List<PokemonDetailAbilitiesInner> abilities, List<PokemonDetailPastAbilitiesInner> pastAbilities, List<PokemonFormSummary> forms, List<PokemonGameIndex> gameIndices, PokemonDetailHeldItems heldItems, String locationAreaEncounters, List<PokemonDetailMovesInner> moves, PokemonSpeciesSummary species, PokemonDetailSprites sprites, PokemonDetailCries cries, List<PokemonStat> stats, List<PokemonDetailTypesInner> types, List<PokemonDetailPastTypesInner> pastTypes) {
    this.id = id;
    this.name = name;
    this.baseExperience = baseExperience;
    this.height = height;
    this.isDefault = isDefault;
    this.order = order;
    this.weight = weight;
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

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("base_experience")
  public Integer getBaseExperience() {
    return baseExperience;
  }
  public void setBaseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
  }

    
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

    
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

    
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

    
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }
  public void setWeight(Integer weight) {
    this.weight = weight;
  }

    
  @JsonProperty("abilities")
  public List<PokemonDetailAbilitiesInner> getAbilities() {
    return abilities;
  }
  public void setAbilities(List<PokemonDetailAbilitiesInner> abilities) {
    this.abilities = abilities;
  }

    
  @JsonProperty("past_abilities")
  public List<PokemonDetailPastAbilitiesInner> getPastAbilities() {
    return pastAbilities;
  }
  public void setPastAbilities(List<PokemonDetailPastAbilitiesInner> pastAbilities) {
    this.pastAbilities = pastAbilities;
  }

    
  @JsonProperty("forms")
  public List<PokemonFormSummary> getForms() {
    return forms;
  }
  public void setForms(List<PokemonFormSummary> forms) {
    this.forms = forms;
  }

    
  @JsonProperty("game_indices")
  public List<PokemonGameIndex> getGameIndices() {
    return gameIndices;
  }
  public void setGameIndices(List<PokemonGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

    
  @JsonProperty("held_items")
  public PokemonDetailHeldItems getHeldItems() {
    return heldItems;
  }
  public void setHeldItems(PokemonDetailHeldItems heldItems) {
    this.heldItems = heldItems;
  }

    
  @JsonProperty("location_area_encounters")
  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }
  public void setLocationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
  }

    
  @JsonProperty("moves")
  public List<PokemonDetailMovesInner> getMoves() {
    return moves;
  }
  public void setMoves(List<PokemonDetailMovesInner> moves) {
    this.moves = moves;
  }

    
  @JsonProperty("species")
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }
  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

    
  @JsonProperty("sprites")
  public PokemonDetailSprites getSprites() {
    return sprites;
  }
  public void setSprites(PokemonDetailSprites sprites) {
    this.sprites = sprites;
  }

    
  @JsonProperty("cries")
  public PokemonDetailCries getCries() {
    return cries;
  }
  public void setCries(PokemonDetailCries cries) {
    this.cries = cries;
  }

    
  @JsonProperty("stats")
  public List<PokemonStat> getStats() {
    return stats;
  }
  public void setStats(List<PokemonStat> stats) {
    this.stats = stats;
  }

    
  @JsonProperty("types")
  public List<PokemonDetailTypesInner> getTypes() {
    return types;
  }
  public void setTypes(List<PokemonDetailTypesInner> types) {
    this.types = types;
  }

    
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
