package apimodels;

import apimodels.GenerationSummary;
import apimodels.MoveDamageClassSummary;
import apimodels.MoveSummary;
import apimodels.TypeGameIndex;
import apimodels.TypeGameSprite;
import apimodels.TypeName;
import apimodels.TypePastRelationships;
import apimodels.TypePokemon;
import apimodels.TypeRelationships;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Serializer for the Type resource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TypeDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("damage_relations")
  @NotNull
@Valid

  private TypeRelationships damageRelations;

  @JsonProperty("past_damage_relations")
  @NotNull
@Valid

  private List<@Valid TypePastRelationships> pastDamageRelations = new ArrayList<>();

  @JsonProperty("game_indices")
  @NotNull
@Valid

  private List<@Valid TypeGameIndex> gameIndices = new ArrayList<>();

  @JsonProperty("generation")
  @NotNull
@Valid

  private GenerationSummary generation;

  @JsonProperty("move_damage_class")
  @NotNull
@Valid

  private MoveDamageClassSummary moveDamageClass;

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid TypeName> names = new ArrayList<>();

  @JsonProperty("pokemon")
  @NotNull
@Valid

  private List<@Valid TypePokemon> pokemon = new ArrayList<>();

  @JsonProperty("moves")
  @NotNull
@Valid

  private List<@Valid MoveSummary> moves = new ArrayList<>();

  @JsonProperty("sprites")
  @NotNull
@Valid

  private Map<String, Map<String, TypeGameSprite>> sprites = new HashMap<>();

  public TypeDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier for this resource.
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TypeDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this resource.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TypeDetail damageRelations(TypeRelationships damageRelations) {
    this.damageRelations = damageRelations;
    return this;
  }

   /**
   * A detail of how effective this type is toward others and vice versa.
   * @return damageRelations
  **/
  public TypeRelationships getDamageRelations() {
    return damageRelations;
  }

  public void setDamageRelations(TypeRelationships damageRelations) {
    this.damageRelations = damageRelations;
  }

  public TypeDetail pastDamageRelations(List<@Valid TypePastRelationships> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
    return this;
  }

  public TypeDetail addPastDamageRelationsItem(TypePastRelationships pastDamageRelationsItem) {
    if (this.pastDamageRelations == null) {
      this.pastDamageRelations = new ArrayList<>();
    }
    this.pastDamageRelations.add(pastDamageRelationsItem);
    return this;
  }

   /**
   * A list of details of how effective this type was toward others and vice versa in previous generations
   * @return pastDamageRelations
  **/
  public List<@Valid TypePastRelationships> getPastDamageRelations() {
    return pastDamageRelations;
  }

  public void setPastDamageRelations(List<@Valid TypePastRelationships> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
  }

  public TypeDetail gameIndices(List<@Valid TypeGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  public TypeDetail addGameIndicesItem(TypeGameIndex gameIndicesItem) {
    if (this.gameIndices == null) {
      this.gameIndices = new ArrayList<>();
    }
    this.gameIndices.add(gameIndicesItem);
    return this;
  }

   /**
   * A list of game indices relevent to this item by generation.
   * @return gameIndices
  **/
  public List<@Valid TypeGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<@Valid TypeGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public TypeDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

   /**
   * The generation this type was introduced in.
   * @return generation
  **/
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public TypeDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
    return this;
  }

   /**
   * The class of damage inflicted by this type.
   * @return moveDamageClass
  **/
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }

  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  public TypeDetail names(List<@Valid TypeName> names) {
    this.names = names;
    return this;
  }

  public TypeDetail addNamesItem(TypeName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  public List<@Valid TypeName> getNames() {
    return names;
  }

  public void setNames(List<@Valid TypeName> names) {
    this.names = names;
  }

  public TypeDetail pokemon(List<@Valid TypePokemon> pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  public TypeDetail addPokemonItem(TypePokemon pokemonItem) {
    if (this.pokemon == null) {
      this.pokemon = new ArrayList<>();
    }
    this.pokemon.add(pokemonItem);
    return this;
  }

   /**
   * A list of details of Pokémon that have this type.
   * @return pokemon
  **/
  public List<@Valid TypePokemon> getPokemon() {
    return pokemon;
  }

  public void setPokemon(List<@Valid TypePokemon> pokemon) {
    this.pokemon = pokemon;
  }

  public TypeDetail moves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  public TypeDetail addMovesItem(MoveSummary movesItem) {
    if (this.moves == null) {
      this.moves = new ArrayList<>();
    }
    this.moves.add(movesItem);
    return this;
  }

   /**
   * A list of moves that have this type.
   * @return moves
  **/
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

  public void setMoves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
  }

  public TypeDetail sprites(Map<String, Map<String, TypeGameSprite>> sprites) {
    this.sprites = sprites;
    return this;
  }

  public TypeDetail putSpritesItem(String key, Map<String, TypeGameSprite> spritesItem) {
    if (this.sprites == null) {
      this.sprites = new HashMap<>();
    }
    this.sprites.put(key, spritesItem);
    return this;
  }

   /**
   * Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
   * @return sprites
  **/
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
    return Objects.equals(id, typeDetail.id) &&
        Objects.equals(name, typeDetail.name) &&
        Objects.equals(damageRelations, typeDetail.damageRelations) &&
        Objects.equals(pastDamageRelations, typeDetail.pastDamageRelations) &&
        Objects.equals(gameIndices, typeDetail.gameIndices) &&
        Objects.equals(generation, typeDetail.generation) &&
        Objects.equals(moveDamageClass, typeDetail.moveDamageClass) &&
        Objects.equals(names, typeDetail.names) &&
        Objects.equals(pokemon, typeDetail.pokemon) &&
        Objects.equals(moves, typeDetail.moves) &&
        Objects.equals(sprites, typeDetail.sprites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, damageRelations, pastDamageRelations, gameIndices, generation, moveDamageClass, names, pokemon, moves, sprites);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

