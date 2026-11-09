package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BerryFlavorSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class BerryFlavorMap   {
  
  private Integer potency;

  private BerryFlavorSummary flavor;

  /**
   * How powerful the referenced flavor is for this berry.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public BerryFlavorMap potency(Integer potency) {
    this.potency = potency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "How powerful the referenced flavor is for this berry.")
  @JsonProperty("potency")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getPotency() {
    return potency;
  }
  public void setPotency(Integer potency) {
    this.potency = potency;
  }


  /**
   * The referenced berry flavor.
   **/
  public BerryFlavorMap flavor(BerryFlavorSummary flavor) {
    this.flavor = flavor;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The referenced berry flavor.")
  @JsonProperty("flavor")
  @NotNull
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

