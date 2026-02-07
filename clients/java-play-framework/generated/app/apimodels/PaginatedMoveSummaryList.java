package apimodels;

import apimodels.MoveSummary;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PaginatedMoveSummaryList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PaginatedMoveSummaryList   {
  @JsonProperty("count")
  
  private Integer count;

  @JsonProperty("next")
  @Valid

  private URI next;

  @JsonProperty("previous")
  @Valid

  private URI previous;

  @JsonProperty("results")
  @Valid

  private List<@Valid MoveSummary> results = null;

  public PaginatedMoveSummaryList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaginatedMoveSummaryList next(URI next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  public URI getNext() {
    return next;
  }

  public void setNext(URI next) {
    this.next = next;
  }

  public PaginatedMoveSummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  public URI getPrevious() {
    return previous;
  }

  public void setPrevious(URI previous) {
    this.previous = previous;
  }

  public PaginatedMoveSummaryList results(List<@Valid MoveSummary> results) {
    this.results = results;
    return this;
  }

  public PaginatedMoveSummaryList addResultsItem(MoveSummary resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  public List<@Valid MoveSummary> getResults() {
    return results;
  }

  public void setResults(List<@Valid MoveSummary> results) {
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
    PaginatedMoveSummaryList paginatedMoveSummaryList = (PaginatedMoveSummaryList) o;
    return Objects.equals(count, paginatedMoveSummaryList.count) &&
        Objects.equals(next, paginatedMoveSummaryList.next) &&
        Objects.equals(previous, paginatedMoveSummaryList.previous) &&
        Objects.equals(results, paginatedMoveSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedMoveSummaryList {\n");
    
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

