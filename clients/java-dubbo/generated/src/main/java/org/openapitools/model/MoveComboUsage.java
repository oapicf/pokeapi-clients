package org.openapitools.model;

import org.openapitools.model.MoveSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class MoveComboUsage implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A list of moves to use before this move.
   */
  @JsonProperty("use_before")
  private List<MoveSummary> useBefore;

  /**
   * A list of moves to use after this move.
   */
  @JsonProperty("use_after")
  private List<MoveSummary> useAfter;

  /**
   * A list of moves to use before this move.
   * @return useBefore
   */
  public List<MoveSummary> getUseBefore() {
    return useBefore;
  }

  public void setUseBefore(List<MoveSummary> useBefore) {
    this.useBefore = useBefore;
  }

  /**
   * A list of moves to use after this move.
   * @return useAfter
   */
  public List<MoveSummary> getUseAfter() {
    return useAfter;
  }

  public void setUseAfter(List<MoveSummary> useAfter) {
    this.useAfter = useAfter;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
