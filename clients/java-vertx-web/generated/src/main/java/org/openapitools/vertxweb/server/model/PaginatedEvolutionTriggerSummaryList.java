package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.EvolutionTriggerSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaginatedEvolutionTriggerSummaryList   {
  
  private Integer count;
  private URI next;
  private URI previous;
  private List<EvolutionTriggerSummary> results = new ArrayList<>();

  public PaginatedEvolutionTriggerSummaryList () {

  }

  public PaginatedEvolutionTriggerSummaryList (Integer count, URI next, URI previous, List<EvolutionTriggerSummary> results) {
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
  public List<EvolutionTriggerSummary> getResults() {
    return results;
  }
  public void setResults(List<EvolutionTriggerSummary> results) {
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
    PaginatedEvolutionTriggerSummaryList paginatedEvolutionTriggerSummaryList = (PaginatedEvolutionTriggerSummaryList) o;
    return Objects.equals(count, paginatedEvolutionTriggerSummaryList.count) &&
        Objects.equals(next, paginatedEvolutionTriggerSummaryList.next) &&
        Objects.equals(previous, paginatedEvolutionTriggerSummaryList.previous) &&
        Objects.equals(results, paginatedEvolutionTriggerSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedEvolutionTriggerSummaryList {\n");
    
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
