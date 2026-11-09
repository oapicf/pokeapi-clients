package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveLearnMethodSummary;
import org.openapitools.model.VersionGroupSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonMoveVersionGroup   {
  
  private Integer levelLearnedAt;
  private MoveLearnMethodSummary moveLearnMethod;
  private VersionGroupSummary versionGroup;
  private Integer order;

  /**
   * The minimum level to learn the move.
   **/
  
  @ApiModelProperty(required = true, value = "The minimum level to learn the move.")
  @JsonProperty("level_learned_at")
  @NotNull
  public Integer getLevelLearnedAt() {
    return levelLearnedAt;
  }
  public void setLevelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
  }

  /**
   * The method by which the move is learned.
   **/
  
  @ApiModelProperty(required = true, value = "The method by which the move is learned.")
  @JsonProperty("move_learn_method")
  @NotNull
  @Valid
  public MoveLearnMethodSummary getMoveLearnMethod() {
    return moveLearnMethod;
  }
  public void setMoveLearnMethod(MoveLearnMethodSummary moveLearnMethod) {
    this.moveLearnMethod = moveLearnMethod;
  }

  /**
   * The version group in which the move is learned.
   **/
  
  @ApiModelProperty(required = true, value = "The version group in which the move is learned.")
  @JsonProperty("version_group")
  @NotNull
  @Valid
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
   **/
  
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

