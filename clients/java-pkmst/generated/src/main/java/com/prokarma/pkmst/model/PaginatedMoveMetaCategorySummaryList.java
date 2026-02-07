package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.MoveMetaCategorySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PaginatedMoveMetaCategorySummaryList
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PaginatedMoveMetaCategorySummaryList   {
  @JsonProperty("count")
  private Integer count;

  @JsonProperty("next")
  private URI next;

  @JsonProperty("previous")
  private URI previous;

  @JsonProperty("results")
  
  private List<MoveMetaCategorySummary> results = null;

  public PaginatedMoveMetaCategorySummaryList count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  @ApiModelProperty(example = "123", value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaginatedMoveMetaCategorySummaryList next(URI next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
   */
  @ApiModelProperty(example = "http://api.example.org/accounts/?offset=400&limit=100", value = "")
  public URI getNext() {
    return next;
  }

  public void setNext(URI next) {
    this.next = next;
  }

  public PaginatedMoveMetaCategorySummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Get previous
   * @return previous
   */
  @ApiModelProperty(example = "http://api.example.org/accounts/?offset=200&limit=100", value = "")
  public URI getPrevious() {
    return previous;
  }

  public void setPrevious(URI previous) {
    this.previous = previous;
  }

  public PaginatedMoveMetaCategorySummaryList results(List<MoveMetaCategorySummary> results) {
    this.results = results;
    return this;
  }

  public PaginatedMoveMetaCategorySummaryList addResultsItem(MoveMetaCategorySummary resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
   */
  @ApiModelProperty(value = "")
  public List<MoveMetaCategorySummary> getResults() {
    return results;
  }

  public void setResults(List<MoveMetaCategorySummary> results) {
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
    PaginatedMoveMetaCategorySummaryList paginatedMoveMetaCategorySummaryList = (PaginatedMoveMetaCategorySummaryList) o;
    return Objects.equals(this.count, paginatedMoveMetaCategorySummaryList.count) &&
        Objects.equals(this.next, paginatedMoveMetaCategorySummaryList.next) &&
        Objects.equals(this.previous, paginatedMoveMetaCategorySummaryList.previous) &&
        Objects.equals(this.results, paginatedMoveMetaCategorySummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedMoveMetaCategorySummaryList {\n");
    
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

