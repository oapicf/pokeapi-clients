package apimodels;

import apimodels.StatSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonStat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonStat   {
  @JsonProperty("base_stat")
  @NotNull

  private Integer baseStat;

  @JsonProperty("effort")
  @NotNull

  private Integer effort;

  @JsonProperty("stat")
  @NotNull
@Valid

  private StatSummary stat;

  public PokemonStat baseStat(Integer baseStat) {
    this.baseStat = baseStat;
    return this;
  }

   /**
   * Get baseStat
   * @return baseStat
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

