package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.GenerationSummary;
import org.openapitools.server.model.PokemonStat;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonPastStat   {

    private GenerationSummary generation;
    private List<@Valid PokemonStat> stats = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokemonPastStat() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonPastStat.
     *
     * @param generation The last generation in which the referenced pokémon had the listed stats.
     * @param stats The stat the Pokémon had up to and including the listed generation.
     */
    public PokemonPastStat(
        GenerationSummary generation, 
        List<@Valid PokemonStat> stats
    ) {
        this.generation = generation;
        this.stats = stats;
    }



    /**
     * The last generation in which the referenced pokémon had the listed stats.
     * @return generation
     */
    public GenerationSummary getGeneration() {
        return generation;
    }

    public void setGeneration(GenerationSummary generation) {
        this.generation = generation;
    }

    /**
     * The stat the Pokémon had up to and including the listed generation.
     * @return stats
     */
    public List<@Valid PokemonStat> getStats() {
        return stats;
    }

    public void setStats(List<@Valid PokemonStat> stats) {
        this.stats = stats;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonPastStat {\n");
        
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

