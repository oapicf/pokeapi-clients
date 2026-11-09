package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("MoveComboUsage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveComboUsage   {
  private List<@Valid MoveSummary> useBefore;
  private List<@Valid MoveSummary> useAfter;

  public MoveComboUsage() {
  }

  @JsonCreator
  public MoveComboUsage(
    @JsonProperty(required = true, value = "use_before") List<@Valid MoveSummary> useBefore,
    @JsonProperty(required = true, value = "use_after") List<@Valid MoveSummary> useAfter
  ) {
    this.useBefore = useBefore;
    this.useAfter = useAfter;
  }

  /**
   * A list of moves to use before this move.
   **/
  public MoveComboUsage useBefore(List<@Valid MoveSummary> useBefore) {
    this.useBefore = useBefore;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of moves to use before this move.")
  @JsonProperty(required = true, value = "use_before")
  @NotNull public List<@Valid MoveSummary> getUseBefore() {
    return useBefore;
  }

  @JsonProperty(required = true, value = "use_before")
  public void setUseBefore(List<@Valid MoveSummary> useBefore) {
    this.useBefore = useBefore;
  }

  public MoveComboUsage addUseBeforeItem(MoveSummary useBeforeItem) {
    if (this.useBefore == null) {
      this.useBefore = new ArrayList<>();
    }

    this.useBefore.add(useBeforeItem);
    return this;
  }

  public MoveComboUsage removeUseBeforeItem(MoveSummary useBeforeItem) {
    if (useBeforeItem != null && this.useBefore != null) {
      this.useBefore.remove(useBeforeItem);
    }

    return this;
  }
  /**
   * A list of moves to use after this move.
   **/
  public MoveComboUsage useAfter(List<@Valid MoveSummary> useAfter) {
    this.useAfter = useAfter;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of moves to use after this move.")
  @JsonProperty(required = true, value = "use_after")
  @NotNull public List<@Valid MoveSummary> getUseAfter() {
    return useAfter;
  }

  @JsonProperty(required = true, value = "use_after")
  public void setUseAfter(List<@Valid MoveSummary> useAfter) {
    this.useAfter = useAfter;
  }

  public MoveComboUsage addUseAfterItem(MoveSummary useAfterItem) {
    if (this.useAfter == null) {
      this.useAfter = new ArrayList<>();
    }

    this.useAfter.add(useAfterItem);
    return this;
  }

  public MoveComboUsage removeUseAfterItem(MoveSummary useAfterItem) {
    if (useAfterItem != null && this.useAfter != null) {
      this.useAfter.remove(useAfterItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
