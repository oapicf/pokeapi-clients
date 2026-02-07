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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  @Valid
  private TypeDetailDamageRelations damageRelations;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid TypeDetailPastDamageRelationsInner> pastDamageRelations = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid TypeGameIndex> gameIndices = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private GenerationSummary generation;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private MoveDamageClassSummary moveDamageClass;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AbilityName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid TypeDetailPokemonInner> pokemon = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid MoveSummary> moves = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Map<String, Map<String, TypeDetailSpritesValueValue>> sprites = new HashMap<>();
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public TypeDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public TypeDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get damageRelations
  * @return damageRelations
  */
  @JsonProperty("damage_relations")
  @NotNull
  public TypeDetailDamageRelations getDamageRelations() {
    return damageRelations;
  }

  /**
   * Sets the <code>damageRelations</code> property.
   */
 public void setDamageRelations(TypeDetailDamageRelations damageRelations) {
    this.damageRelations = damageRelations;
  }

  /**
   * Sets the <code>damageRelations</code> property.
   */
  public TypeDetail damageRelations(TypeDetailDamageRelations damageRelations) {
    this.damageRelations = damageRelations;
    return this;
  }

 /**
  * Get pastDamageRelations
  * @return pastDamageRelations
  */
  @JsonProperty("past_damage_relations")
  @NotNull
  public List<@Valid TypeDetailPastDamageRelationsInner> getPastDamageRelations() {
    return pastDamageRelations;
  }

  /**
   * Sets the <code>pastDamageRelations</code> property.
   */
 public void setPastDamageRelations(List<@Valid TypeDetailPastDamageRelationsInner> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
  }

  /**
   * Sets the <code>pastDamageRelations</code> property.
   */
  public TypeDetail pastDamageRelations(List<@Valid TypeDetailPastDamageRelationsInner> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
    return this;
  }

  /**
   * Adds a new item to the <code>pastDamageRelations</code> list.
   */
  public TypeDetail addPastDamageRelationsItem(TypeDetailPastDamageRelationsInner pastDamageRelationsItem) {
    this.pastDamageRelations.add(pastDamageRelationsItem);
    return this;
  }

 /**
  * Get gameIndices
  * @return gameIndices
  */
  @JsonProperty("game_indices")
  @NotNull
  public List<@Valid TypeGameIndex> getGameIndices() {
    return gameIndices;
  }

  /**
   * Sets the <code>gameIndices</code> property.
   */
 public void setGameIndices(List<@Valid TypeGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   * Sets the <code>gameIndices</code> property.
   */
  public TypeDetail gameIndices(List<@Valid TypeGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  /**
   * Adds a new item to the <code>gameIndices</code> list.
   */
  public TypeDetail addGameIndicesItem(TypeGameIndex gameIndicesItem) {
    this.gameIndices.add(gameIndicesItem);
    return this;
  }

 /**
  * Get generation
  * @return generation
  */
  @JsonProperty("generation")
  @NotNull
  public GenerationSummary getGeneration() {
    return generation;
  }

  /**
   * Sets the <code>generation</code> property.
   */
 public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * Sets the <code>generation</code> property.
   */
  public TypeDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

 /**
  * Get moveDamageClass
  * @return moveDamageClass
  */
  @JsonProperty("move_damage_class")
  @NotNull
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }

  /**
   * Sets the <code>moveDamageClass</code> property.
   */
 public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  /**
   * Sets the <code>moveDamageClass</code> property.
   */
  public TypeDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid AbilityName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid AbilityName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public TypeDetail names(List<@Valid AbilityName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public TypeDetail addNamesItem(AbilityName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
  * Get pokemon
  * @return pokemon
  */
  @JsonProperty("pokemon")
  @NotNull
  public List<@Valid TypeDetailPokemonInner> getPokemon() {
    return pokemon;
  }

  /**
   * Sets the <code>pokemon</code> property.
   */
 public void setPokemon(List<@Valid TypeDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * Sets the <code>pokemon</code> property.
   */
  public TypeDetail pokemon(List<@Valid TypeDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  /**
   * Adds a new item to the <code>pokemon</code> list.
   */
  public TypeDetail addPokemonItem(TypeDetailPokemonInner pokemonItem) {
    this.pokemon.add(pokemonItem);
    return this;
  }

 /**
  * Get moves
  * @return moves
  */
  @JsonProperty("moves")
  @NotNull
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

  /**
   * Sets the <code>moves</code> property.
   */
 public void setMoves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
  }

  /**
   * Sets the <code>moves</code> property.
   */
  public TypeDetail moves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  /**
   * Adds a new item to the <code>moves</code> list.
   */
  public TypeDetail addMovesItem(MoveSummary movesItem) {
    this.moves.add(movesItem);
    return this;
  }

 /**
  * Get sprites
  * @return sprites
  */
  @JsonProperty("sprites")
  @NotNull
  public Map<String, Map<String, TypeDetailSpritesValueValue>> getSprites() {
    return sprites;
  }

  /**
   * Sets the <code>sprites</code> property.
   * <br><em>N.B. <code>sprites</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setSprites(Map<String, Map<String, TypeDetailSpritesValueValue>> sprites) {
    this.sprites = sprites;
  }

  /**
   * Sets the <code>sprites</code> property.
   * <br><em>N.B. <code>sprites</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public TypeDetail sprites(Map<String, Map<String, TypeDetailSpritesValueValue>> sprites) {
    this.sprites = sprites;
    return this;
  }

  /**
   * Puts a new item into the <code>sprites</code> map.
   * <br><em>N.B. <code>sprites</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public TypeDetail putSpritesItem(String key, Map<String, TypeDetailSpritesValueValue> spritesItem) {
    this.sprites.put(key, spritesItem);
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

