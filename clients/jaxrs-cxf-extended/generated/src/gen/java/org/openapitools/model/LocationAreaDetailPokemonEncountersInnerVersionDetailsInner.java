package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon version;

  @ApiModelProperty(required = true, value = "")
  private Integer maxChance;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails encounterDetails;
 /**
  * Get version
  * @return version
  */
  @JsonProperty("version")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getVersion() {
    return version;
  }

  /**
   * Sets the <code>version</code> property.
   */
 public void setVersion(AbilityDetailPokemonInnerPokemon version) {
    this.version = version;
  }

  /**
   * Sets the <code>version</code> property.
   */
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInner version(AbilityDetailPokemonInnerPokemon version) {
    this.version = version;
    return this;
  }

 /**
  * Get maxChance
  * @return maxChance
  */
  @JsonProperty("max_chance")
  @NotNull
  public Integer getMaxChance() {
    return maxChance;
  }

  /**
   * Sets the <code>maxChance</code> property.
   */
 public void setMaxChance(Integer maxChance) {
    this.maxChance = maxChance;
  }

  /**
   * Sets the <code>maxChance</code> property.
   */
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInner maxChance(Integer maxChance) {
    this.maxChance = maxChance;
    return this;
  }

 /**
  * Get encounterDetails
  * @return encounterDetails
  */
  @JsonProperty("encounter_details")
  @NotNull
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails getEncounterDetails() {
    return encounterDetails;
  }

  /**
   * Sets the <code>encounterDetails</code> property.
   */
 public void setEncounterDetails(LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails encounterDetails) {
    this.encounterDetails = encounterDetails;
  }

  /**
   * Sets the <code>encounterDetails</code> property.
   */
  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInner encounterDetails(LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails encounterDetails) {
    this.encounterDetails = encounterDetails;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

