package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.MoveSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MoveStatChange
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveStatChange {

  private Integer change;

  private MoveSummary move;

  public MoveStatChange() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveStatChange(Integer change, MoveSummary move) {
    this.change = change;
    this.move = move;
  }

  public MoveStatChange change(Integer change) {
    this.change = change;
    return this;
  }

  /**
   * The maximum amount of change to the referenced stat.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return change
   */
  @NotNull @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "change", description = "The maximum amount of change to the referenced stat.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("change")
  public Integer getChange() {
    return change;
  }

  public void setChange(Integer change) {
    this.change = change;
  }

  public MoveStatChange move(MoveSummary move) {
    this.move = move;
    return this;
  }

  /**
   * The move causing the change.
   * @return move
   */
  @NotNull @Valid 
  @Schema(name = "move", description = "The move causing the change.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("move")
  public MoveSummary getMove() {
    return move;
  }

  public void setMove(MoveSummary move) {
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
    MoveStatChange moveStatChange = (MoveStatChange) o;
    return Objects.equals(this.change, moveStatChange.change) &&
        Objects.equals(this.move, moveStatChange.move);
  }

  @Override
  public int hashCode() {
    return Objects.hash(change, move);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveStatChange {\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    move: ").append(toIndentedString(move)).append("\n");
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

