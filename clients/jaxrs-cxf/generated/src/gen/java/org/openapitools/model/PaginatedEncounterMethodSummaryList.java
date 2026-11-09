package org.openapitools.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EncounterMethodSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PaginatedEncounterMethodSummaryList  {
  
 /**
  * The total number of resources available from this API.
  */
  @ApiModelProperty(example = "100", required = true, value = "The total number of resources available from this API.")

  private Integer count;

 /**
  * The URL for the next page in the list, or null if there is no next page.
  */
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/encounter-method/?offset=40&limit=20", value = "The URL for the next page in the list, or null if there is no next page.")

  private URI next;

 /**
  * The URL for the previous page in the list, or null if there is no previous page.
  */
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/encounter-method/?offset=0&limit=20", value = "The URL for the previous page in the list, or null if there is no previous page.")

  private URI previous;

 /**
  * A list of API resources on this page.
  */
  @ApiModelProperty(required = true, value = "A list of API resources on this page.")

  private List<@Valid EncounterMethodSummary> results = new ArrayList<>();
 /**
   * The total number of resources available from this API.
   * @return count
  **/
  @JsonProperty("count")
  @NotNull
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaginatedEncounterMethodSummaryList count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * The URL for the next page in the list, or null if there is no next page.
   * @return next
  **/
  @JsonProperty("next")
  public URI getNext() {
    return next;
  }

  public void setNext(URI next) {
    this.next = next;
  }

  public PaginatedEncounterMethodSummaryList next(URI next) {
    this.next = next;
    return this;
  }

 /**
   * The URL for the previous page in the list, or null if there is no previous page.
   * @return previous
  **/
  @JsonProperty("previous")
  public URI getPrevious() {
    return previous;
  }

  public void setPrevious(URI previous) {
    this.previous = previous;
  }

  public PaginatedEncounterMethodSummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

 /**
   * A list of API resources on this page.
   * @return results
  **/
  @JsonProperty("results")
  @NotNull
  public List<@Valid EncounterMethodSummary> getResults() {
    return results;
  }

  public void setResults(List<@Valid EncounterMethodSummary> results) {
    this.results = results;
  }

  public PaginatedEncounterMethodSummaryList results(List<@Valid EncounterMethodSummary> results) {
    this.results = results;
    return this;
  }

  public PaginatedEncounterMethodSummaryList addResultsItem(EncounterMethodSummary resultsItem) {
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
    PaginatedEncounterMethodSummaryList paginatedEncounterMethodSummaryList = (PaginatedEncounterMethodSummaryList) o;
    return Objects.equals(this.count, paginatedEncounterMethodSummaryList.count) &&
        Objects.equals(this.next, paginatedEncounterMethodSummaryList.next) &&
        Objects.equals(this.previous, paginatedEncounterMethodSummaryList.previous) &&
        Objects.equals(this.results, paginatedEncounterMethodSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedEncounterMethodSummaryList {\n");
    
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

