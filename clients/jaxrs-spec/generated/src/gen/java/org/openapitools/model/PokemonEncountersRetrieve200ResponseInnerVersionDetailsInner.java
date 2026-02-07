package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("pokemon_encounters_retrieve_200_response_inner_version_details_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner   {
  private @Valid List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails = new ArrayList<>();
  private BigDecimal maxChance;
  private PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion version;

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner() {
  }

  @JsonCreator
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner(
    @JsonProperty(required = true, value = "encounter_details") List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails,
    @JsonProperty(required = true, value = "max_chance") BigDecimal maxChance,
    @JsonProperty(required = true, value = "version") PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion version
  ) {
    this.encounterDetails = encounterDetails;
    this.maxChance = maxChance;
    this.version = version;
  }

  /**
   **/
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner encounterDetails(List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails) {
    this.encounterDetails = encounterDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "encounter_details")
  @NotNull @Valid public List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> getEncounterDetails() {
    return encounterDetails;
  }

  @JsonProperty(required = true, value = "encounter_details")
  public void setEncounterDetails(List<@Valid PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails) {
    this.encounterDetails = encounterDetails;
  }

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner addEncounterDetailsItem(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner encounterDetailsItem) {
    if (this.encounterDetails == null) {
      this.encounterDetails = new ArrayList<>();
    }

    this.encounterDetails.add(encounterDetailsItem);
    return this;
  }

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner removeEncounterDetailsItem(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner encounterDetailsItem) {
    if (encounterDetailsItem != null && this.encounterDetails != null) {
      this.encounterDetails.remove(encounterDetailsItem);
    }

    return this;
  }
  /**
   **/
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner maxChance(BigDecimal maxChance) {
    this.maxChance = maxChance;
    return this;
  }

  
  @ApiModelProperty(example = "100", required = true, value = "")
  @JsonProperty(required = true, value = "max_chance")
  @NotNull @Valid public BigDecimal getMaxChance() {
    return maxChance;
  }

  @JsonProperty(required = true, value = "max_chance")
  public void setMaxChance(BigDecimal maxChance) {
    this.maxChance = maxChance;
  }

  /**
   **/
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner version(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "version")
  @NotNull @Valid public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion getVersion() {
    return version;
  }

  @JsonProperty(required = true, value = "version")
  public void setVersion(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion version) {
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
    PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner = (PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner) o;
    return Objects.equals(this.encounterDetails, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner.encounterDetails) &&
        Objects.equals(this.maxChance, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner.maxChance) &&
        Objects.equals(this.version, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encounterDetails, maxChance, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner {\n");
    
    sb.append("    encounterDetails: ").append(toIndentedString(encounterDetails)).append("\n");
    sb.append("    maxChance: ").append(toIndentedString(maxChance)).append("\n");
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

