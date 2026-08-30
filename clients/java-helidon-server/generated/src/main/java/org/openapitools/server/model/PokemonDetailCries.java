package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonDetailCries   {

    private URI latest;
    private URI legacy;

    /**
     * Default constructor.
     */
    public PokemonDetailCries() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonDetailCries.
     *
     * @param latest latest
     * @param legacy legacy
     */
    public PokemonDetailCries(
        URI latest, 
        URI legacy
    ) {
        this.latest = latest;
        this.legacy = legacy;
    }



    /**
     * Get latest
     * @return latest
     */
    public URI getLatest() {
        return latest;
    }

    public void setLatest(URI latest) {
        this.latest = latest;
    }

    /**
     * Get legacy
     * @return legacy
     */
    public URI getLegacy() {
        return legacy;
    }

    public void setLegacy(URI legacy) {
        this.legacy = legacy;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDetailCries {\n");
        
        sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
        sb.append("    legacy: ").append(toIndentedString(legacy)).append("\n");
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

