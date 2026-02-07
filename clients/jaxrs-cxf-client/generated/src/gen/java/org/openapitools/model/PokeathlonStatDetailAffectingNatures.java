package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokeathlonStatDetailAffectingNaturesDecreaseInner;
import org.openapitools.model.PokeathlonStatDetailAffectingNaturesIncreaseInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokeathlonStatDetailAffectingNatures  {
  
  @ApiModelProperty(required = true, value = "")

  private List<PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<PokeathlonStatDetailAffectingNaturesIncreaseInner> increase = new ArrayList<>();
 /**
   * Get decrease
   * @return decrease
  **/
  @JsonProperty("decrease")
  public List<PokeathlonStatDetailAffectingNaturesDecreaseInner> getDecrease() {
    return decrease;
  }

  public void setDecrease(List<PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease) {
    this.decrease = decrease;
  }

  public PokeathlonStatDetailAffectingNatures decrease(List<PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease) {
    this.decrease = decrease;
    return this;
  }

  public PokeathlonStatDetailAffectingNatures addDecreaseItem(PokeathlonStatDetailAffectingNaturesDecreaseInner decreaseItem) {
    this.decrease.add(decreaseItem);
    return this;
  }

 /**
   * Get increase
   * @return increase
  **/
  @JsonProperty("increase")
  public List<PokeathlonStatDetailAffectingNaturesIncreaseInner> getIncrease() {
    return increase;
  }

  public void setIncrease(List<PokeathlonStatDetailAffectingNaturesIncreaseInner> increase) {
    this.increase = increase;
  }

  public PokeathlonStatDetailAffectingNatures increase(List<PokeathlonStatDetailAffectingNaturesIncreaseInner> increase) {
    this.increase = increase;
    return this;
  }

  public PokeathlonStatDetailAffectingNatures addIncreaseItem(PokeathlonStatDetailAffectingNaturesIncreaseInner increaseItem) {
    this.increase.add(increaseItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

