package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.BerrySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PaginatedBerrySummaryList
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PaginatedBerrySummaryList   {
  @JsonProperty("count")
  private Integer count;

  @JsonProperty("next")
  private URI next;

  @JsonProperty("previous")
  private URI previous;

  @JsonProperty("results")
  
  private List<BerrySummary> results = new ArrayList<>();

  public PaginatedBerrySummaryList count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The total number of resources available from this API.
   * @return count
   */
  @ApiModelProperty(example = "100", required = true, value = "The total number of resources available from this API.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaginatedBerrySummaryList next(URI next) {
    this.next = next;
    return this;
  }

  /**
   * The URL for the next page in the list, or null if there is no next page.
   * @return next
   */
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/berry/?offset=40&limit=20", value = "The URL for the next page in the list, or null if there is no next page.")
  public URI getNext() {
    return next;
  }

  public void setNext(URI next) {
    this.next = next;
  }

  public PaginatedBerrySummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

  /**
   * The URL for the previous page in the list, or null if there is no previous page.
   * @return previous
   */
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/berry/?offset=0&limit=20", value = "The URL for the previous page in the list, or null if there is no previous page.")
  public URI getPrevious() {
    return previous;
  }

  public void setPrevious(URI previous) {
    this.previous = previous;
  }

  public PaginatedBerrySummaryList results(List<BerrySummary> results) {
    this.results = results;
    return this;
  }

  public PaginatedBerrySummaryList addResultsItem(BerrySummary resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * A list of API resources on this page.
   * @return results
   */
  @ApiModelProperty(required = true, value = "A list of API resources on this page.")
  public List<BerrySummary> getResults() {
    return results;
  }

  public void setResults(List<BerrySummary> results) {
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
    PaginatedBerrySummaryList paginatedBerrySummaryList = (PaginatedBerrySummaryList) o;
    return Objects.equals(this.count, paginatedBerrySummaryList.count) &&
        Objects.equals(this.next, paginatedBerrySummaryList.next) &&
        Objects.equals(this.previous, paginatedBerrySummaryList.previous) &&
        Objects.equals(this.results, paginatedBerrySummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedBerrySummaryList {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

