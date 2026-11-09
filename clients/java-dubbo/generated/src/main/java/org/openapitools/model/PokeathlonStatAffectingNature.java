package org.openapitools.model;

import org.openapitools.model.NatureSummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokeathlonStatAffectingNature implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The maximum amount of change to the referenced Pokéathlon stat.
   */
  @JsonProperty("max_change")
  private Integer maxChange;

  /**
   * The nature causing the change.
   */
  @JsonProperty("nature")
  private NatureSummary nature;

  /**
   * The maximum amount of change to the referenced Pokéathlon stat.
   * @return maxChange
   */
  public Integer getMaxChange() {
    return maxChange;
  }

  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

  /**
   * The nature causing the change.
   * @return nature
   */
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
