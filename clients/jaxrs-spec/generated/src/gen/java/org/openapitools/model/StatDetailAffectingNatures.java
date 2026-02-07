package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("StatDetail_affecting_natures")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T15:24:06.001755207Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class StatDetailAffectingNatures   {
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> increase = new ArrayList<>();
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> decrease = new ArrayList<>();

  public StatDetailAffectingNatures() {
  }

  @JsonCreator
  public StatDetailAffectingNatures(
    @JsonProperty(required = true, value = "increase") List<@Valid AbilityDetailPokemonInnerPokemon> increase,
    @JsonProperty(required = true, value = "decrease") List<@Valid AbilityDetailPokemonInnerPokemon> decrease
  ) {
    this.increase = increase;
    this.decrease = decrease;
  }

  /**
   **/
  public StatDetailAffectingNatures increase(List<@Valid AbilityDetailPokemonInnerPokemon> increase) {
    this.increase = increase;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "increase")
  @NotNull @Valid public List<@Valid AbilityDetailPokemonInnerPokemon> getIncrease() {
    return increase;
  }

  @JsonProperty(required = true, value = "increase")
  public void setIncrease(List<@Valid AbilityDetailPokemonInnerPokemon> increase) {
    this.increase = increase;
  }

  public StatDetailAffectingNatures addIncreaseItem(AbilityDetailPokemonInnerPokemon increaseItem) {
    if (this.increase == null) {
      this.increase = new ArrayList<>();
    }

    this.increase.add(increaseItem);
    return this;
  }

  public StatDetailAffectingNatures removeIncreaseItem(AbilityDetailPokemonInnerPokemon increaseItem) {
    if (increaseItem != null && this.increase != null) {
      this.increase.remove(increaseItem);
    }

    return this;
  }
  /**
   **/
  public StatDetailAffectingNatures decrease(List<@Valid AbilityDetailPokemonInnerPokemon> decrease) {
    this.decrease = decrease;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "decrease")
  @NotNull @Valid public List<@Valid AbilityDetailPokemonInnerPokemon> getDecrease() {
    return decrease;
  }

  @JsonProperty(required = true, value = "decrease")
  public void setDecrease(List<@Valid AbilityDetailPokemonInnerPokemon> decrease) {
    this.decrease = decrease;
  }

  public StatDetailAffectingNatures addDecreaseItem(AbilityDetailPokemonInnerPokemon decreaseItem) {
    if (this.decrease == null) {
      this.decrease = new ArrayList<>();
    }

    this.decrease.add(decreaseItem);
    return this;
  }

  public StatDetailAffectingNatures removeDecreaseItem(AbilityDetailPokemonInnerPokemon decreaseItem) {
    if (decreaseItem != null && this.decrease != null) {
      this.decrease.remove(decreaseItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

