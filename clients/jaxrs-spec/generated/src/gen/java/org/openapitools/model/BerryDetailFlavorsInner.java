package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BerryDetailFlavorsInnerFlavor;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("BerryDetail_flavors_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T15:24:06.001755207Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BerryDetailFlavorsInner   {
  private Integer potency;
  private BerryDetailFlavorsInnerFlavor flavor;

  public BerryDetailFlavorsInner() {
  }

  @JsonCreator
  public BerryDetailFlavorsInner(
    @JsonProperty(required = true, value = "potency") Integer potency,
    @JsonProperty(required = true, value = "flavor") BerryDetailFlavorsInnerFlavor flavor
  ) {
    this.potency = potency;
    this.flavor = flavor;
  }

  /**
   **/
  public BerryDetailFlavorsInner potency(Integer potency) {
    this.potency = potency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "potency")
  @NotNull public Integer getPotency() {
    return potency;
  }

  @JsonProperty(required = true, value = "potency")
  public void setPotency(Integer potency) {
    this.potency = potency;
  }

  /**
   **/
  public BerryDetailFlavorsInner flavor(BerryDetailFlavorsInnerFlavor flavor) {
    this.flavor = flavor;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "flavor")
  @NotNull @Valid public BerryDetailFlavorsInnerFlavor getFlavor() {
    return flavor;
  }

  @JsonProperty(required = true, value = "flavor")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

