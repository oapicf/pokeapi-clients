package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EggGroupDetailPokemonSpeciesInner   {

    private String name;
    private URI url;

    /**
     * Default constructor.
     */
    public EggGroupDetailPokemonSpeciesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create EggGroupDetailPokemonSpeciesInner.
     *
     * @param name Pokemon species name.
     * @param url The URL to get more information about the species
     */
    public EggGroupDetailPokemonSpeciesInner(
        String name, 
        URI url
    ) {
        this.name = name;
        this.url = url;
    }



    /**
     * Pokemon species name.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The URL to get more information about the species
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
        sb.append("class EggGroupDetailPokemonSpeciesInner {\n");
        
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

