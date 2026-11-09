package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.NatureSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokeathlonStatAffectingNature   {
  
  private Integer maxChange;
  private NatureSummary nature;

  public PokeathlonStatAffectingNature () {

  }

  public PokeathlonStatAffectingNature (Integer maxChange, NatureSummary nature) {
    this.maxChange = maxChange;
    this.nature = nature;
  }

    
  @JsonProperty("max_change")
  public Integer getMaxChange() {
    return maxChange;
  }
  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

    
  @JsonProperty("nature")
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
    return Objects.equals(maxChange, pokeathlonStatAffectingNature.maxChange) &&
        Objects.equals(nature, pokeathlonStatAffectingNature.nature);
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
