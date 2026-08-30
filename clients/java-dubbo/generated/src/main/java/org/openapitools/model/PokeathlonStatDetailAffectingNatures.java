package org.openapitools.model;

import org.openapitools.model.PokeathlonStatDetailAffectingNaturesDecreaseInner;
import org.openapitools.model.PokeathlonStatDetailAffectingNaturesIncreaseInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PokeathlonStatDetailAffectingNatures implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("decrease")
  private List<PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease = new ArrayList<>();

  @JsonProperty("increase")
  private List<PokeathlonStatDetailAffectingNaturesIncreaseInner> increase = new ArrayList<>();

  /**
   * 
   * @return decrease
   */
  public List<PokeathlonStatDetailAffectingNaturesDecreaseInner> getDecrease() {
    return decrease;
  }

  public void setDecrease(List<PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease) {
    this.decrease = decrease;
  }

  /**
   * 
   * @return increase
   */
  public List<PokeathlonStatDetailAffectingNaturesIncreaseInner> getIncrease() {
    return increase;
  }

  public void setIncrease(List<PokeathlonStatDetailAffectingNaturesIncreaseInner> increase) {
    this.increase = increase;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokeathlonStatDetailAffectingNatures pokeathlonStatDetailAffectingNatures = (PokeathlonStatDetailAffectingNatures) o;
    return Objects.equals(this.decrease, pokeathlonStatDetailAffectingNatures.decrease) &&
        Objects.equals(this.increase, pokeathlonStatDetailAffectingNatures.increase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decrease, increase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokeathlonStatDetailAffectingNatures {\n");
    
    sb.append("    decrease: ").append(toIndentedString(decrease)).append("\n");
    sb.append("    increase: ").append(toIndentedString(increase)).append("\n");
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
