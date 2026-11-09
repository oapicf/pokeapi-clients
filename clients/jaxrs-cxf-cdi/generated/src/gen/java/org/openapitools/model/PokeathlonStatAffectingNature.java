package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NatureSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokeathlonStatAffectingNature   {
  
  private Integer maxChange;

  private NatureSummary nature;

  /**
   * The maximum amount of change to the referenced Pokéathlon stat.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokeathlonStatAffectingNature maxChange(Integer maxChange) {
    this.maxChange = maxChange;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The maximum amount of change to the referenced Pokéathlon stat.")
  @JsonProperty("max_change")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getMaxChange() {
    return maxChange;
  }
  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }


  /**
   * The nature causing the change.
   **/
  public PokeathlonStatAffectingNature nature(NatureSummary nature) {
    this.nature = nature;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The nature causing the change.")
  @JsonProperty("nature")
  @NotNull
  public NatureSummary getNature() {
    return nature;
  }
  public void setNature(NatureSummary nature) {
    this.nature = nature;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokeathlonStatAffectingNature pokeathlonStatAffectingNature = (PokeathlonStatAffectingNature) o;
    return Objects.equals(this.maxChange, pokeathlonStatAffectingNature.maxChange) &&
        Objects.equals(this.nature, pokeathlonStatAffectingNature.nature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxChange, nature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokeathlonStatAffectingNature {\n");
    
    sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
    sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
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

