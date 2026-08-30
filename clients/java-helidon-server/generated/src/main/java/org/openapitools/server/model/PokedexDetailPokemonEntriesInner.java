package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokedexDetailPokemonEntriesInner   {

    private Integer entryNumber;
    private AbilityDetailPokemonInnerPokemon pokemonSpecies;

    /**
     * Default constructor.
     */
    public PokedexDetailPokemonEntriesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create PokedexDetailPokemonEntriesInner.
     *
     * @param entryNumber entryNumber
     * @param pokemonSpecies pokemonSpecies
     */
    public PokedexDetailPokemonEntriesInner(
        Integer entryNumber, 
        AbilityDetailPokemonInnerPokemon pokemonSpecies
    ) {
        this.entryNumber = entryNumber;
        this.pokemonSpecies = pokemonSpecies;
    }



    /**
     * Get entryNumber
     * @return entryNumber
     */
    public Integer getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(Integer entryNumber) {
        this.entryNumber = entryNumber;
    }

    /**
     * Get pokemonSpecies
     * @return pokemonSpecies
     */
    public AbilityDetailPokemonInnerPokemon getPokemonSpecies() {
        return pokemonSpecies;
    }

    public void setPokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokedexDetailPokemonEntriesInner {\n");
        
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

