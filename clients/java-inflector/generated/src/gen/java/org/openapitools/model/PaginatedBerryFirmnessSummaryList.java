package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BerryFirmnessSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PaginatedBerryFirmnessSummaryList   {
  @JsonProperty("count")
  private Integer count;

  @JsonProperty("next")
  private URI next;

  @JsonProperty("previous")
  private URI previous;

  @JsonProperty("results")
  private List<BerryFirmnessSummary> results = new ArrayList<>();

  /**
   * The total number of resources available from this API.
   **/
  public PaginatedBerryFirmnessSummaryList count(Integer count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(example = "100", required = true, value = "The total number of resources available from this API.")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * The URL for the next page in the list, or null if there is no next page.
   **/
  public PaginatedBerryFirmnessSummaryList next(URI next) {
    this.next = next;
    return this;
  }

  
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/berry-firmness/?offset=40&limit=20", value = "The URL for the next page in the list, or null if there is no next page.")
  @JsonProperty("next")
  public URI getNext() {
    return next;
  }
  public void setNext(URI next) {
    this.next = next;
  }

  /**
   * The URL for the previous page in the list, or null if there is no previous page.
   **/
  public PaginatedBerryFirmnessSummaryList previous(URI previous) {
    this.previous = previous;
    return this;
  }

  
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/berry-firmness/?offset=0&limit=20", value = "The URL for the previous page in the list, or null if there is no previous page.")
  @JsonProperty("previous")
  public URI getPrevious() {
    return previous;
  }
  public void setPrevious(URI previous) {
    this.previous = previous;
  }

  /**
   * A list of API resources on this page.
   **/
  public PaginatedBerryFirmnessSummaryList results(List<BerryFirmnessSummary> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of API resources on this page.")
  @JsonProperty("results")
  public List<BerryFirmnessSummary> getResults() {
    return results;
  }
  public void setResults(List<BerryFirmnessSummary> results) {
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
    PaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList = (PaginatedBerryFirmnessSummaryList) o;
    return Objects.equals(count, paginatedBerryFirmnessSummaryList.count) &&
        Objects.equals(next, paginatedBerryFirmnessSummaryList.next) &&
        Objects.equals(previous, paginatedBerryFirmnessSummaryList.previous) &&
        Objects.equals(results, paginatedBerryFirmnessSummaryList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedBerryFirmnessSummaryList {\n");
    
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

