package org.openapitools.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PaginatedLocationSummaryList  {
  
  @ApiModelProperty(example = "123", value = "")

  private Integer count;

  @ApiModelProperty(example = "http://api.example.org/accounts/?offset=400&limit=100", value = "")

  private URI next;

  @ApiModelProperty(example = "http://api.example.org/accounts/?offset=200&limit=100", value = "")

  private URI previous;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid LocationSummary> results = new ArrayList<>();
 /**
   * Get count
   * @return count
  **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaginatedLocationSummaryList count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * Get next
   * @return next
  **/
  @JsonProperty("next")
  public URI getNext() {
    return next;
  }

  public void setNext(URI next) {
    this.next = next;
  }

  public PaginatedLocationSummaryList next(URI next) {
    this.next = next;
    return this;
  }

 /**
   * Get previous
   * @return previous
  **/
  @JsonProperty("previous")
  public URI getPrevious() {
    return previous;
  }

  public void setPrevious(URI previous) {
    this.previous = previous;
  }

  public PaginatedLocationSummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

 /**
   * Get results
   * @return results
  **/
  @JsonProperty("results")
  public List<@Valid LocationSummary> getResults() {
    return results;
  }

  public void setResults(List<@Valid LocationSummary> results) {
    this.results = results;
  }

  public PaginatedLocationSummaryList results(List<@Valid LocationSummary> results) {
    this.results = results;
    return this;
  }

  public PaginatedLocationSummaryList addResultsItem(LocationSummary resultsItem) {
    this.results.add(resultsItem);
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
    PaginatedLocationSummaryList paginatedLocationSummaryList = (PaginatedLocationSummaryList) o;
    return Objects.equals(this.count, paginatedLocationSummaryList.count) &&
        Objects.equals(this.next, paginatedLocationSummaryList.next) &&
        Objects.equals(this.previous, paginatedLocationSummaryList.previous) &&
        Objects.equals(this.results, paginatedLocationSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedLocationSummaryList {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

