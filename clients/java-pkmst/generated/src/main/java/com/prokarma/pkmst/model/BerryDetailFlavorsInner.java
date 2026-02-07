package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.BerryDetailFlavorsInnerFlavor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * BerryDetailFlavorsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T15:23:15.032724200Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BerryDetailFlavorsInner   {
  @JsonProperty("potency")
  private Integer potency;

  @JsonProperty("flavor")
  private BerryDetailFlavorsInnerFlavor flavor;

  public BerryDetailFlavorsInner potency(Integer potency) {
    this.potency = potency;
    return this;
  }

  /**
   * Get potency
   * @return potency
   */
  @ApiModelProperty(required = true, value = "")
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
   */
  @ApiModelProperty(required = true, value = "")
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

