package org.openapitools.model;

import org.openapitools.model.GenerationSummary;
import org.openapitools.model.PokemonStat;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonPastStat implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The last generation in which the referenced pokémon had the listed stats.
   */
  @JsonProperty("generation")
  private GenerationSummary generation;

  /**
   * The stat the Pokémon had up to and including the listed generation.
   */
  @JsonProperty("stats")
  private List<PokemonStat> stats = new ArrayList<>();

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
  public List<PokemonStat> getStats() {
    return stats;
  }

  public void setStats(List<PokemonStat> stats) {
    this.stats = stats;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
