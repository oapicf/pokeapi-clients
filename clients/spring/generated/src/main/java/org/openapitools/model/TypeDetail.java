package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.TypeGameIndex;
import org.openapitools.model.TypeGameSprite;
import org.openapitools.model.TypeName;
import org.openapitools.model.TypePastRelationships;
import org.openapitools.model.TypePokemon;
import org.openapitools.model.TypeRelationships;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Serializer for the Type resource
 */

@Schema(name = "TypeDetail", description = "Serializer for the Type resource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class TypeDetail {

  private Integer id;

  private String name;

  private TypeRelationships damageRelations;

  private List<@Valid TypePastRelationships> pastDamageRelations = new ArrayList<>();

  private List<@Valid TypeGameIndex> gameIndices = new ArrayList<>();

  private GenerationSummary generation;

  private JsonNullable<MoveDamageClassSummary> moveDamageClass = JsonNullable.<MoveDamageClassSummary>undefined();

  private List<@Valid TypeName> names = new ArrayList<>();

  private List<@Valid TypePokemon> pokemon = new ArrayList<>();

  private List<@Valid MoveSummary> moves = new ArrayList<>();

  private Map<String, Map<String, @Valid TypeGameSprite>> sprites = new HashMap<>();

  public TypeDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TypeDetail(Integer id, String name, TypeRelationships damageRelations, List<@Valid TypePastRelationships> pastDamageRelations, List<@Valid TypeGameIndex> gameIndices, GenerationSummary generation, MoveDamageClassSummary moveDamageClass, List<@Valid TypeName> names, List<@Valid TypePokemon> pokemon, List<@Valid MoveSummary> moves, Map<String, Map<String, @Valid TypeGameSprite>> sprites) {
    this.id = id;
    this.name = name;
    this.damageRelations = damageRelations;
    this.pastDamageRelations = pastDamageRelations;
    this.gameIndices = gameIndices;
    this.generation = generation;
    this.moveDamageClass = JsonNullable.of(moveDamageClass);
    this.names = names;
    this.pokemon = pokemon;
    this.moves = moves;
    this.sprites = sprites;
  }

  public TypeDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The identifier for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
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
   */
  @NotNull @Size(max = 200) 
  @Schema(name = "name", description = "The name for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
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
   */
  @Valid 
  @Schema(name = "damage_relations", accessMode = Schema.AccessMode.READ_ONLY, description = "A detail of how effective this type is toward others and vice versa.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("damage_relations")
  public TypeRelationships getDamageRelations() {
    return damageRelations;
  }

  @JsonProperty("damage_relations")
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
   */
  
  @Schema(name = "past_damage_relations", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of details of how effective this type was toward others and vice versa in previous generations", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("past_damage_relations")
  public List<@Valid TypePastRelationships> getPastDamageRelations() {
    return pastDamageRelations;
  }

  @JsonProperty("past_damage_relations")
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
   */
  
  @Schema(name = "game_indices", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of game indices relevent to this item by generation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("game_indices")
  public List<@Valid TypeGameIndex> getGameIndices() {
    return gameIndices;
  }

  @JsonProperty("game_indices")
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
   */
  @NotNull @Valid 
  @Schema(name = "generation", description = "The generation this type was introduced in.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }

  @JsonProperty("generation")
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public TypeDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = JsonNullable.of(moveDamageClass);
    return this;
  }

  /**
   * The class of damage inflicted by this type.
   * @return moveDamageClass
   */
  /* @Present */ @Valid 
  @Schema(name = "move_damage_class", description = "The class of damage inflicted by this type.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("move_damage_class")
  public JsonNullable<MoveDamageClassSummary> getMoveDamageClass() {
    return moveDamageClass;
  }

  @JsonProperty("move_damage_class")
  public void setMoveDamageClass(JsonNullable<MoveDamageClassSummary> moveDamageClass) {
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
   */
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of this resource listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid TypeName> getNames() {
    return names;
  }

  @JsonProperty("names")
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
   */
  
  @Schema(name = "pokemon", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of details of Pokémon that have this type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon")
  public List<@Valid TypePokemon> getPokemon() {
    return pokemon;
  }

  @JsonProperty("pokemon")
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
   */
  
  @Schema(name = "moves", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of moves that have this type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("moves")
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

  @JsonProperty("moves")
  public void setMoves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
  }

  public TypeDetail sprites(Map<String, Map<String, @Valid TypeGameSprite>> sprites) {
    this.sprites = sprites;
    return this;
  }

  public TypeDetail putSpritesItem(String key, Map<String, @Valid TypeGameSprite> spritesItem) {
    if (this.sprites == null) {
      this.sprites = new HashMap<>();
    }
    this.sprites.put(key, spritesItem);
    return this;
  }

  /**
   * Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
   * @return sprites
   */
  
  @Schema(name = "sprites", accessMode = Schema.AccessMode.READ_ONLY, description = "Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sprites")
  public Map<String, Map<String, @Valid TypeGameSprite>> getSprites() {
    return sprites;
  }

  @JsonProperty("sprites")
  public void setSprites(Map<String, Map<String, @Valid TypeGameSprite>> sprites) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

