package org.openapitools.server.model;

import org.openapitools.server.model.PokemonSpeciesSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonDexNumber   {

    private Integer entryNumber;
    private PokemonSpeciesSummary pokemonSpecies;

    /**
     * Default constructor.
     */
    public PokemonDexNumber() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonDexNumber.
     *
     * @param entryNumber The index of this Pokémon species entry within the Pokédex.
     * @param pokemonSpecies The Pokémon species being encountered.
     */
    public PokemonDexNumber(
        Integer entryNumber, 
        PokemonSpeciesSummary pokemonSpecies
    ) {
        this.entryNumber = entryNumber;
        this.pokemonSpecies = pokemonSpecies;
    }



    /**
     * The index of this Pokémon species entry within the Pokédex.
     * @return entryNumber
     */
    public Integer getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(Integer entryNumber) {
        this.entryNumber = entryNumber;
    }

    /**
     * The Pokémon species being encountered.
     * @return pokemonSpecies
     */
    public PokemonSpeciesSummary getPokemonSpecies() {
        return pokemonSpecies;
    }

    public void setPokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDexNumber {\n");
        
        sb.append("    entryNumber: ").append(toIndentedString(entryNumber)).append("\n");
        sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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

