package org.openapitools.model;

import org.openapitools.model.PokeathlonStatSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NaturePokeathlonStat  {
  
 /**
  * The amount of change.
  */
  @ApiModelProperty(required = true, value = "The amount of change.")

  private Integer maxChange;

 /**
  * The stat being affected.
  */
  @ApiModelProperty(required = true, value = "The stat being affected.")

  @Valid

  private PokeathlonStatSummary pokeathlonStat;
 /**
   * The amount of change.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxChange
  **/
  @JsonProperty("max_change")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getMaxChange() {
    return maxChange;
  }

  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

  public NaturePokeathlonStat maxChange(Integer maxChange) {
    this.maxChange = maxChange;
    return this;
  }

 /**
   * The stat being affected.
   * @return pokeathlonStat
  **/
  @JsonProperty("pokeathlon_stat")
  @NotNull
  public PokeathlonStatSummary getPokeathlonStat() {
    return pokeathlonStat;
  }

  public void setPokeathlonStat(PokeathlonStatSummary pokeathlonStat) {
    this.pokeathlonStat = pokeathlonStat;
  }

  public NaturePokeathlonStat pokeathlonStat(PokeathlonStatSummary pokeathlonStat) {
    this.pokeathlonStat = pokeathlonStat;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

