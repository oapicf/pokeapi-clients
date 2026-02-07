package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokeathlonStatDetailAffectingNaturesDecreaseInner;
import org.openapitools.model.PokeathlonStatDetailAffectingNaturesIncreaseInner;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokeathlonStatDetailAffectingNatures   {
  
  private List<@Valid PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease = new ArrayList<>();

  private List<@Valid PokeathlonStatDetailAffectingNaturesIncreaseInner> increase = new ArrayList<>();

  /**
   **/
  public PokeathlonStatDetailAffectingNatures decrease(List<@Valid PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease) {
    this.decrease = decrease;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("decrease")
  @NotNull
  public List<@Valid PokeathlonStatDetailAffectingNaturesDecreaseInner> getDecrease() {
    return decrease;
  }
  public void setDecrease(List<@Valid PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease) {
    this.decrease = decrease;
  }

  public PokeathlonStatDetailAffectingNatures addDecreaseItem(PokeathlonStatDetailAffectingNaturesDecreaseInner decreaseItem) {
    if (this.decrease == null) {
      this.decrease = new ArrayList<>();
    }
    this.decrease.add(decreaseItem);
    return this;
  }


  /**
   **/
  public PokeathlonStatDetailAffectingNatures increase(List<@Valid PokeathlonStatDetailAffectingNaturesIncreaseInner> increase) {
    this.increase = increase;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("increase")
  @NotNull
  public List<@Valid PokeathlonStatDetailAffectingNaturesIncreaseInner> getIncrease() {
    return increase;
  }
  public void setIncrease(List<@Valid PokeathlonStatDetailAffectingNaturesIncreaseInner> increase) {
    this.increase = increase;
  }

  public PokeathlonStatDetailAffectingNatures addIncreaseItem(PokeathlonStatDetailAffectingNaturesIncreaseInner increaseItem) {
    if (this.increase == null) {
      this.increase = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

