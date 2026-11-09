package org.openapitools.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveLearnMethodSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PaginatedMoveLearnMethodSummaryList  {
  
 /**
  * The total number of resources available from this API.
  */
  @ApiModelProperty(example = "100", required = true, value = "The total number of resources available from this API.")
  private Integer count;

 /**
  * The URL for the next page in the list, or null if there is no next page.
  */
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/move-learn-method/?offset=40&limit=20", value = "The URL for the next page in the list, or null if there is no next page.")
  private URI next;

 /**
  * The URL for the previous page in the list, or null if there is no previous page.
  */
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/move-learn-method/?offset=0&limit=20", value = "The URL for the previous page in the list, or null if there is no previous page.")
  private URI previous;

 /**
  * A list of API resources on this page.
  */
  @ApiModelProperty(required = true, value = "A list of API resources on this page.")
  private List<@Valid MoveLearnMethodSummary> results = new ArrayList<>();
 /**
  * The total number of resources available from this API.
  * @return count
  */
  @JsonProperty("count")
  @NotNull
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
  public PaginatedMoveLearnMethodSummaryList count(Integer count) {
    this.count = count;
    return this;
  }

 /**
  * The URL for the next page in the list, or null if there is no next page.
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
  public PaginatedMoveLearnMethodSummaryList next(URI next) {
    this.next = next;
    return this;
  }

 /**
  * The URL for the previous page in the list, or null if there is no previous page.
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
  public PaginatedMoveLearnMethodSummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

 /**
  * A list of API resources on this page.
  * @return results
  */
  @JsonProperty("results")
  @NotNull
  public List<@Valid MoveLearnMethodSummary> getResults() {
    return results;
  }

  /**
   * Sets the <code>results</code> property.
   */
 public void setResults(List<@Valid MoveLearnMethodSummary> results) {
    this.results = results;
  }

  /**
   * Sets the <code>results</code> property.
   */
  public PaginatedMoveLearnMethodSummaryList results(List<@Valid MoveLearnMethodSummary> results) {
    this.results = results;
    return this;
  }

  /**
   * Adds a new item to the <code>results</code> list.
   */
  public PaginatedMoveLearnMethodSummaryList addResultsItem(MoveLearnMethodSummary resultsItem) {
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
    PaginatedMoveLearnMethodSummaryList paginatedMoveLearnMethodSummaryList = (PaginatedMoveLearnMethodSummaryList) o;
    return Objects.equals(this.count, paginatedMoveLearnMethodSummaryList.count) &&
        Objects.equals(this.next, paginatedMoveLearnMethodSummaryList.next) &&
        Objects.equals(this.previous, paginatedMoveLearnMethodSummaryList.previous) &&
        Objects.equals(this.results, paginatedMoveLearnMethodSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedMoveLearnMethodSummaryList {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

