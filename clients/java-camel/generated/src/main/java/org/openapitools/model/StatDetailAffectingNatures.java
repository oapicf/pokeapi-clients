package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StatDetailAffectingNatures
 */

@JsonTypeName("StatDetail_affecting_natures")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class StatDetailAffectingNatures {

  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> increase = new ArrayList<>();

  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> decrease = new ArrayList<>();

  public StatDetailAffectingNatures() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StatDetailAffectingNatures(List<@Valid AbilityDetailPokemonInnerPokemon> increase, List<@Valid AbilityDetailPokemonInnerPokemon> decrease) {
    this.increase = increase;
    this.decrease = decrease;
  }

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
   */
  @NotNull @Valid 
  @Schema(name = "increase", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("increase")
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
   */
  @NotNull @Valid 
  @Schema(name = "decrease", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("decrease")
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

