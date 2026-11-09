package org.openapitools.model;

import org.openapitools.model.PokemonHeldItemVersion;
import org.openapitools.model.PokemonSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonHeldItem implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The Pokémon that holds this item.
   */
  @JsonProperty("pokemon")
  private PokemonSummary pokemon;

  /**
   * The details for the version that this item is held in by the Pokémon.
   */
  @JsonProperty("version_details")
  private List<PokemonHeldItemVersion> versionDetails = new ArrayList<>();

  /**
   * The Pokémon that holds this item.
   * @return pokemon
   */
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * The details for the version that this item is held in by the Pokémon.
   * @return versionDetails
   */
  public List<PokemonHeldItemVersion> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<PokemonHeldItemVersion> versionDetails) {
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
