package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BerryFlavorSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class BerryFlavorMap   {
  @JsonProperty("potency")
  private Integer potency;

  @JsonProperty("flavor")
  private BerryFlavorSummary flavor;

  /**
   * How powerful the referenced flavor is for this berry.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public BerryFlavorMap potency(Integer potency) {
    this.potency = potency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "How powerful the referenced flavor is for this berry.")
  @JsonProperty("potency")
  public Integer getPotency() {
    return potency;
  }
  public void setPotency(Integer potency) {
    this.potency = potency;
  }

  /**
   * The referenced berry flavor.
   **/
  public BerryFlavorMap flavor(BerryFlavorSummary flavor) {
    this.flavor = flavor;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The referenced berry flavor.")
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

