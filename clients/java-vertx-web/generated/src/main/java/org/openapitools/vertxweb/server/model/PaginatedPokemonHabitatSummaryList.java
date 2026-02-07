package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.PokemonHabitatSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaginatedPokemonHabitatSummaryList   {
  
  private Integer count;
  private URI next;
  private URI previous;
  private List<PokemonHabitatSummary> results = new ArrayList<>();

  public PaginatedPokemonHabitatSummaryList () {

  }

  public PaginatedPokemonHabitatSummaryList (Integer count, URI next, URI previous, List<PokemonHabitatSummary> results) {
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
  public List<PokemonHabitatSummary> getResults() {
    return results;
  }
  public void setResults(List<PokemonHabitatSummary> results) {
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
    PaginatedPokemonHabitatSummaryList paginatedPokemonHabitatSummaryList = (PaginatedPokemonHabitatSummaryList) o;
    return Objects.equals(count, paginatedPokemonHabitatSummaryList.count) &&
        Objects.equals(next, paginatedPokemonHabitatSummaryList.next) &&
        Objects.equals(previous, paginatedPokemonHabitatSummaryList.previous) &&
        Objects.equals(results, paginatedPokemonHabitatSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedPokemonHabitatSummaryList {\n");
    
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
