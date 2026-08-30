package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.PokemonDetailAbilitiesInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonDetailPastAbilitiesInner   {

    private List<@Valid PokemonDetailAbilitiesInner> abilities = new ArrayList<>();
    private AbilityDetailPokemonInnerPokemon generation;

    /**
     * Default constructor.
     */
    public PokemonDetailPastAbilitiesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonDetailPastAbilitiesInner.
     *
     * @param abilities abilities
     * @param generation generation
     */
    public PokemonDetailPastAbilitiesInner(
        List<@Valid PokemonDetailAbilitiesInner> abilities, 
        AbilityDetailPokemonInnerPokemon generation
    ) {
        this.abilities = abilities;
        this.generation = generation;
    }



    /**
     * Get abilities
     * @return abilities
     */
    public List<@Valid PokemonDetailAbilitiesInner> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<@Valid PokemonDetailAbilitiesInner> abilities) {
        this.abilities = abilities;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDetailPastAbilitiesInner {\n");
        
        sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
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

