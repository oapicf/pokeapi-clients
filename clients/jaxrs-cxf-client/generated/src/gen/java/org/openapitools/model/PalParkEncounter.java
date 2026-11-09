package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokemonSpeciesSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PalParkEncounter  {
  
 /**
  * The base score given to the player when this Pokémon is caught during a pal park run.
  */
  @ApiModelProperty(value = "The base score given to the player when this Pokémon is caught during a pal park run.")

  private Integer baseScore;

 /**
  * The base rate for encountering this Pokémon in this pal park area.
  */
  @ApiModelProperty(required = true, value = "The base rate for encountering this Pokémon in this pal park area.")

  private Integer rate;

 /**
  * The Pokémon species being encountered.
  */
  @ApiModelProperty(required = true, value = "The Pokémon species being encountered.")

  private PokemonSpeciesSummary pokemonSpecies;
 /**
   * The base score given to the player when this Pokémon is caught during a pal park run.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return baseScore
  **/
  @JsonProperty("base_score")
  public Integer getBaseScore() {
    return baseScore;
  }

  public void setBaseScore(Integer baseScore) {
    this.baseScore = baseScore;
  }

  public PalParkEncounter baseScore(Integer baseScore) {
    this.baseScore = baseScore;
    return this;
  }

 /**
   * The base rate for encountering this Pokémon in this pal park area.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return rate
  **/
  @JsonProperty("rate")
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public PalParkEncounter rate(Integer rate) {
    this.rate = rate;
    return this;
  }

 /**
   * The Pokémon species being encountered.
   * @return pokemonSpecies
  **/
  @JsonProperty("pokemon_species")
  public PokemonSpeciesSummary getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  public PalParkEncounter pokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
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
    PalParkEncounter palParkEncounter = (PalParkEncounter) o;
    return Objects.equals(this.baseScore, palParkEncounter.baseScore) &&
        Objects.equals(this.rate, palParkEncounter.rate) &&
        Objects.equals(this.pokemonSpecies, palParkEncounter.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseScore, rate, pokemonSpecies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PalParkEncounter {\n");
    
    sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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

