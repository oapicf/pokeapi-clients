package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ContestTypeSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PaginatedContestTypeSummaryList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PaginatedContestTypeSummaryList {

  private @Nullable Integer count;

  private @Nullable URI next;

  private @Nullable URI previous;

  @Valid
  private List<@Valid ContestTypeSummary> results = new ArrayList<>();

  public PaginatedContestTypeSummaryList count(@Nullable Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  
  @Schema(name = "count", example = "123", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public @Nullable Integer getCount() {
    return count;
  }

  public void setCount(@Nullable Integer count) {
    this.count = count;
  }

  public PaginatedContestTypeSummaryList next(@Nullable URI next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
   */
  @Valid 
  @Schema(name = "next", example = "http://api.example.org/accounts/?offset=400&limit=100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next")
  public @Nullable URI getNext() {
    return next;
  }

  public void setNext(@Nullable URI next) {
    this.next = next;
  }

  public PaginatedContestTypeSummaryList previous(@Nullable URI previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Get previous
   * @return previous
   */
  @Valid 
  @Schema(name = "previous", example = "http://api.example.org/accounts/?offset=200&limit=100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previous")
  public @Nullable URI getPrevious() {
    return previous;
  }

  public void setPrevious(@Nullable URI previous) {
    this.previous = previous;
  }

  public PaginatedContestTypeSummaryList results(List<@Valid ContestTypeSummary> results) {
    this.results = results;
    return this;
  }

  public PaginatedContestTypeSummaryList addResultsItem(ContestTypeSummary resultsItem) {
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
  @Valid 
  @Schema(name = "results", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("results")
  public List<@Valid ContestTypeSummary> getResults() {
    return results;
  }

  public void setResults(List<@Valid ContestTypeSummary> results) {
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
    PaginatedContestTypeSummaryList paginatedContestTypeSummaryList = (PaginatedContestTypeSummaryList) o;
    return Objects.equals(this.count, paginatedContestTypeSummaryList.count) &&
        Objects.equals(this.next, paginatedContestTypeSummaryList.next) &&
        Objects.equals(this.previous, paginatedContestTypeSummaryList.previous) &&
        Objects.equals(this.results, paginatedContestTypeSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedContestTypeSummaryList {\n");
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

