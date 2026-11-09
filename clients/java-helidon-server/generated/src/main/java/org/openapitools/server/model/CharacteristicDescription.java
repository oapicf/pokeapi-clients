package org.openapitools.server.model;

import org.openapitools.server.model.LanguageSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CharacteristicDescription   {

    private String description;
    private LanguageSummary language;

    /**
     * Default constructor.
     */
    public CharacteristicDescription() {
    // JSON-B / Jackson
    }

    /**
     * Create CharacteristicDescription.
     *
     * @param description The localized description for an API resource in a specific language.
     * @param language The language this name is in.
     */
    public CharacteristicDescription(
        String description, 
        LanguageSummary language
    ) {
        this.description = description;
        this.language = language;
    }



    /**
     * The localized description for an API resource in a specific language.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        sb.append("class CharacteristicDescription {\n");
        
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

