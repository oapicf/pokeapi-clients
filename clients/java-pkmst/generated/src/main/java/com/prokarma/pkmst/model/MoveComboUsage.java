package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.MoveSummary;
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
 * MoveComboUsage
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveComboUsage   {
  @JsonProperty("use_before")
  
  private List<MoveSummary> useBefore = null;

  @JsonProperty("use_after")
  
  private List<MoveSummary> useAfter = null;

  public MoveComboUsage useBefore(List<MoveSummary> useBefore) {
    this.useBefore = useBefore;
    return this;
  }

  public MoveComboUsage addUseBeforeItem(MoveSummary useBeforeItem) {
    if (this.useBefore == null) {
      this.useBefore = new ArrayList<>();
    }
    this.useBefore.add(useBeforeItem);
    return this;
  }

  /**
   * A list of moves to use before this move.
   * @return useBefore
   */
  @ApiModelProperty(required = true, value = "A list of moves to use before this move.")
  public List<MoveSummary> getUseBefore() {
    return useBefore;
  }

  public void setUseBefore(List<MoveSummary> useBefore) {
    this.useBefore = useBefore;
  }

  public MoveComboUsage useAfter(List<MoveSummary> useAfter) {
    this.useAfter = useAfter;
    return this;
  }

  public MoveComboUsage addUseAfterItem(MoveSummary useAfterItem) {
    if (this.useAfter == null) {
      this.useAfter = new ArrayList<>();
    }
    this.useAfter.add(useAfterItem);
    return this;
  }

  /**
   * A list of moves to use after this move.
   * @return useAfter
   */
  @ApiModelProperty(required = true, value = "A list of moves to use after this move.")
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

