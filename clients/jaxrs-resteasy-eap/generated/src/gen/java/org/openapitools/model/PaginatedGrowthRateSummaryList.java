package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GrowthRateSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-02-07T04:17:52.397146649Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PaginatedGrowthRateSummaryList   {
  
  private Integer count;
  private URI next;
  private URI previous;
  private List<@Valid GrowthRateSummary> results = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(example = "123", value = "")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   **/
  
  @ApiModelProperty(example = "http://api.example.org/accounts/?offset=400&limit=100", value = "")
  @JsonProperty("next")
  public URI getNext() {
    return next;
  }
  public void setNext(URI next) {
    this.next = next;
  }

  /**
   **/
  
  @ApiModelProperty(example = "http://api.example.org/accounts/?offset=200&limit=100", value = "")
  @JsonProperty("previous")
  public URI getPrevious() {
    return previous;
  }
  public void setPrevious(URI previous) {
    this.previous = previous;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("results")
  public List<@Valid GrowthRateSummary> getResults() {
    return results;
  }
  public void setResults(List<@Valid GrowthRateSummary> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList = (PaginatedGrowthRateSummaryList) o;
    return Objects.equals(this.count, paginatedGrowthRateSummaryList.count) &&
        Objects.equals(this.next, paginatedGrowthRateSummaryList.next) &&
        Objects.equals(this.previous, paginatedGrowthRateSummaryList.previous) &&
        Objects.equals(this.results, paginatedGrowthRateSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedGrowthRateSummaryList {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

