package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemSprites   {

    private String _default;

    /**
     * Default constructor.
     */
    public ItemSprites() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemSprites.
     *
     * @param _default The default depiction of this item.
     */
    public ItemSprites(
        String _default
    ) {
        this._default = _default;
    }



    /**
     * The default depiction of this item.
     * @return _default
     */
    public String getDefault() {
        return _default;
    }

    public void setDefault(String _default) {
        this._default = _default;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemSprites {\n");
        
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

