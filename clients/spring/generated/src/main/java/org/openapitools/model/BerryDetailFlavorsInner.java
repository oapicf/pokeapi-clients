package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.BerryDetailFlavorsInnerFlavor;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BerryDetailFlavorsInner
 */

@JsonTypeName("BerryDetail_flavors_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BerryDetailFlavorsInner {

  private Integer potency;

  private BerryDetailFlavorsInnerFlavor flavor;

  public BerryDetailFlavorsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BerryDetailFlavorsInner(Integer potency, BerryDetailFlavorsInnerFlavor flavor) {
    this.potency = potency;
    this.flavor = flavor;
  }

  public BerryDetailFlavorsInner potency(Integer potency) {
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

  public BerryDetailFlavorsInner flavor(BerryDetailFlavorsInnerFlavor flavor) {
    this.flavor = flavor;
    return this;
  }

  /**
   * Get flavor
   * @return flavor
   */
  @NotNull @Valid 
  @Schema(name = "flavor", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("flavor")
  public BerryDetailFlavorsInnerFlavor getFlavor() {
    return flavor;
  }

  public void setFlavor(BerryDetailFlavorsInnerFlavor flavor) {
    this.flavor = flavor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BerryDetailFlavorsInner berryDetailFlavorsInner = (BerryDetailFlavorsInner) o;
    return Objects.equals(this.potency, berryDetailFlavorsInner.potency) &&
        Objects.equals(this.flavor, berryDetailFlavorsInner.flavor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potency, flavor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryDetailFlavorsInner {\n");
    sb.append("    potency: ").append(toIndentedString(potency)).append("\n");
    sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
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

