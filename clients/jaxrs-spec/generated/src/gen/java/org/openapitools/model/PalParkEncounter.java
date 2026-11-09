package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokemonSpeciesSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PalParkEncounter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PalParkEncounter   {
  private Integer baseScore;
  private Integer rate;
  private PokemonSpeciesSummary pokemonSpecies;

  public PalParkEncounter() {
  }

  @JsonCreator
  public PalParkEncounter(
    @JsonProperty(required = true, value = "rate") Integer rate,
    @JsonProperty(required = true, value = "pokemon_species") PokemonSpeciesSummary pokemonSpecies
  ) {
    this.rate = rate;
    this.pokemonSpecies = pokemonSpecies;
  }

  /**
   * The base score given to the player when this Pokémon is caught during a pal park run.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PalParkEncounter baseScore(Integer baseScore) {
    this.baseScore = baseScore;
    return this;
  }

  
  @ApiModelProperty(value = "The base score given to the player when this Pokémon is caught during a pal park run.")
  @JsonProperty("base_score")
   @Min(-2147483648) @Max(2147483647)public Integer getBaseScore() {
    return baseScore;
  }

  @JsonProperty("base_score")
  public void setBaseScore(Integer baseScore) {
    this.baseScore = baseScore;
  }

  /**
   * The base rate for encountering this Pokémon in this pal park area.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PalParkEncounter rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The base rate for encountering this Pokémon in this pal park area.")
  @JsonProperty(required = true, value = "rate")
  @NotNull  @Min(-2147483648) @Max(2147483647)public Integer getRate() {
    return rate;
  }

  @JsonProperty(required = true, value = "rate")
  public void setRate(Integer rate) {
    this.rate = rate;
  }

  /**
   * The Pokémon species being encountered.
   **/
  public PalParkEncounter pokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Pokémon species being encountered.")
  @JsonProperty(required = true, value = "pokemon_species")
  @NotNull @Valid public PokemonSpeciesSummary getPokemonSpecies() {
    return pokemonSpecies;
  }

  @JsonProperty(required = true, value = "pokemon_species")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
