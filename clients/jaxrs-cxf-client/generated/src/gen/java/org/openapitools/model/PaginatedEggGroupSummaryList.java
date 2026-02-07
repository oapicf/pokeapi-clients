package org.openapitools.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EggGroupSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PaginatedEggGroupSummaryList  {
  
  @ApiModelProperty(example = "123", value = "")

  private Integer count;

  @ApiModelProperty(example = "http://api.example.org/accounts/?offset=400&limit=100", value = "")

  private URI next;

  @ApiModelProperty(example = "http://api.example.org/accounts/?offset=200&limit=100", value = "")

  private URI previous;

  @ApiModelProperty(value = "")

  private List<EggGroupSummary> results = new ArrayList<>();
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

  public PaginatedEggGroupSummaryList count(Integer count) {
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

  public PaginatedEggGroupSummaryList next(URI next) {
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

  public PaginatedEggGroupSummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

 /**
   * Get results
   * @return results
  **/
  @JsonProperty("results")
  public List<EggGroupSummary> getResults() {
    return results;
  }

  public void setResults(List<EggGroupSummary> results) {
    this.results = results;
  }

  public PaginatedEggGroupSummaryList results(List<EggGroupSummary> results) {
    this.results = results;
    return this;
  }

  public PaginatedEggGroupSummaryList addResultsItem(EggGroupSummary resultsItem) {
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
    PaginatedEggGroupSummaryList paginatedEggGroupSummaryList = (PaginatedEggGroupSummaryList) o;
    return Objects.equals(this.count, paginatedEggGroupSummaryList.count) &&
        Objects.equals(this.next, paginatedEggGroupSummaryList.next) &&
        Objects.equals(this.previous, paginatedEggGroupSummaryList.previous) &&
        Objects.equals(this.results, paginatedEggGroupSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedEggGroupSummaryList {\n");
    
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

