package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonHeldItemVersion;
import org.openapitools.model.PokemonSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokemonHeldItem   {
  
  private PokemonSummary pokemon;

  private List<@Valid PokemonHeldItemVersion> versionDetails = new ArrayList<>();

  /**
   * The Pokémon that holds this item.
   **/
  public PokemonHeldItem pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Pokémon that holds this item.")
  @JsonProperty("pokemon")
  @NotNull
  public PokemonSummary getPokemon() {
    return pokemon;
  }
  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }


  /**
   * The details for the version that this item is held in by the Pokémon.
   **/
  public PokemonHeldItem versionDetails(List<@Valid PokemonHeldItemVersion> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The details for the version that this item is held in by the Pokémon.")
  @JsonProperty("version_details")
  @NotNull
  public List<@Valid PokemonHeldItemVersion> getVersionDetails() {
    return versionDetails;
  }
  public void setVersionDetails(List<@Valid PokemonHeldItemVersion> versionDetails) {
    this.versionDetails = versionDetails;
  }

  public PokemonHeldItem addVersionDetailsItem(PokemonHeldItemVersion versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }
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
    PokemonHeldItem pokemonHeldItem = (PokemonHeldItem) o;
    return Objects.equals(this.pokemon, pokemonHeldItem.pokemon) &&
        Objects.equals(this.versionDetails, pokemonHeldItem.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pokemon, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonHeldItem {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

