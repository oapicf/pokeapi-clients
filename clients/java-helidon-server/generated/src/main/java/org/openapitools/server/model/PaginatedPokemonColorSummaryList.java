package org.openapitools.server.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PokemonColorSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PaginatedPokemonColorSummaryList   {

    private Integer count;
    private URI next;
    private URI previous;
    private List<@Valid PokemonColorSummary> results = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PaginatedPokemonColorSummaryList() {
    // JSON-B / Jackson
    }

    /**
     * Create PaginatedPokemonColorSummaryList.
     *
     * @param count count
     * @param next next
     * @param previous previous
     * @param results results
     */
    public PaginatedPokemonColorSummaryList(
        Integer count, 
        URI next, 
        URI previous, 
        List<@Valid PokemonColorSummary> results
    ) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }



    /**
     * Get count
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Get next
     * @return next
     */
    public URI getNext() {
        return next;
    }

    public void setNext(URI next) {
        this.next = next;
    }

    /**
     * Get previous
     * @return previous
     */
    public URI getPrevious() {
        return previous;
    }

    public void setPrevious(URI previous) {
        this.previous = previous;
    }

    /**
     * Get results
     * @return results
     */
    public List<@Valid PokemonColorSummary> getResults() {
        return results;
    }

    public void setResults(List<@Valid PokemonColorSummary> results) {
        this.results = results;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaginatedPokemonColorSummaryList {\n");
        
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

