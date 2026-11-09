package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.BerryFlavorSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BerryFlavorMap
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class BerryFlavorMap {

  private Integer potency;

  private BerryFlavorSummary flavor;

  public BerryFlavorMap() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BerryFlavorMap(Integer potency, BerryFlavorSummary flavor) {
    this.potency = potency;
    this.flavor = flavor;
  }

  public BerryFlavorMap potency(Integer potency) {
    this.potency = potency;
    return this;
  }

  /**
   * How powerful the referenced flavor is for this berry.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return potency
   */
  @NotNull @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "potency", description = "How powerful the referenced flavor is for this berry.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("potency")
  public Integer getPotency() {
    return potency;
  }

  @JsonProperty("potency")
  public void setPotency(Integer potency) {
    this.potency = potency;
  }

  public BerryFlavorMap flavor(BerryFlavorSummary flavor) {
    this.flavor = flavor;
    return this;
  }

  /**
   * The referenced berry flavor.
   * @return flavor
   */
  @NotNull @Valid 
  @Schema(name = "flavor", description = "The referenced berry flavor.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("flavor")
  public BerryFlavorSummary getFlavor() {
    return flavor;
  }

  @JsonProperty("flavor")
  public void setFlavor(BerryFlavorSummary flavor) {
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
    BerryFlavorMap berryFlavorMap = (BerryFlavorMap) o;
    return Objects.equals(this.potency, berryFlavorMap.potency) &&
        Objects.equals(this.flavor, berryFlavorMap.flavor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potency, flavor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFlavorMap {\n");
    sb.append("    potency: ").append(toIndentedString(potency)).append("\n");
    sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
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

