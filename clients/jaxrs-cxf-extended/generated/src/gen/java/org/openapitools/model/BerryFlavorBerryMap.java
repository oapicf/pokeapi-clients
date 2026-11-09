package org.openapitools.model;

import org.openapitools.model.BerrySummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BerryFlavorBerryMap  {
  
 /**
  * How powerful the referenced flavor is for this berry.
  */
  @ApiModelProperty(required = true, value = "How powerful the referenced flavor is for this berry.")
  private Integer potency;

 /**
  * The berry with the referenced flavor.
  */
  @ApiModelProperty(required = true, value = "The berry with the referenced flavor.")
  @Valid
  private BerrySummary berry;
 /**
  * How powerful the referenced flavor is for this berry.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return potency
  */
  @JsonProperty("potency")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getPotency() {
    return potency;
  }

  /**
   * Sets the <code>potency</code> property.
   */
 public void setPotency(Integer potency) {
    this.potency = potency;
  }

  /**
   * Sets the <code>potency</code> property.
   */
  public BerryFlavorBerryMap potency(Integer potency) {
    this.potency = potency;
    return this;
  }

 /**
  * The berry with the referenced flavor.
  * @return berry
  */
  @JsonProperty("berry")
  @NotNull
  public BerrySummary getBerry() {
    return berry;
  }

  /**
   * Sets the <code>berry</code> property.
   */
 public void setBerry(BerrySummary berry) {
    this.berry = berry;
  }

  /**
   * Sets the <code>berry</code> property.
   */
  public BerryFlavorBerryMap berry(BerrySummary berry) {
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
    BerryFlavorBerryMap berryFlavorBerryMap = (BerryFlavorBerryMap) o;
    return Objects.equals(this.potency, berryFlavorBerryMap.potency) &&
        Objects.equals(this.berry, berryFlavorBerryMap.berry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potency, berry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFlavorBerryMap {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

