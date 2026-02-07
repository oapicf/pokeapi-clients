package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LocationAreaDetail_encounter_method_rates_inner_version_details_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner   {
  private Integer rate;
  private AbilityDetailPokemonInnerPokemon version;

  public LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner() {
  }

  @JsonCreator
  public LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner(
    @JsonProperty(required = true, value = "rate") Integer rate,
    @JsonProperty(required = true, value = "version") AbilityDetailPokemonInnerPokemon version
  ) {
    this.rate = rate;
    this.version = version;
  }

  /**
   **/
  public LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "rate")
  @NotNull public Integer getRate() {
    return rate;
  }

  @JsonProperty(required = true, value = "rate")
  public void setRate(Integer rate) {
    this.rate = rate;
  }

  /**
   **/
  public LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner version(AbilityDetailPokemonInnerPokemon version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "version")
  @NotNull @Valid public AbilityDetailPokemonInnerPokemon getVersion() {
    return version;
  }

  @JsonProperty(required = true, value = "version")
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

