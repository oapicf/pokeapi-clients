package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.GenerationSummary;
import org.openapitools.vertxweb.server.model.PokemonStat;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonPastStat   {
  
  private GenerationSummary generation;
  private List<PokemonStat> stats = new ArrayList<>();

  public PokemonPastStat () {

  }

  public PokemonPastStat (GenerationSummary generation, List<PokemonStat> stats) {
    this.generation = generation;
    this.stats = stats;
  }

    
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

    
  @JsonProperty("stats")
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
    return Objects.equals(generation, pokemonPastStat.generation) &&
        Objects.equals(stats, pokemonPastStat.stats);
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
