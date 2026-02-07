package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
 */

@JsonTypeName("LocationAreaDetail_encounter_method_rates_inner_version_details_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner {

  private Integer rate;

  private AbilityDetailPokemonInnerPokemon version;

  public LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner(Integer rate, AbilityDetailPokemonInnerPokemon version) {
    this.rate = rate;
    this.version = version;
  }

  public LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
   */
  @NotNull 
  @Schema(name = "rate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rate")
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner version(AbilityDetailPokemonInnerPokemon version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @NotNull @Valid 
  @Schema(name = "version", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public AbilityDetailPokemonInnerPokemon getVersion() {
    return version;
  }

  public void setVersion(AbilityDetailPokemonInnerPokemon version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner locationAreaDetailEncounterMethodRatesInnerVersionDetailsInner = (LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner) o;
    return Objects.equals(this.rate, locationAreaDetailEncounterMethodRatesInnerVersionDetailsInner.rate) &&
        Objects.equals(this.version, locationAreaDetailEncounterMethodRatesInnerVersionDetailsInner.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner {\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

