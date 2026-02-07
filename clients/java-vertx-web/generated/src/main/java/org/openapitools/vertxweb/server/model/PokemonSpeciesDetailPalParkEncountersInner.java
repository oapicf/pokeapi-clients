package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonSpeciesDetailPalParkEncountersInner   {
  
  private AbilityDetailPokemonInnerPokemon area;
  private Integer baseScore;
  private Integer rate;

  public PokemonSpeciesDetailPalParkEncountersInner () {

  }

  public PokemonSpeciesDetailPalParkEncountersInner (AbilityDetailPokemonInnerPokemon area, Integer baseScore, Integer rate) {
    this.area = area;
    this.baseScore = baseScore;
    this.rate = rate;
  }

    
  @JsonProperty("area")
  public AbilityDetailPokemonInnerPokemon getArea() {
    return area;
  }
  public void setArea(AbilityDetailPokemonInnerPokemon area) {
    this.area = area;
  }

    
  @JsonProperty("base_score")
  public Integer getBaseScore() {
    return baseScore;
  }
  public void setBaseScore(Integer baseScore) {
    this.baseScore = baseScore;
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
    PokemonSpeciesDetailPalParkEncountersInner pokemonSpeciesDetailPalParkEncountersInner = (PokemonSpeciesDetailPalParkEncountersInner) o;
    return Objects.equals(area, pokemonSpeciesDetailPalParkEncountersInner.area) &&
        Objects.equals(baseScore, pokemonSpeciesDetailPalParkEncountersInner.baseScore) &&
        Objects.equals(rate, pokemonSpeciesDetailPalParkEncountersInner.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, baseScore, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesDetailPalParkEncountersInner {\n");
    
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
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
