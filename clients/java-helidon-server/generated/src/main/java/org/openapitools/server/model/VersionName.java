package org.openapitools.server.model;

import org.openapitools.server.model.LanguageSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class VersionName   {

    private String name;
    private LanguageSummary language;

    /**
     * Default constructor.
     */
    public VersionName() {
    // JSON-B / Jackson
    }

    /**
     * Create VersionName.
     *
     * @param name name
     * @param language language
     */
    public VersionName(
        String name, 
        LanguageSummary language
    ) {
        this.name = name;
        this.language = language;
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
     * Get language
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
        sb.append("class VersionName {\n");
        
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

