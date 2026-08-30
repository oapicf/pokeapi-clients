package org.openapitools.model;

import java.net.URI;
import org.openapitools.model.EggGroupSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PaginatedEggGroupSummaryList implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("next")
  private URI next;

  @JsonProperty("previous")
  private URI previous;

  @JsonProperty("results")
  private List<EggGroupSummary> results = new ArrayList<>();

  /**
   * 
   * @return count
   */
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * 
   * @return next
   */
  public URI getNext() {
    return next;
  }

  public void setNext(URI next) {
    this.next = next;
  }

  /**
   * 
   * @return previous
   */
  public URI getPrevious() {
    return previous;
  }

  public void setPrevious(URI previous) {
    this.previous = previous;
  }

  /**
   * 
   * @return results
   */
  public List<EggGroupSummary> getResults() {
    return results;
  }

  public void setResults(List<EggGroupSummary> results) {
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
    PaginatedEggGroupSummaryList paginatedEggGroupSummaryList = (PaginatedEggGroupSummaryList) o;
    return Objects.equals(this.count, paginatedEggGroupSummaryList.count) &&
        Objects.equals(this.next, paginatedEggGroupSummaryList.next) &&
        Objects.equals(this.previous, paginatedEggGroupSummaryList.previous) &&
        Objects.equals(this.results, paginatedEggGroupSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedEggGroupSummaryList {\n");
    
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
