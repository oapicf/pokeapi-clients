package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.BerryFlavorSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BerryFlavorMap   {
  
  private Integer potency;
  private BerryFlavorSummary flavor;

  public BerryFlavorMap () {

  }

  public BerryFlavorMap (Integer potency, BerryFlavorSummary flavor) {
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
