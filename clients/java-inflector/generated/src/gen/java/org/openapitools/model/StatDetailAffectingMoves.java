package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.StatDetailAffectingMovesIncreaseInner;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T15:22:50.575598517Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class StatDetailAffectingMoves   {
  @JsonProperty("increase")
  private List<StatDetailAffectingMovesIncreaseInner> increase = new ArrayList<>();

  @JsonProperty("decrease")
  private List<StatDetailAffectingMovesIncreaseInner> decrease = new ArrayList<>();

  /**
   **/
  public StatDetailAffectingMoves increase(List<StatDetailAffectingMovesIncreaseInner> increase) {
    this.increase = increase;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("increase")
  public List<StatDetailAffectingMovesIncreaseInner> getIncrease() {
    return increase;
  }
  public void setIncrease(List<StatDetailAffectingMovesIncreaseInner> increase) {
    this.increase = increase;
  }

  /**
   **/
  public StatDetailAffectingMoves decrease(List<StatDetailAffectingMovesIncreaseInner> decrease) {
    this.decrease = decrease;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("decrease")
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
    return Objects.equals(increase, statDetailAffectingMoves.increase) &&
        Objects.equals(decrease, statDetailAffectingMoves.decrease);
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

