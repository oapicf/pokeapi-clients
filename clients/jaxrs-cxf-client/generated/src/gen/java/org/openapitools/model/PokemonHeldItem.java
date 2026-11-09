package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonHeldItemVersion;
import org.openapitools.model.PokemonSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonHeldItem  {
  
 /**
  * The Pokémon that holds this item.
  */
  @ApiModelProperty(required = true, value = "The Pokémon that holds this item.")

  private PokemonSummary pokemon;

 /**
  * The details for the version that this item is held in by the Pokémon.
  */
  @ApiModelProperty(required = true, value = "The details for the version that this item is held in by the Pokémon.")

  private List<PokemonHeldItemVersion> versionDetails = new ArrayList<>();
 /**
   * The Pokémon that holds this item.
   * @return pokemon
  **/
  @JsonProperty("pokemon")
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  public PokemonHeldItem pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
    return this;
  }

 /**
   * The details for the version that this item is held in by the Pokémon.
   * @return versionDetails
  **/
  @JsonProperty("version_details")
  public List<PokemonHeldItemVersion> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<PokemonHeldItemVersion> versionDetails) {
    this.versionDetails = versionDetails;
  }

  public PokemonHeldItem versionDetails(List<PokemonHeldItemVersion> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public PokemonHeldItem addVersionDetailsItem(PokemonHeldItemVersion versionDetailsItem) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

