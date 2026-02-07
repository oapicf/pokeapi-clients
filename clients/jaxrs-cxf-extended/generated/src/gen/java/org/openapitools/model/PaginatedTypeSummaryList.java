package org.openapitools.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TypeSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PaginatedTypeSummaryList  {
  
  @ApiModelProperty(example = "123", value = "")
  private Integer count;

  @ApiModelProperty(example = "http://api.example.org/accounts/?offset=400&limit=100", value = "")
  private URI next;

  @ApiModelProperty(example = "http://api.example.org/accounts/?offset=200&limit=100", value = "")
  private URI previous;

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid TypeSummary> results = new ArrayList<>();
 /**
  * Get count
  * @return count
  */
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  /**
   * Sets the <code>count</code> property.
   */
 public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * Sets the <code>count</code> property.
   */
  public PaginatedTypeSummaryList count(Integer count) {
    this.count = count;
    return this;
  }

 /**
  * Get next
  * @return next
  */
  @JsonProperty("next")
  public URI getNext() {
    return next;
  }

  /**
   * Sets the <code>next</code> property.
   */
 public void setNext(URI next) {
    this.next = next;
  }

  /**
   * Sets the <code>next</code> property.
   */
  public PaginatedTypeSummaryList next(URI next) {
    this.next = next;
    return this;
  }

 /**
  * Get previous
  * @return previous
  */
  @JsonProperty("previous")
  public URI getPrevious() {
    return previous;
  }

  /**
   * Sets the <code>previous</code> property.
   */
 public void setPrevious(URI previous) {
    this.previous = previous;
  }

  /**
   * Sets the <code>previous</code> property.
   */
  public PaginatedTypeSummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

 /**
  * Get results
  * @return results
  */
  @JsonProperty("results")
  public List<@Valid TypeSummary> getResults() {
    return results;
  }

  /**
   * Sets the <code>results</code> property.
   */
 public void setResults(List<@Valid TypeSummary> results) {
    this.results = results;
  }

  /**
   * Sets the <code>results</code> property.
   */
  public PaginatedTypeSummaryList results(List<@Valid TypeSummary> results) {
    this.results = results;
    return this;
  }

  /**
   * Adds a new item to the <code>results</code> list.
   */
  public PaginatedTypeSummaryList addResultsItem(TypeSummary resultsItem) {
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
    PaginatedTypeSummaryList paginatedTypeSummaryList = (PaginatedTypeSummaryList) o;
    return Objects.equals(this.count, paginatedTypeSummaryList.count) &&
        Objects.equals(this.next, paginatedTypeSummaryList.next) &&
        Objects.equals(this.previous, paginatedTypeSummaryList.previous) &&
        Objects.equals(this.results, paginatedTypeSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedTypeSummaryList {\n");
    
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

