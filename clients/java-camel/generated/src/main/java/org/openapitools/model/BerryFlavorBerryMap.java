package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.BerrySummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BerryFlavorBerryMap
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class BerryFlavorBerryMap {

  private Integer potency;

  private BerrySummary berry;

  public BerryFlavorBerryMap() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BerryFlavorBerryMap(Integer potency, BerrySummary berry) {
    this.potency = potency;
    this.berry = berry;
  }

  public BerryFlavorBerryMap potency(Integer potency) {
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

  public void setPotency(Integer potency) {
    this.potency = potency;
  }

  public BerryFlavorBerryMap berry(BerrySummary berry) {
    this.berry = berry;
    return this;
  }

  /**
   * The berry with the referenced flavor.
   * @return berry
   */
  @NotNull @Valid 
  @Schema(name = "berry", description = "The berry with the referenced flavor.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("berry")
  public BerrySummary getBerry() {
    return berry;
  }

  public void setBerry(BerrySummary berry) {
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
    BerryFlavorBerryMap berryFlavorBerryMap = (BerryFlavorBerryMap) o;
    return Objects.equals(this.potency, berryFlavorBerryMap.potency) &&
        Objects.equals(this.berry, berryFlavorBerryMap.berry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potency, berry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFlavorBerryMap {\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

