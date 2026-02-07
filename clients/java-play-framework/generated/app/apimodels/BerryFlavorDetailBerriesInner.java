package apimodels;

import apimodels.BerryFlavorDetailBerriesInnerBerry;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BerryFlavorDetailBerriesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T15:23:19.397731995Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BerryFlavorDetailBerriesInner   {
  @JsonProperty("potency")
  @NotNull

  private Integer potency;

  @JsonProperty("berry")
  @NotNull
@Valid

  private BerryFlavorDetailBerriesInnerBerry berry;

  public BerryFlavorDetailBerriesInner potency(Integer potency) {
    this.potency = potency;
    return this;
  }

   /**
   * Get potency
   * @return potency
  **/
  public Integer getPotency() {
    return potency;
  }

  public void setPotency(Integer potency) {
    this.potency = potency;
  }

  public BerryFlavorDetailBerriesInner berry(BerryFlavorDetailBerriesInnerBerry berry) {
    this.berry = berry;
    return this;
  }

   /**
   * Get berry
   * @return berry
  **/
  public BerryFlavorDetailBerriesInnerBerry getBerry() {
    return berry;
  }

  public void setBerry(BerryFlavorDetailBerriesInnerBerry berry) {
    this.berry = berry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner = (BerryFlavorDetailBerriesInner) o;
    return Objects.equals(potency, berryFlavorDetailBerriesInner.potency) &&
        Objects.equals(berry, berryFlavorDetailBerriesInner.berry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potency, berry);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFlavorDetailBerriesInner {\n");
    
    sb.append("    potency: ").append(toIndentedString(potency)).append("\n");
    sb.append("    berry: ").append(toIndentedString(berry)).append("\n");
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

