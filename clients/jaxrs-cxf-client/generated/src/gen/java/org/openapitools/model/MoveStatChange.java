package org.openapitools.model;

import org.openapitools.model.MoveSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveStatChange  {
  
 /**
  * The maximum amount of change to the referenced stat.
  */
  @ApiModelProperty(required = true, value = "The maximum amount of change to the referenced stat.")

  private Integer change;

 /**
  * The move causing the change.
  */
  @ApiModelProperty(required = true, value = "The move causing the change.")

  private MoveSummary move;
 /**
   * The maximum amount of change to the referenced stat.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return change
  **/
  @JsonProperty("change")
  public Integer getChange() {
    return change;
  }

  public void setChange(Integer change) {
    this.change = change;
  }

  public MoveStatChange change(Integer change) {
    this.change = change;
    return this;
  }

 /**
   * The move causing the change.
   * @return move
  **/
  @JsonProperty("move")
  public MoveSummary getMove() {
    return move;
  }

  public void setMove(MoveSummary move) {
    this.move = move;
  }

  public MoveStatChange move(MoveSummary move) {
    this.move = move;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

