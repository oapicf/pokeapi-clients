package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.BerryFlavorDetailBerriesInnerBerry;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BerryFlavorDetailBerriesInner
 */

@JsonTypeName("BerryFlavorDetail_berries_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BerryFlavorDetailBerriesInner {

  private Integer potency;

  private BerryFlavorDetailBerriesInnerBerry berry;

  public BerryFlavorDetailBerriesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BerryFlavorDetailBerriesInner(Integer potency, BerryFlavorDetailBerriesInnerBerry berry) {
    this.potency = potency;
    this.berry = berry;
  }

  public BerryFlavorDetailBerriesInner potency(Integer potency) {
    this.potency = potency;
    return this;
  }

  /**
   * Get potency
   * @return potency
   */
  @NotNull 
  @Schema(name = "potency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("potency")
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
   */
  @NotNull @Valid 
  @Schema(name = "berry", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("berry")
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
    return Objects.equals(this.potency, berryFlavorDetailBerriesInner.potency) &&
        Objects.equals(this.berry, berryFlavorDetailBerriesInner.berry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potency, berry);
  }

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

