package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.MoveSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveStatChange   {
  
  private Integer change;
  private MoveSummary move;

  public MoveStatChange () {

  }

  public MoveStatChange (Integer change, MoveSummary move) {
    this.change = change;
    this.move = move;
  }

    
  @JsonProperty("change")
  public Integer getChange() {
    return change;
  }
  public void setChange(Integer change) {
    this.change = change;
  }

    
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
    return Objects.equals(change, moveStatChange.change) &&
        Objects.equals(move, moveStatChange.move);
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
