package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import io.swagger.annotations.*;

@ApiModel(description="Serializer for the Type resource")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-07T04:17:47.675703185Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("damage_relations")
  @NotNull
  @Valid
  public TypeDetailDamageRelations getDamageRelations() {
    return damageRelations;
  }
  public void setDamageRelations(TypeDetailDamageRelations damageRelations) {
    this.damageRelations = damageRelations;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("past_damage_relations")
  @NotNull
  @Valid
  public List<@Valid TypeDetailPastDamageRelationsInner> getPastDamageRelations() {
    return pastDamageRelations;
  }
  public void setPastDamageRelations(List<@Valid TypeDetailPastDamageRelationsInner> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("game_indices")
  @NotNull
  @Valid
  public List<@Valid TypeGameIndex> getGameIndices() {
    return gameIndices;
  }
  public void setGameIndices(List<@Valid TypeGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("generation")
  @NotNull
  @Valid
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("move_damage_class")
  @NotNull
  @Valid
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }
  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  @NotNull
  @Valid
  public List<@Valid AbilityName> getNames() {
    return names;
  }
  public void setNames(List<@Valid AbilityName> names) {
    this.names = names;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokemon")
  @NotNull
  @Valid
  public List<@Valid TypeDetailPokemonInner> getPokemon() {
    return pokemon;
  }
  public void setPokemon(List<@Valid TypeDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("moves")
  @NotNull
  @Valid
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }
  public void setMoves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sprites")
  @NotNull
  @Valid
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

