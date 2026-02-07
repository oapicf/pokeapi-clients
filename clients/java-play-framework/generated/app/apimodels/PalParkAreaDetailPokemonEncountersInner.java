package apimodels;

import apimodels.AbilityDetailPokemonInnerPokemon;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PalParkAreaDetailPokemonEncountersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PalParkAreaDetailPokemonEncountersInner   {
  @JsonProperty("base_score")
  @NotNull

  private Integer baseScore;

  @JsonProperty("pokemon-species")
  @NotNull
@Valid

  private AbilityDetailPokemonInnerPokemon pokemonSpecies;

  @JsonProperty("rate")
  @NotNull

  private Integer rate;

  public PalParkAreaDetailPokemonEncountersInner baseScore(Integer baseScore) {
    this.baseScore = baseScore;
    return this;
  }

   /**
   * Get baseScore
   * @return baseScore
  **/
  public Integer getBaseScore() {
    return baseScore;
  }

  public void setBaseScore(Integer baseScore) {
    this.baseScore = baseScore;
  }

  public PalParkAreaDetailPokemonEncountersInner pokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

   /**
   * Get pokemonSpecies
   * @return pokemonSpecies
  **/
  public AbilityDetailPokemonInnerPokemon getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  public PalParkAreaDetailPokemonEncountersInner rate(Integer rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

