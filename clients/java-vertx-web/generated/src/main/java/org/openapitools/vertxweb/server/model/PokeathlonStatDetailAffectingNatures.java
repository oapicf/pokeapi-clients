package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.PokeathlonStatDetailAffectingNaturesDecreaseInner;
import org.openapitools.vertxweb.server.model.PokeathlonStatDetailAffectingNaturesIncreaseInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokeathlonStatDetailAffectingNatures   {
  
  private List<PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease = new ArrayList<>();
  private List<PokeathlonStatDetailAffectingNaturesIncreaseInner> increase = new ArrayList<>();

  public PokeathlonStatDetailAffectingNatures () {

  }

  public PokeathlonStatDetailAffectingNatures (List<PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease, List<PokeathlonStatDetailAffectingNaturesIncreaseInner> increase) {
    this.decrease = decrease;
    this.increase = increase;
  }

    
  @JsonProperty("decrease")
  public List<PokeathlonStatDetailAffectingNaturesDecreaseInner> getDecrease() {
    return decrease;
  }
  public void setDecrease(List<PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease) {
    this.decrease = decrease;
  }

    
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
