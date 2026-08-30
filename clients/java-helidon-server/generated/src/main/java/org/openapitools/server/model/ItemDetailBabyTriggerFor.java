package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemDetailBabyTriggerFor   {

    private URI url;

    /**
     * Default constructor.
     */
    public ItemDetailBabyTriggerFor() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemDetailBabyTriggerFor.
     *
     * @param url url
     */
    public ItemDetailBabyTriggerFor(
        URI url
    ) {
        this.url = url;
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
        sb.append("class ItemDetailBabyTriggerFor {\n");
        
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

