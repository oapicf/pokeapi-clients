package org.openapitools.server.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ContestTypeSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PaginatedContestTypeSummaryList   {

    private Integer count;
    private URI next;
    private URI previous;
    private List<@Valid ContestTypeSummary> results = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PaginatedContestTypeSummaryList() {
    // JSON-B / Jackson
    }

    /**
     * Create PaginatedContestTypeSummaryList.
     *
     * @param count The total number of resources available from this API.
     * @param next The URL for the next page in the list, or null if there is no next page.
     * @param previous The URL for the previous page in the list, or null if there is no previous page.
     * @param results A list of API resources on this page.
     */
    public PaginatedContestTypeSummaryList(
        Integer count, 
        URI next, 
        URI previous, 
        List<@Valid ContestTypeSummary> results
    ) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }



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
    public List<@Valid ContestTypeSummary> getResults() {
        return results;
    }

    public void setResults(List<@Valid ContestTypeSummary> results) {
        this.results = results;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaginatedContestTypeSummaryList {\n");
        
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

