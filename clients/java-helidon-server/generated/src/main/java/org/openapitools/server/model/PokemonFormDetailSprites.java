package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonFormDetailSprites extends HashMap<String, URI>  {

    private URI _default;

    /**
     * Default constructor.
     */
    public PokemonFormDetailSprites() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonFormDetailSprites.
     *
     * @param _default _default
     */
    public PokemonFormDetailSprites(
        URI _default
    ) {
        this._default = _default;
    }



    /**
     * Get _default
     * @return _default
     */
    public URI getDefault() {
        return _default;
    }

    public void setDefault(URI _default) {
        this._default = _default;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonFormDetailSprites {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

