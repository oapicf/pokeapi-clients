package org.openapitools.model;

import org.openapitools.model.StatSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonStat  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer baseStat;

  @ApiModelProperty(required = true, value = "")
  private Integer effort;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private StatSummary stat;
 /**
  * Get baseStat
  * @return baseStat
  */
  @JsonProperty("base_stat")
  @NotNull
  public Integer getBaseStat() {
    return baseStat;
  }

  /**
   * Sets the <code>baseStat</code> property.
   */
 public void setBaseStat(Integer baseStat) {
    this.baseStat = baseStat;
  }

  /**
   * Sets the <code>baseStat</code> property.
   */
  public PokemonStat baseStat(Integer baseStat) {
    this.baseStat = baseStat;
    return this;
  }

 /**
  * Get effort
  * @return effort
  */
  @JsonProperty("effort")
  @NotNull
  public Integer getEffort() {
    return effort;
  }

  /**
   * Sets the <code>effort</code> property.
   */
 public void setEffort(Integer effort) {
    this.effort = effort;
  }

  /**
   * Sets the <code>effort</code> property.
   */
  public PokemonStat effort(Integer effort) {
    this.effort = effort;
    return this;
  }

 /**
  * Get stat
  * @return stat
  */
  @JsonProperty("stat")
  @NotNull
  public StatSummary getStat() {
    return stat;
  }

  /**
   * Sets the <code>stat</code> property.
   */
 public void setStat(StatSummary stat) {
    this.stat = stat;
  }

  /**
   * Sets the <code>stat</code> property.
   */
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

