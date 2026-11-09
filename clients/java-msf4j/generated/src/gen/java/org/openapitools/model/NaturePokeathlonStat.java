package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokeathlonStatSummary;

/**
 * NaturePokeathlonStat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class NaturePokeathlonStat   {
  @JsonProperty("max_change")
  private Integer maxChange;

  @JsonProperty("pokeathlon_stat")
  private PokeathlonStatSummary pokeathlonStat;

  public NaturePokeathlonStat maxChange(Integer maxChange) {
    this.maxChange = maxChange;
    return this;
  }

   /**
   * The amount of change.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxChange
  **/
  @ApiModelProperty(required = true, value = "The amount of change.")
  public Integer getMaxChange() {
    return maxChange;
  }

  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

  public NaturePokeathlonStat pokeathlonStat(PokeathlonStatSummary pokeathlonStat) {
    this.pokeathlonStat = pokeathlonStat;
    return this;
  }

   /**
   * The stat being affected.
   * @return pokeathlonStat
  **/
  @ApiModelProperty(required = true, value = "The stat being affected.")
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

