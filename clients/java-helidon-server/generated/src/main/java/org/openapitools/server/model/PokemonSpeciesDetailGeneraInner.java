package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonSpeciesDetailGeneraInner   {

    private String genus;
    private AbilityDetailPokemonInnerPokemon language;

    /**
     * Default constructor.
     */
    public PokemonSpeciesDetailGeneraInner() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonSpeciesDetailGeneraInner.
     *
     * @param genus genus
     * @param language language
     */
    public PokemonSpeciesDetailGeneraInner(
        String genus, 
        AbilityDetailPokemonInnerPokemon language
    ) {
        this.genus = genus;
        this.language = language;
    }



    /**
     * Get genus
     * @return genus
     */
    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    /**
     * Get language
     * @return language
     */
    public AbilityDetailPokemonInnerPokemon getLanguage() {
        return language;
    }

    public void setLanguage(AbilityDetailPokemonInnerPokemon language) {
        this.language = language;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonSpeciesDetailGeneraInner {\n");
        
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

