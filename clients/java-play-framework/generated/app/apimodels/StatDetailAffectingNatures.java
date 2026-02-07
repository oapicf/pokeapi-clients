package apimodels;

import apimodels.AbilityDetailPokemonInnerPokemon;
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
 * StatDetailAffectingNatures
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T15:23:19.397731995Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class StatDetailAffectingNatures   {
  @JsonProperty("increase")
  @NotNull
@Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> increase = new ArrayList<>();

  @JsonProperty("decrease")
  @NotNull
@Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> decrease = new ArrayList<>();

  public StatDetailAffectingNatures increase(List<@Valid AbilityDetailPokemonInnerPokemon> increase) {
    this.increase = increase;
    return this;
  }

  public StatDetailAffectingNatures addIncreaseItem(AbilityDetailPokemonInnerPokemon increaseItem) {
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
  public List<@Valid AbilityDetailPokemonInnerPokemon> getIncrease() {
    return increase;
  }

  public void setIncrease(List<@Valid AbilityDetailPokemonInnerPokemon> increase) {
    this.increase = increase;
  }

  public StatDetailAffectingNatures decrease(List<@Valid AbilityDetailPokemonInnerPokemon> decrease) {
    this.decrease = decrease;
    return this;
  }

  public StatDetailAffectingNatures addDecreaseItem(AbilityDetailPokemonInnerPokemon decreaseItem) {
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
  public List<@Valid AbilityDetailPokemonInnerPokemon> getDecrease() {
    return decrease;
  }

  public void setDecrease(List<@Valid AbilityDetailPokemonInnerPokemon> decrease) {
    this.decrease = decrease;
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
    return Objects.equals(increase, statDetailAffectingNatures.increase) &&
        Objects.equals(decrease, statDetailAffectingNatures.decrease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increase, decrease);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

