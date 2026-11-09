/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**](https://github.com/phalt) and other [**PokéAPI contributors**](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.
 *
 * OpenAPI document version: 2.10.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveLearnMethodSummary;
import org.openapitools.model.VersionGroupSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-11-09T13:49:34.675912514Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonMoveVersionGroup   {
  
  private Integer levelLearnedAt;
  private MoveLearnMethodSummary moveLearnMethod;
  private VersionGroupSummary versionGroup;
  private Integer order;

  /**
   * The minimum level to learn the move.
   */
  public PokemonMoveVersionGroup levelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The minimum level to learn the move.")
  @JsonProperty("level_learned_at")
  public Integer getLevelLearnedAt() {
    return levelLearnedAt;
  }
  public void setLevelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
  }

  /**
   * The method by which the move is learned.
   */
  public PokemonMoveVersionGroup moveLearnMethod(MoveLearnMethodSummary moveLearnMethod) {
    this.moveLearnMethod = moveLearnMethod;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The method by which the move is learned.")
  @JsonProperty("move_learn_method")
  public MoveLearnMethodSummary getMoveLearnMethod() {
    return moveLearnMethod;
  }
  public void setMoveLearnMethod(MoveLearnMethodSummary moveLearnMethod) {
    this.moveLearnMethod = moveLearnMethod;
  }

  /**
   * The version group in which the move is learned.
   */
  public PokemonMoveVersionGroup versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version group in which the move is learned.")
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
   */
  public PokemonMoveVersionGroup order(Integer order) {
    this.order = order;
    return this;
  }

  
  @ApiModelProperty(value = "Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonMoveVersionGroup pokemonMoveVersionGroup = (PokemonMoveVersionGroup) o;
    return Objects.equals(levelLearnedAt, pokemonMoveVersionGroup.levelLearnedAt) &&
        Objects.equals(moveLearnMethod, pokemonMoveVersionGroup.moveLearnMethod) &&
        Objects.equals(versionGroup, pokemonMoveVersionGroup.versionGroup) &&
        Objects.equals(order, pokemonMoveVersionGroup.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(levelLearnedAt, moveLearnMethod, versionGroup, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonMoveVersionGroup {\n");
    
    sb.append("    levelLearnedAt: ").append(toIndentedString(levelLearnedAt)).append("\n");
    sb.append("    moveLearnMethod: ").append(toIndentedString(moveLearnMethod)).append("\n");
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

