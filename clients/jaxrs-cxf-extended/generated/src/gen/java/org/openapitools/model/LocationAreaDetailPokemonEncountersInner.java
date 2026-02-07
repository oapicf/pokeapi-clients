package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LocationAreaDetailPokemonEncountersInner  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon pokemon;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> versionDetails = new ArrayList<>();
 /**
  * Get pokemon
  * @return pokemon
  */
  @JsonProperty("pokemon")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getPokemon() {
    return pokemon;
  }

  /**
   * Sets the <code>pokemon</code> property.
   */
 public void setPokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * Sets the <code>pokemon</code> property.
   */
  public LocationAreaDetailPokemonEncountersInner pokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
    return this;
  }

 /**
  * Get versionDetails
  * @return versionDetails
  */
  @JsonProperty("version_details")
  @NotNull
  public List<@Valid LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> getVersionDetails() {
    return versionDetails;
  }

  /**
   * Sets the <code>versionDetails</code> property.
   */
 public void setVersionDetails(List<@Valid LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
  }

  /**
   * Sets the <code>versionDetails</code> property.
   */
  public LocationAreaDetailPokemonEncountersInner versionDetails(List<@Valid LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  /**
   * Adds a new item to the <code>versionDetails</code> list.
   */
  public LocationAreaDetailPokemonEncountersInner addVersionDetailsItem(LocationAreaDetailPokemonEncountersInnerVersionDetailsInner versionDetailsItem) {
    this.versionDetails.add(versionDetailsItem);
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
    LocationAreaDetailPokemonEncountersInner locationAreaDetailPokemonEncountersInner = (LocationAreaDetailPokemonEncountersInner) o;
    return Objects.equals(this.pokemon, locationAreaDetailPokemonEncountersInner.pokemon) &&
        Objects.equals(this.versionDetails, locationAreaDetailPokemonEncountersInner.versionDetails);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

