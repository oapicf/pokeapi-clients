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
import org.openapitools.model.MoveSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveComboUsage   {
  
  private List<@Valid MoveSummary> useBefore;
  private List<@Valid MoveSummary> useAfter;

  /**
   * A list of moves to use before this move.
   **/
  
  @ApiModelProperty(required = true, value = "A list of moves to use before this move.")
  @JsonProperty("use_before")
  @NotNull
  public List<@Valid MoveSummary> getUseBefore() {
    return useBefore;
  }
  public void setUseBefore(List<@Valid MoveSummary> useBefore) {
    this.useBefore = useBefore;
  }

  /**
   * A list of moves to use after this move.
   **/
  
  @ApiModelProperty(required = true, value = "A list of moves to use after this move.")
  @JsonProperty("use_after")
  @NotNull
  public List<@Valid MoveSummary> getUseAfter() {
    return useAfter;
  }
  public void setUseAfter(List<@Valid MoveSummary> useAfter) {
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

