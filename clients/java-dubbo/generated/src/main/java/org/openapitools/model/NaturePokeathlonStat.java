package org.openapitools.model;

import org.openapitools.model.PokeathlonStatSummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class NaturePokeathlonStat implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The amount of change.
   */
  @JsonProperty("max_change")
  private Integer maxChange;

  /**
   * The stat being affected.
   */
  @JsonProperty("pokeathlon_stat")
  private PokeathlonStatSummary pokeathlonStat;

  /**
   * The amount of change.
   * @return maxChange
   */
  public Integer getMaxChange() {
    return maxChange;
  }

  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

  /**
   * The stat being affected.
   * @return pokeathlonStat
   */
  public PokeathlonStatSummary getPokeathlonStat() {
    return pokeathlonStat;
  }

  public void setPokeathlonStat(PokeathlonStatSummary pokeathlonStat) {
    this.pokeathlonStat = pokeathlonStat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NaturePokeathlonStat naturePokeathlonStat = (NaturePokeathlonStat) o;
    return Objects.equals(this.maxChange, naturePokeathlonStat.maxChange) &&
        Objects.equals(this.pokeathlonStat, naturePokeathlonStat.pokeathlonStat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxChange, pokeathlonStat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NaturePokeathlonStat {\n");
    
    sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
    sb.append("    pokeathlonStat: ").append(toIndentedString(pokeathlonStat)).append("\n");
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
