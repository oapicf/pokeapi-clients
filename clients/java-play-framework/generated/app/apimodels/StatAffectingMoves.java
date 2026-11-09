package apimodels;

import apimodels.MoveStatChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * StatAffectingMoves
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class StatAffectingMoves   {
  @JsonProperty("increase")
  @NotNull
@Valid

  private List<@Valid MoveStatChange> increase = new ArrayList<>();

  @JsonProperty("decrease")
  @NotNull
@Valid

  private List<@Valid MoveStatChange> decrease = new ArrayList<>();

  public StatAffectingMoves increase(List<@Valid MoveStatChange> increase) {
    this.increase = increase;
    return this;
  }

  public StatAffectingMoves addIncreaseItem(MoveStatChange increaseItem) {
    if (this.increase == null) {
      this.increase = new ArrayList<>();
    }
    this.increase.add(increaseItem);
    return this;
  }

   /**
   * A list of moves and how they change the referenced stat.
   * @return increase
  **/
  public List<@Valid MoveStatChange> getIncrease() {
    return increase;
  }

  public void setIncrease(List<@Valid MoveStatChange> increase) {
    this.increase = increase;
  }

  public StatAffectingMoves decrease(List<@Valid MoveStatChange> decrease) {
    this.decrease = decrease;
    return this;
  }

  public StatAffectingMoves addDecreaseItem(MoveStatChange decreaseItem) {
    if (this.decrease == null) {
      this.decrease = new ArrayList<>();
    }
    this.decrease.add(decreaseItem);
    return this;
  }

   /**
   * A list of moves and how they change the referenced stat.
   * @return decrease
  **/
  public List<@Valid MoveStatChange> getDecrease() {
    return decrease;
  }

  public void setDecrease(List<@Valid MoveStatChange> decrease) {
    this.decrease = decrease;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatAffectingMoves statAffectingMoves = (StatAffectingMoves) o;
    return Objects.equals(increase, statAffectingMoves.increase) &&
        Objects.equals(decrease, statAffectingMoves.decrease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increase, decrease);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatAffectingMoves {\n");
    
    sb.append("    increase: ").append(toIndentedString(increase)).append("\n");
    sb.append("    decrease: ").append(toIndentedString(decrease)).append("\n");
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

