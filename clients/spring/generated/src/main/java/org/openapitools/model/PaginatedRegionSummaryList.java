package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RegionSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PaginatedRegionSummaryList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T02:00:43.960184425Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PaginatedRegionSummaryList {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer count;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable URI next;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable URI previous;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid RegionSummary> results = new ArrayList<>();

  public PaginatedRegionSummaryList count(@Nullable Integer count) {
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

  @JsonProperty("count")
  public void setCount(@Nullable Integer count) {
    this.count = count;
  }

  public PaginatedRegionSummaryList next(@Nullable URI next) {
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

  @JsonProperty("next")
  public void setNext(@Nullable URI next) {
    this.next = next;
  }

  public PaginatedRegionSummaryList previous(@Nullable URI previous) {
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

  @JsonProperty("previous")
  public void setPrevious(@Nullable URI previous) {
    this.previous = previous;
  }

  public PaginatedRegionSummaryList results(List<@Valid RegionSummary> results) {
    this.results = results;
    return this;
  }

  public PaginatedRegionSummaryList addResultsItem(RegionSummary resultsItem) {
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
  public List<@Valid RegionSummary> getResults() {
    return results;
  }

  @JsonProperty("results")
  public void setResults(List<@Valid RegionSummary> results) {
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
    PaginatedRegionSummaryList paginatedRegionSummaryList = (PaginatedRegionSummaryList) o;
    return Objects.equals(this.count, paginatedRegionSummaryList.count) &&
        Objects.equals(this.next, paginatedRegionSummaryList.next) &&
        Objects.equals(this.previous, paginatedRegionSummaryList.previous) &&
        Objects.equals(this.results, paginatedRegionSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedRegionSummaryList {\n");
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

