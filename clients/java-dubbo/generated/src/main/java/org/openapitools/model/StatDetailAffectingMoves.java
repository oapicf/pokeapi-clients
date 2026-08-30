package org.openapitools.model;

import org.openapitools.model.StatDetailAffectingMovesIncreaseInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class StatDetailAffectingMoves implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("increase")
  private List<StatDetailAffectingMovesIncreaseInner> increase = new ArrayList<>();

  @JsonProperty("decrease")
  private List<StatDetailAffectingMovesIncreaseInner> decrease = new ArrayList<>();

  /**
   * 
   * @return increase
   */
  public List<StatDetailAffectingMovesIncreaseInner> getIncrease() {
    return increase;
  }

  public void setIncrease(List<StatDetailAffectingMovesIncreaseInner> increase) {
    this.increase = increase;
  }

  /**
   * 
   * @return decrease
   */
  public List<StatDetailAffectingMovesIncreaseInner> getDecrease() {
    return decrease;
  }

  public void setDecrease(List<StatDetailAffectingMovesIncreaseInner> decrease) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
