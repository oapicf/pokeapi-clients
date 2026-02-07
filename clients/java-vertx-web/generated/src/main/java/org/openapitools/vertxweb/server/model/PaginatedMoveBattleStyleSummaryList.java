package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MoveBattleStyleSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaginatedMoveBattleStyleSummaryList   {
  
  private Integer count;
  private URI next;
  private URI previous;
  private List<MoveBattleStyleSummary> results = new ArrayList<>();

  public PaginatedMoveBattleStyleSummaryList () {

  }

  public PaginatedMoveBattleStyleSummaryList (Integer count, URI next, URI previous, List<MoveBattleStyleSummary> results) {
    this.count = count;
    this.next = next;
    this.previous = previous;
    this.results = results;
  }

    
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

    
  @JsonProperty("next")
  public URI getNext() {
    return next;
  }
  public void setNext(URI next) {
    this.next = next;
  }

    
  @JsonProperty("previous")
  public URI getPrevious() {
    return previous;
  }
  public void setPrevious(URI previous) {
    this.previous = previous;
  }

    
  @JsonProperty("results")
  public List<MoveBattleStyleSummary> getResults() {
    return results;
  }
  public void setResults(List<MoveBattleStyleSummary> results) {
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
    PaginatedMoveBattleStyleSummaryList paginatedMoveBattleStyleSummaryList = (PaginatedMoveBattleStyleSummaryList) o;
    return Objects.equals(count, paginatedMoveBattleStyleSummaryList.count) &&
        Objects.equals(next, paginatedMoveBattleStyleSummaryList.next) &&
        Objects.equals(previous, paginatedMoveBattleStyleSummaryList.previous) &&
        Objects.equals(results, paginatedMoveBattleStyleSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedMoveBattleStyleSummaryList {\n");
    
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
