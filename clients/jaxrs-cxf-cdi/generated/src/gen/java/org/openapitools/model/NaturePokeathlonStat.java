package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokeathlonStatSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class NaturePokeathlonStat   {
  
  private Integer maxChange;

  private PokeathlonStatSummary pokeathlonStat;

  /**
   * The amount of change.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public NaturePokeathlonStat maxChange(Integer maxChange) {
    this.maxChange = maxChange;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The amount of change.")
  @JsonProperty("max_change")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getMaxChange() {
    return maxChange;
  }
  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }


  /**
   * The stat being affected.
   **/
  public NaturePokeathlonStat pokeathlonStat(PokeathlonStatSummary pokeathlonStat) {
    this.pokeathlonStat = pokeathlonStat;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The stat being affected.")
  @JsonProperty("pokeathlon_stat")
  @NotNull
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

