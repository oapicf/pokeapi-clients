package org.openapitools.server.model;

import org.openapitools.server.model.LanguageSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class SuperContestEffectFlavorText   {

    private String flavorText;
    private LanguageSummary language;

    /**
     * Default constructor.
     */
    public SuperContestEffectFlavorText() {
    // JSON-B / Jackson
    }

    /**
     * Create SuperContestEffectFlavorText.
     *
     * @param flavorText flavorText
     * @param language language
     */
    public SuperContestEffectFlavorText(
        String flavorText, 
        LanguageSummary language
    ) {
        this.flavorText = flavorText;
        this.language = language;
    }



    /**
     * Get flavorText
     * @return flavorText
     */
    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
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
        sb.append("class SuperContestEffectFlavorText {\n");
        
        sb.append("    flavorText: ").append(toIndentedString(flavorText)).append("\n");
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

