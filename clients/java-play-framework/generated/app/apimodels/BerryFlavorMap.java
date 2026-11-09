package apimodels;

import apimodels.BerryFlavorSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BerryFlavorMap
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BerryFlavorMap   {
  @JsonProperty("potency")
  @NotNull
@Min(-2147483648)
@Max(2147483647)

  private Integer potency;

  @JsonProperty("flavor")
  @NotNull
@Valid

  private BerryFlavorSummary flavor;

  public BerryFlavorMap potency(Integer potency) {
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

  public BerryFlavorMap flavor(BerryFlavorSummary flavor) {
    this.flavor = flavor;
    return this;
  }

   /**
   * The referenced berry flavor.
   * @return flavor
  **/
  public BerryFlavorSummary getFlavor() {
    return flavor;
  }

  public void setFlavor(BerryFlavorSummary flavor) {
    this.flavor = flavor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BerryFlavorMap berryFlavorMap = (BerryFlavorMap) o;
    return Objects.equals(potency, berryFlavorMap.potency) &&
        Objects.equals(flavor, berryFlavorMap.flavor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potency, flavor);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFlavorMap {\n");
    
    sb.append("    potency: ").append(toIndentedString(potency)).append("\n");
    sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
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

