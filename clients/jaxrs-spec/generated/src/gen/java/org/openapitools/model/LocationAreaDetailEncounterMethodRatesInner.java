package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LocationAreaDetail_encounter_method_rates_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LocationAreaDetailEncounterMethodRatesInner   {
  private AbilityDetailPokemonInnerPokemon encounterMethod;
  private @Valid List<@Valid LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails = new ArrayList<>();

  public LocationAreaDetailEncounterMethodRatesInner() {
  }

  @JsonCreator
  public LocationAreaDetailEncounterMethodRatesInner(
    @JsonProperty(required = true, value = "encounter_method") AbilityDetailPokemonInnerPokemon encounterMethod,
    @JsonProperty(required = true, value = "version_details") List<@Valid LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails
  ) {
    this.encounterMethod = encounterMethod;
    this.versionDetails = versionDetails;
  }

  /**
   **/
  public LocationAreaDetailEncounterMethodRatesInner encounterMethod(AbilityDetailPokemonInnerPokemon encounterMethod) {
    this.encounterMethod = encounterMethod;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "encounter_method")
  @NotNull @Valid public AbilityDetailPokemonInnerPokemon getEncounterMethod() {
    return encounterMethod;
  }

  @JsonProperty(required = true, value = "encounter_method")
  public void setEncounterMethod(AbilityDetailPokemonInnerPokemon encounterMethod) {
    this.encounterMethod = encounterMethod;
  }

  /**
   **/
  public LocationAreaDetailEncounterMethodRatesInner versionDetails(List<@Valid LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "version_details")
  @NotNull @Valid public List<@Valid LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> getVersionDetails() {
    return versionDetails;
  }

  @JsonProperty(required = true, value = "version_details")
  public void setVersionDetails(List<@Valid LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
  }

  public LocationAreaDetailEncounterMethodRatesInner addVersionDetailsItem(LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }

    this.versionDetails.add(versionDetailsItem);
    return this;
  }

  public LocationAreaDetailEncounterMethodRatesInner removeVersionDetailsItem(LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner versionDetailsItem) {
    if (versionDetailsItem != null && this.versionDetails != null) {
      this.versionDetails.remove(versionDetailsItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAreaDetailEncounterMethodRatesInner locationAreaDetailEncounterMethodRatesInner = (LocationAreaDetailEncounterMethodRatesInner) o;
    return Objects.equals(this.encounterMethod, locationAreaDetailEncounterMethodRatesInner.encounterMethod) &&
        Objects.equals(this.versionDetails, locationAreaDetailEncounterMethodRatesInner.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encounterMethod, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaDetailEncounterMethodRatesInner {\n");
    
    sb.append("    encounterMethod: ").append(toIndentedString(encounterMethod)).append("\n");
    sb.append("    versionDetails: ").append(toIndentedString(versionDetails)).append("\n");
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

