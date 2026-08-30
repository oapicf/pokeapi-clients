package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonDetailSprites extends HashMap<String, URI>  {

    private URI frontDefault;

    /**
     * Default constructor.
     */
    public PokemonDetailSprites() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonDetailSprites.
     *
     * @param frontDefault frontDefault
     */
    public PokemonDetailSprites(
        URI frontDefault
    ) {
        this.frontDefault = frontDefault;
    }



    /**
     * Get frontDefault
     * @return frontDefault
     */
    public URI getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(URI frontDefault) {
        this.frontDefault = frontDefault;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDetailSprites {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
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

