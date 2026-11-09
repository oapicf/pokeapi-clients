package org.openapitools.server.model;

import org.openapitools.server.model.PokemonSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TypePokemon   {

    private Integer slot;
    private PokemonSummary pokemon;

    /**
     * Default constructor.
     */
    public TypePokemon() {
    // JSON-B / Jackson
    }

    /**
     * Create TypePokemon.
     *
     * @param slot The order the Pokémon&#39;s types are listed in.
     * @param pokemon The Pokémon that has the referenced type.
     */
    public TypePokemon(
        Integer slot, 
        PokemonSummary pokemon
    ) {
        this.slot = slot;
        this.pokemon = pokemon;
    }



    /**
     * The order the Pokémon's types are listed in.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return slot
     */
    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    /**
     * The Pokémon that has the referenced type.
     * @return pokemon
     */
    public PokemonSummary getPokemon() {
        return pokemon;
    }

    public void setPokemon(PokemonSummary pokemon) {
        this.pokemon = pokemon;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypePokemon {\n");
        
        sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
        sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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

