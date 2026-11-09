package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokeathlonStatSummary;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PaginatedPokeathlonStatSummaryList
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PaginatedPokeathlonStatSummaryList {

  private Integer count;

  private JsonNullable<URI> next = JsonNullable.<URI>undefined();

  private JsonNullable<URI> previous = JsonNullable.<URI>undefined();

  private List<@Valid PokeathlonStatSummary> results = new ArrayList<>();

  public PaginatedPokeathlonStatSummaryList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaginatedPokeathlonStatSummaryList(Integer count, List<@Valid PokeathlonStatSummary> results) {
    this.count = count;
    this.results = results;
  }

  public PaginatedPokeathlonStatSummaryList count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The total number of resources available from this API.
   * @return count
   */
  @NotNull 
  @Schema(name = "count", example = "100", description = "The total number of resources available from this API.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaginatedPokeathlonStatSummaryList next(URI next) {
    this.next = JsonNullable.of(next);
    return this;
  }

  /**
   * The URL for the next page in the list, or null if there is no next page.
   * @return next
   */
  @Valid 
  @Schema(name = "next", example = "https://pokeapi.co/api/v2/pokeathlon-stat/?offset=40&limit=20", description = "The URL for the next page in the list, or null if there is no next page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next")
  public JsonNullable<URI> getNext() {
    return next;
  }

  public void setNext(JsonNullable<URI> next) {
    this.next = next;
  }

  public PaginatedPokeathlonStatSummaryList previous(URI previous) {
    this.previous = JsonNullable.of(previous);
    return this;
  }

  /**
   * The URL for the previous page in the list, or null if there is no previous page.
   * @return previous
   */
  @Valid 
  @Schema(name = "previous", example = "https://pokeapi.co/api/v2/pokeathlon-stat/?offset=0&limit=20", description = "The URL for the previous page in the list, or null if there is no previous page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previous")
  public JsonNullable<URI> getPrevious() {
    return previous;
  }

  public void setPrevious(JsonNullable<URI> previous) {
    this.previous = previous;
  }

  public PaginatedPokeathlonStatSummaryList results(List<@Valid PokeathlonStatSummary> results) {
    this.results = results;
    return this;
  }

  public PaginatedPokeathlonStatSummaryList addResultsItem(PokeathlonStatSummary resultsItem) {
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
  @NotNull 
  @Schema(name = "results", description = "A list of API resources on this page.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("results")
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
        equalsNullable(this.next, paginatedPokeathlonStatSummaryList.next) &&
        equalsNullable(this.previous, paginatedPokeathlonStatSummaryList.previous) &&
        Objects.equals(this.results, paginatedPokeathlonStatSummaryList.results);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, hashCodeNullable(next), hashCodeNullable(previous), results);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

