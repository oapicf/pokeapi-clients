package apimodels;

import apimodels.PokeathlonStatSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NaturePokeathlonStat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class NaturePokeathlonStat   {
  @JsonProperty("max_change")
  @NotNull
@Min(-2147483648)
@Max(2147483647)

  private Integer maxChange;

  @JsonProperty("pokeathlon_stat")
  @NotNull
@Valid

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
    return Objects.equals(maxChange, naturePokeathlonStat.maxChange) &&
        Objects.equals(pokeathlonStat, naturePokeathlonStat.pokeathlonStat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxChange, pokeathlonStat);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

