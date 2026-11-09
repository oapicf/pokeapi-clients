package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MoveSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveComboUsage   {
  
  private List<MoveSummary> useBefore;
  private List<MoveSummary> useAfter;

  public MoveComboUsage () {

  }

  public MoveComboUsage (List<MoveSummary> useBefore, List<MoveSummary> useAfter) {
    this.useBefore = useBefore;
    this.useAfter = useAfter;
  }

    
  @JsonProperty("use_before")
  public List<MoveSummary> getUseBefore() {
    return useBefore;
  }
  public void setUseBefore(List<MoveSummary> useBefore) {
    this.useBefore = useBefore;
  }

    
  @JsonProperty("use_after")
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
    return Objects.equals(useBefore, moveComboUsage.useBefore) &&
        Objects.equals(useAfter, moveComboUsage.useAfter);
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
