package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.TypeDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TypeDetailPokemonInner   {

    private Integer slot;
    private TypeDetailPokemonInnerPokemon pokemon;

    /**
     * Default constructor.
     */
    public TypeDetailPokemonInner() {
    // JSON-B / Jackson
    }

    /**
     * Create TypeDetailPokemonInner.
     *
     * @param slot slot
     * @param pokemon pokemon
     */
    public TypeDetailPokemonInner(
        Integer slot, 
        TypeDetailPokemonInnerPokemon pokemon
    ) {
        this.slot = slot;
        this.pokemon = pokemon;
    }



    /**
     * Get slot
     * @return slot
     */
    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    /**
     * Get pokemon
     * @return pokemon
     */
    public TypeDetailPokemonInnerPokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(TypeDetailPokemonInnerPokemon pokemon) {
        this.pokemon = pokemon;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeDetailPokemonInner {\n");
        
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

