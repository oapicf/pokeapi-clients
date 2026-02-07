package apimodels;

import apimodels.AbilityName;
import apimodels.GenerationSummary;
import apimodels.MoveDamageClassSummary;
import apimodels.MoveSummary;
import apimodels.TypeDetailDamageRelations;
import apimodels.TypeDetailPastDamageRelationsInner;
import apimodels.TypeDetailPokemonInner;
import apimodels.TypeDetailSpritesValueValue;
import apimodels.TypeGameIndex;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T15:23:19.397731995Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TypeDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=100)

  private String name;

  @JsonProperty("damage_relations")
  @NotNull
@Valid

  private TypeDetailDamageRelations damageRelations;

  @JsonProperty("past_damage_relations")
  @NotNull
@Valid

  private List<@Valid TypeDetailPastDamageRelationsInner> pastDamageRelations = new ArrayList<>();

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

  private List<@Valid AbilityName> names = new ArrayList<>();

  @JsonProperty("pokemon")
  @NotNull
@Valid

  private List<@Valid TypeDetailPokemonInner> pokemon = new ArrayList<>();

  @JsonProperty("moves")
  @NotNull
@Valid

  private List<@Valid MoveSummary> moves = new ArrayList<>();

  @JsonProperty("sprites")
  @NotNull
@Valid

  private Map<String, Map<String, TypeDetailSpritesValueValue>> sprites = new HashMap<>();

  public TypeDetail id(Integer id) {
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

  public TypeDetail name(String name) {
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

  public TypeDetail damageRelations(TypeDetailDamageRelations damageRelations) {
    this.damageRelations = damageRelations;
    return this;
  }

   /**
   * Get damageRelations
   * @return damageRelations
  **/
  public TypeDetailDamageRelations getDamageRelations() {
    return damageRelations;
  }

  public void setDamageRelations(TypeDetailDamageRelations damageRelations) {
    this.damageRelations = damageRelations;
  }

  public TypeDetail pastDamageRelations(List<@Valid TypeDetailPastDamageRelationsInner> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
    return this;
  }

  public TypeDetail addPastDamageRelationsItem(TypeDetailPastDamageRelationsInner pastDamageRelationsItem) {
    if (this.pastDamageRelations == null) {
      this.pastDamageRelations = new ArrayList<>();
    }
    this.pastDamageRelations.add(pastDamageRelationsItem);
    return this;
  }

   /**
   * Get pastDamageRelations
   * @return pastDamageRelations
  **/
  public List<@Valid TypeDetailPastDamageRelationsInner> getPastDamageRelations() {
    return pastDamageRelations;
  }

  public void setPastDamageRelations(List<@Valid TypeDetailPastDamageRelationsInner> pastDamageRelations) {
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
   * Get gameIndices
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
   * Get generation
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
   * Get moveDamageClass
   * @return moveDamageClass
  **/
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }

  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  public TypeDetail names(List<@Valid AbilityName> names) {
    this.names = names;
    return this;
  }

  public TypeDetail addNamesItem(AbilityName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  public List<@Valid AbilityName> getNames() {
    return names;
  }

  public void setNames(List<@Valid AbilityName> names) {
    this.names = names;
  }

  public TypeDetail pokemon(List<@Valid TypeDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  public TypeDetail addPokemonItem(TypeDetailPokemonInner pokemonItem) {
    if (this.pokemon == null) {
      this.pokemon = new ArrayList<>();
    }
    this.pokemon.add(pokemonItem);
    return this;
  }

   /**
   * Get pokemon
   * @return pokemon
  **/
  public List<@Valid TypeDetailPokemonInner> getPokemon() {
    return pokemon;
  }

  public void setPokemon(List<@Valid TypeDetailPokemonInner> pokemon) {
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
   * Get moves
   * @return moves
  **/
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

  public void setMoves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
  }

  public TypeDetail sprites(Map<String, Map<String, TypeDetailSpritesValueValue>> sprites) {
    this.sprites = sprites;
    return this;
  }

  public TypeDetail putSpritesItem(String key, Map<String, TypeDetailSpritesValueValue> spritesItem) {
    if (this.sprites == null) {
      this.sprites = new HashMap<>();
    }
    this.sprites.put(key, spritesItem);
    return this;
  }

   /**
   * Get sprites
   * @return sprites
  **/
  public Map<String, Map<String, TypeDetailSpritesValueValue>> getSprites() {
    return sprites;
  }

  public void setSprites(Map<String, Map<String, TypeDetailSpritesValueValue>> sprites) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

