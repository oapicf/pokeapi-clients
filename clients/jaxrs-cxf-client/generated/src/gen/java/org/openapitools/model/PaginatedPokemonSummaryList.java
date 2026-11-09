package org.openapitools.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokemonSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PaginatedPokemonSummaryList  {
  
 /**
  * The total number of resources available from this API.
  */
  @ApiModelProperty(example = "100", required = true, value = "The total number of resources available from this API.")

  private Integer count;

 /**
  * The URL for the next page in the list, or null if there is no next page.
  */
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/pokemon/?offset=40&limit=20", value = "The URL for the next page in the list, or null if there is no next page.")

  private URI next;

 /**
  * The URL for the previous page in the list, or null if there is no previous page.
  */
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/pokemon/?offset=0&limit=20", value = "The URL for the previous page in the list, or null if there is no previous page.")

  private URI previous;

 /**
  * A list of API resources on this page.
  */
  @ApiModelProperty(required = true, value = "A list of API resources on this page.")

  private List<PokemonSummary> results = new ArrayList<>();
 /**
   * The total number of resources available from this API.
   * @return count
  **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaginatedPokemonSummaryList count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * The URL for the next page in the list, or null if there is no next page.
   * @return next
  **/
  @JsonProperty("next")
  public URI getNext() {
    return next;
  }

  public void setNext(URI next) {
    this.next = next;
  }

  public PaginatedPokemonSummaryList next(URI next) {
    this.next = next;
    return this;
  }

 /**
   * The URL for the previous page in the list, or null if there is no previous page.
   * @return previous
  **/
  @JsonProperty("previous")
  public URI getPrevious() {
    return previous;
  }

  public void setPrevious(URI previous) {
    this.previous = previous;
  }

  public PaginatedPokemonSummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

 /**
   * A list of API resources on this page.
   * @return results
  **/
  @JsonProperty("results")
  public List<PokemonSummary> getResults() {
    return results;
  }

  public void setResults(List<PokemonSummary> results) {
    this.results = results;
  }

  public PaginatedPokemonSummaryList results(List<PokemonSummary> results) {
    this.results = results;
    return this;
  }

  public PaginatedPokemonSummaryList addResultsItem(PokemonSummary resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedPokemonSummaryList paginatedPokemonSummaryList = (PaginatedPokemonSummaryList) o;
    return Objects.equals(this.count, paginatedPokemonSummaryList.count) &&
        Objects.equals(this.next, paginatedPokemonSummaryList.next) &&
        Objects.equals(this.previous, paginatedPokemonSummaryList.previous) &&
        Objects.equals(this.results, paginatedPokemonSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedPokemonSummaryList {\n");
    
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

