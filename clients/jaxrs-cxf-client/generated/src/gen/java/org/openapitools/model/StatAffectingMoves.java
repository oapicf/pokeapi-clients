package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveStatChange;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class StatAffectingMoves  {
  
 /**
  * A list of moves and how they change the referenced stat.
  */
  @ApiModelProperty(required = true, value = "A list of moves and how they change the referenced stat.")

  private List<MoveStatChange> increase = new ArrayList<>();

 /**
  * A list of moves and how they change the referenced stat.
  */
  @ApiModelProperty(required = true, value = "A list of moves and how they change the referenced stat.")

  private List<MoveStatChange> decrease = new ArrayList<>();
 /**
   * A list of moves and how they change the referenced stat.
   * @return increase
  **/
  @JsonProperty("increase")
  public List<MoveStatChange> getIncrease() {
    return increase;
  }

  public void setIncrease(List<MoveStatChange> increase) {
    this.increase = increase;
  }

  public StatAffectingMoves increase(List<MoveStatChange> increase) {
    this.increase = increase;
    return this;
  }

  public StatAffectingMoves addIncreaseItem(MoveStatChange increaseItem) {
    this.increase.add(increaseItem);
    return this;
  }

 /**
   * A list of moves and how they change the referenced stat.
   * @return decrease
  **/
  @JsonProperty("decrease")
  public List<MoveStatChange> getDecrease() {
    return decrease;
  }

  public void setDecrease(List<MoveStatChange> decrease) {
    this.decrease = decrease;
  }

  public StatAffectingMoves decrease(List<MoveStatChange> decrease) {
    this.decrease = decrease;
    return this;
  }

  public StatAffectingMoves addDecreaseItem(MoveStatChange decreaseItem) {
    this.decrease.add(decreaseItem);
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
    StatAffectingMoves statAffectingMoves = (StatAffectingMoves) o;
    return Objects.equals(this.increase, statAffectingMoves.increase) &&
        Objects.equals(this.decrease, statAffectingMoves.decrease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increase, decrease);
  }

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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

