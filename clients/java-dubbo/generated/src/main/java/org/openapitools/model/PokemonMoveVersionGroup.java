package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveLearnMethodSummary;
import org.openapitools.model.VersionGroupSummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonMoveVersionGroup implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The minimum level to learn the move.
   */
  @JsonProperty("level_learned_at")
  private Integer levelLearnedAt;

  /**
   * The method by which the move is learned.
   */
  @JsonProperty("move_learn_method")
  private MoveLearnMethodSummary moveLearnMethod;

  /**
   * The version group in which the move is learned.
   */
  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  /**
   * Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
   */
  @JsonProperty("order")
  private Integer order;

  /**
   * The minimum level to learn the move.
   * @return levelLearnedAt
   */
  public Integer getLevelLearnedAt() {
    return levelLearnedAt;
  }

  public void setLevelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
  }

  /**
   * The method by which the move is learned.
   * @return moveLearnMethod
   */
  public MoveLearnMethodSummary getMoveLearnMethod() {
    return moveLearnMethod;
  }

  public void setMoveLearnMethod(MoveLearnMethodSummary moveLearnMethod) {
    this.moveLearnMethod = moveLearnMethod;
  }

  /**
   * The version group in which the move is learned.
   * @return versionGroup
   */
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
   * @return order
   */
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
