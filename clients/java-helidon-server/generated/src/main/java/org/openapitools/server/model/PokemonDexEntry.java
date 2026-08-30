package org.openapitools.server.model;

import org.openapitools.server.model.PokedexSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonDexEntry   {

    private Integer entryNumber;
    private PokedexSummary pokedex;

    /**
     * Default constructor.
     */
    public PokemonDexEntry() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonDexEntry.
     *
     * @param entryNumber entryNumber
     * @param pokedex pokedex
     */
    public PokemonDexEntry(
        Integer entryNumber, 
        PokedexSummary pokedex
    ) {
        this.entryNumber = entryNumber;
        this.pokedex = pokedex;
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
     * Get pokedex
     * @return pokedex
     */
    public PokedexSummary getPokedex() {
        return pokedex;
    }

    public void setPokedex(PokedexSummary pokedex) {
        this.pokedex = pokedex;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDexEntry {\n");
        
        sb.append("    entryNumber: ").append(toIndentedString(entryNumber)).append("\n");
        sb.append("    pokedex: ").append(toIndentedString(pokedex)).append("\n");
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

