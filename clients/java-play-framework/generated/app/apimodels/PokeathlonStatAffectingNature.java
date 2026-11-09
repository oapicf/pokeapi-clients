package apimodels;

import apimodels.NatureSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokeathlonStatAffectingNature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokeathlonStatAffectingNature   {
  @JsonProperty("max_change")
  @NotNull
@Min(-2147483648)
@Max(2147483647)

  private Integer maxChange;

  @JsonProperty("nature")
  @NotNull
@Valid

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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

