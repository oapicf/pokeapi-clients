package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.AbilityName;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.TypeDetailDamageRelations;
import org.openapitools.model.TypeDetailPastDamageRelationsInner;
import org.openapitools.model.TypeDetailPokemonInner;
import org.openapitools.model.TypeDetailSpritesValueValue;
import org.openapitools.model.TypeGameIndex;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Serializer for the Type resource
 */
@ApiModel(description="Serializer for the Type resource")

public class TypeDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private TypeDetailDamageRelations damageRelations;

  @ApiModelProperty(required = true, value = "")

  private List<TypeDetailPastDamageRelationsInner> pastDamageRelations = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<TypeGameIndex> gameIndices = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private GenerationSummary generation;

  @ApiModelProperty(required = true, value = "")

  private MoveDamageClassSummary moveDamageClass;

  @ApiModelProperty(required = true, value = "")

  private List<AbilityName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<TypeDetailPokemonInner> pokemon = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<MoveSummary> moves = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private Map<String, Map<String, TypeDetailSpritesValueValue>> sprites = new HashMap<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TypeDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get damageRelations
   * @return damageRelations
  **/
  @JsonProperty("damage_relations")
  public TypeDetailDamageRelations getDamageRelations() {
    return damageRelations;
  }

  public void setDamageRelations(TypeDetailDamageRelations damageRelations) {
    this.damageRelations = damageRelations;
  }

  public TypeDetail damageRelations(TypeDetailDamageRelations damageRelations) {
    this.damageRelations = damageRelations;
    return this;
  }

 /**
   * Get pastDamageRelations
   * @return pastDamageRelations
  **/
  @JsonProperty("past_damage_relations")
  public List<TypeDetailPastDamageRelationsInner> getPastDamageRelations() {
    return pastDamageRelations;
  }

  public void setPastDamageRelations(List<TypeDetailPastDamageRelationsInner> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
  }

  public TypeDetail pastDamageRelations(List<TypeDetailPastDamageRelationsInner> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
    return this;
  }

  public TypeDetail addPastDamageRelationsItem(TypeDetailPastDamageRelationsInner pastDamageRelationsItem) {
    this.pastDamageRelations.add(pastDamageRelationsItem);
    return this;
  }

 /**
   * Get gameIndices
   * @return gameIndices
  **/
  @JsonProperty("game_indices")
  public List<TypeGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<TypeGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public TypeDetail gameIndices(List<TypeGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  public TypeDetail addGameIndicesItem(TypeGameIndex gameIndicesItem) {
    this.gameIndices.add(gameIndicesItem);
    return this;
  }

 /**
   * Get generation
   * @return generation
  **/
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public TypeDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

 /**
   * Get moveDamageClass
   * @return moveDamageClass
  **/
  @JsonProperty("move_damage_class")
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }

  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  public TypeDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<AbilityName> getNames() {
    return names;
  }

  public void setNames(List<AbilityName> names) {
    this.names = names;
  }

  public TypeDetail names(List<AbilityName> names) {
    this.names = names;
    return this;
  }

  public TypeDetail addNamesItem(AbilityName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
   * Get pokemon
   * @return pokemon
  **/
  @JsonProperty("pokemon")
  public List<TypeDetailPokemonInner> getPokemon() {
    return pokemon;
  }

  public void setPokemon(List<TypeDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
  }

  public TypeDetail pokemon(List<TypeDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  public TypeDetail addPokemonItem(TypeDetailPokemonInner pokemonItem) {
    this.pokemon.add(pokemonItem);
    return this;
  }

 /**
   * Get moves
   * @return moves
  **/
  @JsonProperty("moves")
  public List<MoveSummary> getMoves() {
    return moves;
  }

  public void setMoves(List<MoveSummary> moves) {
    this.moves = moves;
  }

  public TypeDetail moves(List<MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  public TypeDetail addMovesItem(MoveSummary movesItem) {
    this.moves.add(movesItem);
    return this;
  }

 /**
   * Get sprites
   * @return sprites
  **/
  @JsonProperty("sprites")
  public Map<String, Map<String, TypeDetailSpritesValueValue>> getSprites() {
    return sprites;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeDetail typeDetail = (TypeDetail) o;
    return Objects.equals(this.id, typeDetail.id) &&
        Objects.equals(this.name, typeDetail.name) &&
        Objects.equals(this.damageRelations, typeDetail.damageRelations) &&
        Objects.equals(this.pastDamageRelations, typeDetail.pastDamageRelations) &&
        Objects.equals(this.gameIndices, typeDetail.gameIndices) &&
        Objects.equals(this.generation, typeDetail.generation) &&
        Objects.equals(this.moveDamageClass, typeDetail.moveDamageClass) &&
        Objects.equals(this.names, typeDetail.names) &&
        Objects.equals(this.pokemon, typeDetail.pokemon) &&
        Objects.equals(this.moves, typeDetail.moves) &&
        Objects.equals(this.sprites, typeDetail.sprites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, damageRelations, pastDamageRelations, gameIndices, generation, moveDamageClass, names, pokemon, moves, sprites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    damageRelations: ").append(toIndentedString(damageRelations)).append("\n");
    sb.append("    pastDamageRelations: ").append(toIndentedString(pastDamageRelations)).append("\n");
    sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    moveDamageClass: ").append(toIndentedString(moveDamageClass)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
    sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
    sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

