package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StatDetailAffectingMovesIncreaseInner
 */

@JsonTypeName("StatDetail_affecting_moves_increase_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T02:00:43.960184425Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class StatDetailAffectingMovesIncreaseInner {

  private Integer change;

  private AbilityDetailPokemonInnerPokemon move;

  public StatDetailAffectingMovesIncreaseInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StatDetailAffectingMovesIncreaseInner(Integer change, AbilityDetailPokemonInnerPokemon move) {
    this.change = change;
    this.move = move;
  }

  public StatDetailAffectingMovesIncreaseInner change(Integer change) {
    this.change = change;
    return this;
  }

  /**
   * Get change
   * @return change
   */
  @NotNull 
  @Schema(name = "change", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("change")
  public Integer getChange() {
    return change;
  }

  @JsonProperty("change")
  public void setChange(Integer change) {
    this.change = change;
  }

  public StatDetailAffectingMovesIncreaseInner move(AbilityDetailPokemonInnerPokemon move) {
    this.move = move;
    return this;
  }

  /**
   * Get move
   * @return move
   */
  @NotNull @Valid 
  @Schema(name = "move", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("move")
  public AbilityDetailPokemonInnerPokemon getMove() {
    return move;
  }

  @JsonProperty("move")
  public void setMove(AbilityDetailPokemonInnerPokemon move) {
    this.move = move;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatDetailAffectingMovesIncreaseInner statDetailAffectingMovesIncreaseInner = (StatDetailAffectingMovesIncreaseInner) o;
    return Objects.equals(this.change, statDetailAffectingMovesIncreaseInner.change) &&
        Objects.equals(this.move, statDetailAffectingMovesIncreaseInner.move);
  }

  @Override
  public int hashCode() {
    return Objects.hash(change, move);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatDetailAffectingMovesIncreaseInner {\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    move: ").append(toIndentedString(move)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

