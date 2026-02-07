package org.openapitools.model;

import java.util.Objects;
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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokeathlonStatDetailAffectingNatures   {
  @JsonProperty("decrease")
  private List<PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease = new ArrayList<>();

  @JsonProperty("increase")
  private List<PokeathlonStatDetailAffectingNaturesIncreaseInner> increase = new ArrayList<>();

  /**
   **/
  public PokeathlonStatDetailAffectingNatures decrease(List<PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease) {
    this.decrease = decrease;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("decrease")
  public List<PokeathlonStatDetailAffectingNaturesDecreaseInner> getDecrease() {
    return decrease;
  }
  public void setDecrease(List<PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease) {
    this.decrease = decrease;
  }

  /**
   **/
  public PokeathlonStatDetailAffectingNatures increase(List<PokeathlonStatDetailAffectingNaturesIncreaseInner> increase) {
    this.increase = increase;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("increase")
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
    return Objects.equals(decrease, pokeathlonStatDetailAffectingNatures.decrease) &&
        Objects.equals(increase, pokeathlonStatDetailAffectingNatures.increase);
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

