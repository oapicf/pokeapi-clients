package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NatureSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class StatAffectingNatures   {
  
  private List<@Valid NatureSummary> increase = new ArrayList<>();
  private List<@Valid NatureSummary> decrease = new ArrayList<>();

  /**
   * A list of natures and how they change the referenced stat.
   **/
  
  @ApiModelProperty(required = true, value = "A list of natures and how they change the referenced stat.")
  @JsonProperty("increase")
  @NotNull
  public List<@Valid NatureSummary> getIncrease() {
    return increase;
  }
  public void setIncrease(List<@Valid NatureSummary> increase) {
    this.increase = increase;
  }

  /**
   * A list of nature sand how they change the referenced stat.
   **/
  
  @ApiModelProperty(required = true, value = "A list of nature sand how they change the referenced stat.")
  @JsonProperty("decrease")
  @NotNull
  public List<@Valid NatureSummary> getDecrease() {
    return decrease;
  }
  public void setDecrease(List<@Valid NatureSummary> decrease) {
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

