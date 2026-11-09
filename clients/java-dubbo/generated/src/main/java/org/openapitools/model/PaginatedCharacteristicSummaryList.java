package org.openapitools.model;

import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CharacteristicSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PaginatedCharacteristicSummaryList implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The total number of resources available from this API.
   */
  @JsonProperty("count")
  private Integer count;

  /**
   * The URL for the next page in the list, or null if there is no next page.
   */
  @JsonProperty("next")
  private URI next;

  /**
   * The URL for the previous page in the list, or null if there is no previous page.
   */
  @JsonProperty("previous")
  private URI previous;

  /**
   * A list of API resources on this page.
   */
  @JsonProperty("results")
  private List<CharacteristicSummary> results = new ArrayList<>();

  /**
   * The total number of resources available from this API.
   * @return count
   */
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * The URL for the next page in the list, or null if there is no next page.
   * @return next
   */
  public URI getNext() {
    return next;
  }

  public void setNext(URI next) {
    this.next = next;
  }

  /**
   * The URL for the previous page in the list, or null if there is no previous page.
   * @return previous
   */
  public URI getPrevious() {
    return previous;
  }

  public void setPrevious(URI previous) {
    this.previous = previous;
  }

  /**
   * A list of API resources on this page.
   * @return results
   */
  public List<CharacteristicSummary> getResults() {
    return results;
  }

  public void setResults(List<CharacteristicSummary> results) {
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
    PaginatedCharacteristicSummaryList paginatedCharacteristicSummaryList = (PaginatedCharacteristicSummaryList) o;
    return Objects.equals(this.count, paginatedCharacteristicSummaryList.count) &&
        Objects.equals(this.next, paginatedCharacteristicSummaryList.next) &&
        Objects.equals(this.previous, paginatedCharacteristicSummaryList.previous) &&
        Objects.equals(this.results, paginatedCharacteristicSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedCharacteristicSummaryList {\n");
    
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
