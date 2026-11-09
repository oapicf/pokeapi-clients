package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ItemPocketSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PaginatedItemPocketSummaryList   {
  
  private Integer count;

  private URI next;

  private URI previous;

  private List<@Valid ItemPocketSummary> results = new ArrayList<>();

  /**
   * The total number of resources available from this API.
   **/
  public PaginatedItemPocketSummaryList count(Integer count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(example = "100", required = true, value = "The total number of resources available from this API.")
  @JsonProperty("count")
  @NotNull
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }


  /**
   * The URL for the next page in the list, or null if there is no next page.
   **/
  public PaginatedItemPocketSummaryList next(URI next) {
    this.next = next;
    return this;
  }

  
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/item-pocket/?offset=40&limit=20", value = "The URL for the next page in the list, or null if there is no next page.")
  @JsonProperty("next")
  public URI getNext() {
    return next;
  }
  public void setNext(URI next) {
    this.next = next;
  }


  /**
   * The URL for the previous page in the list, or null if there is no previous page.
   **/
  public PaginatedItemPocketSummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

  
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/item-pocket/?offset=0&limit=20", value = "The URL for the previous page in the list, or null if there is no previous page.")
  @JsonProperty("previous")
  public URI getPrevious() {
    return previous;
  }
  public void setPrevious(URI previous) {
    this.previous = previous;
  }


  /**
   * A list of API resources on this page.
   **/
  public PaginatedItemPocketSummaryList results(List<@Valid ItemPocketSummary> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of API resources on this page.")
  @JsonProperty("results")
  @NotNull
  public List<@Valid ItemPocketSummary> getResults() {
    return results;
  }
  public void setResults(List<@Valid ItemPocketSummary> results) {
    this.results = results;
  }

  public PaginatedItemPocketSummaryList addResultsItem(ItemPocketSummary resultsItem) {
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
    PaginatedItemPocketSummaryList paginatedItemPocketSummaryList = (PaginatedItemPocketSummaryList) o;
    return Objects.equals(this.count, paginatedItemPocketSummaryList.count) &&
        Objects.equals(this.next, paginatedItemPocketSummaryList.next) &&
        Objects.equals(this.previous, paginatedItemPocketSummaryList.previous) &&
        Objects.equals(this.results, paginatedItemPocketSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedItemPocketSummaryList {\n");
    
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

