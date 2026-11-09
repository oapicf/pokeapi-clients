package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveComboUsage  {
  
 /**
  * A list of moves to use before this move.
  */
  @ApiModelProperty(required = true, value = "A list of moves to use before this move.")

  private List<MoveSummary> useBefore;

 /**
  * A list of moves to use after this move.
  */
  @ApiModelProperty(required = true, value = "A list of moves to use after this move.")

  private List<MoveSummary> useAfter;
 /**
   * A list of moves to use before this move.
   * @return useBefore
  **/
  @JsonProperty("use_before")
  public List<MoveSummary> getUseBefore() {
    return useBefore;
  }

  public void setUseBefore(List<MoveSummary> useBefore) {
    this.useBefore = useBefore;
  }

  public MoveComboUsage useBefore(List<MoveSummary> useBefore) {
    this.useBefore = useBefore;
    return this;
  }

  public MoveComboUsage addUseBeforeItem(MoveSummary useBeforeItem) {
    this.useBefore.add(useBeforeItem);
    return this;
  }

 /**
   * A list of moves to use after this move.
   * @return useAfter
  **/
  @JsonProperty("use_after")
  public List<MoveSummary> getUseAfter() {
    return useAfter;
  }

  public void setUseAfter(List<MoveSummary> useAfter) {
    this.useAfter = useAfter;
  }

  public MoveComboUsage useAfter(List<MoveSummary> useAfter) {
    this.useAfter = useAfter;
    return this;
  }

  public MoveComboUsage addUseAfterItem(MoveSummary useAfterItem) {
    this.useAfter.add(useAfterItem);
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
    MoveComboUsage moveComboUsage = (MoveComboUsage) o;
    return Objects.equals(this.useBefore, moveComboUsage.useBefore) &&
        Objects.equals(this.useAfter, moveComboUsage.useAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useBefore, useAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveComboUsage {\n");
    
    sb.append("    useBefore: ").append(toIndentedString(useBefore)).append("\n");
    sb.append("    useAfter: ").append(toIndentedString(useAfter)).append("\n");
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

