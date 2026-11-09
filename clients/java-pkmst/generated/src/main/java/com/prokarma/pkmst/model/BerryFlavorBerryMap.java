package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.BerrySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * BerryFlavorBerryMap
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class BerryFlavorBerryMap   {
  @JsonProperty("potency")
  private Integer potency;

  @JsonProperty("berry")
  private BerrySummary berry;

  public BerryFlavorBerryMap potency(Integer potency) {
    this.potency = potency;
    return this;
  }

  /**
   * How powerful the referenced flavor is for this berry.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return potency
   */
  @ApiModelProperty(required = true, value = "How powerful the referenced flavor is for this berry.")
  public Integer getPotency() {
    return potency;
  }

  public void setPotency(Integer potency) {
    this.potency = potency;
  }

  public BerryFlavorBerryMap berry(BerrySummary berry) {
    this.berry = berry;
    return this;
  }

  /**
   * The berry with the referenced flavor.
   * @return berry
   */
  @ApiModelProperty(required = true, value = "The berry with the referenced flavor.")
  public BerrySummary getBerry() {
    return berry;
  }

  public void setBerry(BerrySummary berry) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

