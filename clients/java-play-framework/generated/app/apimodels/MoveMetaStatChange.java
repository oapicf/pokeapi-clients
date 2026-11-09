package apimodels;

import apimodels.StatSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MoveMetaStatChange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MoveMetaStatChange   {
  @JsonProperty("change")
  @NotNull
@Min(-2147483648)
@Max(2147483647)

  private Integer change;

  @JsonProperty("stat")
  @NotNull
@Valid

  private StatSummary stat;

  public MoveMetaStatChange change(Integer change) {
    this.change = change;
    return this;
  }

   /**
   * The amount of change.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return change
  **/
  public Integer getChange() {
    return change;
  }

  public void setChange(Integer change) {
    this.change = change;
  }

  public MoveMetaStatChange stat(StatSummary stat) {
    this.stat = stat;
    return this;
  }

   /**
   * The stat being affected.
   * @return stat
  **/
  public StatSummary getStat() {
    return stat;
  }

  public void setStat(StatSummary stat) {
    this.stat = stat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveMetaStatChange moveMetaStatChange = (MoveMetaStatChange) o;
    return Objects.equals(change, moveMetaStatChange.change) &&
        Objects.equals(stat, moveMetaStatChange.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(change, stat);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveMetaStatChange {\n");
    
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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

