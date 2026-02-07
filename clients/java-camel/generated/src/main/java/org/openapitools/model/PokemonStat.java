package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.StatSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PokemonStat
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonStat {

  private Integer baseStat;

  private Integer effort;

  private StatSummary stat;

  public PokemonStat() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonStat(Integer baseStat, Integer effort, StatSummary stat) {
    this.baseStat = baseStat;
    this.effort = effort;
    this.stat = stat;
  }

  public PokemonStat baseStat(Integer baseStat) {
    this.baseStat = baseStat;
    return this;
  }

  /**
   * Get baseStat
   * @return baseStat
   */
  @NotNull 
  @Schema(name = "base_stat", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("base_stat")
  public Integer getBaseStat() {
    return baseStat;
  }

  public void setBaseStat(Integer baseStat) {
    this.baseStat = baseStat;
  }

  public PokemonStat effort(Integer effort) {
    this.effort = effort;
    return this;
  }

  /**
   * Get effort
   * @return effort
   */
  @NotNull 
  @Schema(name = "effort", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effort")
  public Integer getEffort() {
    return effort;
  }

  public void setEffort(Integer effort) {
    this.effort = effort;
  }

  public PokemonStat stat(StatSummary stat) {
    this.stat = stat;
    return this;
  }

  /**
   * Get stat
   * @return stat
   */
  @NotNull @Valid 
  @Schema(name = "stat", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stat")
  public StatSummary getStat() {
    return stat;
  }

  public void setStat(StatSummary stat) {
    this.stat = stat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonStat pokemonStat = (PokemonStat) o;
    return Objects.equals(this.baseStat, pokemonStat.baseStat) &&
        Objects.equals(this.effort, pokemonStat.effort) &&
        Objects.equals(this.stat, pokemonStat.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseStat, effort, stat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonStat {\n");
    sb.append("    baseStat: ").append(toIndentedString(baseStat)).append("\n");
    sb.append("    effort: ").append(toIndentedString(effort)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

