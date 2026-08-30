package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonShapeDetailNamesInner   {

    private URI url;
    private String name;

    /**
     * Default constructor.
     */
    public PokemonShapeDetailNamesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonShapeDetailNamesInner.
     *
     * @param url url
     * @param name name
     */
    public PokemonShapeDetailNamesInner(
        URI url, 
        String name
    ) {
        this.url = url;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonShapeDetailNamesInner {\n");
        
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

