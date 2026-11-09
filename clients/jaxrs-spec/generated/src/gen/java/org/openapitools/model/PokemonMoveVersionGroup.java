package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveLearnMethodSummary;
import org.openapitools.model.VersionGroupSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonMoveVersionGroup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonMoveVersionGroup   {
  private Integer levelLearnedAt;
  private MoveLearnMethodSummary moveLearnMethod;
  private VersionGroupSummary versionGroup;
  private Integer order;

  public PokemonMoveVersionGroup() {
  }

  @JsonCreator
  public PokemonMoveVersionGroup(
    @JsonProperty(required = true, value = "level_learned_at") Integer levelLearnedAt,
    @JsonProperty(required = true, value = "move_learn_method") MoveLearnMethodSummary moveLearnMethod,
    @JsonProperty(required = true, value = "version_group") VersionGroupSummary versionGroup
  ) {
    this.levelLearnedAt = levelLearnedAt;
    this.moveLearnMethod = moveLearnMethod;
    this.versionGroup = versionGroup;
  }

  /**
   * The minimum level to learn the move.
   **/
  public PokemonMoveVersionGroup levelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The minimum level to learn the move.")
  @JsonProperty(required = true, value = "level_learned_at")
  @NotNull public Integer getLevelLearnedAt() {
    return levelLearnedAt;
  }

  @JsonProperty(required = true, value = "level_learned_at")
  public void setLevelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
  }

  /**
   * The method by which the move is learned.
   **/
  public PokemonMoveVersionGroup moveLearnMethod(MoveLearnMethodSummary moveLearnMethod) {
    this.moveLearnMethod = moveLearnMethod;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The method by which the move is learned.")
  @JsonProperty(required = true, value = "move_learn_method")
  @NotNull @Valid public MoveLearnMethodSummary getMoveLearnMethod() {
    return moveLearnMethod;
  }

  @JsonProperty(required = true, value = "move_learn_method")
  public void setMoveLearnMethod(MoveLearnMethodSummary moveLearnMethod) {
    this.moveLearnMethod = moveLearnMethod;
  }

  /**
   * The version group in which the move is learned.
   **/
  public PokemonMoveVersionGroup versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version group in which the move is learned.")
  @JsonProperty(required = true, value = "version_group")
  @NotNull @Valid public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty(required = true, value = "version_group")
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
   **/
  public PokemonMoveVersionGroup order(Integer order) {
    this.order = order;
    return this;
  }

  
  @ApiModelProperty(value = "Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }

  @JsonProperty("order")
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
