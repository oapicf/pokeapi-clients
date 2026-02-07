package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.StatSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonStat   {
  
  private Integer baseStat;
  private Integer effort;
  private StatSummary stat;

  public PokemonStat () {

  }

  public PokemonStat (Integer baseStat, Integer effort, StatSummary stat) {
    this.baseStat = baseStat;
    this.effort = effort;
    this.stat = stat;
  }

    
  @JsonProperty("base_stat")
  public Integer getBaseStat() {
    return baseStat;
  }
  public void setBaseStat(Integer baseStat) {
    this.baseStat = baseStat;
  }

    
  @JsonProperty("effort")
  public Integer getEffort() {
    return effort;
  }
  public void setEffort(Integer effort) {
    this.effort = effort;
  }

    
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
    return Objects.equals(baseStat, pokemonStat.baseStat) &&
        Objects.equals(effort, pokemonStat.effort) &&
        Objects.equals(stat, pokemonStat.stat);
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
