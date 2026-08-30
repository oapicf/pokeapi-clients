package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemDetailSprites   {

    private URI _default;

    /**
     * Default constructor.
     */
    public ItemDetailSprites() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemDetailSprites.
     *
     * @param _default _default
     */
    public ItemDetailSprites(
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
        sb.append("class ItemDetailSprites {\n");
        
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

