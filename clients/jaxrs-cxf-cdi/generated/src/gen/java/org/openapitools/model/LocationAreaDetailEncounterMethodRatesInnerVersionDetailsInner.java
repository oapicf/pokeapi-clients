package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner   {
  
  private Integer rate;

  private AbilityDetailPokemonInnerPokemon version;

  /**
   **/
  public LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("rate")
  @NotNull
  public Integer getRate() {
    return rate;
  }
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
  @JsonProperty("version")
  @NotNull
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

