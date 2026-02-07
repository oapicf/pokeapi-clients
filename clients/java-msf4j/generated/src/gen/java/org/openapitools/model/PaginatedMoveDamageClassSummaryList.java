package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveDamageClassSummary;

/**
 * PaginatedMoveDamageClassSummaryList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PaginatedMoveDamageClassSummaryList   {
  @JsonProperty("count")
  private Integer count;

  @JsonProperty("next")
  private URI next;

  @JsonProperty("previous")
  private URI previous;

  @JsonProperty("results")
  private List<@Valid MoveDamageClassSummary> results = null;

  public PaginatedMoveDamageClassSummaryList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "123", value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaginatedMoveDamageClassSummaryList next(URI next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(example = "http://api.example.org/accounts/?offset=400&limit=100", value = "")
  public URI getNext() {
    return next;
  }

  public void setNext(URI next) {
    this.next = next;
  }

  public PaginatedMoveDamageClassSummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(example = "http://api.example.org/accounts/?offset=200&limit=100", value = "")
  public URI getPrevious() {
    return previous;
  }

  public void setPrevious(URI previous) {
    this.previous = previous;
  }

  public PaginatedMoveDamageClassSummaryList results(List<@Valid MoveDamageClassSummary> results) {
    this.results = results;
    return this;
  }

  public PaginatedMoveDamageClassSummaryList addResultsItem(MoveDamageClassSummary resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<@Valid MoveDamageClassSummary> getResults() {
    return results;
  }

  public void setResults(List<@Valid MoveDamageClassSummary> results) {
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
    PaginatedMoveDamageClassSummaryList paginatedMoveDamageClassSummaryList = (PaginatedMoveDamageClassSummaryList) o;
    return Objects.equals(this.count, paginatedMoveDamageClassSummaryList.count) &&
        Objects.equals(this.next, paginatedMoveDamageClassSummaryList.next) &&
        Objects.equals(this.previous, paginatedMoveDamageClassSummaryList.previous) &&
        Objects.equals(this.results, paginatedMoveDamageClassSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedMoveDamageClassSummaryList {\n");
    
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

