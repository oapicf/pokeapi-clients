package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.StatDetailAffectingMovesIncreaseInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("StatDetail_affecting_moves")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class StatDetailAffectingMoves   {
  private @Valid List<@Valid StatDetailAffectingMovesIncreaseInner> increase = new ArrayList<>();
  private @Valid List<@Valid StatDetailAffectingMovesIncreaseInner> decrease = new ArrayList<>();

  public StatDetailAffectingMoves() {
  }

  @JsonCreator
  public StatDetailAffectingMoves(
    @JsonProperty(required = true, value = "increase") List<@Valid StatDetailAffectingMovesIncreaseInner> increase,
    @JsonProperty(required = true, value = "decrease") List<@Valid StatDetailAffectingMovesIncreaseInner> decrease
  ) {
    this.increase = increase;
    this.decrease = decrease;
  }

  /**
   **/
  public StatDetailAffectingMoves increase(List<@Valid StatDetailAffectingMovesIncreaseInner> increase) {
    this.increase = increase;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "increase")
  @NotNull @Valid public List<@Valid StatDetailAffectingMovesIncreaseInner> getIncrease() {
    return increase;
  }

  @JsonProperty(required = true, value = "increase")
  public void setIncrease(List<@Valid StatDetailAffectingMovesIncreaseInner> increase) {
    this.increase = increase;
  }

  public StatDetailAffectingMoves addIncreaseItem(StatDetailAffectingMovesIncreaseInner increaseItem) {
    if (this.increase == null) {
      this.increase = new ArrayList<>();
    }

    this.increase.add(increaseItem);
    return this;
  }

  public StatDetailAffectingMoves removeIncreaseItem(StatDetailAffectingMovesIncreaseInner increaseItem) {
    if (increaseItem != null && this.increase != null) {
      this.increase.remove(increaseItem);
    }

    return this;
  }
  /**
   **/
  public StatDetailAffectingMoves decrease(List<@Valid StatDetailAffectingMovesIncreaseInner> decrease) {
    this.decrease = decrease;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "decrease")
  @NotNull @Valid public List<@Valid StatDetailAffectingMovesIncreaseInner> getDecrease() {
    return decrease;
  }

  @JsonProperty(required = true, value = "decrease")
  public void setDecrease(List<@Valid StatDetailAffectingMovesIncreaseInner> decrease) {
    this.decrease = decrease;
  }

  public StatDetailAffectingMoves addDecreaseItem(StatDetailAffectingMovesIncreaseInner decreaseItem) {
    if (this.decrease == null) {
      this.decrease = new ArrayList<>();
    }

    this.decrease.add(decreaseItem);
    return this;
  }

  public StatDetailAffectingMoves removeDecreaseItem(StatDetailAffectingMovesIncreaseInner decreaseItem) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

