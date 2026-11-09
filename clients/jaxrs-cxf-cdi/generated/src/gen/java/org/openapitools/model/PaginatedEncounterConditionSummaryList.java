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
import org.openapitools.model.EncounterConditionSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PaginatedEncounterConditionSummaryList   {
  
  private Integer count;

  private URI next;

  private URI previous;

  private List<@Valid EncounterConditionSummary> results = new ArrayList<>();

  /**
   * The total number of resources available from this API.
   **/
  public PaginatedEncounterConditionSummaryList count(Integer count) {
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
  public PaginatedEncounterConditionSummaryList next(URI next) {
    this.next = next;
    return this;
  }

  
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/encounter-condition/?offset=40&limit=20", value = "The URL for the next page in the list, or null if there is no next page.")
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
  public PaginatedEncounterConditionSummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

  
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/encounter-condition/?offset=0&limit=20", value = "The URL for the previous page in the list, or null if there is no previous page.")
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
  public PaginatedEncounterConditionSummaryList results(List<@Valid EncounterConditionSummary> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of API resources on this page.")
  @JsonProperty("results")
  @NotNull
  public List<@Valid EncounterConditionSummary> getResults() {
    return results;
  }
  public void setResults(List<@Valid EncounterConditionSummary> results) {
    this.results = results;
  }

  public PaginatedEncounterConditionSummaryList addResultsItem(EncounterConditionSummary resultsItem) {
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
    PaginatedEncounterConditionSummaryList paginatedEncounterConditionSummaryList = (PaginatedEncounterConditionSummaryList) o;
    return Objects.equals(this.count, paginatedEncounterConditionSummaryList.count) &&
        Objects.equals(this.next, paginatedEncounterConditionSummaryList.next) &&
        Objects.equals(this.previous, paginatedEncounterConditionSummaryList.previous) &&
        Objects.equals(this.results, paginatedEncounterConditionSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedEncounterConditionSummaryList {\n");
    
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

