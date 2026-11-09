package org.openapitools.model;

import org.openapitools.model.StatSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveMetaStatChange  {
  
 /**
  * The amount of change.
  */
  @ApiModelProperty(required = true, value = "The amount of change.")
  private Integer change;

 /**
  * The stat being affected.
  */
  @ApiModelProperty(required = true, value = "The stat being affected.")
  @Valid
  private StatSummary stat;
 /**
  * The amount of change.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return change
  */
  @JsonProperty("change")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getChange() {
    return change;
  }

  /**
   * Sets the <code>change</code> property.
   */
 public void setChange(Integer change) {
    this.change = change;
  }

  /**
   * Sets the <code>change</code> property.
   */
  public MoveMetaStatChange change(Integer change) {
    this.change = change;
    return this;
  }

 /**
  * The stat being affected.
  * @return stat
  */
  @JsonProperty("stat")
  @NotNull
  public StatSummary getStat() {
    return stat;
  }

  /**
   * Sets the <code>stat</code> property.
   */
 public void setStat(StatSummary stat) {
    this.stat = stat;
  }

  /**
   * Sets the <code>stat</code> property.
   */
  public MoveMetaStatChange stat(StatSummary stat) {
    this.stat = stat;
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
    MoveMetaStatChange moveMetaStatChange = (MoveMetaStatChange) o;
    return Objects.equals(this.change, moveMetaStatChange.change) &&
        Objects.equals(this.stat, moveMetaStatChange.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(change, stat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveMetaStatChange {\n");
    
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

