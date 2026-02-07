package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.PokemonDetailMovesInnerVersionGroupDetailsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonDetailMovesInner   {
  
  private AbilityDetailPokemonInnerPokemon move;
  private List<PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails = new ArrayList<>();

  public PokemonDetailMovesInner () {

  }

  public PokemonDetailMovesInner (AbilityDetailPokemonInnerPokemon move, List<PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails) {
    this.move = move;
    this.versionGroupDetails = versionGroupDetails;
  }

    
  @JsonProperty("move")
  public AbilityDetailPokemonInnerPokemon getMove() {
    return move;
  }
  public void setMove(AbilityDetailPokemonInnerPokemon move) {
    this.move = move;
  }

    
  @JsonProperty("version_group_details")
  public List<PokemonDetailMovesInnerVersionGroupDetailsInner> getVersionGroupDetails() {
    return versionGroupDetails;
  }
  public void setVersionGroupDetails(List<PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails) {
    this.versionGroupDetails = versionGroupDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonDetailMovesInner pokemonDetailMovesInner = (PokemonDetailMovesInner) o;
    return Objects.equals(move, pokemonDetailMovesInner.move) &&
        Objects.equals(versionGroupDetails, pokemonDetailMovesInner.versionGroupDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(move, versionGroupDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDetailMovesInner {\n");
    
    sb.append("    move: ").append(toIndentedString(move)).append("\n");
    sb.append("    versionGroupDetails: ").append(toIndentedString(versionGroupDetails)).append("\n");
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
