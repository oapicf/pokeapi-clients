package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationAreaDetailPokemonEncountersInner   {
  
  private AbilityDetailPokemonInnerPokemon pokemon;
  private List<LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> versionDetails = new ArrayList<>();

  public LocationAreaDetailPokemonEncountersInner () {

  }

  public LocationAreaDetailPokemonEncountersInner (AbilityDetailPokemonInnerPokemon pokemon, List<LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> versionDetails) {
    this.pokemon = pokemon;
    this.versionDetails = versionDetails;
  }

    
  @JsonProperty("pokemon")
  public AbilityDetailPokemonInnerPokemon getPokemon() {
    return pokemon;
  }
  public void setPokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
  }

    
  @JsonProperty("version_details")
  public List<LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> getVersionDetails() {
    return versionDetails;
  }
  public void setVersionDetails(List<LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAreaDetailPokemonEncountersInner locationAreaDetailPokemonEncountersInner = (LocationAreaDetailPokemonEncountersInner) o;
    return Objects.equals(pokemon, locationAreaDetailPokemonEncountersInner.pokemon) &&
        Objects.equals(versionDetails, locationAreaDetailPokemonEncountersInner.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pokemon, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaDetailPokemonEncountersInner {\n");
    
    sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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
