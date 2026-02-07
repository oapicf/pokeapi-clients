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
import org.openapitools.model.AbilityName;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.TypeDetailDamageRelations;
import org.openapitools.model.TypeDetailPastDamageRelationsInner;
import org.openapitools.model.TypeDetailPokemonInner;
import org.openapitools.model.TypeDetailSpritesValueValue;
import org.openapitools.model.TypeGameIndex;



/**
 * Serializer for the Type resource
 **/

@ApiModel(description = "Serializer for the Type resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("damage_relations")
  private TypeDetailDamageRelations damageRelations;

  @JsonProperty("past_damage_relations")
  private List<TypeDetailPastDamageRelationsInner> pastDamageRelations = new ArrayList<>();

  @JsonProperty("game_indices")
  private List<TypeGameIndex> gameIndices = new ArrayList<>();

  @JsonProperty("generation")
  private GenerationSummary generation;

  @JsonProperty("move_damage_class")
  private MoveDamageClassSummary moveDamageClass;

  @JsonProperty("names")
  private List<AbilityName> names = new ArrayList<>();

  @JsonProperty("pokemon")
  private List<TypeDetailPokemonInner> pokemon = new ArrayList<>();

  @JsonProperty("moves")
  private List<MoveSummary> moves = new ArrayList<>();

  @JsonProperty("sprites")
  private Map<String, Map<String, TypeDetailSpritesValueValue>> sprites = new HashMap<>();

  /**
   **/
  public TypeDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public TypeDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public TypeDetail damageRelations(TypeDetailDamageRelations damageRelations) {
    this.damageRelations = damageRelations;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("damage_relations")
  public TypeDetailDamageRelations getDamageRelations() {
    return damageRelations;
  }
  public void setDamageRelations(TypeDetailDamageRelations damageRelations) {
    this.damageRelations = damageRelations;
  }

  /**
   **/
  public TypeDetail pastDamageRelations(List<TypeDetailPastDamageRelationsInner> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("past_damage_relations")
  public List<TypeDetailPastDamageRelationsInner> getPastDamageRelations() {
    return pastDamageRelations;
  }
  public void setPastDamageRelations(List<TypeDetailPastDamageRelationsInner> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
  }

  /**
   **/
  public TypeDetail gameIndices(List<TypeGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("game_indices")
  public List<TypeGameIndex> getGameIndices() {
    return gameIndices;
  }
  public void setGameIndices(List<TypeGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   **/
  public TypeDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   **/
  public TypeDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("move_damage_class")
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }
  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  /**
   **/
  public TypeDetail names(List<AbilityName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  public List<AbilityName> getNames() {
    return names;
  }
  public void setNames(List<AbilityName> names) {
    this.names = names;
  }

  /**
   **/
  public TypeDetail pokemon(List<TypeDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokemon")
  public List<TypeDetailPokemonInner> getPokemon() {
    return pokemon;
  }
  public void setPokemon(List<TypeDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
  }

  /**
   **/
  public TypeDetail moves(List<MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("moves")
  public List<MoveSummary> getMoves() {
    return moves;
  }
  public void setMoves(List<MoveSummary> moves) {
    this.moves = moves;
  }

  /**
   **/
  public TypeDetail sprites(Map<String, Map<String, TypeDetailSpritesValueValue>> sprites) {
    this.sprites = sprites;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sprites")
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

