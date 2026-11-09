package org.openapitools.server.model;

import org.openapitools.server.model.LanguageSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonSpeciesGenus   {

    private String genus;
    private LanguageSummary language;

    /**
     * Default constructor.
     */
    public PokemonSpeciesGenus() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonSpeciesGenus.
     *
     * @param genus The localized genus for the referenced Pokémon species
     * @param language The language this genus is in.
     */
    public PokemonSpeciesGenus(
        String genus, 
        LanguageSummary language
    ) {
        this.genus = genus;
        this.language = language;
    }



    /**
     * The localized genus for the referenced Pokémon species
     * @return genus
     */
    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    /**
     * The language this genus is in.
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
        sb.append("class PokemonSpeciesGenus {\n");
        
        sb.append("    genus: ").append(toIndentedString(genus)).append("\n");
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

