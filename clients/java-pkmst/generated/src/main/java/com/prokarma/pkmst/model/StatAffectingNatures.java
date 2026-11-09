package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.NatureSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * StatAffectingNatures
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class StatAffectingNatures   {
  @JsonProperty("increase")
  
  private List<NatureSummary> increase = new ArrayList<>();

  @JsonProperty("decrease")
  
  private List<NatureSummary> decrease = new ArrayList<>();

  public StatAffectingNatures increase(List<NatureSummary> increase) {
    this.increase = increase;
    return this;
  }

  public StatAffectingNatures addIncreaseItem(NatureSummary increaseItem) {
    if (this.increase == null) {
      this.increase = new ArrayList<>();
    }
    this.increase.add(increaseItem);
    return this;
  }

  /**
   * A list of natures and how they change the referenced stat.
   * @return increase
   */
  @ApiModelProperty(required = true, value = "A list of natures and how they change the referenced stat.")
  public List<NatureSummary> getIncrease() {
    return increase;
  }

  public void setIncrease(List<NatureSummary> increase) {
    this.increase = increase;
  }

  public StatAffectingNatures decrease(List<NatureSummary> decrease) {
    this.decrease = decrease;
    return this;
  }

  public StatAffectingNatures addDecreaseItem(NatureSummary decreaseItem) {
    if (this.decrease == null) {
      this.decrease = new ArrayList<>();
    }
    this.decrease.add(decreaseItem);
    return this;
  }

  /**
   * A list of nature sand how they change the referenced stat.
   * @return decrease
   */
  @ApiModelProperty(required = true, value = "A list of nature sand how they change the referenced stat.")
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

