package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Serializer for the Type resource
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Serializer for the Type resource")
public class TypeDetail   {
  
  private Integer id;

  private String name;

  private TypeDetailDamageRelations damageRelations;

  private List<@Valid TypeDetailPastDamageRelationsInner> pastDamageRelations = new ArrayList<>();

  private List<@Valid TypeGameIndex> gameIndices = new ArrayList<>();

  private GenerationSummary generation;

  private MoveDamageClassSummary moveDamageClass;

  private List<@Valid AbilityName> names = new ArrayList<>();

  private List<@Valid TypeDetailPokemonInner> pokemon = new ArrayList<>();

  private List<@Valid MoveSummary> moves = new ArrayList<>();

  private Map<String, Map<String, TypeDetailSpritesValueValue>> sprites = new HashMap<>();

  /**
   **/
  public TypeDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
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
  @NotNull
 @Size(max=100)  public String getName() {
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
  @NotNull
  public TypeDetailDamageRelations getDamageRelations() {
    return damageRelations;
  }
  public void setDamageRelations(TypeDetailDamageRelations damageRelations) {
    this.damageRelations = damageRelations;
  }


  /**
   **/
  public TypeDetail pastDamageRelations(List<@Valid TypeDetailPastDamageRelationsInner> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("past_damage_relations")
  @NotNull
  public List<@Valid TypeDetailPastDamageRelationsInner> getPastDamageRelations() {
    return pastDamageRelations;
  }
  public void setPastDamageRelations(List<@Valid TypeDetailPastDamageRelationsInner> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
  }

  public TypeDetail addPastDamageRelationsItem(TypeDetailPastDamageRelationsInner pastDamageRelationsItem) {
    if (this.pastDamageRelations == null) {
      this.pastDamageRelations = new ArrayList<>();
    }
    this.pastDamageRelations.add(pastDamageRelationsItem);
    return this;
  }


  /**
   **/
  public TypeDetail gameIndices(List<@Valid TypeGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("game_indices")
  @NotNull
  public List<@Valid TypeGameIndex> getGameIndices() {
    return gameIndices;
  }
  public void setGameIndices(List<@Valid TypeGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public TypeDetail addGameIndicesItem(TypeGameIndex gameIndicesItem) {
    if (this.gameIndices == null) {
      this.gameIndices = new ArrayList<>();
    }
    this.gameIndices.add(gameIndicesItem);
    return this;
  }


  /**
   **/
  public TypeDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("generation")
  @NotNull
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
  @NotNull
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }
  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }


  /**
   **/
  public TypeDetail names(List<@Valid AbilityName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  @NotNull
  public List<@Valid AbilityName> getNames() {
    return names;
  }
  public void setNames(List<@Valid AbilityName> names) {
    this.names = names;
  }

  public TypeDetail addNamesItem(AbilityName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }


  /**
   **/
  public TypeDetail pokemon(List<@Valid TypeDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokemon")
  @NotNull
  public List<@Valid TypeDetailPokemonInner> getPokemon() {
    return pokemon;
  }
  public void setPokemon(List<@Valid TypeDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
  }

  public TypeDetail addPokemonItem(TypeDetailPokemonInner pokemonItem) {
    if (this.pokemon == null) {
      this.pokemon = new ArrayList<>();
    }
    this.pokemon.add(pokemonItem);
    return this;
  }


  /**
   **/
  public TypeDetail moves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("moves")
  @NotNull
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }
  public void setMoves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
  }

  public TypeDetail addMovesItem(MoveSummary movesItem) {
    if (this.moves == null) {
      this.moves = new ArrayList<>();
    }
    this.moves.add(movesItem);
    return this;
  }


  /**
   **/
  public TypeDetail sprites(Map<String, Map<String, TypeDetailSpritesValueValue>> sprites) {
    this.sprites = sprites;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sprites")
  @NotNull
  public Map<String, Map<String, TypeDetailSpritesValueValue>> getSprites() {
    return sprites;
  }
  public void setSprites(Map<String, Map<String, TypeDetailSpritesValueValue>> sprites) {
    this.sprites = sprites;
  }


  public TypeDetail putSpritesItem(String key, Map<String, TypeDetailSpritesValueValue> spritesItem) {
    if (this.sprites == null) {
      this.sprites = new HashMap<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

