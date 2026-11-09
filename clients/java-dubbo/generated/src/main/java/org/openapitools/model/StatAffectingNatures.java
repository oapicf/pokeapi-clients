package org.openapitools.model;

import org.openapitools.model.NatureSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class StatAffectingNatures implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A list of natures and how they change the referenced stat.
   */
  @JsonProperty("increase")
  private List<NatureSummary> increase = new ArrayList<>();

  /**
   * A list of nature sand how they change the referenced stat.
   */
  @JsonProperty("decrease")
  private List<NatureSummary> decrease = new ArrayList<>();

  /**
   * A list of natures and how they change the referenced stat.
   * @return increase
   */
  public List<NatureSummary> getIncrease() {
    return increase;
  }

  public void setIncrease(List<NatureSummary> increase) {
    this.increase = increase;
  }

  /**
   * A list of nature sand how they change the referenced stat.
   * @return decrease
   */
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
    return Objects.equals(this.increase, statAffectingNatures.increase) &&
        Objects.equals(this.decrease, statAffectingNatures.decrease);
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
