package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.GenerationSummary;
import org.openapitools.server.model.PokemonAbilityPast;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonPastAbility   {

    private List<@Valid PokemonAbilityPast> abilities = new ArrayList<>();
    private GenerationSummary generation;

    /**
     * Default constructor.
     */
    public PokemonPastAbility() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonPastAbility.
     *
     * @param abilities The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
     * @param generation The last generation in which the referenced pokémon had the listed abilities.
     */
    public PokemonPastAbility(
        List<@Valid PokemonAbilityPast> abilities, 
        GenerationSummary generation
    ) {
        this.abilities = abilities;
        this.generation = generation;
    }



    /**
     * The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
     * @return abilities
     */
    public List<@Valid PokemonAbilityPast> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<@Valid PokemonAbilityPast> abilities) {
        this.abilities = abilities;
    }

    /**
     * The last generation in which the referenced pokémon had the listed abilities.
     * @return generation
     */
    public GenerationSummary getGeneration() {
        return generation;
    }

    public void setGeneration(GenerationSummary generation) {
        this.generation = generation;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonPastAbility {\n");
        
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

