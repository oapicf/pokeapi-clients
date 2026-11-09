package apimodels;

import apimodels.AbilitySummary;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PaginatedAbilitySummaryList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PaginatedAbilitySummaryList   {
  @JsonProperty("count")
  @NotNull

  private Integer count;

  @JsonProperty("next")
  @Valid

  private URI next;

  @JsonProperty("previous")
  @Valid

  private URI previous;

  @JsonProperty("results")
  @NotNull
@Valid

  private List<@Valid AbilitySummary> results = new ArrayList<>();

  public PaginatedAbilitySummaryList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The total number of resources available from this API.
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaginatedAbilitySummaryList next(URI next) {
    this.next = next;
    return this;
  }

   /**
   * The URL for the next page in the list, or null if there is no next page.
   * @return next
  **/
  public URI getNext() {
    return next;
  }

  public void setNext(URI next) {
    this.next = next;
  }

  public PaginatedAbilitySummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

   /**
   * The URL for the previous page in the list, or null if there is no previous page.
   * @return previous
  **/
  public URI getPrevious() {
    return previous;
  }

  public void setPrevious(URI previous) {
    this.previous = previous;
  }

  public PaginatedAbilitySummaryList results(List<@Valid AbilitySummary> results) {
    this.results = results;
    return this;
  }

  public PaginatedAbilitySummaryList addResultsItem(AbilitySummary resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * A list of API resources on this page.
   * @return results
  **/
  public List<@Valid AbilitySummary> getResults() {
    return results;
  }

  public void setResults(List<@Valid AbilitySummary> results) {
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
    PaginatedAbilitySummaryList paginatedAbilitySummaryList = (PaginatedAbilitySummaryList) o;
    return Objects.equals(count, paginatedAbilitySummaryList.count) &&
        Objects.equals(next, paginatedAbilitySummaryList.next) &&
        Objects.equals(previous, paginatedAbilitySummaryList.previous) &&
        Objects.equals(results, paginatedAbilitySummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedAbilitySummaryList {\n");
    
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

