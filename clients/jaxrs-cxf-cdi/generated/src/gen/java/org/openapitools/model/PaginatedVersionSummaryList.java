package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.VersionSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PaginatedVersionSummaryList   {
  
  private Integer count;

  private URI next;

  private URI previous;

  private List<@Valid VersionSummary> results = new ArrayList<>();

  /**
   **/
  public PaginatedVersionSummaryList count(Integer count) {
    this.count = count;
    return this;
  }

  
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
  public PaginatedVersionSummaryList next(URI next) {
    this.next = next;
    return this;
  }

  
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
  public PaginatedVersionSummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

  
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
  public PaginatedVersionSummaryList results(List<@Valid VersionSummary> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("results")
  public List<@Valid VersionSummary> getResults() {
    return results;
  }
  public void setResults(List<@Valid VersionSummary> results) {
    this.results = results;
  }

  public PaginatedVersionSummaryList addResultsItem(VersionSummary resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
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
    PaginatedVersionSummaryList paginatedVersionSummaryList = (PaginatedVersionSummaryList) o;
    return Objects.equals(this.count, paginatedVersionSummaryList.count) &&
        Objects.equals(this.next, paginatedVersionSummaryList.next) &&
        Objects.equals(this.previous, paginatedVersionSummaryList.previous) &&
        Objects.equals(this.results, paginatedVersionSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedVersionSummaryList {\n");
    
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

