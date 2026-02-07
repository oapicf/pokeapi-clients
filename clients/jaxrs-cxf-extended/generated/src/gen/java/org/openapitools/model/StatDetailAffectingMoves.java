package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.StatDetailAffectingMovesIncreaseInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class StatDetailAffectingMoves  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid StatDetailAffectingMovesIncreaseInner> increase = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid StatDetailAffectingMovesIncreaseInner> decrease = new ArrayList<>();
 /**
  * Get increase
  * @return increase
  */
  @JsonProperty("increase")
  @NotNull
  public List<@Valid StatDetailAffectingMovesIncreaseInner> getIncrease() {
    return increase;
  }

  /**
   * Sets the <code>increase</code> property.
   */
 public void setIncrease(List<@Valid StatDetailAffectingMovesIncreaseInner> increase) {
    this.increase = increase;
  }

  /**
   * Sets the <code>increase</code> property.
   */
  public StatDetailAffectingMoves increase(List<@Valid StatDetailAffectingMovesIncreaseInner> increase) {
    this.increase = increase;
    return this;
  }

  /**
   * Adds a new item to the <code>increase</code> list.
   */
  public StatDetailAffectingMoves addIncreaseItem(StatDetailAffectingMovesIncreaseInner increaseItem) {
    this.increase.add(increaseItem);
    return this;
  }

 /**
  * Get decrease
  * @return decrease
  */
  @JsonProperty("decrease")
  @NotNull
  public List<@Valid StatDetailAffectingMovesIncreaseInner> getDecrease() {
    return decrease;
  }

  /**
   * Sets the <code>decrease</code> property.
   */
 public void setDecrease(List<@Valid StatDetailAffectingMovesIncreaseInner> decrease) {
    this.decrease = decrease;
  }

  /**
   * Sets the <code>decrease</code> property.
   */
  public StatDetailAffectingMoves decrease(List<@Valid StatDetailAffectingMovesIncreaseInner> decrease) {
    this.decrease = decrease;
    return this;
  }

  /**
   * Adds a new item to the <code>decrease</code> list.
   */
  public StatDetailAffectingMoves addDecreaseItem(StatDetailAffectingMovesIncreaseInner decreaseItem) {
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
    StatDetailAffectingMoves statDetailAffectingMoves = (StatDetailAffectingMoves) o;
    return Objects.equals(this.increase, statDetailAffectingMoves.increase) &&
        Objects.equals(this.decrease, statDetailAffectingMoves.decrease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increase, decrease);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatDetailAffectingMoves {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

