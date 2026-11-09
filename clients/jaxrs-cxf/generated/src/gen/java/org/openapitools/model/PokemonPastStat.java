package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.PokemonStat;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonPastStat  {
  
 /**
  * The last generation in which the referenced pokémon had the listed stats.
  */
  @ApiModelProperty(required = true, value = "The last generation in which the referenced pokémon had the listed stats.")

  @Valid

  private GenerationSummary generation;

 /**
  * The stat the Pokémon had up to and including the listed generation.
  */
  @ApiModelProperty(required = true, value = "The stat the Pokémon had up to and including the listed generation.")

  private List<@Valid PokemonStat> stats = new ArrayList<>();
 /**
   * The last generation in which the referenced pokémon had the listed stats.
   * @return generation
  **/
  @JsonProperty("generation")
  @NotNull
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public PokemonPastStat generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

 /**
   * The stat the Pokémon had up to and including the listed generation.
   * @return stats
  **/
  @JsonProperty("stats")
  @NotNull
  public List<@Valid PokemonStat> getStats() {
    return stats;
  }

  public void setStats(List<@Valid PokemonStat> stats) {
    this.stats = stats;
  }

  public PokemonPastStat stats(List<@Valid PokemonStat> stats) {
    this.stats = stats;
    return this;
  }

  public PokemonPastStat addStatsItem(PokemonStat statsItem) {
    this.stats.add(statsItem);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonPastStat pokemonPastStat = (PokemonPastStat) o;
    return Objects.equals(this.generation, pokemonPastStat.generation) &&
        Objects.equals(this.stats, pokemonPastStat.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generation, stats);
  }

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

