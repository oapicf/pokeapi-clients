package org.openapitools.server.model;

import org.openapitools.server.model.LanguageSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonShapeAwesomeName   {

    private String awesomeName;
    private LanguageSummary language;

    /**
     * Default constructor.
     */
    public PokemonShapeAwesomeName() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonShapeAwesomeName.
     *
     * @param awesomeName The localized \&quot;scientific\&quot; name for an API resource in a specific language.
     * @param language The language this \&quot;scientific\&quot; name is in.
     */
    public PokemonShapeAwesomeName(
        String awesomeName, 
        LanguageSummary language
    ) {
        this.awesomeName = awesomeName;
        this.language = language;
    }



    /**
     * The localized \"scientific\" name for an API resource in a specific language.
     * @return awesomeName
     */
    public String getAwesomeName() {
        return awesomeName;
    }

    public void setAwesomeName(String awesomeName) {
        this.awesomeName = awesomeName;
    }

    /**
     * The language this \"scientific\" name is in.
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
        sb.append("class PokemonShapeAwesomeName {\n");
        
        sb.append("    awesomeName: ").append(toIndentedString(awesomeName)).append("\n");
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

