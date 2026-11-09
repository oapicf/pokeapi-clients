package org.openapitools.model;

import org.openapitools.model.BerryFlavorSummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class BerryFlavorMap implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * How powerful the referenced flavor is for this berry.
   */
  @JsonProperty("potency")
  private Integer potency;

  /**
   * The referenced berry flavor.
   */
  @JsonProperty("flavor")
  private BerryFlavorSummary flavor;

  /**
   * How powerful the referenced flavor is for this berry.
   * @return potency
   */
  public Integer getPotency() {
    return potency;
  }

  public void setPotency(Integer potency) {
    this.potency = potency;
  }

  /**
   * The referenced berry flavor.
   * @return flavor
   */
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
