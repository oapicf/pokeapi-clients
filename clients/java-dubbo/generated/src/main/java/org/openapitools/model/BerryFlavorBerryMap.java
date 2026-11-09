package org.openapitools.model;

import org.openapitools.model.BerrySummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class BerryFlavorBerryMap implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * How powerful the referenced flavor is for this berry.
   */
  @JsonProperty("potency")
  private Integer potency;

  /**
   * The berry with the referenced flavor.
   */
  @JsonProperty("berry")
  private BerrySummary berry;

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
   * The berry with the referenced flavor.
   * @return berry
   */
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
