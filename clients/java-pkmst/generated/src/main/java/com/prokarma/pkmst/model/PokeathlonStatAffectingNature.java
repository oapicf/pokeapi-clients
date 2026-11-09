package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.NatureSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokeathlonStatAffectingNature
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokeathlonStatAffectingNature   {
  @JsonProperty("max_change")
  private Integer maxChange;

  @JsonProperty("nature")
  private NatureSummary nature;

  public PokeathlonStatAffectingNature maxChange(Integer maxChange) {
    this.maxChange = maxChange;
    return this;
  }

  /**
   * The maximum amount of change to the referenced Pokéathlon stat.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxChange
   */
  @ApiModelProperty(required = true, value = "The maximum amount of change to the referenced Pokéathlon stat.")
  public Integer getMaxChange() {
    return maxChange;
  }

  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

  public PokeathlonStatAffectingNature nature(NatureSummary nature) {
    this.nature = nature;
    return this;
  }

  /**
   * The nature causing the change.
   * @return nature
   */
  @ApiModelProperty(required = true, value = "The nature causing the change.")
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

