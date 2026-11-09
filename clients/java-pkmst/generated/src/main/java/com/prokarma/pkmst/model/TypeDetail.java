package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.GenerationSummary;
import com.prokarma.pkmst.model.MoveDamageClassSummary;
import com.prokarma.pkmst.model.MoveSummary;
import com.prokarma.pkmst.model.TypeGameIndex;
import com.prokarma.pkmst.model.TypeGameSprite;
import com.prokarma.pkmst.model.TypeName;
import com.prokarma.pkmst.model.TypePastRelationships;
import com.prokarma.pkmst.model.TypePokemon;
import com.prokarma.pkmst.model.TypeRelationships;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Serializer for the Type resource
 */
@ApiModel(description = "Serializer for the Type resource")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class TypeDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("damage_relations")
  private TypeRelationships damageRelations;

  @JsonProperty("past_damage_relations")
  
  private List<TypePastRelationships> pastDamageRelations = new ArrayList<>();

  @JsonProperty("game_indices")
  
  private List<TypeGameIndex> gameIndices = new ArrayList<>();

  @JsonProperty("generation")
  private GenerationSummary generation;

  @JsonProperty("move_damage_class")
  private MoveDamageClassSummary moveDamageClass;

  @JsonProperty("names")
  
  private List<TypeName> names = new ArrayList<>();

  @JsonProperty("pokemon")
  
  private List<TypePokemon> pokemon = new ArrayList<>();

  @JsonProperty("moves")
  
  private List<MoveSummary> moves = new ArrayList<>();

  @JsonProperty("sprites")
  
  private Map<String, Map<String, TypeGameSprite>> sprites = new HashMap<>();

  public TypeDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The identifier for this resource.")
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
   */
  @ApiModelProperty(required = true, value = "The name for this resource.")
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
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A detail of how effective this type is toward others and vice versa.")
  public TypeRelationships getDamageRelations() {
    return damageRelations;
  }

  public void setDamageRelations(TypeRelationships damageRelations) {
    this.damageRelations = damageRelations;
  }

  public TypeDetail pastDamageRelations(List<TypePastRelationships> pastDamageRelations) {
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
  @ApiModelProperty(required = true, readOnly = true, value = "A list of details of how effective this type was toward others and vice versa in previous generations")
  public List<TypePastRelationships> getPastDamageRelations() {
    return pastDamageRelations;
  }

  public void setPastDamageRelations(List<TypePastRelationships> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
  }

  public TypeDetail gameIndices(List<TypeGameIndex> gameIndices) {
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
  @ApiModelProperty(required = true, readOnly = true, value = "A list of game indices relevent to this item by generation.")
  public List<TypeGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<TypeGameIndex> gameIndices) {
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
  @ApiModelProperty(required = true, value = "The generation this type was introduced in.")
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
   */
  @ApiModelProperty(required = true, value = "The class of damage inflicted by this type.")
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }

  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  public TypeDetail names(List<TypeName> names) {
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
  @ApiModelProperty(required = true, readOnly = true, value = "The name of this resource listed in different languages.")
  public List<TypeName> getNames() {
    return names;
  }

  public void setNames(List<TypeName> names) {
    this.names = names;
  }

  public TypeDetail pokemon(List<TypePokemon> pokemon) {
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
  @ApiModelProperty(required = true, readOnly = true, value = "A list of details of Pokémon that have this type.")
  public List<TypePokemon> getPokemon() {
    return pokemon;
  }

  public void setPokemon(List<TypePokemon> pokemon) {
    this.pokemon = pokemon;
  }

  public TypeDetail moves(List<MoveSummary> moves) {
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
  @ApiModelProperty(required = true, readOnly = true, value = "A list of moves that have this type.")
  public List<MoveSummary> getMoves() {
    return moves;
  }

  public void setMoves(List<MoveSummary> moves) {
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
   */
  @ApiModelProperty(required = true, readOnly = true, value = "Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.")
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

