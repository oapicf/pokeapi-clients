package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.PokeathlonStatDetailAffectingNaturesDecreaseInner;
import com.prokarma.pkmst.model.PokeathlonStatDetailAffectingNaturesIncreaseInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokeathlonStatDetailAffectingNatures
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokeathlonStatDetailAffectingNatures   {
  @JsonProperty("decrease")
  
  private List<PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease = new ArrayList<>();

  @JsonProperty("increase")
  
  private List<PokeathlonStatDetailAffectingNaturesIncreaseInner> increase = new ArrayList<>();

  public PokeathlonStatDetailAffectingNatures decrease(List<PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease) {
    this.decrease = decrease;
    return this;
  }

  public PokeathlonStatDetailAffectingNatures addDecreaseItem(PokeathlonStatDetailAffectingNaturesDecreaseInner decreaseItem) {
    if (this.decrease == null) {
      this.decrease = new ArrayList<>();
    }
    this.decrease.add(decreaseItem);
    return this;
  }

  /**
   * Get decrease
   * @return decrease
   */
  @ApiModelProperty(required = true, value = "")
  public List<PokeathlonStatDetailAffectingNaturesDecreaseInner> getDecrease() {
    return decrease;
  }

  public void setDecrease(List<PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease) {
    this.decrease = decrease;
  }

  public PokeathlonStatDetailAffectingNatures increase(List<PokeathlonStatDetailAffectingNaturesIncreaseInner> increase) {
    this.increase = increase;
    return this;
  }

  public PokeathlonStatDetailAffectingNatures addIncreaseItem(PokeathlonStatDetailAffectingNaturesIncreaseInner increaseItem) {
    if (this.increase == null) {
      this.increase = new ArrayList<>();
    }
    this.increase.add(increaseItem);
    return this;
  }

  /**
   * Get increase
   * @return increase
   */
  @ApiModelProperty(required = true, value = "")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

