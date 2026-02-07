package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails;

/**
 * LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner   {
  @JsonProperty("version")
  private AbilityDetailPokemonInnerPokemon version;

  @JsonProperty("max_chance")
  private Integer maxChance;

  @JsonProperty("encounter_details")
  private LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails encounterDetails;

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInner version(AbilityDetailPokemonInnerPokemon version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")
  public AbilityDetailPokemonInnerPokemon getVersion() {
    return version;
  }

  public void setVersion(AbilityDetailPokemonInnerPokemon version) {
    this.version = version;
  }

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInner maxChance(Integer maxChance) {
    this.maxChance = maxChance;
    return this;
  }

   /**
   * Get maxChance
   * @return maxChance
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getMaxChance() {
    return maxChance;
  }

  public void setMaxChance(Integer maxChance) {
    this.maxChance = maxChance;
  }

  public LocationAreaDetailPokemonEncountersInnerVersionDetailsInner encounterDetails(LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails encounterDetails) {
    this.encounterDetails = encounterDetails;
    return this;
  }

   /**
   * Get encounterDetails
   * @return encounterDetails
  **/
  @ApiModelProperty(required = true, value = "")
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

