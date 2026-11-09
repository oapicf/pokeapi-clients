package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ItemCategorySummary;
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
 * PaginatedItemCategorySummaryList
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PaginatedItemCategorySummaryList   {
  @JsonProperty("count")
  private Integer count;

  @JsonProperty("next")
  private URI next;

  @JsonProperty("previous")
  private URI previous;

  @JsonProperty("results")
  
  private List<ItemCategorySummary> results = new ArrayList<>();

  public PaginatedItemCategorySummaryList count(Integer count) {
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

  public PaginatedItemCategorySummaryList next(URI next) {
    this.next = next;
    return this;
  }

  /**
   * The URL for the next page in the list, or null if there is no next page.
   * @return next
   */
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/item-category/?offset=40&limit=20", value = "The URL for the next page in the list, or null if there is no next page.")
  public URI getNext() {
    return next;
  }

  public void setNext(URI next) {
    this.next = next;
  }

  public PaginatedItemCategorySummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

  /**
   * The URL for the previous page in the list, or null if there is no previous page.
   * @return previous
   */
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/item-category/?offset=0&limit=20", value = "The URL for the previous page in the list, or null if there is no previous page.")
  public URI getPrevious() {
    return previous;
  }

  public void setPrevious(URI previous) {
    this.previous = previous;
  }

  public PaginatedItemCategorySummaryList results(List<ItemCategorySummary> results) {
    this.results = results;
    return this;
  }

  public PaginatedItemCategorySummaryList addResultsItem(ItemCategorySummary resultsItem) {
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
  public List<ItemCategorySummary> getResults() {
    return results;
  }

  public void setResults(List<ItemCategorySummary> results) {
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
    PaginatedItemCategorySummaryList paginatedItemCategorySummaryList = (PaginatedItemCategorySummaryList) o;
    return Objects.equals(this.count, paginatedItemCategorySummaryList.count) &&
        Objects.equals(this.next, paginatedItemCategorySummaryList.next) &&
        Objects.equals(this.previous, paginatedItemCategorySummaryList.previous) &&
        Objects.equals(this.results, paginatedItemCategorySummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedItemCategorySummaryList {\n");
    
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

