package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.PokemonDetailTypesInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonDetailPastTypesInner   {

    private AbilityDetailPokemonInnerPokemon generation;
    private List<@Valid PokemonDetailTypesInner> types = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokemonDetailPastTypesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonDetailPastTypesInner.
     *
     * @param generation generation
     * @param types types
     */
    public PokemonDetailPastTypesInner(
        AbilityDetailPokemonInnerPokemon generation, 
        List<@Valid PokemonDetailTypesInner> types
    ) {
        this.generation = generation;
        this.types = types;
    }



    /**
     * Get generation
     * @return generation
     */
    public AbilityDetailPokemonInnerPokemon getGeneration() {
        return generation;
    }

    public void setGeneration(AbilityDetailPokemonInnerPokemon generation) {
        this.generation = generation;
    }

    /**
     * Get types
     * @return types
     */
    public List<@Valid PokemonDetailTypesInner> getTypes() {
        return types;
    }

    public void setTypes(List<@Valid PokemonDetailTypesInner> types) {
        this.types = types;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDetailPastTypesInner {\n");
        
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

