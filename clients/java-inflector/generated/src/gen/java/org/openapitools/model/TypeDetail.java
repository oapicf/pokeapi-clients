package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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



/**
 * Serializer for the Type resource
 **/

@ApiModel(description = "Serializer for the Type resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

  /**
   * The identifier for this resource.
   **/
  public TypeDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  public TypeDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A detail of how effective this type is toward others and vice versa.
   **/
  public TypeDetail damageRelations(TypeRelationships damageRelations) {
    this.damageRelations = damageRelations;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A detail of how effective this type is toward others and vice versa.")
  @JsonProperty("damage_relations")
  public TypeRelationships getDamageRelations() {
    return damageRelations;
  }
  public void setDamageRelations(TypeRelationships damageRelations) {
    this.damageRelations = damageRelations;
  }

  /**
   * A list of details of how effective this type was toward others and vice versa in previous generations
   **/
  public TypeDetail pastDamageRelations(List<TypePastRelationships> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of details of how effective this type was toward others and vice versa in previous generations")
  @JsonProperty("past_damage_relations")
  public List<TypePastRelationships> getPastDamageRelations() {
    return pastDamageRelations;
  }
  public void setPastDamageRelations(List<TypePastRelationships> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
  }

  /**
   * A list of game indices relevent to this item by generation.
   **/
  public TypeDetail gameIndices(List<TypeGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of game indices relevent to this item by generation.")
  @JsonProperty("game_indices")
  public List<TypeGameIndex> getGameIndices() {
    return gameIndices;
  }
  public void setGameIndices(List<TypeGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   * The generation this type was introduced in.
   **/
  public TypeDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The generation this type was introduced in.")
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * The class of damage inflicted by this type.
   **/
  public TypeDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The class of damage inflicted by this type.")
  @JsonProperty("move_damage_class")
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }
  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  /**
   * The name of this resource listed in different languages.
   **/
  public TypeDetail names(List<TypeName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty("names")
  public List<TypeName> getNames() {
    return names;
  }
  public void setNames(List<TypeName> names) {
    this.names = names;
  }

  /**
   * A list of details of Pokémon that have this type.
   **/
  public TypeDetail pokemon(List<TypePokemon> pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of details of Pokémon that have this type.")
  @JsonProperty("pokemon")
  public List<TypePokemon> getPokemon() {
    return pokemon;
  }
  public void setPokemon(List<TypePokemon> pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * A list of moves that have this type.
   **/
  public TypeDetail moves(List<MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of moves that have this type.")
  @JsonProperty("moves")
  public List<MoveSummary> getMoves() {
    return moves;
  }
  public void setMoves(List<MoveSummary> moves) {
    this.moves = moves;
  }

  /**
   * Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
   **/
  public TypeDetail sprites(Map<String, Map<String, TypeGameSprite>> sprites) {
    this.sprites = sprites;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.")
  @JsonProperty("sprites")
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

