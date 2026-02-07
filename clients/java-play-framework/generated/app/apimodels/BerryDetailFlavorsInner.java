package apimodels;

import apimodels.BerryDetailFlavorsInnerFlavor;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BerryDetailFlavorsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BerryDetailFlavorsInner   {
  @JsonProperty("potency")
  @NotNull

  private Integer potency;

  @JsonProperty("flavor")
  @NotNull
@Valid

  private BerryDetailFlavorsInnerFlavor flavor;

  public BerryDetailFlavorsInner potency(Integer potency) {
    this.potency = potency;
    return this;
  }

   /**
   * Get potency
   * @return potency
  **/
  public Integer getPotency() {
    return potency;
  }

  public void setPotency(Integer potency) {
    this.potency = potency;
  }

  public BerryDetailFlavorsInner flavor(BerryDetailFlavorsInnerFlavor flavor) {
    this.flavor = flavor;
    return this;
  }

   /**
   * Get flavor
   * @return flavor
  **/
  public BerryDetailFlavorsInnerFlavor getFlavor() {
    return flavor;
  }

  public void setFlavor(BerryDetailFlavorsInnerFlavor flavor) {
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
    BerryDetailFlavorsInner berryDetailFlavorsInner = (BerryDetailFlavorsInner) o;
    return Objects.equals(potency, berryDetailFlavorsInner.potency) &&
        Objects.equals(flavor, berryDetailFlavorsInner.flavor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potency, flavor);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryDetailFlavorsInner {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

