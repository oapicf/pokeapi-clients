package org.openapitools.model;

import org.openapitools.model.GenerationSummary;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.TypeGameIndex;
import org.openapitools.model.TypeGameSprite;
import org.openapitools.model.TypeName;
import org.openapitools.model.TypePastRelationships;
import org.openapitools.model.TypePokemon;
import org.openapitools.model.TypeRelationships;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

/**
 * Serializer for the Type resource
 */
public class TypeDetail implements Serializable {
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
   * A detail of how effective this type is toward others and vice versa.
   */
  @JsonProperty("damage_relations")
  private TypeRelationships damageRelations;

  /**
   * A list of details of how effective this type was toward others and vice versa in previous generations
   */
  @JsonProperty("past_damage_relations")
  private List<TypePastRelationships> pastDamageRelations = new ArrayList<>();

  /**
   * A list of game indices relevent to this item by generation.
   */
  @JsonProperty("game_indices")
  private List<TypeGameIndex> gameIndices = new ArrayList<>();

  /**
   * The generation this type was introduced in.
   */
  @JsonProperty("generation")
  private GenerationSummary generation;

  /**
   * The class of damage inflicted by this type.
   */
  @JsonProperty("move_damage_class")
  private MoveDamageClassSummary moveDamageClass;

  /**
   * The name of this resource listed in different languages.
   */
  @JsonProperty("names")
  private List<TypeName> names = new ArrayList<>();

  /**
   * A list of details of Pokémon that have this type.
   */
  @JsonProperty("pokemon")
  private List<TypePokemon> pokemon = new ArrayList<>();

  /**
   * A list of moves that have this type.
   */
  @JsonProperty("moves")
  private List<MoveSummary> moves = new ArrayList<>();

  /**
   * Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
   */
  @JsonProperty("sprites")
  private Map<String, Map<String, TypeGameSprite>> sprites = new HashMap<>();

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
   * A detail of how effective this type is toward others and vice versa.
   * @return damageRelations
   */
  public TypeRelationships getDamageRelations() {
    return damageRelations;
  }

  public void setDamageRelations(TypeRelationships damageRelations) {
    this.damageRelations = damageRelations;
  }

  /**
   * A list of details of how effective this type was toward others and vice versa in previous generations
   * @return pastDamageRelations
   */
  public List<TypePastRelationships> getPastDamageRelations() {
    return pastDamageRelations;
  }

  public void setPastDamageRelations(List<TypePastRelationships> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
  }

  /**
   * A list of game indices relevent to this item by generation.
   * @return gameIndices
   */
  public List<TypeGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<TypeGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   * The generation this type was introduced in.
   * @return generation
   */
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * The class of damage inflicted by this type.
   * @return moveDamageClass
   */
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }

  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
  public List<TypeName> getNames() {
    return names;
  }

  public void setNames(List<TypeName> names) {
    this.names = names;
  }

  /**
   * A list of details of Pokémon that have this type.
   * @return pokemon
   */
  public List<TypePokemon> getPokemon() {
    return pokemon;
  }

  public void setPokemon(List<TypePokemon> pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * A list of moves that have this type.
   * @return moves
   */
  public List<MoveSummary> getMoves() {
    return moves;
  }

  public void setMoves(List<MoveSummary> moves) {
    this.moves = moves;
  }

  /**
   * Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
   * @return sprites
   */
  public Map<String, Map<String, TypeGameSprite>> getSprites() {
    return sprites;
  }

  public void setSprites(Map<String, Map<String, TypeGameSprite>> sprites) {
    this.sprites = sprites;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
