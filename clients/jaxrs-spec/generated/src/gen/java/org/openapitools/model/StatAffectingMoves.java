package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveStatChange;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("StatAffectingMoves")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class StatAffectingMoves   {
  private List<@Valid MoveStatChange> increase = new ArrayList<>();
  private List<@Valid MoveStatChange> decrease = new ArrayList<>();

  public StatAffectingMoves() {
  }

  @JsonCreator
  public StatAffectingMoves(
    @JsonProperty(required = true, value = "increase") List<@Valid MoveStatChange> increase,
    @JsonProperty(required = true, value = "decrease") List<@Valid MoveStatChange> decrease
  ) {
    this.increase = increase;
    this.decrease = decrease;
  }

  /**
   * A list of moves and how they change the referenced stat.
   **/
  public StatAffectingMoves increase(List<@Valid MoveStatChange> increase) {
    this.increase = increase;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of moves and how they change the referenced stat.")
  @JsonProperty(required = true, value = "increase")
  @NotNull public List<@Valid MoveStatChange> getIncrease() {
    return increase;
  }

  @JsonProperty(required = true, value = "increase")
  public void setIncrease(List<@Valid MoveStatChange> increase) {
    this.increase = increase;
  }

  public StatAffectingMoves addIncreaseItem(MoveStatChange increaseItem) {
    if (this.increase == null) {
      this.increase = new ArrayList<>();
    }

    this.increase.add(increaseItem);
    return this;
  }

  public StatAffectingMoves removeIncreaseItem(MoveStatChange increaseItem) {
    if (increaseItem != null && this.increase != null) {
      this.increase.remove(increaseItem);
    }

    return this;
  }
  /**
   * A list of moves and how they change the referenced stat.
   **/
  public StatAffectingMoves decrease(List<@Valid MoveStatChange> decrease) {
    this.decrease = decrease;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of moves and how they change the referenced stat.")
  @JsonProperty(required = true, value = "decrease")
  @NotNull public List<@Valid MoveStatChange> getDecrease() {
    return decrease;
  }

  @JsonProperty(required = true, value = "decrease")
  public void setDecrease(List<@Valid MoveStatChange> decrease) {
    this.decrease = decrease;
  }

  public StatAffectingMoves addDecreaseItem(MoveStatChange decreaseItem) {
    if (this.decrease == null) {
      this.decrease = new ArrayList<>();
    }

    this.decrease.add(decreaseItem);
    return this;
  }

  public StatAffectingMoves removeDecreaseItem(MoveStatChange decreaseItem) {
    if (decreaseItem != null && this.decrease != null) {
      this.decrease.remove(decreaseItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
