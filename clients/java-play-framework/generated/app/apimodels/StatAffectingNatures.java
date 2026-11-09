package apimodels;

import apimodels.NatureSummary;
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
 * StatAffectingNatures
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class StatAffectingNatures   {
  @JsonProperty("increase")
  @NotNull
@Valid

  private List<@Valid NatureSummary> increase = new ArrayList<>();

  @JsonProperty("decrease")
  @NotNull
@Valid

  private List<@Valid NatureSummary> decrease = new ArrayList<>();

  public StatAffectingNatures increase(List<@Valid NatureSummary> increase) {
    this.increase = increase;
    return this;
  }

  public StatAffectingNatures addIncreaseItem(NatureSummary increaseItem) {
    if (this.increase == null) {
      this.increase = new ArrayList<>();
    }
    this.increase.add(increaseItem);
    return this;
  }

   /**
   * A list of natures and how they change the referenced stat.
   * @return increase
  **/
  public List<@Valid NatureSummary> getIncrease() {
    return increase;
  }

  public void setIncrease(List<@Valid NatureSummary> increase) {
    this.increase = increase;
  }

  public StatAffectingNatures decrease(List<@Valid NatureSummary> decrease) {
    this.decrease = decrease;
    return this;
  }

  public StatAffectingNatures addDecreaseItem(NatureSummary decreaseItem) {
    if (this.decrease == null) {
      this.decrease = new ArrayList<>();
    }
    this.decrease.add(decreaseItem);
    return this;
  }

   /**
   * A list of nature sand how they change the referenced stat.
   * @return decrease
  **/
  public List<@Valid NatureSummary> getDecrease() {
    return decrease;
  }

  public void setDecrease(List<@Valid NatureSummary> decrease) {
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
    StatAffectingNatures statAffectingNatures = (StatAffectingNatures) o;
    return Objects.equals(increase, statAffectingNatures.increase) &&
        Objects.equals(decrease, statAffectingNatures.decrease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increase, decrease);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatAffectingNatures {\n");
    
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

