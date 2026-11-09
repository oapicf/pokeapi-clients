package apimodels;

import apimodels.MoveSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MoveStatChange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MoveStatChange   {
  @JsonProperty("change")
  @NotNull
@Min(-2147483648)
@Max(2147483647)

  private Integer change;

  @JsonProperty("move")
  @NotNull
@Valid

  private MoveSummary move;

  public MoveStatChange change(Integer change) {
    this.change = change;
    return this;
  }

   /**
   * The maximum amount of change to the referenced stat.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return change
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

