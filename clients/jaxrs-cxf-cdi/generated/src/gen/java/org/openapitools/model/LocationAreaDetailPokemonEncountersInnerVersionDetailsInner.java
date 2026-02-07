package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner   {
  
  private AbilityDetailPokemonInnerPokemon version;

  private Integer maxChance;

  private LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails encounterDetails;

  /**
   **/
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInner version(AbilityDetailPokemonInnerPokemon version) {
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


  /**
   **/
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInner maxChance(Integer maxChance) {
    this.maxChance = maxChance;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("max_chance")
  @NotNull
  public Integer getMaxChance() {
    return maxChance;
  }
  public void setMaxChance(Integer maxChance) {
    this.maxChance = maxChance;
  }


  /**
   **/
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInner encounterDetails(LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails encounterDetails) {
    this.encounterDetails = encounterDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("encounter_details")
  @NotNull
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails getEncounterDetails() {
    return encounterDetails;
  }
  public void setEncounterDetails(LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails encounterDetails) {
    this.encounterDetails = encounterDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAreaDetailPokemonEncountersInnerVersionDetailsInner locationAreaDetailPokemonEncountersInnerVersionDetailsInner = (LocationAreaDetailPokemonEncountersInnerVersionDetailsInner) o;
    return Objects.equals(this.version, locationAreaDetailPokemonEncountersInnerVersionDetailsInner.version) &&
        Objects.equals(this.maxChance, locationAreaDetailPokemonEncountersInnerVersionDetailsInner.maxChance) &&
        Objects.equals(this.encounterDetails, locationAreaDetailPokemonEncountersInnerVersionDetailsInner.encounterDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, maxChance, encounterDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    maxChance: ").append(toIndentedString(maxChance)).append("\n");
    sb.append("    encounterDetails: ").append(toIndentedString(encounterDetails)).append("\n");
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

