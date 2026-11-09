package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.StatSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("MoveMetaStatChange")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveMetaStatChange   {
  private Integer change;
  private StatSummary stat;

  public MoveMetaStatChange() {
  }

  @JsonCreator
  public MoveMetaStatChange(
    @JsonProperty(required = true, value = "change") Integer change,
    @JsonProperty(required = true, value = "stat") StatSummary stat
  ) {
    this.change = change;
    this.stat = stat;
  }

  /**
   * The amount of change.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public MoveMetaStatChange change(Integer change) {
    this.change = change;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The amount of change.")
  @JsonProperty(required = true, value = "change")
  @NotNull  @Min(-2147483648) @Max(2147483647)public Integer getChange() {
    return change;
  }

  @JsonProperty(required = true, value = "change")
  public void setChange(Integer change) {
    this.change = change;
  }

  /**
   * The stat being affected.
   **/
  public MoveMetaStatChange stat(StatSummary stat) {
    this.stat = stat;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The stat being affected.")
  @JsonProperty(required = true, value = "stat")
  @NotNull @Valid public StatSummary getStat() {
    return stat;
  }

  @JsonProperty(required = true, value = "stat")
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
