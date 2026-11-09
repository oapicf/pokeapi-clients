package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveLearnMethodSummary;
import org.openapitools.model.VersionGroupSummary;

/**
 * PokemonMoveVersionGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonMoveVersionGroup   {
  @JsonProperty("level_learned_at")
  private Integer levelLearnedAt;

  @JsonProperty("move_learn_method")
  private MoveLearnMethodSummary moveLearnMethod;

  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  @JsonProperty("order")
  private Integer order;

  public PokemonMoveVersionGroup levelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
    return this;
  }

   /**
   * The minimum level to learn the move.
   * @return levelLearnedAt
  **/
  @ApiModelProperty(required = true, value = "The minimum level to learn the move.")
  public Integer getLevelLearnedAt() {
    return levelLearnedAt;
  }

  public void setLevelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
  }

  public PokemonMoveVersionGroup moveLearnMethod(MoveLearnMethodSummary moveLearnMethod) {
    this.moveLearnMethod = moveLearnMethod;
    return this;
  }

   /**
   * The method by which the move is learned.
   * @return moveLearnMethod
  **/
  @ApiModelProperty(required = true, value = "The method by which the move is learned.")
  public MoveLearnMethodSummary getMoveLearnMethod() {
    return moveLearnMethod;
  }

  public void setMoveLearnMethod(MoveLearnMethodSummary moveLearnMethod) {
    this.moveLearnMethod = moveLearnMethod;
  }

  public PokemonMoveVersionGroup versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

   /**
   * The version group in which the move is learned.
   * @return versionGroup
  **/
  @ApiModelProperty(required = true, value = "The version group in which the move is learned.")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public PokemonMoveVersionGroup order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
   * @return order
  **/
  @ApiModelProperty(value = "Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.")
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
    return Objects.equals(this.levelLearnedAt, pokemonMoveVersionGroup.levelLearnedAt) &&
        Objects.equals(this.moveLearnMethod, pokemonMoveVersionGroup.moveLearnMethod) &&
        Objects.equals(this.versionGroup, pokemonMoveVersionGroup.versionGroup) &&
        Objects.equals(this.order, pokemonMoveVersionGroup.order);
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

