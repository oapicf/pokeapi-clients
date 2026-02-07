package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BerryFlavorDetailBerriesInnerBerry;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BerryFlavorDetailBerriesInner   {
  @JsonProperty("potency")
  private Integer potency;

  @JsonProperty("berry")
  private BerryFlavorDetailBerriesInnerBerry berry;

  /**
   **/
  public BerryFlavorDetailBerriesInner potency(Integer potency) {
    this.potency = potency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("potency")
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

