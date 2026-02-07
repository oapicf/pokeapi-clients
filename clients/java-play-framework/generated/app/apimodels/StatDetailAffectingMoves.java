package apimodels;

import apimodels.StatDetailAffectingMovesIncreaseInner;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * StatDetailAffectingMoves
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class StatDetailAffectingMoves   {
  @JsonProperty("increase")
  @NotNull
@Valid

  private List<@Valid StatDetailAffectingMovesIncreaseInner> increase = new ArrayList<>();

  @JsonProperty("decrease")
  @NotNull
@Valid

  private List<@Valid StatDetailAffectingMovesIncreaseInner> decrease = new ArrayList<>();

  public StatDetailAffectingMoves increase(List<@Valid StatDetailAffectingMovesIncreaseInner> increase) {
    this.increase = increase;
    return this;
  }

  public StatDetailAffectingMoves addIncreaseItem(StatDetailAffectingMovesIncreaseInner increaseItem) {
    if (this.increase == null) {
      this.increase = new ArrayList<>();
    }
    this.increase.add(increaseItem);
    return this;
  }

   /**
   * Get increase
   * @return increase
  **/
  public List<@Valid StatDetailAffectingMovesIncreaseInner> getIncrease() {
    return increase;
  }

  public void setIncrease(List<@Valid StatDetailAffectingMovesIncreaseInner> increase) {
    this.increase = increase;
  }

  public StatDetailAffectingMoves decrease(List<@Valid StatDetailAffectingMovesIncreaseInner> decrease) {
    this.decrease = decrease;
    return this;
  }

  public StatDetailAffectingMoves addDecreaseItem(StatDetailAffectingMovesIncreaseInner decreaseItem) {
    if (this.decrease == null) {
      this.decrease = new ArrayList<>();
    }
    this.decrease.add(decreaseItem);
    return this;
  }

   /**
   * Get decrease
   * @return decrease
  **/
  public List<@Valid StatDetailAffectingMovesIncreaseInner> getDecrease() {
    return decrease;
  }

  public void setDecrease(List<@Valid StatDetailAffectingMovesIncreaseInner> decrease) {
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
    StatDetailAffectingMoves statDetailAffectingMoves = (StatDetailAffectingMoves) o;
    return Objects.equals(increase, statDetailAffectingMoves.increase) &&
        Objects.equals(decrease, statDetailAffectingMoves.decrease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increase, decrease);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

