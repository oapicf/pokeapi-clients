package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonShapeDetailAwesomeNamesInner   {

    private String awesomeName;
    private AbilityDetailPokemonInnerPokemon language;

    /**
     * Default constructor.
     */
    public PokemonShapeDetailAwesomeNamesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonShapeDetailAwesomeNamesInner.
     *
     * @param awesomeName awesomeName
     * @param language language
     */
    public PokemonShapeDetailAwesomeNamesInner(
        String awesomeName, 
        AbilityDetailPokemonInnerPokemon language
    ) {
        this.awesomeName = awesomeName;
        this.language = language;
    }



    /**
     * Get awesomeName
     * @return awesomeName
     */
    public String getAwesomeName() {
        return awesomeName;
    }

    public void setAwesomeName(String awesomeName) {
        this.awesomeName = awesomeName;
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
        sb.append("class PokemonShapeDetailAwesomeNamesInner {\n");
        
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

