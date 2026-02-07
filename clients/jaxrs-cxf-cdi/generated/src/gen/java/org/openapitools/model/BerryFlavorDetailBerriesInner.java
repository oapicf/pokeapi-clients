package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BerryFlavorDetailBerriesInnerBerry;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class BerryFlavorDetailBerriesInner   {
  
  private Integer potency;

  private BerryFlavorDetailBerriesInnerBerry berry;

  /**
   **/
  public BerryFlavorDetailBerriesInner potency(Integer potency) {
    this.potency = potency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("potency")
  @NotNull
  public Integer getPotency() {
    return potency;
  }
  public void setPotency(Integer potency) {
    this.potency = potency;
  }


  /**
   **/
  public BerryFlavorDetailBerriesInner berry(BerryFlavorDetailBerriesInnerBerry berry) {
    this.berry = berry;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("berry")
  @NotNull
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

