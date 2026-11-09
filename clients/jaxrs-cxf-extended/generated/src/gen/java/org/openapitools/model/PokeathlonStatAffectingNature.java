package org.openapitools.model;

import org.openapitools.model.NatureSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokeathlonStatAffectingNature  {
  
 /**
  * The maximum amount of change to the referenced Pokéathlon stat.
  */
  @ApiModelProperty(required = true, value = "The maximum amount of change to the referenced Pokéathlon stat.")
  private Integer maxChange;

 /**
  * The nature causing the change.
  */
  @ApiModelProperty(required = true, value = "The nature causing the change.")
  @Valid
  private NatureSummary nature;
 /**
  * The maximum amount of change to the referenced Pokéathlon stat.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return maxChange
  */
  @JsonProperty("max_change")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getMaxChange() {
    return maxChange;
  }

  /**
   * Sets the <code>maxChange</code> property.
   */
 public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

  /**
   * Sets the <code>maxChange</code> property.
   */
  public PokeathlonStatAffectingNature maxChange(Integer maxChange) {
    this.maxChange = maxChange;
    return this;
  }

 /**
  * The nature causing the change.
  * @return nature
  */
  @JsonProperty("nature")
  @NotNull
  public NatureSummary getNature() {
    return nature;
  }

  /**
   * Sets the <code>nature</code> property.
   */
 public void setNature(NatureSummary nature) {
    this.nature = nature;
  }

  /**
   * Sets the <code>nature</code> property.
   */
  public PokeathlonStatAffectingNature nature(NatureSummary nature) {
    this.nature = nature;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

