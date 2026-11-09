package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MoveSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class MoveStatChange   {
  
  private Integer change;

  private MoveSummary move;

  /**
   * The maximum amount of change to the referenced stat.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public MoveStatChange change(Integer change) {
    this.change = change;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The maximum amount of change to the referenced stat.")
  @JsonProperty("change")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getChange() {
    return change;
  }
  public void setChange(Integer change) {
    this.change = change;
  }


  /**
   * The move causing the change.
   **/
  public MoveStatChange move(MoveSummary move) {
    this.move = move;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The move causing the change.")
  @JsonProperty("move")
  @NotNull
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

