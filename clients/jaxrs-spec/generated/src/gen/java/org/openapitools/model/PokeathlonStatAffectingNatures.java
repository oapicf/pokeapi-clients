package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokeathlonStatAffectingNature;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokeathlonStatAffectingNatures")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokeathlonStatAffectingNatures   {
  private List<@Valid PokeathlonStatAffectingNature> increase = new ArrayList<>();
  private List<@Valid PokeathlonStatAffectingNature> decrease = new ArrayList<>();

  public PokeathlonStatAffectingNatures() {
  }

  @JsonCreator
  public PokeathlonStatAffectingNatures(
    @JsonProperty(required = true, value = "increase") List<@Valid PokeathlonStatAffectingNature> increase,
    @JsonProperty(required = true, value = "decrease") List<@Valid PokeathlonStatAffectingNature> decrease
  ) {
    this.increase = increase;
    this.decrease = decrease;
  }

  /**
   * A list of natures and how they change the referenced Pokéathlon stat.
   **/
  public PokeathlonStatAffectingNatures increase(List<@Valid PokeathlonStatAffectingNature> increase) {
    this.increase = increase;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of natures and how they change the referenced Pokéathlon stat.")
  @JsonProperty(required = true, value = "increase")
  @NotNull public List<@Valid PokeathlonStatAffectingNature> getIncrease() {
    return increase;
  }

  @JsonProperty(required = true, value = "increase")
  public void setIncrease(List<@Valid PokeathlonStatAffectingNature> increase) {
    this.increase = increase;
  }

  public PokeathlonStatAffectingNatures addIncreaseItem(PokeathlonStatAffectingNature increaseItem) {
    if (this.increase == null) {
      this.increase = new ArrayList<>();
    }

    this.increase.add(increaseItem);
    return this;
  }

  public PokeathlonStatAffectingNatures removeIncreaseItem(PokeathlonStatAffectingNature increaseItem) {
    if (increaseItem != null && this.increase != null) {
      this.increase.remove(increaseItem);
    }

    return this;
  }
  /**
   * A list of natures and how they change the referenced Pokéathlon stat.
   **/
  public PokeathlonStatAffectingNatures decrease(List<@Valid PokeathlonStatAffectingNature> decrease) {
    this.decrease = decrease;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of natures and how they change the referenced Pokéathlon stat.")
  @JsonProperty(required = true, value = "decrease")
  @NotNull public List<@Valid PokeathlonStatAffectingNature> getDecrease() {
    return decrease;
  }

  @JsonProperty(required = true, value = "decrease")
  public void setDecrease(List<@Valid PokeathlonStatAffectingNature> decrease) {
    this.decrease = decrease;
  }

  public PokeathlonStatAffectingNatures addDecreaseItem(PokeathlonStatAffectingNature decreaseItem) {
    if (this.decrease == null) {
      this.decrease = new ArrayList<>();
    }

    this.decrease.add(decreaseItem);
    return this;
  }

  public PokeathlonStatAffectingNatures removeDecreaseItem(PokeathlonStatAffectingNature decreaseItem) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
