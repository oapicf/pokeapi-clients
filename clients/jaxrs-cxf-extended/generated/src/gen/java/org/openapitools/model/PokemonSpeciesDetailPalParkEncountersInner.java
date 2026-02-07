package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonSpeciesDetailPalParkEncountersInner  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon area;

  @ApiModelProperty(required = true, value = "")
  private Integer baseScore;

  @ApiModelProperty(required = true, value = "")
  private Integer rate;
 /**
  * Get area
  * @return area
  */
  @JsonProperty("area")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getArea() {
    return area;
  }

  /**
   * Sets the <code>area</code> property.
   */
 public void setArea(AbilityDetailPokemonInnerPokemon area) {
    this.area = area;
  }

  /**
   * Sets the <code>area</code> property.
   */
  public PokemonSpeciesDetailPalParkEncountersInner area(AbilityDetailPokemonInnerPokemon area) {
    this.area = area;
    return this;
  }

 /**
  * Get baseScore
  * @return baseScore
  */
  @JsonProperty("base_score")
  @NotNull
  public Integer getBaseScore() {
    return baseScore;
  }

  /**
   * Sets the <code>baseScore</code> property.
   */
 public void setBaseScore(Integer baseScore) {
    this.baseScore = baseScore;
  }

  /**
   * Sets the <code>baseScore</code> property.
   */
  public PokemonSpeciesDetailPalParkEncountersInner baseScore(Integer baseScore) {
    this.baseScore = baseScore;
    return this;
  }

 /**
  * Get rate
  * @return rate
  */
  @JsonProperty("rate")
  @NotNull
  public Integer getRate() {
    return rate;
  }

  /**
   * Sets the <code>rate</code> property.
   */
 public void setRate(Integer rate) {
    this.rate = rate;
  }

  /**
   * Sets the <code>rate</code> property.
   */
  public PokemonSpeciesDetailPalParkEncountersInner rate(Integer rate) {
    this.rate = rate;
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
    PokemonSpeciesDetailPalParkEncountersInner pokemonSpeciesDetailPalParkEncountersInner = (PokemonSpeciesDetailPalParkEncountersInner) o;
    return Objects.equals(this.area, pokemonSpeciesDetailPalParkEncountersInner.area) &&
        Objects.equals(this.baseScore, pokemonSpeciesDetailPalParkEncountersInner.baseScore) &&
        Objects.equals(this.rate, pokemonSpeciesDetailPalParkEncountersInner.rate);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

