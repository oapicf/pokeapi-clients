package org.openapitools.server.model;

import org.openapitools.server.model.LanguageSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LocationAreaName   {

    private String name;
    private LanguageSummary language;

    /**
     * Default constructor.
     */
    public LocationAreaName() {
    // JSON-B / Jackson
    }

    /**
     * Create LocationAreaName.
     *
     * @param name The localized name for an API resource in a specific language.
     * @param language The language this name is in.
     */
    public LocationAreaName(
        String name, 
        LanguageSummary language
    ) {
        this.name = name;
        this.language = language;
    }



    /**
     * The localized name for an API resource in a specific language.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The language this name is in.
     * @return language
     */
    public LanguageSummary getLanguage() {
        return language;
    }

    public void setLanguage(LanguageSummary language) {
        this.language = language;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationAreaName {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

