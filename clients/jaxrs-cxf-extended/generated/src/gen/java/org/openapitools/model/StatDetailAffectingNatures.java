package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class StatDetailAffectingNatures  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> increase = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> decrease = new ArrayList<>();
 /**
  * Get increase
  * @return increase
  */
  @JsonProperty("increase")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getIncrease() {
    return increase;
  }

  /**
   * Sets the <code>increase</code> property.
   */
 public void setIncrease(List<@Valid AbilityDetailPokemonInnerPokemon> increase) {
    this.increase = increase;
  }

  /**
   * Sets the <code>increase</code> property.
   */
  public StatDetailAffectingNatures increase(List<@Valid AbilityDetailPokemonInnerPokemon> increase) {
    this.increase = increase;
    return this;
  }

  /**
   * Adds a new item to the <code>increase</code> list.
   */
  public StatDetailAffectingNatures addIncreaseItem(AbilityDetailPokemonInnerPokemon increaseItem) {
    this.increase.add(increaseItem);
    return this;
  }

 /**
  * Get decrease
  * @return decrease
  */
  @JsonProperty("decrease")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getDecrease() {
    return decrease;
  }

  /**
   * Sets the <code>decrease</code> property.
   */
 public void setDecrease(List<@Valid AbilityDetailPokemonInnerPokemon> decrease) {
    this.decrease = decrease;
  }

  /**
   * Sets the <code>decrease</code> property.
   */
  public StatDetailAffectingNatures decrease(List<@Valid AbilityDetailPokemonInnerPokemon> decrease) {
    this.decrease = decrease;
    return this;
  }

  /**
   * Adds a new item to the <code>decrease</code> list.
   */
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

