package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokeathlonStatDetailAffectingNaturesDecreaseInner;
import org.openapitools.model.PokeathlonStatDetailAffectingNaturesIncreaseInner;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokeathlonStatDetailAffectingNatures
 */

@JsonTypeName("PokeathlonStatDetail_affecting_natures")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T02:00:43.960184425Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PokeathlonStatDetailAffectingNatures {

  private List<@Valid PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease = new ArrayList<>();

  private List<@Valid PokeathlonStatDetailAffectingNaturesIncreaseInner> increase = new ArrayList<>();

  public PokeathlonStatDetailAffectingNatures() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokeathlonStatDetailAffectingNatures(List<@Valid PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease, List<@Valid PokeathlonStatDetailAffectingNaturesIncreaseInner> increase) {
    this.decrease = decrease;
    this.increase = increase;
  }

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
   */
  @NotNull @Valid 
  @Schema(name = "decrease", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("decrease")
  public List<@Valid PokeathlonStatDetailAffectingNaturesDecreaseInner> getDecrease() {
    return decrease;
  }

  @JsonProperty("decrease")
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
   */
  @NotNull @Valid 
  @Schema(name = "increase", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("increase")
  public List<@Valid PokeathlonStatDetailAffectingNaturesIncreaseInner> getIncrease() {
    return increase;
  }

  @JsonProperty("increase")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

