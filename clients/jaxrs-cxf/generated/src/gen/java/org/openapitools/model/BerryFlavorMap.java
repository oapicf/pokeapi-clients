package org.openapitools.model;

import org.openapitools.model.BerryFlavorSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BerryFlavorMap  {
  
 /**
  * How powerful the referenced flavor is for this berry.
  */
  @ApiModelProperty(required = true, value = "How powerful the referenced flavor is for this berry.")

  private Integer potency;

 /**
  * The referenced berry flavor.
  */
  @ApiModelProperty(required = true, value = "The referenced berry flavor.")

  @Valid

  private BerryFlavorSummary flavor;
 /**
   * How powerful the referenced flavor is for this berry.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return potency
  **/
  @JsonProperty("potency")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getPotency() {
    return potency;
  }

  public void setPotency(Integer potency) {
    this.potency = potency;
  }

  public BerryFlavorMap potency(Integer potency) {
    this.potency = potency;
    return this;
  }

 /**
   * The referenced berry flavor.
   * @return flavor
  **/
  @JsonProperty("flavor")
  @NotNull
  public BerryFlavorSummary getFlavor() {
    return flavor;
  }

  public void setFlavor(BerryFlavorSummary flavor) {
    this.flavor = flavor;
  }

  public BerryFlavorMap flavor(BerryFlavorSummary flavor) {
    this.flavor = flavor;
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
    BerryFlavorMap berryFlavorMap = (BerryFlavorMap) o;
    return Objects.equals(this.potency, berryFlavorMap.potency) &&
        Objects.equals(this.flavor, berryFlavorMap.flavor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potency, flavor);
  }

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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

