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
 */
@ApiModel(description = "Serializer for the Type resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class TypeDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("damage_relations")
  private TypeRelationships damageRelations;

  @JsonProperty("past_damage_relations")
  private List<@Valid TypePastRelationships> pastDamageRelations = new ArrayList<>();

  @JsonProperty("game_indices")
  private List<@Valid TypeGameIndex> gameIndices = new ArrayList<>();

  @JsonProperty("generation")
  private GenerationSummary generation;

  @JsonProperty("move_damage_class")
  private MoveDamageClassSummary moveDamageClass;

  @JsonProperty("names")
  private List<@Valid TypeName> names = new ArrayList<>();

  @JsonProperty("pokemon")
  private List<@Valid TypePokemon> pokemon = new ArrayList<>();

  @JsonProperty("moves")
  private List<@Valid MoveSummary> moves = new ArrayList<>();

  @JsonProperty("sprites")
  private Map<String, Map<String, @Valid TypeGameSprite>> sprites = new HashMap<>();

   /**
   * The identifier for this resource.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public TypeDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this resource.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name for this resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * A detail of how effective this type is toward others and vice versa.
   * @return damageRelations
  **/
  @ApiModelProperty(required = true, value = "A detail of how effective this type is toward others and vice versa.")
  public TypeRelationships getDamageRelations() {
    return damageRelations;
  }

   /**
   * A list of details of how effective this type was toward others and vice versa in previous generations
   * @return pastDamageRelations
  **/
  @ApiModelProperty(required = true, value = "A list of details of how effective this type was toward others and vice versa in previous generations")
  public List<@Valid TypePastRelationships> getPastDamageRelations() {
    return pastDamageRelations;
  }

   /**
   * A list of game indices relevent to this item by generation.
   * @return gameIndices
  **/
  @ApiModelProperty(required = true, value = "A list of game indices relevent to this item by generation.")
  public List<@Valid TypeGameIndex> getGameIndices() {
    return gameIndices;
  }

  public TypeDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

   /**
   * The generation this type was introduced in.
   * @return generation
  **/
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
  **/
  @ApiModelProperty(required = true, value = "The class of damage inflicted by this type.")
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }

  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

   /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  public List<@Valid TypeName> getNames() {
    return names;
  }

   /**
   * A list of details of Pokémon that have this type.
   * @return pokemon
  **/
  @ApiModelProperty(required = true, value = "A list of details of Pokémon that have this type.")
  public List<@Valid TypePokemon> getPokemon() {
    return pokemon;
  }

   /**
   * A list of moves that have this type.
   * @return moves
  **/
  @ApiModelProperty(required = true, value = "A list of moves that have this type.")
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

   /**
   * Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
   * @return sprites
  **/
  @ApiModelProperty(required = true, value = "Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.")
  public Map<String, Map<String, @Valid TypeGameSprite>> getSprites() {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

