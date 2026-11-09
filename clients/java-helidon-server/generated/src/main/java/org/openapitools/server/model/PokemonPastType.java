package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.GenerationSummary;
import org.openapitools.server.model.PokemonType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonPastType   {

    private GenerationSummary generation;
    private List<@Valid PokemonType> types = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokemonPastType() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonPastType.
     *
     * @param generation The last generation in which the referenced pokémon had the listed types.
     * @param types The types the referenced pokémon had up to and including the listed generation.
     */
    public PokemonPastType(
        GenerationSummary generation, 
        List<@Valid PokemonType> types
    ) {
        this.generation = generation;
        this.types = types;
    }



    /**
     * The last generation in which the referenced pokémon had the listed types.
     * @return generation
     */
    public GenerationSummary getGeneration() {
        return generation;
    }

    public void setGeneration(GenerationSummary generation) {
        this.generation = generation;
    }

    /**
     * The types the referenced pokémon had up to and including the listed generation.
     * @return types
     */
    public List<@Valid PokemonType> getTypes() {
        return types;
    }

    public void setTypes(List<@Valid PokemonType> types) {
        this.types = types;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonPastType {\n");
        
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

