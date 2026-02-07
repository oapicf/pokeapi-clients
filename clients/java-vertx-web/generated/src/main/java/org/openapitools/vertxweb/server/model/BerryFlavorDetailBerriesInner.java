package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.BerryFlavorDetailBerriesInnerBerry;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BerryFlavorDetailBerriesInner   {
  
  private Integer potency;
  private BerryFlavorDetailBerriesInnerBerry berry;

  public BerryFlavorDetailBerriesInner () {

  }

  public BerryFlavorDetailBerriesInner (Integer potency, BerryFlavorDetailBerriesInnerBerry berry) {
    this.potency = potency;
    this.berry = berry;
  }

    
  @JsonProperty("potency")
  public Integer getPotency() {
    return potency;
  }
  public void setPotency(Integer potency) {
    this.potency = potency;
  }

    
  @JsonProperty("berry")
  public BerryFlavorDetailBerriesInnerBerry getBerry() {
    return berry;
  }
  public void setBerry(BerryFlavorDetailBerriesInnerBerry berry) {
    this.berry = berry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner = (BerryFlavorDetailBerriesInner) o;
    return Objects.equals(potency, berryFlavorDetailBerriesInner.potency) &&
        Objects.equals(berry, berryFlavorDetailBerriesInner.berry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potency, berry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFlavorDetailBerriesInner {\n");
    
    sb.append("    potency: ").append(toIndentedString(potency)).append("\n");
    sb.append("    berry: ").append(toIndentedString(berry)).append("\n");
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
