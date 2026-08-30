package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TypeDetailSpritesValueValue   {

    private URI nameIcon;

    /**
     * Default constructor.
     */
    public TypeDetailSpritesValueValue() {
    // JSON-B / Jackson
    }

    /**
     * Create TypeDetailSpritesValueValue.
     *
     * @param nameIcon nameIcon
     */
    public TypeDetailSpritesValueValue(
        URI nameIcon
    ) {
        this.nameIcon = nameIcon;
    }



    /**
     * Get nameIcon
     * @return nameIcon
     */
    public URI getNameIcon() {
        return nameIcon;
    }

    public void setNameIcon(URI nameIcon) {
        this.nameIcon = nameIcon;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeDetailSpritesValueValue {\n");
        
        sb.append("    nameIcon: ").append(toIndentedString(nameIcon)).append("\n");
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

