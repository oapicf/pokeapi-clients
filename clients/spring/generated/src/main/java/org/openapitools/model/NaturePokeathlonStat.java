package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PokeathlonStatSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NaturePokeathlonStat
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class NaturePokeathlonStat {

  private Integer maxChange;

  private PokeathlonStatSummary pokeathlonStat;

  public NaturePokeathlonStat() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NaturePokeathlonStat(Integer maxChange, PokeathlonStatSummary pokeathlonStat) {
    this.maxChange = maxChange;
    this.pokeathlonStat = pokeathlonStat;
  }

  public NaturePokeathlonStat maxChange(Integer maxChange) {
    this.maxChange = maxChange;
    return this;
  }

  /**
   * The amount of change.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxChange
   */
  @NotNull @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "max_change", description = "The amount of change.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max_change")
  public Integer getMaxChange() {
    return maxChange;
  }

  @JsonProperty("max_change")
  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

  public NaturePokeathlonStat pokeathlonStat(PokeathlonStatSummary pokeathlonStat) {
    this.pokeathlonStat = pokeathlonStat;
    return this;
  }

  /**
   * The stat being affected.
   * @return pokeathlonStat
   */
  @NotNull @Valid 
  @Schema(name = "pokeathlon_stat", description = "The stat being affected.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokeathlon_stat")
  public PokeathlonStatSummary getPokeathlonStat() {
    return pokeathlonStat;
  }

  @JsonProperty("pokeathlon_stat")
  public void setPokeathlonStat(PokeathlonStatSummary pokeathlonStat) {
    this.pokeathlonStat = pokeathlonStat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NaturePokeathlonStat naturePokeathlonStat = (NaturePokeathlonStat) o;
    return Objects.equals(this.maxChange, naturePokeathlonStat.maxChange) &&
        Objects.equals(this.pokeathlonStat, naturePokeathlonStat.pokeathlonStat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxChange, pokeathlonStat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NaturePokeathlonStat {\n");
    sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
    sb.append("    pokeathlonStat: ").append(toIndentedString(pokeathlonStat)).append("\n");
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

