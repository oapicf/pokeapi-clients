package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MoveStatChange;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatAffectingMoves   {
  
  private List<MoveStatChange> increase = new ArrayList<>();
  private List<MoveStatChange> decrease = new ArrayList<>();

  public StatAffectingMoves () {

  }

  public StatAffectingMoves (List<MoveStatChange> increase, List<MoveStatChange> decrease) {
    this.increase = increase;
    this.decrease = decrease;
  }

    
  @JsonProperty("increase")
  public List<MoveStatChange> getIncrease() {
    return increase;
  }
  public void setIncrease(List<MoveStatChange> increase) {
    this.increase = increase;
  }

    
  @JsonProperty("decrease")
  public List<MoveStatChange> getDecrease() {
    return decrease;
  }
  public void setDecrease(List<MoveStatChange> decrease) {
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
