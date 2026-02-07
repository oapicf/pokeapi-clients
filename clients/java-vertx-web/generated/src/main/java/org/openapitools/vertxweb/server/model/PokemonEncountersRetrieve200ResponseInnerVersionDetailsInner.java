package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner;
import org.openapitools.vertxweb.server.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner   {
  
  private List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails = new ArrayList<>();
  private BigDecimal maxChance;
  private PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion version;

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner () {

  }

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner (List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails, BigDecimal maxChance, PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion version) {
    this.encounterDetails = encounterDetails;
    this.maxChance = maxChance;
    this.version = version;
  }

    
  @JsonProperty("encounter_details")
  public List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> getEncounterDetails() {
    return encounterDetails;
  }
  public void setEncounterDetails(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails) {
    this.encounterDetails = encounterDetails;
  }

    
  @JsonProperty("max_chance")
  public BigDecimal getMaxChance() {
    return maxChance;
  }
  public void setMaxChance(BigDecimal maxChance) {
    this.maxChance = maxChance;
  }

    
  @JsonProperty("version")
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion getVersion() {
    return version;
  }
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
    return Objects.equals(encounterDetails, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner.encounterDetails) &&
        Objects.equals(maxChance, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner.maxChance) &&
        Objects.equals(version, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner.version);
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
