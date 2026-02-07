package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PalParkAreaDetailPokemonEncountersInner   {
  
  private Integer baseScore;
  private AbilityDetailPokemonInnerPokemon pokemonSpecies;
  private Integer rate;

  public PalParkAreaDetailPokemonEncountersInner () {

  }

  public PalParkAreaDetailPokemonEncountersInner (Integer baseScore, AbilityDetailPokemonInnerPokemon pokemonSpecies, Integer rate) {
    this.baseScore = baseScore;
    this.pokemonSpecies = pokemonSpecies;
    this.rate = rate;
  }

    
  @JsonProperty("base_score")
  public Integer getBaseScore() {
    return baseScore;
  }
  public void setBaseScore(Integer baseScore) {
    this.baseScore = baseScore;
  }

    
  @JsonProperty("pokemon-species")
  public AbilityDetailPokemonInnerPokemon getPokemonSpecies() {
    return pokemonSpecies;
  }
  public void setPokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

    
  @JsonProperty("rate")
  public Integer getRate() {
    return rate;
  }
  public void setRate(Integer rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PalParkAreaDetailPokemonEncountersInner palParkAreaDetailPokemonEncountersInner = (PalParkAreaDetailPokemonEncountersInner) o;
    return Objects.equals(baseScore, palParkAreaDetailPokemonEncountersInner.baseScore) &&
        Objects.equals(pokemonSpecies, palParkAreaDetailPokemonEncountersInner.pokemonSpecies) &&
        Objects.equals(rate, palParkAreaDetailPokemonEncountersInner.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseScore, pokemonSpecies, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PalParkAreaDetailPokemonEncountersInner {\n");
    
    sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
    sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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
