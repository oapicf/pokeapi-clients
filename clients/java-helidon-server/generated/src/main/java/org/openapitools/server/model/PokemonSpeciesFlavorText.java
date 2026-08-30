package org.openapitools.server.model;

import org.openapitools.server.model.LanguageSummary;
import org.openapitools.server.model.VersionSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonSpeciesFlavorText   {

    private String flavorText;
    private LanguageSummary language;
    private VersionSummary version;

    /**
     * Default constructor.
     */
    public PokemonSpeciesFlavorText() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonSpeciesFlavorText.
     *
     * @param flavorText flavorText
     * @param language language
     * @param version version
     */
    public PokemonSpeciesFlavorText(
        String flavorText, 
        LanguageSummary language, 
        VersionSummary version
    ) {
        this.flavorText = flavorText;
        this.language = language;
        this.version = version;
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
     * Get version
     * @return version
     */
    public VersionSummary getVersion() {
        return version;
    }

    public void setVersion(VersionSummary version) {
        this.version = version;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonSpeciesFlavorText {\n");
        
        sb.append("    flavorText: ").append(toIndentedString(flavorText)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

