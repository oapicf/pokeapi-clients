package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.BerryDetailFlavorsInnerFlavor;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BerryDetailFlavorsInner  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer potency;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private BerryDetailFlavorsInnerFlavor flavor;
 /**
   * Get potency
   * @return potency
  **/
  @JsonProperty("potency")
  @NotNull
  public Integer getPotency() {
    return potency;
  }

  public void setPotency(Integer potency) {
    this.potency = potency;
  }

  public BerryDetailFlavorsInner potency(Integer potency) {
    this.potency = potency;
    return this;
  }

 /**
   * Get flavor
   * @return flavor
  **/
  @JsonProperty("flavor")
  @NotNull
  public BerryDetailFlavorsInnerFlavor getFlavor() {
    return flavor;
  }

  public void setFlavor(BerryDetailFlavorsInnerFlavor flavor) {
    this.flavor = flavor;
  }

  public BerryDetailFlavorsInner flavor(BerryDetailFlavorsInnerFlavor flavor) {
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
    BerryDetailFlavorsInner berryDetailFlavorsInner = (BerryDetailFlavorsInner) o;
    return Objects.equals(this.potency, berryDetailFlavorsInner.potency) &&
        Objects.equals(this.flavor, berryDetailFlavorsInner.flavor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potency, flavor);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

