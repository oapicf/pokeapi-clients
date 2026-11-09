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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokeathlonStatSummary;

/**
 * PaginatedPokeathlonStatSummaryList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PaginatedPokeathlonStatSummaryList   {
  @JsonProperty("count")
  private Integer count;

  @JsonProperty("next")
  private URI next;

  @JsonProperty("previous")
  private URI previous;

  @JsonProperty("results")
  private List<@Valid PokeathlonStatSummary> results = new ArrayList<>();

  public PaginatedPokeathlonStatSummaryList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The total number of resources available from this API.
   * @return count
  **/
  @ApiModelProperty(example = "100", required = true, value = "The total number of resources available from this API.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaginatedPokeathlonStatSummaryList next(URI next) {
    this.next = next;
    return this;
  }

   /**
   * The URL for the next page in the list, or null if there is no next page.
   * @return next
  **/
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/pokeathlon-stat/?offset=40&limit=20", value = "The URL for the next page in the list, or null if there is no next page.")
  public URI getNext() {
    return next;
  }

  public void setNext(URI next) {
    this.next = next;
  }

  public PaginatedPokeathlonStatSummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

   /**
   * The URL for the previous page in the list, or null if there is no previous page.
   * @return previous
  **/
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/pokeathlon-stat/?offset=0&limit=20", value = "The URL for the previous page in the list, or null if there is no previous page.")
  public URI getPrevious() {
    return previous;
  }

  public void setPrevious(URI previous) {
    this.previous = previous;
  }

  public PaginatedPokeathlonStatSummaryList results(List<@Valid PokeathlonStatSummary> results) {
    this.results = results;
    return this;
  }

  public PaginatedPokeathlonStatSummaryList addResultsItem(PokeathlonStatSummary resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * A list of API resources on this page.
   * @return results
  **/
  @ApiModelProperty(required = true, value = "A list of API resources on this page.")
  public List<@Valid PokeathlonStatSummary> getResults() {
    return results;
  }

  public void setResults(List<@Valid PokeathlonStatSummary> results) {
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
    PaginatedPokeathlonStatSummaryList paginatedPokeathlonStatSummaryList = (PaginatedPokeathlonStatSummaryList) o;
    return Objects.equals(this.count, paginatedPokeathlonStatSummaryList.count) &&
        Objects.equals(this.next, paginatedPokeathlonStatSummaryList.next) &&
        Objects.equals(this.previous, paginatedPokeathlonStatSummaryList.previous) &&
        Objects.equals(this.results, paginatedPokeathlonStatSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedPokeathlonStatSummaryList {\n");
    
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

