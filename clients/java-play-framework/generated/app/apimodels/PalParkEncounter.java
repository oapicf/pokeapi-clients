package apimodels;

import apimodels.PokemonSpeciesSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PalParkEncounter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PalParkEncounter   {
  @JsonProperty("base_score")
  @Min(-2147483648)
@Max(2147483647)

  private Integer baseScore;

  @JsonProperty("rate")
  @NotNull
@Min(-2147483648)
@Max(2147483647)

  private Integer rate;

  @JsonProperty("pokemon_species")
  @NotNull
@Valid

  private PokemonSpeciesSummary pokemonSpecies;

  public PalParkEncounter baseScore(Integer baseScore) {
    this.baseScore = baseScore;
    return this;
  }

   /**
   * The base score given to the player when this Pokémon is caught during a pal park run.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return baseScore
  **/
  public Integer getBaseScore() {
    return baseScore;
  }

  public void setBaseScore(Integer baseScore) {
    this.baseScore = baseScore;
  }

  public PalParkEncounter rate(Integer rate) {
    this.rate = rate;
    return this;
  }

   /**
   * The base rate for encountering this Pokémon in this pal park area.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return rate
  **/
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public PalParkEncounter pokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

   /**
   * The Pokémon species being encountered.
   * @return pokemonSpecies
  **/
  public PokemonSpeciesSummary getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
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
    return Objects.equals(baseScore, palParkEncounter.baseScore) &&
        Objects.equals(rate, palParkEncounter.rate) &&
        Objects.equals(pokemonSpecies, palParkEncounter.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseScore, rate, pokemonSpecies);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

