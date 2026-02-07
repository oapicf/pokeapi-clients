package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class StatDetailAffectingNatures  {
  
  @ApiModelProperty(required = true, value = "")

  private List<AbilityDetailPokemonInnerPokemon> increase = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<AbilityDetailPokemonInnerPokemon> decrease = new ArrayList<>();
 /**
   * Get increase
   * @return increase
  **/
  @JsonProperty("increase")
  public List<AbilityDetailPokemonInnerPokemon> getIncrease() {
    return increase;
  }

  public void setIncrease(List<AbilityDetailPokemonInnerPokemon> increase) {
    this.increase = increase;
  }

  public StatDetailAffectingNatures increase(List<AbilityDetailPokemonInnerPokemon> increase) {
    this.increase = increase;
    return this;
  }

  public StatDetailAffectingNatures addIncreaseItem(AbilityDetailPokemonInnerPokemon increaseItem) {
    this.increase.add(increaseItem);
    return this;
  }

 /**
   * Get decrease
   * @return decrease
  **/
  @JsonProperty("decrease")
  public List<AbilityDetailPokemonInnerPokemon> getDecrease() {
    return decrease;
  }

  public void setDecrease(List<AbilityDetailPokemonInnerPokemon> decrease) {
    this.decrease = decrease;
  }

  public StatDetailAffectingNatures decrease(List<AbilityDetailPokemonInnerPokemon> decrease) {
    this.decrease = decrease;
    return this;
  }

  public StatDetailAffectingNatures addDecreaseItem(AbilityDetailPokemonInnerPokemon decreaseItem) {
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
    StatDetailAffectingNatures statDetailAffectingNatures = (StatDetailAffectingNatures) o;
    return Objects.equals(this.increase, statDetailAffectingNatures.increase) &&
        Objects.equals(this.decrease, statDetailAffectingNatures.decrease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increase, decrease);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatDetailAffectingNatures {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

