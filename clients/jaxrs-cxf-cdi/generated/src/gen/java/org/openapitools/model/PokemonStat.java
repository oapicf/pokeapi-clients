package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.StatSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokemonStat   {
  
  private Integer baseStat;

  private Integer effort;

  private StatSummary stat;

  /**
   **/
  public PokemonStat baseStat(Integer baseStat) {
    this.baseStat = baseStat;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("base_stat")
  @NotNull
  public Integer getBaseStat() {
    return baseStat;
  }
  public void setBaseStat(Integer baseStat) {
    this.baseStat = baseStat;
  }


  /**
   **/
  public PokemonStat effort(Integer effort) {
    this.effort = effort;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("effort")
  @NotNull
  public Integer getEffort() {
    return effort;
  }
  public void setEffort(Integer effort) {
    this.effort = effort;
  }


  /**
   **/
  public PokemonStat stat(StatSummary stat) {
    this.stat = stat;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("stat")
  @NotNull
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

