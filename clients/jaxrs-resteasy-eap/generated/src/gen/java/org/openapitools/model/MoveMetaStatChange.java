package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.StatSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-11-09T13:50:03.149615362Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveMetaStatChange   {
  
  private Integer change;
  private StatSummary stat;

  /**
   * The amount of change.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(required = true, value = "The amount of change.")
  @JsonProperty("change")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getChange() {
    return change;
  }
  public void setChange(Integer change) {
    this.change = change;
  }

  /**
   * The stat being affected.
   **/
  
  @ApiModelProperty(required = true, value = "The stat being affected.")
  @JsonProperty("stat")
  @NotNull
  public StatSummary getStat() {
    return stat;
  }
  public void setStat(StatSummary stat) {
    this.stat = stat;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

