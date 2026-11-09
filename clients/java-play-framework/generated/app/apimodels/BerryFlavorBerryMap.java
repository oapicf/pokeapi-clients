package apimodels;

import apimodels.BerrySummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BerryFlavorBerryMap
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BerryFlavorBerryMap   {
  @JsonProperty("potency")
  @NotNull
@Min(-2147483648)
@Max(2147483647)

  private Integer potency;

  @JsonProperty("berry")
  @NotNull
@Valid

  private BerrySummary berry;

  public BerryFlavorBerryMap potency(Integer potency) {
    this.potency = potency;
    return this;
  }

   /**
   * How powerful the referenced flavor is for this berry.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return potency
  **/
  public Integer getPotency() {
    return potency;
  }

  public void setPotency(Integer potency) {
    this.potency = potency;
  }

  public BerryFlavorBerryMap berry(BerrySummary berry) {
    this.berry = berry;
    return this;
  }

   /**
   * The berry with the referenced flavor.
   * @return berry
  **/
  public BerrySummary getBerry() {
    return berry;
  }

  public void setBerry(BerrySummary berry) {
    this.berry = berry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BerryFlavorBerryMap berryFlavorBerryMap = (BerryFlavorBerryMap) o;
    return Objects.equals(potency, berryFlavorBerryMap.potency) &&
        Objects.equals(berry, berryFlavorBerryMap.berry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potency, berry);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFlavorBerryMap {\n");
    
    sb.append("    potency: ").append(toIndentedString(potency)).append("\n");
    sb.append("    berry: ").append(toIndentedString(berry)).append("\n");
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

