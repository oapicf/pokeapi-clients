package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.BerryDetailFlavorsInnerFlavor;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BerryDetailFlavorsInner   {
  
  private Integer potency;
  private BerryDetailFlavorsInnerFlavor flavor;

  public BerryDetailFlavorsInner () {

  }

  public BerryDetailFlavorsInner (Integer potency, BerryDetailFlavorsInnerFlavor flavor) {
    this.potency = potency;
    this.flavor = flavor;
  }

    
  @JsonProperty("potency")
  public Integer getPotency() {
    return potency;
  }
  public void setPotency(Integer potency) {
    this.potency = potency;
  }

    
  @JsonProperty("flavor")
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
