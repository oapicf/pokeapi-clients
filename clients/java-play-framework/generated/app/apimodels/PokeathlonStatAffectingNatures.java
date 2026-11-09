package apimodels;

import apimodels.PokeathlonStatAffectingNature;
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
 * PokeathlonStatAffectingNatures
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokeathlonStatAffectingNatures   {
  @JsonProperty("increase")
  @NotNull
@Valid

  private List<@Valid PokeathlonStatAffectingNature> increase = new ArrayList<>();

  @JsonProperty("decrease")
  @NotNull
@Valid

  private List<@Valid PokeathlonStatAffectingNature> decrease = new ArrayList<>();

  public PokeathlonStatAffectingNatures increase(List<@Valid PokeathlonStatAffectingNature> increase) {
    this.increase = increase;
    return this;
  }

  public PokeathlonStatAffectingNatures addIncreaseItem(PokeathlonStatAffectingNature increaseItem) {
    if (this.increase == null) {
      this.increase = new ArrayList<>();
    }
    this.increase.add(increaseItem);
    return this;
  }

   /**
   * A list of natures and how they change the referenced Pokéathlon stat.
   * @return increase
  **/
  public List<@Valid PokeathlonStatAffectingNature> getIncrease() {
    return increase;
  }

  public void setIncrease(List<@Valid PokeathlonStatAffectingNature> increase) {
    this.increase = increase;
  }

  public PokeathlonStatAffectingNatures decrease(List<@Valid PokeathlonStatAffectingNature> decrease) {
    this.decrease = decrease;
    return this;
  }

  public PokeathlonStatAffectingNatures addDecreaseItem(PokeathlonStatAffectingNature decreaseItem) {
    if (this.decrease == null) {
      this.decrease = new ArrayList<>();
    }
    this.decrease.add(decreaseItem);
    return this;
  }

   /**
   * A list of natures and how they change the referenced Pokéathlon stat.
   * @return decrease
  **/
  public List<@Valid PokeathlonStatAffectingNature> getDecrease() {
    return decrease;
  }

  public void setDecrease(List<@Valid PokeathlonStatAffectingNature> decrease) {
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
    PokeathlonStatAffectingNatures pokeathlonStatAffectingNatures = (PokeathlonStatAffectingNatures) o;
    return Objects.equals(increase, pokeathlonStatAffectingNatures.increase) &&
        Objects.equals(decrease, pokeathlonStatAffectingNatures.decrease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increase, decrease);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

