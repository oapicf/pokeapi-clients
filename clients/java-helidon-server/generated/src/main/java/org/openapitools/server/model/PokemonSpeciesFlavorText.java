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
     * @param flavorText The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this &lt;a href&#x3D;&#39;https://github.com/veekun/pokedex/issues/218#issuecomment-339841781&#39; &gt;issue&lt;/a&gt; to find out more. 
     * @param language The language this name is in.
     * @param version The game version this flavor text is extracted from.
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
     * The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. 
     * @return flavorText
     */
    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
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
     * The game version this flavor text is extracted from.
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

