package org.openapitools.model;

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

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Serializer for the Type resource
 **/
@ApiModel(description = "Serializer for the Type resource")
@JsonTypeName("TypeDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeDetail   {
  private Integer id;
  private String name;
  private TypeDetailDamageRelations damageRelations;
  private @Valid List<@Valid TypeDetailPastDamageRelationsInner> pastDamageRelations = new ArrayList<>();
  private @Valid List<@Valid TypeGameIndex> gameIndices = new ArrayList<>();
  private GenerationSummary generation;
  private MoveDamageClassSummary moveDamageClass;
  private @Valid List<@Valid AbilityName> names = new ArrayList<>();
  private @Valid List<@Valid TypeDetailPokemonInner> pokemon = new ArrayList<>();
  private @Valid List<@Valid MoveSummary> moves = new ArrayList<>();
  private @Valid Map<String, Map<String, TypeDetailSpritesValueValue>> sprites = new HashMap<>();

  public TypeDetail() {
  }

  @JsonCreator
  public TypeDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "damage_relations") TypeDetailDamageRelations damageRelations,
    @JsonProperty(required = true, value = "past_damage_relations") List<@Valid TypeDetailPastDamageRelationsInner> pastDamageRelations,
    @JsonProperty(required = true, value = "game_indices") List<@Valid TypeGameIndex> gameIndices,
    @JsonProperty(required = true, value = "generation") GenerationSummary generation,
    @JsonProperty(required = true, value = "move_damage_class") MoveDamageClassSummary moveDamageClass,
    @JsonProperty(required = true, value = "names") List<@Valid AbilityName> names,
    @JsonProperty(required = true, value = "pokemon") List<@Valid TypeDetailPokemonInner> pokemon,
    @JsonProperty(required = true, value = "moves") List<@Valid MoveSummary> moves,
    @JsonProperty(required = true, value = "sprites") Map<String, Map<String, TypeDetailSpritesValueValue>> sprites
  ) {
    this.id = id;
    this.name = name;
    this.damageRelations = damageRelations;
    this.pastDamageRelations = pastDamageRelations;
    this.gameIndices = gameIndices;
    this.generation = generation;
    this.moveDamageClass = moveDamageClass;
    this.names = names;
    this.pokemon = pokemon;
    this.moves = moves;
    this.sprites = sprites;
  }

  /**
   **/
  public TypeDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
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
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=100)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
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
  @JsonProperty(required = true, value = "damage_relations")
  @NotNull @Valid public TypeDetailDamageRelations getDamageRelations() {
    return damageRelations;
  }

  @JsonProperty(required = true, value = "damage_relations")
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
  @JsonProperty(required = true, value = "past_damage_relations")
  @NotNull @Valid public List<@Valid TypeDetailPastDamageRelationsInner> getPastDamageRelations() {
    return pastDamageRelations;
  }

  @JsonProperty(required = true, value = "past_damage_relations")
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

  public TypeDetail removePastDamageRelationsItem(TypeDetailPastDamageRelationsInner pastDamageRelationsItem) {
    if (pastDamageRelationsItem != null && this.pastDamageRelations != null) {
      this.pastDamageRelations.remove(pastDamageRelationsItem);
    }

    return this;
  }
  /**
   **/
  public TypeDetail gameIndices(List<@Valid TypeGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "game_indices")
  @NotNull @Valid public List<@Valid TypeGameIndex> getGameIndices() {
    return gameIndices;
  }

  @JsonProperty(required = true, value = "game_indices")
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

  public TypeDetail removeGameIndicesItem(TypeGameIndex gameIndicesItem) {
    if (gameIndicesItem != null && this.gameIndices != null) {
      this.gameIndices.remove(gameIndicesItem);
    }

    return this;
  }
  /**
   **/
  public TypeDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "generation")
  @NotNull @Valid public GenerationSummary getGeneration() {
    return generation;
  }

  @JsonProperty(required = true, value = "generation")
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
  @JsonProperty(required = true, value = "move_damage_class")
  @NotNull @Valid public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }

  @JsonProperty(required = true, value = "move_damage_class")
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
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid AbilityName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
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

  public TypeDetail removeNamesItem(AbilityName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

    return this;
  }
  /**
   **/
  public TypeDetail pokemon(List<@Valid TypeDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "pokemon")
  @NotNull @Valid public List<@Valid TypeDetailPokemonInner> getPokemon() {
    return pokemon;
  }

  @JsonProperty(required = true, value = "pokemon")
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

  public TypeDetail removePokemonItem(TypeDetailPokemonInner pokemonItem) {
    if (pokemonItem != null && this.pokemon != null) {
      this.pokemon.remove(pokemonItem);
    }

    return this;
  }
  /**
   **/
  public TypeDetail moves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "moves")
  @NotNull @Valid public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

  @JsonProperty(required = true, value = "moves")
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

  public TypeDetail removeMovesItem(MoveSummary movesItem) {
    if (movesItem != null && this.moves != null) {
      this.moves.remove(movesItem);
    }

    return this;
  }
  /**
   **/
  public TypeDetail sprites(Map<String, Map<String, TypeDetailSpritesValueValue>> sprites) {
    this.sprites = sprites;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "sprites")
  @Valid public Map<String, Map<String, TypeDetailSpritesValueValue>> getSprites() {
    return sprites;
  }

  @JsonProperty(required = true, value = "sprites")
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

  public TypeDetail removeSpritesItem(String key) {
    if (this.sprites != null) {
      this.sprites.remove(key);
    }

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

