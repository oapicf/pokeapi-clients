package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.StatSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonStat   {
  @JsonProperty("base_stat")
  private Integer baseStat;

  @JsonProperty("effort")
  private Integer effort;

  @JsonProperty("stat")
  private StatSummary stat;

  /**
   * The base value of the stat.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonStat baseStat(Integer baseStat) {
    this.baseStat = baseStat;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The base value of the stat.")
  @JsonProperty("base_stat")
  public Integer getBaseStat() {
    return baseStat;
  }
  public void setBaseStat(Integer baseStat) {
    this.baseStat = baseStat;
  }

  /**
   * The effort points (EV) the Pokémon has in the stat.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonStat effort(Integer effort) {
    this.effort = effort;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The effort points (EV) the Pokémon has in the stat.")
  @JsonProperty("effort")
  public Integer getEffort() {
    return effort;
  }
  public void setEffort(Integer effort) {
    this.effort = effort;
  }

  /**
   * The stat the Pokémon has.
   **/
  public PokemonStat stat(StatSummary stat) {
    this.stat = stat;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The stat the Pokémon has.")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

