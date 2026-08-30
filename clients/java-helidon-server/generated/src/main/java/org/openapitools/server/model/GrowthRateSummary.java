package org.openapitools.server.model;

import java.net.URI;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GrowthRateSummary   {

    private String name;
    private URI url;

    /**
     * Default constructor.
     */
    public GrowthRateSummary() {
    // JSON-B / Jackson
    }

    /**
     * Create GrowthRateSummary.
     *
     * @param name name
     * @param url url
     */
    public GrowthRateSummary(
        String name, 
        URI url
    ) {
        this.name = name;
        this.url = url;
    }



    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get url
     * @return url
     */
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GrowthRateSummary {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

