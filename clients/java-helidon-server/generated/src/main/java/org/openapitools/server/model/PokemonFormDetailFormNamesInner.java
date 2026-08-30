package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonFormDetailFormNamesInner   {

    private AbilityDetailPokemonInnerPokemon language;
    private String name;

    /**
     * Default constructor.
     */
    public PokemonFormDetailFormNamesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonFormDetailFormNamesInner.
     *
     * @param language language
     * @param name name
     */
    public PokemonFormDetailFormNamesInner(
        AbilityDetailPokemonInnerPokemon language, 
        String name
    ) {
        this.language = language;
        this.name = name;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonFormDetailFormNamesInner {\n");
        
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

