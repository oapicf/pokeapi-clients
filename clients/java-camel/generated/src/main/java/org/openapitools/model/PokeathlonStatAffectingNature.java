package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.NatureSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokeathlonStatAffectingNature
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokeathlonStatAffectingNature {

  private Integer maxChange;

  private NatureSummary nature;

  public PokeathlonStatAffectingNature() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokeathlonStatAffectingNature(Integer maxChange, NatureSummary nature) {
    this.maxChange = maxChange;
    this.nature = nature;
  }

  public PokeathlonStatAffectingNature maxChange(Integer maxChange) {
    this.maxChange = maxChange;
    return this;
  }

  /**
   * The maximum amount of change to the referenced Pokéathlon stat.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxChange
   */
  @NotNull @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "max_change", description = "The maximum amount of change to the referenced Pokéathlon stat.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max_change")
  public Integer getMaxChange() {
    return maxChange;
  }

  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

  public PokeathlonStatAffectingNature nature(NatureSummary nature) {
    this.nature = nature;
    return this;
  }

  /**
   * The nature causing the change.
   * @return nature
   */
  @NotNull @Valid 
  @Schema(name = "nature", description = "The nature causing the change.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nature")
  public NatureSummary getNature() {
    return nature;
  }

  public void setNature(NatureSummary nature) {
    this.nature = nature;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokeathlonStatAffectingNature pokeathlonStatAffectingNature = (PokeathlonStatAffectingNature) o;
    return Objects.equals(this.maxChange, pokeathlonStatAffectingNature.maxChange) &&
        Objects.equals(this.nature, pokeathlonStatAffectingNature.nature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxChange, nature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokeathlonStatAffectingNature {\n");
    sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
    sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
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

