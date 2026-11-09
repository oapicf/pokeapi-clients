package org.openapitools.model;

import org.openapitools.model.StatSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonStat  {
  
 /**
  * The base value of the stat.
  */
  @ApiModelProperty(required = true, value = "The base value of the stat.")

  private Integer baseStat;

 /**
  * The effort points (EV) the Pokémon has in the stat.
  */
  @ApiModelProperty(required = true, value = "The effort points (EV) the Pokémon has in the stat.")

  private Integer effort;

 /**
  * The stat the Pokémon has.
  */
  @ApiModelProperty(required = true, value = "The stat the Pokémon has.")

  @Valid

  private StatSummary stat;
 /**
   * The base value of the stat.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return baseStat
  **/
  @JsonProperty("base_stat")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getBaseStat() {
    return baseStat;
  }

  public void setBaseStat(Integer baseStat) {
    this.baseStat = baseStat;
  }

  public PokemonStat baseStat(Integer baseStat) {
    this.baseStat = baseStat;
    return this;
  }

 /**
   * The effort points (EV) the Pokémon has in the stat.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return effort
  **/
  @JsonProperty("effort")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getEffort() {
    return effort;
  }

  public void setEffort(Integer effort) {
    this.effort = effort;
  }

  public PokemonStat effort(Integer effort) {
    this.effort = effort;
    return this;
  }

 /**
   * The stat the Pokémon has.
   * @return stat
  **/
  @JsonProperty("stat")
  @NotNull
  public StatSummary getStat() {
    return stat;
  }

  public void setStat(StatSummary stat) {
    this.stat = stat;
  }

  public PokemonStat stat(StatSummary stat) {
    this.stat = stat;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

