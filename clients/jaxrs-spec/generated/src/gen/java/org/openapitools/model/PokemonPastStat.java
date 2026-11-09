package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.PokemonStat;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonPastStat")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonPastStat   {
  private GenerationSummary generation;
  private List<@Valid PokemonStat> stats = new ArrayList<>();

  public PokemonPastStat() {
  }

  @JsonCreator
  public PokemonPastStat(
    @JsonProperty(required = true, value = "generation") GenerationSummary generation,
    @JsonProperty(required = true, value = "stats") List<@Valid PokemonStat> stats
  ) {
    this.generation = generation;
    this.stats = stats;
  }

  /**
   * The last generation in which the referenced pokémon had the listed stats.
   **/
  public PokemonPastStat generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The last generation in which the referenced pokémon had the listed stats.")
  @JsonProperty(required = true, value = "generation")
  @NotNull @Valid public GenerationSummary getGeneration() {
    return generation;
  }

  @JsonProperty(required = true, value = "generation")
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * The stat the Pokémon had up to and including the listed generation.
   **/
  public PokemonPastStat stats(List<@Valid PokemonStat> stats) {
    this.stats = stats;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The stat the Pokémon had up to and including the listed generation.")
  @JsonProperty(required = true, value = "stats")
  @NotNull public List<@Valid PokemonStat> getStats() {
    return stats;
  }

  @JsonProperty(required = true, value = "stats")
  public void setStats(List<@Valid PokemonStat> stats) {
    this.stats = stats;
  }

  public PokemonPastStat addStatsItem(PokemonStat statsItem) {
    if (this.stats == null) {
      this.stats = new ArrayList<>();
    }

    this.stats.add(statsItem);
    return this;
  }

  public PokemonPastStat removeStatsItem(PokemonStat statsItem) {
    if (statsItem != null && this.stats != null) {
      this.stats.remove(statsItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
