package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokeathlonStatAffectingNature;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokeathlonStatAffectingNatures  {
  
 /**
  * A list of natures and how they change the referenced Pokéathlon stat.
  */
  @ApiModelProperty(required = true, value = "A list of natures and how they change the referenced Pokéathlon stat.")

  private List<PokeathlonStatAffectingNature> increase = new ArrayList<>();

 /**
  * A list of natures and how they change the referenced Pokéathlon stat.
  */
  @ApiModelProperty(required = true, value = "A list of natures and how they change the referenced Pokéathlon stat.")

  private List<PokeathlonStatAffectingNature> decrease = new ArrayList<>();
 /**
   * A list of natures and how they change the referenced Pokéathlon stat.
   * @return increase
  **/
  @JsonProperty("increase")
  public List<PokeathlonStatAffectingNature> getIncrease() {
    return increase;
  }

  public void setIncrease(List<PokeathlonStatAffectingNature> increase) {
    this.increase = increase;
  }

  public PokeathlonStatAffectingNatures increase(List<PokeathlonStatAffectingNature> increase) {
    this.increase = increase;
    return this;
  }

  public PokeathlonStatAffectingNatures addIncreaseItem(PokeathlonStatAffectingNature increaseItem) {
    this.increase.add(increaseItem);
    return this;
  }

 /**
   * A list of natures and how they change the referenced Pokéathlon stat.
   * @return decrease
  **/
  @JsonProperty("decrease")
  public List<PokeathlonStatAffectingNature> getDecrease() {
    return decrease;
  }

  public void setDecrease(List<PokeathlonStatAffectingNature> decrease) {
    this.decrease = decrease;
  }

  public PokeathlonStatAffectingNatures decrease(List<PokeathlonStatAffectingNature> decrease) {
    this.decrease = decrease;
    return this;
  }

  public PokeathlonStatAffectingNatures addDecreaseItem(PokeathlonStatAffectingNature decreaseItem) {
    this.decrease.add(decreaseItem);
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
    PokeathlonStatAffectingNatures pokeathlonStatAffectingNatures = (PokeathlonStatAffectingNatures) o;
    return Objects.equals(this.increase, pokeathlonStatAffectingNatures.increase) &&
        Objects.equals(this.decrease, pokeathlonStatAffectingNatures.decrease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increase, decrease);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokeathlonStatAffectingNatures {\n");
    
    sb.append("    increase: ").append(toIndentedString(increase)).append("\n");
    sb.append("    decrease: ").append(toIndentedString(decrease)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

