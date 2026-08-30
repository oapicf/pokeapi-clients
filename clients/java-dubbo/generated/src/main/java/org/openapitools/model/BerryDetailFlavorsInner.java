package org.openapitools.model;

import org.openapitools.model.BerryDetailFlavorsInnerFlavor;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class BerryDetailFlavorsInner implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("potency")
  private Integer potency;

  @JsonProperty("flavor")
  private BerryDetailFlavorsInnerFlavor flavor;

  /**
   * 
   * @return potency
   */
  public Integer getPotency() {
    return potency;
  }

  public void setPotency(Integer potency) {
    this.potency = potency;
  }

  /**
   * 
   * @return flavor
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
