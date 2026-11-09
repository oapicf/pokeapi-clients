package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.NatureSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatAffectingNatures   {
  
  private List<NatureSummary> increase = new ArrayList<>();
  private List<NatureSummary> decrease = new ArrayList<>();

  public StatAffectingNatures () {

  }

  public StatAffectingNatures (List<NatureSummary> increase, List<NatureSummary> decrease) {
    this.increase = increase;
    this.decrease = decrease;
  }

    
  @JsonProperty("increase")
  public List<NatureSummary> getIncrease() {
    return increase;
  }
  public void setIncrease(List<NatureSummary> increase) {
    this.increase = increase;
  }

    
  @JsonProperty("decrease")
  public List<NatureSummary> getDecrease() {
    return decrease;
  }
  public void setDecrease(List<NatureSummary> decrease) {
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
    StatAffectingNatures statAffectingNatures = (StatAffectingNatures) o;
    return Objects.equals(increase, statAffectingNatures.increase) &&
        Objects.equals(decrease, statAffectingNatures.decrease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increase, decrease);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatAffectingNatures {\n");
    
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
