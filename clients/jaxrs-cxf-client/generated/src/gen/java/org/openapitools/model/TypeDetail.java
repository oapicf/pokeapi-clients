package org.openapitools.model;

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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Serializer for the Type resource
 */
@ApiModel(description="Serializer for the Type resource")

public class TypeDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")

  private Integer id;

 /**
  * The name for this resource.
  */
  @ApiModelProperty(required = true, value = "The name for this resource.")

  private String name;

 /**
  * A detail of how effective this type is toward others and vice versa.
  */
  @ApiModelProperty(required = true, value = "A detail of how effective this type is toward others and vice versa.")

  private TypeRelationships damageRelations;

 /**
  * A list of details of how effective this type was toward others and vice versa in previous generations
  */
  @ApiModelProperty(required = true, value = "A list of details of how effective this type was toward others and vice versa in previous generations")

  private List<TypePastRelationships> pastDamageRelations = new ArrayList<>();

 /**
  * A list of game indices relevent to this item by generation.
  */
  @ApiModelProperty(required = true, value = "A list of game indices relevent to this item by generation.")

  private List<TypeGameIndex> gameIndices = new ArrayList<>();

 /**
  * The generation this type was introduced in.
  */
  @ApiModelProperty(required = true, value = "The generation this type was introduced in.")

  private GenerationSummary generation;

 /**
  * The class of damage inflicted by this type.
  */
  @ApiModelProperty(required = true, value = "The class of damage inflicted by this type.")

  private MoveDamageClassSummary moveDamageClass;

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")

  private List<TypeName> names = new ArrayList<>();

 /**
  * A list of details of Pokémon that have this type.
  */
  @ApiModelProperty(required = true, value = "A list of details of Pokémon that have this type.")

  private List<TypePokemon> pokemon = new ArrayList<>();

 /**
  * A list of moves that have this type.
  */
  @ApiModelProperty(required = true, value = "A list of moves that have this type.")

  private List<MoveSummary> moves = new ArrayList<>();

 /**
  * Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
  */
  @ApiModelProperty(required = true, value = "Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.")

  private Map<String, Map<String, TypeGameSprite>> sprites = new HashMap<>();
 /**
   * The identifier for this resource.
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * The name for this resource.
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
   * A detail of how effective this type is toward others and vice versa.
   * @return damageRelations
  **/
  @JsonProperty("damage_relations")
  public TypeRelationships getDamageRelations() {
    return damageRelations;
  }


 /**
   * A list of details of how effective this type was toward others and vice versa in previous generations
   * @return pastDamageRelations
  **/
  @JsonProperty("past_damage_relations")
  public List<TypePastRelationships> getPastDamageRelations() {
    return pastDamageRelations;
  }


 /**
   * A list of game indices relevent to this item by generation.
   * @return gameIndices
  **/
  @JsonProperty("game_indices")
  public List<TypeGameIndex> getGameIndices() {
    return gameIndices;
  }


 /**
   * The generation this type was introduced in.
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
   * The class of damage inflicted by this type.
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
   * The name of this resource listed in different languages.
   * @return names
  **/
  @JsonProperty("names")
  public List<TypeName> getNames() {
    return names;
  }


 /**
   * A list of details of Pokémon that have this type.
   * @return pokemon
  **/
  @JsonProperty("pokemon")
  public List<TypePokemon> getPokemon() {
    return pokemon;
  }


 /**
   * A list of moves that have this type.
   * @return moves
  **/
  @JsonProperty("moves")
  public List<MoveSummary> getMoves() {
    return moves;
  }


 /**
   * Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
   * @return sprites
  **/
  @JsonProperty("sprites")
  public Map<String, Map<String, TypeGameSprite>> getSprites() {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

