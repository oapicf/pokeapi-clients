package apimodels;

import apimodels.PokeathlonStatDetailAffectingNaturesDecreaseInner;
import apimodels.PokeathlonStatDetailAffectingNaturesIncreaseInner;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokeathlonStatDetailAffectingNatures
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokeathlonStatDetailAffectingNatures   {
  @JsonProperty("decrease")
  @NotNull
@Valid

  private List<@Valid PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease = new ArrayList<>();

  @JsonProperty("increase")
  @NotNull
@Valid

  private List<@Valid PokeathlonStatDetailAffectingNaturesIncreaseInner> increase = new ArrayList<>();

  public PokeathlonStatDetailAffectingNatures decrease(List<@Valid PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease) {
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
  **/
  public List<@Valid PokeathlonStatDetailAffectingNaturesDecreaseInner> getDecrease() {
    return decrease;
  }

  public void setDecrease(List<@Valid PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease) {
    this.decrease = decrease;
  }

  public PokeathlonStatDetailAffectingNatures increase(List<@Valid PokeathlonStatDetailAffectingNaturesIncreaseInner> increase) {
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
  **/
  public List<@Valid PokeathlonStatDetailAffectingNaturesIncreaseInner> getIncrease() {
    return increase;
  }

  public void setIncrease(List<@Valid PokeathlonStatDetailAffectingNaturesIncreaseInner> increase) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

