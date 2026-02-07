package org.openapitools.model;

import org.openapitools.model.BerryFlavorDetailBerriesInnerBerry;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BerryFlavorDetailBerriesInner  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer potency;

  @ApiModelProperty(required = true, value = "")

  private BerryFlavorDetailBerriesInnerBerry berry;
 /**
   * Get potency
   * @return potency
  **/
  @JsonProperty("potency")
  public Integer getPotency() {
    return potency;
  }

  public void setPotency(Integer potency) {
    this.potency = potency;
  }

  public BerryFlavorDetailBerriesInner potency(Integer potency) {
    this.potency = potency;
    return this;
  }

 /**
   * Get berry
   * @return berry
  **/
  @JsonProperty("berry")
  public BerryFlavorDetailBerriesInnerBerry getBerry() {
    return berry;
  }

  public void setBerry(BerryFlavorDetailBerriesInnerBerry berry) {
    this.berry = berry;
  }

  public BerryFlavorDetailBerriesInner berry(BerryFlavorDetailBerriesInnerBerry berry) {
    this.berry = berry;
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
    BerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner = (BerryFlavorDetailBerriesInner) o;
    return Objects.equals(this.potency, berryFlavorDetailBerriesInner.potency) &&
        Objects.equals(this.berry, berryFlavorDetailBerriesInner.berry);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

