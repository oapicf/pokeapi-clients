package apimodels;

import apimodels.BerryFlavorSummary;
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
 * PaginatedBerryFlavorSummaryList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PaginatedBerryFlavorSummaryList   {
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

  private List<@Valid BerryFlavorSummary> results = null;

  public PaginatedBerryFlavorSummaryList count(Integer count) {
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

  public PaginatedBerryFlavorSummaryList next(URI next) {
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

  public PaginatedBerryFlavorSummaryList previous(URI previous) {
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

  public PaginatedBerryFlavorSummaryList results(List<@Valid BerryFlavorSummary> results) {
    this.results = results;
    return this;
  }

  public PaginatedBerryFlavorSummaryList addResultsItem(BerryFlavorSummary resultsItem) {
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
  public List<@Valid BerryFlavorSummary> getResults() {
    return results;
  }

  public void setResults(List<@Valid BerryFlavorSummary> results) {
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
    PaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList = (PaginatedBerryFlavorSummaryList) o;
    return Objects.equals(count, paginatedBerryFlavorSummaryList.count) &&
        Objects.equals(next, paginatedBerryFlavorSummaryList.next) &&
        Objects.equals(previous, paginatedBerryFlavorSummaryList.previous) &&
        Objects.equals(results, paginatedBerryFlavorSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedBerryFlavorSummaryList {\n");
    
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

