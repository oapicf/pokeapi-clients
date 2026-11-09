package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TypeGameSprite   {

    private String nameIcon;
    private String symbolIcon;

    /**
     * Default constructor.
     */
    public TypeGameSprite() {
    // JSON-B / Jackson
    }

    /**
     * Create TypeGameSprite.
     *
     * @param nameIcon The URL of the icon displaying the type name in this game, or null if unavailable.
     * @param symbolIcon The URL of the type symbol icon in this game, or null if unavailable.
     */
    public TypeGameSprite(
        String nameIcon, 
        String symbolIcon
    ) {
        this.nameIcon = nameIcon;
        this.symbolIcon = symbolIcon;
    }



    /**
     * The URL of the icon displaying the type name in this game, or null if unavailable.
     * @return nameIcon
     */
    public String getNameIcon() {
        return nameIcon;
    }

    public void setNameIcon(String nameIcon) {
        this.nameIcon = nameIcon;
    }

    /**
     * The URL of the type symbol icon in this game, or null if unavailable.
     * @return symbolIcon
     */
    public String getSymbolIcon() {
        return symbolIcon;
    }

    public void setSymbolIcon(String symbolIcon) {
        this.symbolIcon = symbolIcon;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeGameSprite {\n");
        
        sb.append("    nameIcon: ").append(toIndentedString(nameIcon)).append("\n");
        sb.append("    symbolIcon: ").append(toIndentedString(symbolIcon)).append("\n");
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

