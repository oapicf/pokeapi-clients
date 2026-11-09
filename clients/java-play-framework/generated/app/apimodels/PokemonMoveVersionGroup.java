package apimodels;

import apimodels.MoveLearnMethodSummary;
import apimodels.VersionGroupSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonMoveVersionGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonMoveVersionGroup   {
  @JsonProperty("level_learned_at")
  @NotNull

  private Integer levelLearnedAt;

  @JsonProperty("move_learn_method")
  @NotNull
@Valid

  private MoveLearnMethodSummary moveLearnMethod;

  @JsonProperty("version_group")
  @NotNull
@Valid

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

  @SuppressWarnings("StringBufferReplaceableByString")
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

