package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveLearnMethodSummary;
import org.openapitools.model.VersionGroupSummary;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonMoveVersionGroup
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonMoveVersionGroup {

  private Integer levelLearnedAt;

  private MoveLearnMethodSummary moveLearnMethod;

  private VersionGroupSummary versionGroup;

  private JsonNullable<Integer> order = JsonNullable.<Integer>undefined();

  public PokemonMoveVersionGroup() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonMoveVersionGroup(Integer levelLearnedAt, MoveLearnMethodSummary moveLearnMethod, VersionGroupSummary versionGroup) {
    this.levelLearnedAt = levelLearnedAt;
    this.moveLearnMethod = moveLearnMethod;
    this.versionGroup = versionGroup;
  }

  public PokemonMoveVersionGroup levelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
    return this;
  }

  /**
   * The minimum level to learn the move.
   * @return levelLearnedAt
   */
  @NotNull 
  @Schema(name = "level_learned_at", description = "The minimum level to learn the move.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("level_learned_at")
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
   */
  @NotNull @Valid 
  @Schema(name = "move_learn_method", description = "The method by which the move is learned.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("move_learn_method")
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
   */
  @NotNull @Valid 
  @Schema(name = "version_group", description = "The version group in which the move is learned.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public PokemonMoveVersionGroup order(Integer order) {
    this.order = JsonNullable.of(order);
    return this;
  }

  /**
   * Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
   * @return order
   */
  
  @Schema(name = "order", description = "Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order")
  public JsonNullable<Integer> getOrder() {
    return order;
  }

  public void setOrder(JsonNullable<Integer> order) {
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
        equalsNullable(this.order, pokemonMoveVersionGroup.order);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(levelLearnedAt, moveLearnMethod, versionGroup, hashCodeNullable(order));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

